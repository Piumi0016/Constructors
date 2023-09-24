
public class Constructors  {
    private String name;
    private int age;
    private char grade;

    // Default constructor
    public Constructors() {
        name = "Nimal";
        age = 20;
        grade = 'A';
    }

    // Parameterized constructor
    public Constructors(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Overloaded constructor
    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        Constructors myObj = new Constructors();
        System.out.println("Student 1 Information:");
        myObj.displayInfo();
        System.out.println();


        Constructors myObj1 = new Constructors("Piumi", 21, 'B');
        System.out.println("Student 2 Information:");
        myObj1.displayInfo();
        System.out.println();


        Constructors myObj2 = new Constructors("Sachinthi", 21);
        System.out.println("Student 3 Information:");
        myObj2.displayInfo();
    }
}

