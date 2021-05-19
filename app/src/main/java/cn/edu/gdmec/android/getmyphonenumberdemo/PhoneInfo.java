package cn.edu.gdmec.android.getmyphonenumberdemo;

/*
 * 封装类
 */

public class PhoneInfo {
    private String name;
    private String number;
    //构造函数
    public PhoneInfo(String name,String number){
        setNumber(number);
        setName(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
}
