package com.explore.springboot.majorFoucsList.controller;

import com.explore.springboot.majorFoucsList.bean.MmDishonestyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.explore.springboot.majorFoucsList.mapper.MmDishonestyListMapper;


@RestController
public class MajorFoucsListController {

    @Autowired
    MmDishonestyListMapper mapper;

    @GetMapping("/major/{operateNumber}")
    public MmDishonestyList getDeptById(@PathVariable("operateNumber") String operateNumber){
        MmDishonestyList deptById = mapper.getDeptById(operateNumber);

        return deptById;
    }

    /**
     * 请求url:   http://localhost:8080/major?operateNumber=2222&detail=abc甲乙丙丁81123
     * @param mmDishonestyList
     * @return
     */
    @GetMapping("/major")
    public MmDishonestyList insertDept(MmDishonestyList mmDishonestyList){
        mapper.insertDept(mmDishonestyList);
        return mmDishonestyList;
    }





}
