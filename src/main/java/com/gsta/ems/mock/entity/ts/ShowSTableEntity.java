package com.gsta.ems.mock.entity.ts;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author neo
 * @since 1.0
 */
@Getter
@Setter
public class ShowSTableEntity {

	private String name;
	private LocalDateTime createdTime;
	private Integer columns;
	private Integer tags;
	private Integer tables;

}
