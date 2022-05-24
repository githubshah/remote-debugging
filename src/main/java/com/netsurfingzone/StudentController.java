package com.netsurfingzone;

import com.netsurfingzone.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class BookController {

    @RequestMapping(value = "/simpleuri", method = RequestMethod.GET)
    @ResponseBody
    public Student getBook() {
        Student student = new Student();
        student.setId(1l);
        student.setRollNumber("0126CS071");
        student.setName("rakesh");
        return student;
    }

}