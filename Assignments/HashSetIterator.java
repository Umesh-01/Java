package extra;



import java.util.HashSet;

import java.util.Iterator;



public class HashSetIterator {



public static void main(String[] args) {

HashSet<String> set = new HashSet<>();



set.add("Umesh");

set.add("Singh");

set.add("Jenny");

set.add("Ben");

set.add("Tom");



Iterator<String> it = set.iterator();

while (it.hasNext())

System.out.println(it.next());



}



}
