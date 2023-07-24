package collection_framework;

//Arraya List example
import java.util.ArrayList;

class Main {
  public static void main(String[] args){

    // create ArrayList

    ArrayList<String> languages = new ArrayList<>();

    // Add elements to ArrayList

    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("programming language is : " + languages);
  }
}

Add elements

class Main {
  public static void main(String[] args){
    // create ArrayList

    ArrayList<String> languages = new ArrayList<>();

    // add() method without the index parameter

    languages.add("Java");
    languages.add("C");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);
  }
}


Access elements

class Main {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the arraylist

    animals.add("Cat");
    animals.add("Dog");
    animals.add("Cow");
    System.out.println("ArrayList: " + animals);

    // get the element from the arraylist

    String str = animals.get(1);
    System.out.print("Element at index 1: " + str);
  }
}


Change elements

class Main {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // add elements in the array list

    languages.add("Java");
    languages.add("Kotlin");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // change the element of the array list

    languages.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + languages);
  }
}



Remove elements

class Main {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the array list

    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    System.out.println("ArrayList: " + animals);

    // remove element from index 2

    String str = animals.remove(2);
    System.out.println("Updated ArrayList: " + animals);
    System.out.println("Removed Element: " + str);
  }
}


// Iterate through an ArrayList
// We can use the Java for-each loop to loop through each element of the arraylist. For example,


class Main {
  public static void main(String[] args) {

    // creating an array list
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Cow");
    animals.add("Cat");
    animals.add("Dog");
    System.out.println("ArrayList: " + animals);

    // iterate using for-each loop
    System.out.println("Accessing individual elements:  ");

    for (String language : animals) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}