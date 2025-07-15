package com.korit.simpletodolistback.dto;

import com.korit.simpletodolistback.domain.todo.ToDo;
import lombok.Data;

@Data
public class RegisterDto {
    private String content;
    private String date;

    public ToDo toToDo() {
        return ToDo.builder()
                .todoContent(content)
                .todoDate(date)
                .build();
    }
}