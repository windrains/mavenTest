package com.explore.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    /**
     * 配置好数据源之后，只需注入JdbcTemplate，即可直接用JdbcTemplate执行sql查询
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String,Object> query(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from mm_publicity");
        return maps.get(0);
    }
}
