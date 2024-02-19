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
       // The lines `s.Name = "Radha Harshitha";`, `s.Dept = "MCA";`, and `s.Prog = "BCA";` are
       // assigning values to the instance variables `Name`, `Dept`, and `Prog` of the `Course` object
       // `s`. This means that the student's name is set to "Radha Harshitha", the department is set to
       // "MCA", and the program is set to "BCA". These values will be used when displaying the details
       // of the student using the `displayDetails()` method.
        s.Name = "Radha Harshitha";
        s.Dept = "MCA";
        s.Prog = "BCA";
        // `s.displayDetails();` is calling the `displayDetails()` method on the `Course` object `s`.
        // This method is responsible for printing out the details of the student, including the
        // student's name, department, and program. When `s.displayDetails();` is called, it will
        // output this information to the console.
        s.displayDetails();
}
}
