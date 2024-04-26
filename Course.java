public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList;
    private int numberOfStudents;
    private Faculty faculty;
    
    public Course() {
        // Default constructor
    }
    
    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.studentList = new Student[50]; // Initial size, can be adjusted
        this.numberOfStudents = 0;
    }
    
    @Override
    public String toString() {
        return "Course ID: " + courseId + "\nCourse Title: " + courseTitle + "\nCredit: " + credit;
    }
    
    public void addStudent(Student student) {
        studentList[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public void dropStudent(int studentId) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentList[i].studentId == studentId) {
                // Remove student by shifting elements
                for (int j = i; j < numberOfStudents - 1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                studentList[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }
    
    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    public void dropFaculty() {
        this.faculty = null;
    }
    
    public void printStudentList() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentList[i]);
        }
    }
}