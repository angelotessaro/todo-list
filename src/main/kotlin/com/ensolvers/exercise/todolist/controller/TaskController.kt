package com.ensolvers.exercise.todolist.controller

import com.ensolvers.exercise.todolist.entities.Task
import com.ensolvers.exercise.todolist.entities.TaskRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TaskController(val taskRepository: TaskRepository) {

    @PostMapping
    fun newTask(@RequestBody task: Task) : Task{
        return taskRepository.save(task)
    }
}