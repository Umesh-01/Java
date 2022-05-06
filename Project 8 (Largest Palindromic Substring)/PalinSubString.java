package cse_pblj;

import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class PalinSubString {

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a String:");
	    String s = scan.nextLine();
	    long x=s.chars().distinct().count();
	    if(x==1){
	        System.out.println(s);
	    }else{
	        isPalindrome(s);
	    }
	
	}
	public static void isPalindrome(String s) {
	    HashSet<String> pals = new HashSet<>();
	    int count=0;
	    int max = -1;
	    String maxs = "";
	    for(int i=0;i<s.length();i++) {
	        for(int j=0;i-j>=0 && j+i<s.length();j++) {
	            if(s.charAt(i-j)==s.charAt(i+j)) {
	                String temp = s.substring(i-j, i+j+1);
	                if(!pals.contains(temp)) {
	                    pals.add(temp);
	                    if(maxs==""){
	                        maxs=temp;
	                        max=temp.length();
	                    }else{
	                        if(max<temp.length()){
	                            maxs=temp;
	                            max=temp.length();
	                        }
	                    }
	                    count++;
	                }
	            }else{
	                break;
	            }
	        }
	    }
	    for(int i=0;i<s.length();i++) {
	        for(int j=0;i-j>=0 && j+i+1<s.length();j++) {
	            if(s.charAt(i-j)==s.charAt(i+j+1)) {
	                String temp = s.substring(i-j, i+j+2);
	                if(!pals.contains(temp)) {
	                    pals.add(temp);
	                    if(maxs==""){
	                        maxs=temp;
	                        max=temp.length();
	                    }else{
	                        if(max<temp.length()){
	                            maxs=temp;
	                            max=temp.length();
	                        }
	                    }
	                    count++;
	                }
	            }else{
	                break;
	            }
	        }
	    }
	
	    System.out.println("Largest possible palindromic substring is:");
	    System.out.println(maxs);
	}
}
