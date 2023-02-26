package com.cybersoft.demo.controller;

import com.cybersoft.demo.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    List<StudentModel> list = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> insertStudentRequestParam(
            @RequestParam String name,
            @RequestParam int age
            //@RequestParam(Post) truyền được cả từ Params,
            //Body form-data, urlencoded
    ) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> insertStudentPathVariable(
            @PathVariable String name,
            @PathVariable int age
    ) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> insertStudentResquestBody(
            @RequestBody StudentModel studentModel
    ) {
        list.add(studentModel);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
//    List<StudentModel> studentModelList = new ArrayList<>();
//
//    @PostMapping("")
//    public ResponseEntity<?> insertByParam(
//            @RequestParam String name,
//            @RequestParam int age
//    ) {
//        StudentModel studentModel = new StudentModel();
//        studentModel.setName(name);
//        studentModel.setAge(age);
//        studentModelList.add(studentModel);
//
//        return new ResponseEntity<>(studentModelList,HttpStatus.OK);
//    }
//
//    @PostMapping("/{name}/{age}")
//    public ResponseEntity<?> insertByPath(
//            @PathVariable String name,
//            @PathVariable int age
//    ) {
//        StudentModel studentModel = new StudentModel();
//        studentModel.setName(name);
//        studentModel.setAge(age);
//        studentModelList.add(studentModel);
//
//        return new ResponseEntity<>(studentModelList,HttpStatus.OK);
//    }
//
//    @PutMapping ("")
//    public ResponseEntity<?> insertByBody(
//            @RequestBody StudentModel studentModel
//    ) {
//
//        studentModelList.add(studentModel);
//
//        return new ResponseEntity<>(studentModelList,HttpStatus.OK);
//    }
}
