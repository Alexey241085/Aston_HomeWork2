package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> qqq = new ArrayList<>();
        qqq.add(44);
        qqq.add(29);
        qqq.add(14);

        MyArrayList<Integer> nums = new MyArrayList<>(qqq);
        nums.add(7);
        nums.add(5);
        nums.add(6);
        nums.add(23);
        nums.add(3);

        System.out.println("Метод get()");
        System.out.println(nums.get(1));
        System.out.println("******************");

        nums.updute(1,7);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("******************");
        System.out.println("******************");
        MyArrayList.bubleSort(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("******************");

        System.out.println("******************");
        System.out.println("Размер " + nums.size());
    }
}