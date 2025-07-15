package com.korit.simpletodolistback.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ToDoListController {
    private final ToDoListService toDoListService;

    @PostMapping("/todos")
    public ResponseEntity<?> register(@RequestBody RegisterDto dto) {
        System.out.println(dto);
        toDoListService.register(dto);
        return ResponseEntity.ok("등록 성공");
    }

    @GetMapping("/todos")
    public ResponseEntity<?> getToDoList() {
        return ResponseEntity.ok(toDoListService.getTodoList());
    }

    @DeleteMapping("/todos/{todoId}")
    public ResponseEntity<?> deleteOne(@PathVariable Integer todoId) {
        System.out.println(todoId);
        toDoListService.deleteOne(todoId);
        return ResponseEntity.ok("삭제 성공");
    }

    @DeleteMapping("/todos")
    public ResponseEntity<?> deleteAll(@RequestBody List<Integer> todoIds) {
        System.out.println(todoIds);
        toDoListService.deleteAll(todoIds);
        return ResponseEntity.ok("선택 삭제 성공");
    }

    @PutMapping("/todos/{todoId}")
    public ResponseEntity<?> modify(@PathVariable Integer todoId, @RequestBody ModifyDto dto) {
        System.out.println(todoId);
        System.out.println(dto);
        toDoListService.modify(todoId, dto);
        return ResponseEntity.ok("수정 성공");
    }
}
