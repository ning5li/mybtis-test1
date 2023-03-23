package com.ning.mappers;

import com.ning.pojo.school;
import org.apache.ibatis.annotations.Param;

public interface schoolMapper {

    //分布查询第一步
    public school schoolInfo(@Param("schoolname") String schoolname);


}
