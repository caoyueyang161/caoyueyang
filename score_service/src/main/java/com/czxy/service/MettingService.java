package com.czxy.service;

import com.czxy.domain.Metting;

import java.util.List;

public interface MettingService {

    public List<Metting>findAll();

    public Metting findmettingByid(Integer metting_id);

    public void addMetting(Metting metting);

    public List<Metting>findusernameAll(String username);


}
