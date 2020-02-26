package com.explore.springboot.majorFoucsList.mapper;

import com.explore.springboot.majorFoucsList.bean.MmMarketparticipant;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 接口上加上@Mapper或启动类上加上@MapperScan
 */
public interface MmMarketparticipantMapper {
    public MmMarketparticipant partId(String participantId);

    List<Map> queryPerson(@Param("param") Map param);
}
