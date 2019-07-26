package com.czxy.service.impl;

import com.czxy.dao.DeptMapper;
import com.czxy.domain.Dept;
import com.czxy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        List<Dept> depts = deptMapper.selectAll();
        return depts;
    }
}
