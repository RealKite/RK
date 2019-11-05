package com.us.rk.model.service;

import java.util.List;

import com.us.rk.model.dto.BoardBean;

public interface BoardService {
	public List<BoardBean> findAll();
	public BoardBean findById(int board_no);
	public void boardWrite(BoardBean boardBean);
	public void boardUpdate(BoardBean boardBean);
}
