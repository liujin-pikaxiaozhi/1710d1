package com.liujin.movie.dao;

import java.util.List;

import com.liujin.movie.domain.Movie;
import com.liujin.movie.vo.MovieVO;

public interface MovieDao {

	List<Movie> selects(MovieVO vo);

}
