public class Student {
    String name;
    int age;
    String major;

    // Default contructor
    public Student() {
        name = "Unknown";

        age = 0;

        major = "Undeclared";
    }

    // Constructor with name only
    public Student(
        String studentName
    ) {
        name = studentName;

        age = 18; // default age

        major = "Undeclared";
    }

    // Constructor with name and age only
    public Student(
        String studentName,
        int studentAge
    ) {
        name = studentName;

        age = studentAge;

        major = "Undeclared";
    }

    // Construct with all parameters
    public Student(
        String studentName,
        int studentAge,
        String studentMajor
    ) {
        name = studentName;

        age = studentAge;

        major = studentMajor;
    }

    public void displayInfo() {
        IO.println(
            "Name: " + name + "\nAge: " + age + "\nMajor: " + major
        );
    }

    public void changeMajor(
        String newMajor
    ) {
        major = newMajor;

        IO.println(
            name + " changed major to " + newMajor
        );
    }
}