package com.example.demo_csw.controllers;


import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class HomeController {
    private final IStudentService studentService;

    @GetMapping
    public ResponseEntity getAllStudents() {
        return studentService.getAllStudents();
    }
}