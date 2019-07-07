/*
Create Employee class having 3 fields name as age , name and lastname.
Generate constructor and getter/setter.
Create LambdaDemoClass this class will create List objects of type Employees.
Following implementation needs to be done
 a)Sort the list by lastname.
 b)print all employee whose lastname starts with ‘C’
 */
package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemoClass
{
    public static void main(String[] args)
    {

            List<Employee> listemployee = new ArrayList<Employee>(); //added list of employees
            listemployee.add(new Employee(21, "Pranathi", "Boddu"));
            listemployee.add(new Employee(23, "Varshini", "Vankayalapati"));
            listemployee.add(new Employee(23, "Srilu", "Addanki"));
            listemployee.add( new Employee(24, "Yaksha", "Chandra"));
            listemployee.add(new Employee(20, "Pravalika", "Peddola"));
            listemployee.sort(Comparator.comparing(Employee::getLastname)); //sorting by lastname
            System.out.println(listemployee);
            //getting employee name starting lsatname eith c
            List<Employee> lastnamestartwithc= listemployee.stream().filter(l->l.getLastname().startsWith("C")).collect(Collectors.toList());
            System.out.println(lastnamestartwithc);

    }
}
