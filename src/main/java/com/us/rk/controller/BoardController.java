package com.us.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/board/{word}")
	public String boardSearch(@PathVariable("word") String word, Model model) {
		List<BoardBean> search = boardService.boardSearch(word);
		model.addAttribute("board", search);
		return "board";
	}
	
	@RequestMapping("/boardWrite")
	public String boardWriting(Model model) {
		model.addAttribute("boardBean", new BoardBean());
		return "boardWrite";
	}
	
	@RequestMapping("/boardWrite/{no}")
	public String boardModify(@PathVariable("no") int board_no, Model model) {
		BoardBean board = boardService.findById(board_no);
		System.out.println("번호~~~~~~~~~~~:" + board.getBoard_no());
		model.addAttribute("boardBean", board);
		return "boardWrite";
	}
	
	@RequestMapping("/boardView/{no}")
	public String boardView(@PathVariable("no") int board_no, Model model) {
		BoardBean board = boardService.findById(board_no);
		model.addAttribute("board", board);
		return "boardView";
	}
	
	@RequestMapping("/boardDelete/{no}")
	public String boardDelete(@PathVariable("no") int board_no, Model model) {
		boardService.boardDelete(board_no);
		return "redirect:/board";
	}
	
	@RequestMapping("/boardRegister")
	public String boardRegister(BoardBean boardBean) {
		System.out.println(boardBean.getBoard_no());
		System.out.println(boardBean.getBoard_no()=='0');
		if(boardBean.getBoard_no() == 0) {
			boardService.boardWrite(boardBean);
		}else {
			boardService.boardUpdate(boardBean);
		}
		return "redirect:board";
	}

	
}
