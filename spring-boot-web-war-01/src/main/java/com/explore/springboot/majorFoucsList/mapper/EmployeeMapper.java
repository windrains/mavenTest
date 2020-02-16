package com.explore.springboot.majorFoucsList.mapper;

import com.explore.springboot.majorFoucsList.bean.Employee;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
