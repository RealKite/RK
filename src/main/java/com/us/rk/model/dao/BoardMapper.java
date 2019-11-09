package com.us.rk.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.us.rk.model.dto.BoardBean;

@Repository(value = "BoardMapper")
public interface BoardMapper {
	public List<BoardBean> findAll(BoardBean boardBean);
	public BoardBean findById(int board_no);
	public void boardWrite(BoardBean boardBean);
	public void boardUpdate(BoardBean boardBean);
	public void boardDelete(int board_no);
	public List<BoardBean> boardSearch(String word);
	
	public int boardListCount();
}
