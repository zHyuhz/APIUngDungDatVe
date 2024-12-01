package com.DoAnChuyenNganh.UngDungDatVeXemPhim.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movies")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movie_id;
	@Column(name = "movie_name", length = 50)
	private String movieName;

	@Lob
    @Column(name = "movie_description", columnDefinition = "NVARCHAR(MAX)")
	private String movie_description;

	@Column(name = "movie_genres")
	private String movie_genres;

	@Column(name = "movie_release")
	private LocalDate movie_release;

	@Column(name = "movie_length")
	private int movie_length;

	@Column(name = "movie_poster")
	private String movie_poster;

}
