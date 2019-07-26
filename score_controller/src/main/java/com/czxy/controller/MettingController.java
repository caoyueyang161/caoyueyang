package com.czxy.controller;

import com.czxy.domain.Metting;
import com.czxy.domain.User;
import com.czxy.service.MettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("metting")
public class MettingController  {

    @Autowired
    private MettingService mettingService;

    @GetMapping
    public ResponseEntity<List<Metting>>findAll(){
        try {
            List<Metting> all = mettingService.findAll();
            return new ResponseEntity<>(all,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{metting_id}")
    public ResponseEntity<Metting>findmettingByid(@PathVariable("metting_id")Integer metting_id){
        try {
            Metting metting = mettingService.findmettingByid(metting_id);
            return new ResponseEntity<>(metting,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //添加
    @PostMapping("/addmetting")
    public ResponseEntity<Void>addMetting(@RequestBody Metting metting){
        try {
            mettingService.addMetting(metting);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    //根据用户找到对应的会议
    @GetMapping("/byuidmetting")
    public ResponseEntity<List<Metting>>findmetting(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        System.out.println(user);
        try {
            List<Metting> mettings = mettingService.findusernameAll(user.getUsername());
             return new ResponseEntity<>(mettings,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findmymetting/{metting_id}")
    public ResponseEntity<Metting>findmymetting(@PathVariable("metting_id")Integer metting_id){
        try {
            Metting metting = mettingService.findmettingByid(metting_id);
            return new ResponseEntity<>(metting,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
