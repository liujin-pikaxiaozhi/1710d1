package com.liujin.movie.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liujin.movie.domain.Movie;
import com.liujin.movie.service.MovieService;
import com.liujin.movie.vo.MovieVO;
@RunWith(SpringJUnit4ClassRunner.class)//开启spring
@ContextConfiguration(locations="classpath:spring-beans.xml")//调查spring核心配置文件的位置
public class MovieServiceImplTest {

	@Autowired
	private MovieService service;
	
	//测试
	@Test
	public void testSelects(MovieVO vo) {
		List<Movie> list = service.selects(vo);
		System.out.println(list);
	}

}
