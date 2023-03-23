package com.ning.test;

import com.ning.Utils.SqlSessionUtils;
import com.ning.mappers.courseMapper;
import com.ning.mappers.schoolMapper;
import com.ning.pojo.course;
import com.ning.pojo.school;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class schoolMapperTest {

    @Test
    public void courseInfoById(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        courseMapper mapper = sqlSession.getMapper(courseMapper.class);
        course course = mapper.courseInfo(2);
        System.out.println(course);
    }

    @Test
    public void courseInfoBySid(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        schoolMapper mapper = sqlSession.getMapper(schoolMapper.class);
        school school = mapper.schoolInfo("计算机学院");
        courseMapper mapper1 = sqlSession.getMapper(courseMapper.class);
        List<course> course = mapper1.courseInfoBysid(school.getId());
        System.out.println(course);
    }

    @Test
    public void changeHours(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        courseMapper mapper = sqlSession.getMapper(courseMapper.class);
        Integer integer = mapper.changeHours(4, 40);
        System.out.println("已修改"+integer+"条信息");
    }
    @Test
    public void insertCourse(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        courseMapper mapper = sqlSession.getMapper(courseMapper.class);
        course newCourse = new course(null, "大数据存储", 32, 1);
        Integer integer = mapper.insertCourse(newCourse);
        System.out.println("已插入"+integer+"条记录");
    }
    @Test
    public void selectAllCourses(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        courseMapper mapper = sqlSession.getMapper(courseMapper.class);
        List<course> courses = mapper.allCourses();
        System.out.println(courses);
    }

}
