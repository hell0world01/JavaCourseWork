//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Student {
    private int enrollmentID = 0;
    private String dateOfBirth;
    private String courseName = "";
    private String studentName;
    private String dateOfEnrollment = "";
    private int courseDuration;
    private int tuitionFee;

    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee) {
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
    }

    public int getEnrollmentID() {
        return this.enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDateOfEnrollment() {
        return this.dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public int getCourseDuration() {
        return this.courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public int getTuitionFee() {
        return this.tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public void display() {
        if (this.enrollmentID != 0 && this.dateOfBirth != "" && this.courseName != "" && this.studentName != "" && this.dateOfEnrollment != "" && this.courseDuration != 0 && this.tuitionFee != 0) {
            System.out.println("EnrollmentID :" + this.enrollmentID);
            System.out.println("Date of Birth :" + this.dateOfBirth);
            System.out.println("Course Name :" + this.courseName);
            System.out.println("Student Name :" + this.studentName);
            System.out.println("Date of Enrollment :" + this.dateOfEnrollment);
            System.out.println("Course Duration :" + this.courseDuration);
            System.out.println("Tuition fee :" + this.tuitionFee);
        } else {
            System.out.println("Fill your above form.");
        }

    }
}
