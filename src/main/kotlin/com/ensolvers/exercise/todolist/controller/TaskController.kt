package com.ensolvers.exercise.todolist.controller

import com.ensolvers.exercise.todolist.entities.Task
import com.ensolvers.exercise.todolist.entities.TaskRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/tasks")
class TaskController(val taskRepository: TaskRepository) {
    @CrossOrigin()
    @GetMapping
    fun getTasks() = taskRepository.findAll()

    @CrossOrigin()
    @GetMapping("/{taskId}")
    fun getTask(@PathVariable("taskId") taskId: Long): Optional<Task> {
        return taskRepository.findById(taskId)
    }

    @CrossOrigin()
    @PostMapping
    fun newTask(@RequestBody task: Task) : Task{
        return taskRepository.save(task)
    }

    @CrossOrigin()
    @PutMapping("/{taskId}")
    fun updateTask(@PathVariable("taskId") taskId: Long, @RequestBody updatedTask: Task): Task?{
        val oldTask = taskRepository.findByIdOrNull(taskId)
        if (oldTask == null){
            return oldTask
        }
        return taskRepository.save(updatedTask)
    }

    @CrossOrigin()
    @DeleteMapping("/{taskId}")
    fun deleteTask(@PathVariable("taskId") taskId: Long){
        taskRepository.deleteById(taskId)
    }
}