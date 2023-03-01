package usc;

import code.EnumSingleton;

import java.sql.SQLOutput;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton another = EnumSingleton.INSTANCE;
        System.out.println(singleton == another);
        EnumSingleton singleton1 = EnumSingleton.INSTANCE1;
        singleton.setName("Bob");
        System.out.println(another.getName());
        System.out.println(singleton1.getName());
    }
}
