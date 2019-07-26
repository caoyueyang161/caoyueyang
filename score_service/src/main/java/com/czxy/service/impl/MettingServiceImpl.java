package com.czxy.service.impl;

import com.czxy.dao.MettingMapper;
import com.czxy.domain.Metting;
import com.czxy.service.MettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MettingServiceImpl implements MettingService {

    @Autowired
    private MettingMapper mettingMapper;
    @Override
    public List<Metting> findAll() {
        List<Metting> mettings = mettingMapper.findAll();
        return mettings;
    }

    @Override
    public Metting findmettingByid(Integer metting_id) {
        Metting metting = mettingMapper.selectByPrimaryKey(metting_id);
        return metting;
    }

    @Override
    public void addMetting(Metting metting) {
        mettingMapper.insert(metting);
    }

    @Override
    public List<Metting> findusernameAll(String username) {
        List<Metting> mettings = mettingMapper.findusernameAll(username);
        return mettings;
    }
}
