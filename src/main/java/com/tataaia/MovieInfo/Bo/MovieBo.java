package com.tataaia.MovieInfo.Bo;

public class MovieBo {
	private String movieId;
	private String name;

	@Override
	public String toString() {
		return "MovieBo [movieId=" + movieId + ", name=" + name + "]";
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieBo(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

	public MovieBo() {
		super();
	}

}
