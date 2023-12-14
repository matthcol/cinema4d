package org.example.cinema.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Movie implements Serializable {
    private Integer id;
    private String title;
    private int year;
}
