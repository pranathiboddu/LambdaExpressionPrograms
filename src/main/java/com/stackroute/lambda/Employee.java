/*
Create Employee class having 3 fields name as age , name and lastname.
Generate constructor and getter/setter.
Create LambdaDemoClass this class will create List objects of type Employees.
Following implementation needs to be done
 a)Sort the list by lastname.
 b)print all employee whose lastname starts with ‘C’
 */
package com.stackroute.lambda;

public class Employee {
    //initialized age and name
    private int age;
    private String name;
    //generated getter and setter methods

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;

    public Employee(int age,String name,String lastname)
    {
        this.age=age;
        this.name=name;
        this.lastname=lastname;
    }
    @Override
    public String toString() {
        return ("\n["+this.age+","+this.name+","+this.lastname+"]");
    }
}


