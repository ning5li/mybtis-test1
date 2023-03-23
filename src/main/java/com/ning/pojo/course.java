package com.ning.pojo;

public class course {

    private Integer id;

    private String name;

    private Integer hours;

    private Integer sid;

    public course(Integer id, String name, Integer hours, Integer sid) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.sid = sid;
    }

    public course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", sid=" + sid +
                '}';
    }
}
