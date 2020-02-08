package com.explore.springboot.majorFoucsList.mapper;

import com.explore.springboot.majorFoucsList.bean.MmDishonestyList;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MmDishonestyListMapper{

    /**
     * operate_number要转换成operateNumber，否则封装不到Javabean中
     */
    @Select("select operate_number operateNumber,dishonesty_reason dishonestyReason, detail from mm_dishonesty_list where operate_number=#{operateNumber}")
    public MmDishonestyList getDeptById(String operateNumber);

    @Delete("delete from mm_dishonesty_list where operate_number=#{operateNumber}")
    public int deleteDeptById(String operateNumber);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into mm_dishonesty_list(operate_number,detail) values(#{operateNumber},#{detail})")
    public int insertDept(MmDishonestyList mmDishonestyList);

    @Update("update mm_dishonesty_list set participant_id=#{participantId} where operate_number=#{operateNumber}")
    public int updateDept(MmDishonestyList mmDishonestyList);
}
