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
public class ShowTableEntity {

	private String tableName;
	private LocalDateTime createdTime;
	private Integer columns;
	private String stableName;
	private Long uid;
	private Long tid;
	private Long vgId;

}
