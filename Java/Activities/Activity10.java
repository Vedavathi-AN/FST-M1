package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("V");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("V");
        hs.add("X");
        
        System.out.println("Original HashSet: " + hs);        
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("M")) {
        	System.out.println("M removed from the Set");
        } else {
        	System.out.println("M is not present in the Set");
        }
        
        System.out.println("Checking if V is present: " + hs.contains("V"));
        System.out.println("Updated HashSet: " + hs);
    }
}