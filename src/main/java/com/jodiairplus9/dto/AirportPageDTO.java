package com.jodiairplus9.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AirportPageDTO {

	private Integer page = 0;
	private Long totalElements = 0L;

	private List<AirportDTO> airports;
}





