package com.us.rk.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)// 어플리케이션 보안활성화 메소드
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("user").password("password").roles("ROLE_USER")
		.and()
		.withUser("admin").password("password").roles("ROLE_ADMIN");
	}

	/* 나만의 매커니즘을 구성
	 *  configure(AuthenticationManagerBuilder) 오버라이딩 안해서 인증절차를 지원하기 위한 사용자 저장소가 없다 => 모든요청은 인증요구but 아무도 로그인x
	 *  .antMatchers().hasRole() 또는 .antMatchers().access()
	 *  해당경로에 대해서 어떤한 권한을 가져야만 접근할수 있는가 를 표현
	 * */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic()
		.and()
		//ROLE_USER,ROLE_ADMIN으로 권한 분리 url정의
			.authorizeRequests() 
			.antMatchers("/","member/login","member/signUp").permitAll()// / 나 member/login, member/signUp은 누구가 접근가능
			.antMatchers("/**").access("ROLE_USER")
			.antMatchers("/**").access("ROLE_ADMIN")
			.antMatchers("/admin/**").access("ROLE_ADMIN")
			.antMatchers("/**").authenticated()

		//로그인 페이지 및 성공url, handler 그리고 로그인 시 사용되는 id password 파라미터 정의
		.and()
			.formLogin() //form통한 로그인
			.loginPage("member/login")//로그인경로
			.defaultSuccessUrl("/")
			//.failureHandler(authFailureHandler)
			//.successHandler(authSuccessHandler)
			.usernameParameter("id")
			.passwordParameter("password")

		// 로그아웃 관련 설정
		.and() 
			.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
			.logoutSuccessUrl("/")
			.invalidateHttpSession(true)
		.and()
			// csrf 사용유무 설정
			// csrf 설정을 사용하면 모든 request에 csrf 값을 함께 전달해야한다.
			.csrf();
		//.and()
			// 로그인 프로세스가 진행될 provider
			//.authenticationProvider(authProvider);
	}
	

	/** configureGlobal와 별차이 ㄴㄴ
	 * @Autowired 를 사용할때는 configureGlobal (이름은 중요하지 않음)
	 * @Overide 를 사용할때는 configure 
	 * 
	 * AuthenticationManagerBuilder
	 * 스프링시큐리티의 인증에 대한 지원을 설정하는 몇가지 메소드를 가지고 있다
	 * .inMemoryAuthentication() 
	 * 활성화 및 설정이 가능 선택적으로 인메모리사용자 저장소에 값으 채울수 있다

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication() 
		.withUser("user").password("password").roles("ROLE_USER").and()
		.withUser("admin").password("password").roles("ROLE_USER","ROLE_ADMIN");
	}

	 */














}
