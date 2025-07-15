package com.korit.simpletodolistback.domain.todo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToDoMapper {

    public int register(ToDo todo);
    public int deleteOne(Integer todoId);
    public List<ToDo> findAll();
    public int deleteById(List<Integer> todoIds);
    public int modifyById(ToDo toDo);
}