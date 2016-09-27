package com.KevinMartin.exam01;


import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.List;

public class Method {


    static List<String> combine(List<String> firstList, List<String> secondList) {
        firstList.addAll(secondList);
        return firstList;
    }


    public  static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();

        c = combine(a,b);
    }
}
