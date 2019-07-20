package com.xcy.pojo;

public class SelectByType {
    private String sex;
    private int paixu;

    public SelectByType(){}

    public SelectByType(String sex) {
        this.sex = sex;
    }

    public SelectByType(int paixu) {
        this.paixu = paixu;
    }

    public SelectByType(String sex, int paixu) {
        this.sex = sex;
        this.paixu = paixu;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPaixu() {
        return paixu;
    }

    public void setPaixu(int paixu) {
        this.paixu = paixu;
    }

    @Override
    public String toString() {
        return "SelectByType{" +
                "sex='" + sex + '\'' +
                ", paixu=" + paixu +
                '}';
    }
}
