public class main {

    public static void main(String[] args) {

        // Creating 6 student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        // Setting values using setters
        s1.setStudentID("2023-001");
        s1.setName("Jeremiah Fisher");
        s1.setAge(19);
        s1.enrollCourse("BSIT");

        s2.setStudentID("2023-002");
        s2.setName("Conrad Fisher");
        s2.setAge(20);
        s2.enrollCourse("BSCS");

        s3.setStudentID("2023-003");
        s3.setName("Isabel Conklin");
        s3.setAge(19);
        s3.enrollCourse("BSIS");

        s4.setStudentID("2023-004");
        s4.setName("Steven Conklin");
        s4.setAge(21);
        s4.enrollCourse("BSIT");

        s5.setStudentID("2023-005");
        s5.setName("Taylor Jewel");
        s5.setAge(20);
        s5.enrollCourse("BSA");

        s6.setStudentID("2023-006");
        s6.setName("Cam Cameron");
        s6.setAge(22);
        s6.enrollCourse("BSBA");

        // Display original student information
        System.out.println("Student Information:\n");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
        s6.displayInfo();

        // Updating some student data
        System.out.println("After Updates:\n");

        s2.setAge(21);
        s3.enrollCourse("BSA", "1st Semester");

        s2.displayInfo();
        s3.displayInfo();
    }
}