package com.tataaia.MovieInfo.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tataaia.MovieInfo.Bo.MovieBo;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoControler {
	@RequestMapping("/{movieId}")
	public MovieBo getMovieinfo(@PathVariable("movieId") String movieId) {
		return new MovieBo(movieId, "Love Aj kal");

	}

}
