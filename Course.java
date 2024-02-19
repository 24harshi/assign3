public class Course extends student_details{
    // The code `private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };` declares and
    // initializes an array of strings named `courseCodes`. The array contains the course codes for
    // different courses, namely "C#", "ST", "ML", "DEVOPS", and "MP".
     private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
     private int[] marks = { 47, 38, 32, 45, 48 };
 
     // The `displayStudentMarks()` method is a public method that does not return any value (`void`).
     // It is used to display the course codes and marks obtained by a student.
     /**
     * 
     */
    public void displayStudentMarks(){
        // The line `System.out.println("Course Codes \t Marks Obtained");` is used to print a header
        // for the table that will display the course codes and marks obtained by a student. The `\t` is
        // an escape sequence that represents a tab character, which is used to create a tabular format
        // for the output.
         System.out.println("Course Codes \t Marks Obtained");
 // The code snippet is a for loop that iterates over the `courseCodes` array and `marks` array
 // simultaneously.
 // The code snippet `for (int i = 0; i < courseCodes.length; i++) { System.out.println(courseCodes[i]
 // + "\t\t\t" + marks[i]); }` is iterating over the `courseCodes` array and the `marks` array
 // simultaneously.
 
         for (int i = 0; i < courseCodes.length; i++) {
             System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
         }
         // The code snippet `for (int i = 0; i < marks.length; i++) {
         //             if (marks[i] < 40){
         //                 System.out.println("Marks less than 40:" + courseCodes[i] + "\t" +
         // marks[i]);
         //          }
         //         }` is iterating over the `marks` array to check if the marks obtained in each
         // course are less than 40. If the marks are indeed less than 40 for a particular course (at
         // index `i`), it will print a message indicating that the marks are less than 40 for that
         // course along with the course code and the marks obtained. This loop is used to identify and
         // display the courses where the student obtained marks less than 40.
         for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40){
                System.out.println("Marks less than 40:" + courseCodes[i] + "\t" + marks[i]);
         }
        }
    }
}