package lab7;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    private int currentSize = 100;
    private int newsize;
    int i;

    public Course(String courseName) {
        this.courseName = courseName;

    }

    public void addStudent(String student) {
        if(currentSize == numberOfStudents) {
            newsize = currentSize + 100;
            String[] newArray = new String[newsize];
            for(i = 0; i < currentSize; i++) {
                newArray[i] = students[i];
            }
            currentSize = newsize;
            students = newArray;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

    }
    public Course clone() {
        Course course = new Course(this.courseName);
        course.numberOfStudents = this.numberOfStudents;

        for(i = 0; i < this.students.length; i++) {
            course.students[i] = students[i];
        }
        return course;
    }
}
