package com.hj.zerock.springex.sample.mapper;

import com.hj.springex1.sample.domain.TodoVO;
import com.hj.springex1.sample.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class TodoMapperTests {
    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testInsert() {
        TodoVO todoVO = TodoVO.builder().title("스프링 테스트").dueDate(LocalDate.of(2023, 12, 12))
                .writer("user00").build();

        todoMapper.insert(todoVO);
    }
}
