package com.xcy.pojo;

public class AdminPet {
    private String address;
    private String name;
    private int id;
    private String type;
    private String strain;
    private String petname;
    private String petinfo;
    private int num;
    private int petprice;
    private String sex;
    private String img1;
    private String img2;
    private String img3;
    private int aid;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getPetinfo() {
        return petinfo;
    }

    public void setPetinfo(String petinfo) {
        this.petinfo = petinfo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPetprice() {
        return petprice;
    }

    public void setPetprice(int petprice) {
        this.petprice = petprice;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "AdminPet{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", strain='" + strain + '\'' +
                ", petname='" + petname + '\'' +
                ", petinfo='" + petinfo + '\'' +
                ", num=" + num +
                ", petprice=" + petprice +
                ", sex='" + sex + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", img3='" + img3 + '\'' +
                ", aid=" + aid +
                '}';
    }
}
