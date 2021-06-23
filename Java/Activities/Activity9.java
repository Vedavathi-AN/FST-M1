package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Perk");
        myList.add("Munch");
        myList.add("Kitkat");
        myList.add(3, "Dairymilk");
        myList.add(1, "Silk");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Shots is in list: " + myList.contains("Shots"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Silk");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}