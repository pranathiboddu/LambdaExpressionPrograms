/*
Create class StreamDemo.
Create List like-
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("ahana");
memberNames.add("Shahrukh");
memberNames.add("Salman");
memberNames.add("Yana");
memberNames.add("Lokesh");
a)print all the names starts with A.
b)print all the names in uppercase.
c)print all the names in uppercase whose name ends with s.
d)count all the names ends with h.
e)find the first name starts with ‘S’.
In the same class create another list of types numbers.
a)print all the numbers which are even.
 */
package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MembersStreamDemo {
    public static void main(String[] args)
    {
        List<String> memberNames = new ArrayList<String>(); //added list of membernames
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        //getting names starting with a
        List<String> startswithA= memberNames.stream().filter(l->l.startsWith("A")).collect(Collectors.toList());
        System.out.println("Names Start with a : " +startswithA);
        //converting names into uppercase
        memberNames.replaceAll(s->s.toUpperCase());
        System.out.println("Converting Names to Uppercase : " +memberNames);
        //getting names that are ending with s
        List<String> endwiths=memberNames.stream().filter(l->l.endsWith("S")).collect(Collectors.toList());
        System.out.println("Names ending with s : " +endwiths);
        //getting name count that are ending with h
        List<String> countendwithh=memberNames.stream().filter(l->l.endsWith("H")).collect(Collectors.toList());
        int count=countendwithh.size();
        System.out.println("Names ending with h : " +count);
        //getting names that are starting with s
        List<String> startswithS= memberNames.stream().filter(l->l.startsWith("S")).collect(Collectors.toList());
        System.out.println("Names Start with a : " +startswithS);

        List<Integer> numbers = new ArrayList<Integer>(); //adding list of integers
        numbers.add(11);
        numbers.add(22);
        numbers.add(13);
        numbers.add(24);
        numbers.add(77);
        numbers.add(6);
        //getting list of even numbers
        List<Integer> evennumber=numbers.stream().filter(l->l %2 ==0).collect(Collectors.toList());
        System.out.println("Even numbers : " +evennumber);


    }
}
