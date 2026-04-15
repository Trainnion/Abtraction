// Student class demonstrating encapsulation and method signatures
class Student {

    // Encapsulation: private fields
    private String name;
    private int age;
    private String studentID;
    private String course;

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method behavior
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    // Method signature example
    public void enrollCourse(String course) {
        this.course = course;
    }

    // Method overloading example
    public void enrollCourse(String course, String semester) {
        this.course = course + " (" + semester + ")";
    }
}