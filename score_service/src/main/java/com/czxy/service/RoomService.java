package com.czxy.service;

import com.czxy.domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService  {

    public List<Room>findAll();
}
