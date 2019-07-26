package com.czxy.controller;

import com.czxy.domain.Dept;
import com.czxy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public ResponseEntity<List<Dept>>findAll(){
        try {
            List<Dept> all = deptService.findAll();
            return new ResponseEntity<>(all,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
