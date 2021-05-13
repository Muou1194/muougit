package com.zht.pojo;

public class Bean {

    String str;

    public Bean(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "bean{" +
                "str='" + str + '\'' +
                '}';
    }
}
