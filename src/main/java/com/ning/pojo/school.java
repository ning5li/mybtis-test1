package com.ning.pojo;

public class school {

    private Integer id;

    private String schoolname;

    public school(Integer id, String schoolname) {
        this.id = id;
        this.schoolname = schoolname;
    }

    public school() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "school{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
