package com.xingtaizhiye.spring5.factorybean;

import com.xingtaizhiye.spring5.bean.Student;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Student> {
    //定义返回bean类
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setName("zhangsan");
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
