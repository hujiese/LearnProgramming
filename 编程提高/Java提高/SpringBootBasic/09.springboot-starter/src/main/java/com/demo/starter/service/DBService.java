package com.demo.starter.service;

public class DBService {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public DBService(String driverClassName, String url, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
        System.out.println("DB Connect Ok .... ");
        System.out.println("url = " + url);
        System.out.println("db driver class name = " + driverClassName);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    public void save() {
        System.out.println("public void save() func invoked !");
    }

    public void delete() {
        System.out.println("public void delete() func invoked !");
    }

    public void update() {
        System.out.println("public void update() func invoked !");
    }

    public void query() {
        System.out.println("public void query() func invoked !");
    }
}
