package com.study.oob;

public class MyDog {

    private String breed; // 品种
    private String name; // 名字
    private boolean master; // 是否有主人

    public MyDog(String breed, String name, boolean master) {
        this.breed = breed;
        this.name = name;
        this.master = master;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    // 狂叫能力
    public void bark() {
        System.out.println("无能狂怒...");
    }

    // 跳跃能力
    public void jump() {
        System.out.println("跳跃...");
    }

    // 拆家能力
    public void demolition() {
        System.out.println("拆家...");
    }

    @Override
    public String toString() {
        return "MyDog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
