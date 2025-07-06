// File: StudentDemo.java

import java.util.*;

// Class representing a Student
class Student {
    String name; // Instance variable (property)

    // Static block: runs once when the class is loaded
    static {
        System.out.println("Static block called");
    }

    // Instance initialization block: runs every time an object is created, before the constructor
    {
        System.out.println("Non-static block called");
    }

    // Constructor: initializes the name
    public Student() {
        name = "No Name";
    }

    // Instance method: can be called on an object
    public void getData() {
        System.out.println("getData() called");
    }

    // Static method: can be called on the class itself
    public static void showData() {
        System.out.println("showData() called");
    }
}

// Class to test static and instance behavior
public class StudentDemo {
    // Static method in the main class
    public static void show() {
        System.out.println("show() in StudentDemo called");
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Creating multiple Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        // Calling static and instance methods
        s1.showData();       // Valid, but not recommended for static
        Student.showData();  // Preferred way to call static method

        s1.getData();        // Instance method call
        // Student.getData(); // ❌ Invalid: Cannot call instance method from class name

        show();              // Calling static method from same class
    }
}