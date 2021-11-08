package Singleton.StaticInClass;

import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance().hashCode() == Singleton.getInstance().hashCode());
    }
}
