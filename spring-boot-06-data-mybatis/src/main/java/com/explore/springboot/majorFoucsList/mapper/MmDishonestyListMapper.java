package com.explore.springboot.majorFoucsList.mapper;

import com.explore.springboot.majorFoucsList.bean.MmDishonestyList;
import org.apache.ibatis.annotations.*;


/**
 * 每个Mapper接口上加@Mapper注解或直接在启动类上添加@MapperScan(basePackages = "com.*.mapper")
 */
//@Mapper
public interface MmDishonestyListMapper{

    /**
     * 默认operate_number要转换成operateNumber，否则封装不到Javabean中。
     * 解决方式：新增一个定制mybatis配置项的bean：ConfigurationCustomizer。在com.explore.springboot.config.MybatisConfig类中已定义。
     */
    @Select("select operate_number operateNumber,dishonesty_reason, detail from mm_dishonesty_list where operate_number=#{operateNumber}")
    public MmDishonestyList getDeptById(String operateNumber);

    @Delete("delete from mm_dishonesty_list where operate_number=#{operateNumber}")
    public int deleteDeptById(String operateNumber);

    /**
     * useGeneratedKeys：自动生成主键，插入数据库后添加到return对象中。
     */
//    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into mm_dishonesty_list(operate_number,detail) values(#{operateNumber},#{detail})")
    public int insertDept(MmDishonestyList mmDishonestyList);

    @Update("update mm_dishonesty_list set participant_id=#{participantId} where operate_number=#{operateNumber}")
    public int updateDept(MmDishonestyList mmDishonestyList);
}
