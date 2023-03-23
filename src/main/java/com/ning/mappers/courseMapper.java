package com.ning.mappers;

import com.ning.pojo.course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface courseMapper {

    course courseInfo(@Param("id") Integer id);

    //分布查询第二步
    List<course> courseInfoBysid(@Param("sid") Integer sid);

    Integer changeHours(@Param("id")Integer id,@Param("hours")Integer hours );

    Integer insertCourse(course course);

    List<course> allCourses();
}
