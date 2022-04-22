package extra;



import java.util.Collections;

import java.util.Iterator;

import java.util.TreeSet;



public class TreeSetCollection {



public static void main(String[] args) {

TreeSet<String> set = new TreeSet<>();



set.add("Umesh");

set.add("Singh");

set.add("Chandigarh");

set.add("University");



Iterator<String> it = set.iterator();

String query = "Singh";

boolean result = false;



while (it.hasNext()) {

if (it.next().equals(query)) {

result = true;

break;

}

}



if (result) System.out.println(query + " exists");

else System.out.println(query + " doesn't exist");



}



}
