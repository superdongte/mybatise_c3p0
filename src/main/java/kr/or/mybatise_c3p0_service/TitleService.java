package kr.or.mybatise_c3p0_service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.mybatise_c3p0.dao.TitleDao;
import kr.or.mybatise_c3p0.dto.Title;
import kr.or.mybatise_c3p0.jdbc.MyBaisSqlSessionFactory;

public class TitleService implements TitleDao {
	private String namespace  = "kr.or.mybatise_c3p0.dao.TitleDao";
	private static final Log log = LogFactory.getLog(TitleService.class);
	@Override
	public List<Title> selectTitleByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title selectTitlebyCode(Title title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		log.debug("insertTitle()");
		try(SqlSession sqlSession = MyBaisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertTitle", title);
			sqlSession.commit();
			return res;
		}
		
	}

	@Override
	public int deleteTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

}
