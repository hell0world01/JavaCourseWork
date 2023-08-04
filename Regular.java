//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Regular extends Student {
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }

    public int getNumOfModules() {
        return this.numOfModules;
    }

    public int getNumOfCreditHours() {
        return this.numOfCreditHours;
    }

    public double getDaysPresent() {
        return this.daysPresent;
    }

    public boolean getIsGrantedScholarship() {
        return this.isGrantedScholarship;
    }

    public String presetnPercentage(double daysPresent) {
        int courseDurationInDays = super.getCourseDuration() * 30;
        double presentDaysInPercentage = daysPresent / (double)courseDurationInDays * 100.0;
        String attendanceGrade;
        if ((double)courseDurationInDays >= daysPresent) {
            if (presentDaysInPercentage >= 80.0 && presentDaysInPercentage <= 100.0) {
                this.isGrantedScholarship = true;
                attendanceGrade = "A";
                return "A";
            } else if (presentDaysInPercentage >= 60.0 && presentDaysInPercentage < 80.0) {
                attendanceGrade = "B";
                return "B";
            } else if (presentDaysInPercentage >= 40.0 && presentDaysInPercentage < 60.0) {
                attendanceGrade = "C";
                return "C";
            } else if (presentDaysInPercentage >= 20.0 && presentDaysInPercentage < 40.0) {
                attendanceGrade = "D";
                return "D";
            } else if (presentDaysInPercentage < 20.0 && presentDaysInPercentage >= 0.0) {
                attendanceGrade = "E";
                return "E";
            } else {
                System.out.println("Invalid present percentage.");
                attendanceGrade = "";
                return "";
            }
        } else {
            System.out.println("Course duration is less than days present");
            attendanceGrade = "";
            return "";
        }
    }

    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment) {
        if (this.isGrantedScholarship = true) {
            System.out.println("" + enrollmentID + "." + dateOfEnrollment + "has completed" + courseName + ".");
            System.out.println("The scholarship has been granted.");
        }

    }

    public void display() {
        super.display();
        System.out.println("Number of Modules :" + this.numOfModules);
        System.out.println("Number of Credit Hours :" + this.numOfCreditHours);
        System.out.println("Days Present :" + this.daysPresent);
        System.out.println("Granted Scholarship :" + this.isGrantedScholarship);
    }
}

