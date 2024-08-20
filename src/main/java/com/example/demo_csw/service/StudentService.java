package com.example.demo_csw.service;

import com.example.demo_csw.DTO.ResponseEntity;
import com.example.demo_csw.constant.CommonDefine;
import com.example.demo_csw.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity getAllStudents() {
        ResponseEntity responseEntity = new ResponseEntity();
        try {
            responseEntity.setCode(CommonDefine.SUCCESS_CODE);
            responseEntity.setMsg(CommonDefine.SUCCESS_MESSAGE);
            List<Object> students = List.of(studentRepository.findAll().toArray());
            responseEntity.setData(students);

        }catch (Exception e){
            responseEntity.setCode(CommonDefine.ERROR_CODE);
            responseEntity.setMsg(e.getMessage());
            return responseEntity;
        }
        return responseEntity;
    }
}