package junit;



import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;





class Employees {



public String findName(ArrayList<String> employees, String name){

String result = "";



if(employees.contains(name)){

result="FOUND";

} else {

result="NOT FOUND";

}



return result;

}



}





class EmployeeTest {

Employees emp = new Employees();

ArrayList<String> list = new ArrayList<>();

{

list.add("Umesh");

list.add("Singh");

list.add("Java");

}





@Test

void testFindName() {

System.out.println(list);

assertEquals("Result", "FOUND", emp.findName(list, "Singh"));

System.out.println("Tested successfully.");

}



}

