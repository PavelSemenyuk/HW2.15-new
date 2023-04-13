package com.example.hw2_15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("Ivan1");
        myArrayList.add("Ivan2");
        myArrayList.add("Petr1");
        myArrayList.add("Ivan4");
        myArrayList.add("Ivan5");
        myArrayList.add("Ivan6");
        myArrayList.add("Ivan7");
        myArrayList.add("Ivan8");
        myArrayList.add("Ivan9");



        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add("Ivan1");
        myArrayList1.add("Ivan2");
        myArrayList1.add("Ivan3");
        myArrayList1.add("Ivan4");
        myArrayList1.add("Ivan5");
        myArrayList1.add("Ivan6");
        myArrayList1.add("Ivan7");
        myArrayList1.add("Ivan8");
        myArrayList1.add("Ivan9");

        myArrayList1.set(2,"Petr1");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.toArray()[i]+ ", ");
        }

        for (int i = 0; i < myArrayList1.size(); i++) {
            System.out.println(myArrayList1.toArray()[i]+ ", ");
        }

        System.out.println(myArrayList.equals(myArrayList1));
    }

}
