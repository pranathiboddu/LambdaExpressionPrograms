/*
Create class StreamDemo .
Create list like -
places.add("Nepal, Kathmandu");
places.add("Nepal, Pokhara");
places.add("India, Delhi");
places.add("USA, New York");
places.add("Africa, Nigeria");
a)print all the places from Nepal.
Output should be Kathmandu and Pokhara.
 */
package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args)
    {
        ArrayList<String> places=new ArrayList<>(); //added list of elements
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        //getting all the places from nepal
        List<String> partofplace= places.stream().filter(l->l.startsWith("Nepal")).collect(Collectors.toList());
        System.out.println(partofplace);

    }
}
