package com.explore.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ResponseBody
    @RequestMapping("/query")
    public Map<String,Object> query(){
        logger.debug("进入/query方法");
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from mm_publicity");
        return maps.get(0);
    }

    @RequestMapping("/thy")
    public String thy(Model model){
        logger.debug("进入thy.html页面");
        model.addAttribute("msg","thyme");
        return "/thy";
    }

    @RequestMapping("/enter")
    public String enter(Model model){
        logger.debug("进入success.jsp页面");
        model.addAttribute("msg","成功");
        return "success";
    }
}
