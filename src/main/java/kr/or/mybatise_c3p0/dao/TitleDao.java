package kr.or.mybatise_c3p0.dao;

import java.util.List;

import kr.or.mybatise_c3p0.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	Title selectTitlebyCode(Title title);
	int insertTitle(Title title);
	int deleteTitle(Title title);
	int updateTitle(Title title);
}
