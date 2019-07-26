package com.czxy.service.impl;

import com.czxy.dao.RoomMapper;
import com.czxy.domain.Room;
import com.czxy.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;
    @Override
    public List<Room> findAll() {
        return roomMapper.selectAll();
    }
}
