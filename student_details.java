public class student_details {
   // The lines `public String name;` and `public String dob;` are declaring two instance variables in
   // the `Student` class.
    public String Name;
    public String Dept;
    public String Prog;

   /**
    * The function "displayName" prints the name of a student.
    */
    public void displayDetails() {
        System.out.println("Student Name: " + Name);
        System.out.println("Department: " + Dept);
        System.out.println("Program: " + Prog);

    }
    // The `public static void main(String[] args)` method is the entry point of a Java program. It is
    // the method that is executed when the program starts running.
    public static void main(String[] args) {
       // In the given code snippet, `Courses s = new Courses();` creates a new object of the `Courses`
       // class and assigns it to the variable `s`.
        Course s = new Course();
        s.Name = "Radha Harshitha";
        s.Dept = "MCA";
        s.Prog = "BCA";
        s.displayDetails();
}
}
