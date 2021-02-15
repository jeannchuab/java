package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Challange: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

public class Main {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        Map <String, String> map = new HashMap<String,String>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            map.put(name, Integer.toString(phone));
        }
        System.out.println(map);

        while(in.hasNext()){
            String s = in.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
