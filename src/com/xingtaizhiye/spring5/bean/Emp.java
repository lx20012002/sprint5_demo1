package com.xingtaizhiye.spring5.bean;

public class Emp {
    private String ename;
    private String gender;

    //员工属于某一个部门，使用对象形式表示
    private Department dept;

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
