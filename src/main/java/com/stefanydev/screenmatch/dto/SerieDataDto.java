package com.stefanydev.screenmatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieDataDto(
        @JsonAlias("Title") String title,
        String imdbRating,
        Integer totalSeasons){
}
