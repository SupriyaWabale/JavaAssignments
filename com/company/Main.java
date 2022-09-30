package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(11);
        values.add(12);
        values.stream().forEach(i -> System.out.println(i)); // to convert arraylist to stream

    }
}
