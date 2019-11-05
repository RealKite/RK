package com.us.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.us.rk.model.dto.BoardBean;
import com.us.rk.model.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;  
	
	@RequestMapping("/board")
	public String boardList(Model model) {
		List<BoardBean> findAll = boardService.findAll();
		model.addAttribute("board", findAll);
		return "board";
	}
	
	@RequestMapping("/boardWriting")
	public String boardWriting(Model model) {
		return "boardWriting";
	}
	
	@RequestMapping("/boardWriting/{no}")
	public String boardModify(@PathVariable("no") int board_no, Model model) {
		BoardBean board = boardService.findById(board_no);
		System.out.println("번호~~~~~~~~~~~:" + board.getBoard_no());
		model.addAttribute("boardBean", board);
		return "boardWriting";
	}
	
	@RequestMapping("/boardView/{no}")
	public String boardView(@PathVariable("no") int board_no, Model model) {
		BoardBean board = boardService.findById(board_no);
		model.addAttribute("board", board);
		return "boardView";
	}
	
	@RequestMapping("/boardRegister")
	public String boardRegister(BoardBean boardBean) {
		System.err.println("이건? : " +boardBean);
		System.out.println("글번호: " + boardBean.getBoard_no());
		if(boardBean.getBoard_no() == 0) {
			System.out.println("1번이야?");
			boardService.boardWrite(boardBean);
		}else {
			System.out.println("2번이야?");
			boardService.boardUpdate(boardBean);
			System.out.println("수정 : " + boardBean);
		}	
		return "redirect:board";
	}
}
