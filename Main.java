public class Main {
    public static void main(String[] args) {
        // Creating a new faculty
        Faculty faculty = new Faculty(1, "John Doe", "Professor");
        
        // Creating a new course
        Course course = new Course("C001", "Introduction to Java", 3.0);
        course.addFaculty(faculty);
        
        // Adding students to the course
        Student student1 = new Student(101, "Alice", 3.5);
        Student student2 = new Student(102, "Bob", 3.2);
        
        course.addStudent(student1);
        course.addStudent(student2);
        
        // Printing course details
        System.out.println("Course Details:");
        System.out.println(course);
        
        // Printing faculty details
        System.out.println("\nFaculty Details:");
        System.out.println(faculty);
        
        // Printing student list of the course
        System.out.println("\nStudent List:");
        course.printStudentList();
        
        // Dropping a student from the course
        course.dropStudent(101);
        System.out.println("\nAfter dropping a student:");
        course.printStudentList();
        
        // Dropping the faculty from the course
        course.dropFaculty();
        System.out.println("\nAfter dropping faculty:");
        System.out.println(course);
    }
}