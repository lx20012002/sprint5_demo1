package com.xingtaizhiye.spring5;

public class Orders {
    private String oname;
    private String address;

    public Orders(){

    }

    public Orders(String oname,String address){
        this.oname = oname;
        this.address = address;
    }

    public void testDemo(){
        System.out.println(oname+"的地址是："+address);
    }
}
