package extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap {

private HashMap<String, String> M1;

  public CountryMap() {

  M1 = new HashMap<String, String>();

  }

  public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {

  M1.put(CountryName, capital);

  return M1;

  }

  public String getCapital(String CountryName) {

  return M1.get(CountryName);

  }

  public String getCountry(String capitalName) {

  Set<Entry<String, String>> set = M1.entrySet();

  Iterator<Entry<String, String>> it = set.iterator();

  while (it.hasNext()) {

  Map.Entry<String, String> me = it.next();

  if (me.getValue().equals(capitalName))

  return me.getKey();

  }

  return null;

  }

  public HashMap<String, String> swapKyeValue() {

  HashMap<String, String> M2 = new HashMap<String, String>();

  Set<Entry<String, String>> set = M1.entrySet();

  Iterator<Entry<String, String>> it = set.iterator();

  while (it.hasNext()) {

  Map.Entry<String, String> me = it.next();

  M2.put(me.getValue(), me.getKey());

  }

  return M2;

  }

  public ArrayList<String> toArrayList() {

  ArrayList<String> list = new ArrayList<>();

  Set<Entry<String, String>> set = M1.entrySet();

  Iterator<Entry<String, String>> it = set.iterator();

  while (it.hasNext()) {

  Map.Entry<String, String> me = it.next();

  list.add(me.getKey());

  }

  return list;

  }

  }


public class CountryCapital {

  public static void main(String[] args) {

  CountryMap countryMap = new CountryMap();

  countryMap.saveCountryCapital("India", "Delhi");

  countryMap.saveCountryCapital("Japan", "Tokyo");

  countryMap.saveCountryCapital("USA", "Washington, D.C.");

  System.out.println(countryMap.getCapital("India"));

  System.out.println(countryMap.getCountry("Tokyo"));

  System.out.println(countryMap.toArrayList());

  HashMap<String, String> M2 = countryMap.swapKyeValue();

  System.out.println(M2);

  }
  
}
