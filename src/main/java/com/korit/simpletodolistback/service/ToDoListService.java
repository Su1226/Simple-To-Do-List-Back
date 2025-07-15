package com.korit.simpletodolistback.service;

import com.korit.simpletodolistback.domain.todo.ToDo;
import com.korit.simpletodolistback.domain.todo.ToDoMapper;
import com.korit.simpletodolistback.dto.ModifyDto;
import com.korit.simpletodolistback.dto.RegisterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoListService {

    private final ToDoMapper toDoMapper;

    public void register(RegisterDto dto) {
        ToDo toDo = dto.toToDo();
        toDoMapper.register(toDo);
    }

    public List<ToDo> getTodoList() {
        return toDoMapper.findAll();
    }

    public void deleteOne(Integer todoId) {
        toDoMapper.deleteOne(todoId);
    }

    public void deleteAll(List<Integer> todoIds) {
        toDoMapper.deleteById(todoIds);
    }

    public void modify(Integer todoId, ModifyDto dto) {
        toDoMapper.modifyById(dto.toToDo(todoId));
    }

}
