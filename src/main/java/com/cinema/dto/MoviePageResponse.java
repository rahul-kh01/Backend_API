/**
 * 
 */
package com.cinema.dto;

import java.util.List;

/**
 * @author rahul khandelwal
 *
 */
public record MoviePageResponse(List<MovieDto> movieDtos, Integer pageNumber, Integer pageSize, long totalElements,
		int totalPages, boolean isLast) {

	

}
