package com.czxy.controller;

import com.czxy.domain.Room;
import com.czxy.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootApplication
@RequestMapping("room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>>findAll(){
        try {
            List<Room> all = roomService.findAll();
            return new ResponseEntity<>(all,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
