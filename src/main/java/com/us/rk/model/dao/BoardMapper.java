package com.us.rk.model.dao;

import java.util.List;

import com.us.rk.model.dto.BoardBean;

public interface BoardMapper {
	public List<BoardBean> findAll();
	public BoardBean findById(int board_no);
	public void boardWrite(BoardBean boardBean);
	public void boardUpdate(BoardBean boardBean);
	public void boardDelete(int board_no);
	public List<BoardBean> boardSearch(String word);
}
