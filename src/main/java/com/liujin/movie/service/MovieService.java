package com.liujin.movie.service;

import java.util.List;

import com.liujin.movie.domain.Movie;
import com.liujin.movie.vo.MovieVO;

public interface MovieService {

	List<Movie> selects(MovieVO vo);
	
}
