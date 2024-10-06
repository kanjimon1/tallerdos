package com.example.taller.dos.controller;

import com.example.taller.dos.model.TaskModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<TaskModel> task = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<TaskModel>> getAllTasks(){
        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<TaskModel> createTask(@RequestBody TaskModel task1){
        task.add(task1);
        return new ResponseEntity<>(task1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<TaskModel> completeTask(@PathVariable Long id){
        for (TaskModel task1 : task){
            if (task1.getId().equals(id)){
                task1.setCompleted(true);
                return ResponseEntity.ok(task1);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
