package com.xingtaizhiye.spring5;

public class Orders {
    private String oname;
    private String address;

    public Orders(){
        System.out.println("git test");
        System.out.println("git test2");
        System.out.println("hello git test3 by hot-fix");
    }

    public Orders(String oname,String address){
        this.oname = oname;
        this.address = address;
    }

    public void testDemo(){
        System.out.println(oname+"的地址是："+address);
    }
}
