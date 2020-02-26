package com.explore.springboot.majorFoucsList.controller;

import com.explore.springboot.majorFoucsList.bean.Employee;
import com.explore.springboot.majorFoucsList.bean.MmDishonestyList;
import com.explore.springboot.majorFoucsList.bean.MmMarketparticipant;
import com.explore.springboot.majorFoucsList.mapper.EmployeeMapper;
import com.explore.springboot.majorFoucsList.mapper.MmDishonestyListMapper;
import com.explore.springboot.majorFoucsList.mapper.MmMarketparticipantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class MajorFoucsListController {

    @Autowired
    MmDishonestyListMapper mapper;

    @Autowired
    MmMarketparticipantMapper mmMarketparticipantMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/majorFoucsList/{operateNumber}")
    public MmDishonestyList getDeptById(@PathVariable("operateNumber") String operateNumber){
        MmDishonestyList deptById = mapper.getDeptById(operateNumber);

        return deptById;
    }

    /**
     * 请求url:   http://localhost:8080/majorFoucsList?operateNumber=2222&detail=abc甲乙丙丁81123
     * @param mmDishonestyList
     * @return
     */
    @GetMapping("/majorFoucsList")
    public MmDishonestyList insertDept(MmDishonestyList mmDishonestyList){
        mapper.insertDept(mmDishonestyList);
        return mmDishonestyList;
    }





    @GetMapping("/queryPerson/{participantId}")
    public Map queryPerson(@PathVariable("participantId") String participantId){
        Map map = new HashMap();
        map.put("participantId",participantId);
        List<Map> list = mmMarketparticipantMapper.queryPerson(map);
        return list.get(0);
    }


    @GetMapping("/majorFoucsList/partId/{participantId}")
    public MmMarketparticipant partId(@PathVariable("participantId") String participantId){
        MmMarketparticipant mmMarketparticipant = mmMarketparticipantMapper.partId(participantId);

        return mmMarketparticipant;
    }


    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }


}
