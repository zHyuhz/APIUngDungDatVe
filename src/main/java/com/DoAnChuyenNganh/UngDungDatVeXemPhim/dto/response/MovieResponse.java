package com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieResponse {

	private int movie_id;

	private String movie_name;

	private String movie_description;

	private String movie_genres;

	private LocalDate movie_release;

	private int movie_length;
	
	private String movie_poster;
}
