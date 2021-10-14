/*
We use angle brackets < and > to declare the type of the ArrayList
we use method add() with one argument that represents the value we are inserting and 2 if we need to add it at a particular index 
we could find the size of ArrayList using the size() method
we use the method get() to access an index
we use the method set() for rewriting entries
We can also remove an item by specifying the value to remove("")
we can use indexof() to find the position of an elememnt
*/
import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    //creating an array list
    ArrayList<String> example = new ArrayList<String>();
    //adding a new arraylist
    example.add("Example1");
    //adding a new item with index
    example.add(1,"Example2");
    example.add("Example3");
   
    example.add("Example5");
    //prints the size of the list
    System.out.println(example.size());
    //prints the element of the list
    System.out.println(example.get(1));
    //rewriting entries
    example.set(3,"Example4");
    //printing the modified list
    System.out.println(example.toString());
    //This command removes the FIRST instance of the value
    example.remove("Example4");
    //prints the index of an item
    System.out.println(example.indexOf("Example3"));
  }

  
}
