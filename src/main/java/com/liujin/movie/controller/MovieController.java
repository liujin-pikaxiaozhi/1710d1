package com.liujin.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liujin.movie.domain.Movie;
import com.liujin.movie.service.MovieService;
import com.liujin.movie.vo.MovieVO;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	@RequestMapping("select")
	public String select(Model m,MovieVO vo) {
		List<Movie> list = service.selects(vo);
		m.addAttribute("list", list);
		m.addAttribute("vo", vo);
		return "list";
	}
}
