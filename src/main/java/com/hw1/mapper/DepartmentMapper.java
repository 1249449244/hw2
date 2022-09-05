package com.hw1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hw1.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
