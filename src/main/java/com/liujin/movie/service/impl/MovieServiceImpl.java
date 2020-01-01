package com.liujin.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liujin.movie.dao.MovieDao;
import com.liujin.movie.domain.Movie;
import com.liujin.movie.service.MovieService;
import com.liujin.movie.vo.MovieVO;
@Service("service")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;

	@Override
	public List<Movie> selects(MovieVO vo) {
		// TODO Auto-generated method stub
		return dao.selects(vo);
	}
	
}
