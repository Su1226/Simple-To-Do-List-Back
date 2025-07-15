package com.korit.simpletodolistback.dto;

import com.korit.simpletodolistback.domain.todo.ToDo;
import lombok.Data;

@Data
public class ModifyDto {
    private String content;

    public ToDo toToDo(Integer todoId) {
        return ToDo.builder()
                .todoId(todoId)
                .todoContent(content)
                .build();
    }
}