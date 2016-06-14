package com.theironyard;

/**
 * Created by Ben on 6/8/16.
 */
public class User {
    String name;
    String password;
    int id;

    public User(int id, String name, String password) {
        this.password = password;
        this.name = name;
        this.id = id;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
