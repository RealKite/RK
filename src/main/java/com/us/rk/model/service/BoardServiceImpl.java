package com.us.rk.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.us.rk.model.dao.BoardMapper;
import com.us.rk.model.dto.BoardBean;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardBean> findAll() {
		List<BoardBean> findAll = boardMapper.findAll(); 
		return findAll;
	}
	
	@Override
	public void boardWrite(BoardBean boardBean) {
		boardMapper.boardWrite(boardBean);
	}
	
	@Override
	public BoardBean findById(int board_no) {
		return boardMapper.findById(board_no);
	}
	
	@Override
	public void boardUpdate(BoardBean boardBean) {
		boardMapper.boardUpdate(boardBean);
	}
}
