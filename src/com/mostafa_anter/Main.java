package com.mostafa_anter;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Father son_a = new SonA();
        Father son_b = new SonB();

        /**
         * hash set the only feature that you cant add the same object twice
         * */
        HashSet<Father> set = new HashSet<>();
        set.add(son_a);
        set.add(son_b);
        set.add(son_a);
        set.add(son_b);

        // test hash set
        System.out.println(set.size());
        // test polymorphism
        System.out.println(typeName(son_a));
        System.out.println(typeName(son_b));
    }


    /**
     *
     * @param o
     * @return name of object
     * this function for test polymorphism
     */
    public static String typeName(Father o){
        return o.name();
    }
}
