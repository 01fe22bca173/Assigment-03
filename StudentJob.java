public class StudentJob  extends StudentCourses1{

    public static void main(String[] args) {
        StudentCourses1 s=new StudentCourses1();
        // Hardcoded student information
        String name = "Chetan 172";
        String department = "Computer Science";
        String[] courses = {"Introduction to Java", "Data Structures", "Algorithms"};

        // Displaying student information
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Courses Registered:");

        for (String course : courses) {
            System.out.println(" - " + course);
        }

        s.displayStudentMarks();

}


}