package com.fikri.springdasar.core;

public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database == null){
            database = new Database();
            System.out.println("create new Instance");
        }

        return database;
    }
}
