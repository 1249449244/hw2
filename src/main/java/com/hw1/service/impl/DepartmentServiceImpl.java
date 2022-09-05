package com.hw1.service.impl;

import com.hw1.mapper.DepartmentMapper;
import com.hw1.pojo.Department;
import com.hw1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper dm;
    @Override
    public List<Department> select() {
        return dm.selectList(null);
    }
}
