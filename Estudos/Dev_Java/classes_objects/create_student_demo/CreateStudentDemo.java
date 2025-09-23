public class CreateStudentDemo {
    public static void main(
        String... args
    ) {
        // Using different constructors
        var student_1 = new Student(); // default constructor

        var student_2 = new Student(
            "Alice"
        ); // Name only

        var student_3 = new Student(
            "Bob",
            20
        ); // Name and age

        var student_4 = new Student(
            "Carol",
            19,
            "Computer Science"
        ); // All parameters
    
        // Display all student
        IO.println(
            "=== Student Information ==="
        );

        student_1.displayInfo();
        IO.println();

        student_2.displayInfo();
        IO.println();

        student_3.displayInfo();
        IO.println();

        student_4.displayInfo();
        IO.println();

        // Modify objects
        IO.println(
            "=== After Changes ==="
        );
        
        student_2.changeMajor(
            "Mathematics"
        );
        IO.println();

        student_3.changeMajor(
            "Physics"
        );
    }
}