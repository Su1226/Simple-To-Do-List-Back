package com.korit.simpletodolistback.domain.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    private Integer todoId;
    private String todoContent;
    private String todoDate;
}

