package com.hj.jdbcex1.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Builder
@ToString
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueData;
    private boolean finished;
}
