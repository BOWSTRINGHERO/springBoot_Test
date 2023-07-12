package com.hj.springex1.sample.mapper;

import com.hj.springex1.sample.domain.TodoVO;

public interface TodoMapper {
    String getTime();

    void insert(TodoVO todoVO);
}
