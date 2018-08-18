package by.yaroshuk;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println("a = " + a);
        switch (a){
                case 5:
                case 6:
                System.out.println("OK");
                break;
                default:
                    System.out.println("a = " + a);
        }

    }
}
