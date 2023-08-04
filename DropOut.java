//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class DropOut extends Student {
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    public DropOut(int enrollmentID,String dateOfBirth, String courseName, String studentName,String dateOfEnrollment, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }

    public int getNumOfRemainingModules() {
        return this.numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return this.numOfMonthsAttended;
    }

    public String getDateOfDropOut() {
        return this.dateOfDropout;
    }

    public int getRemainingAmount() {
        return this.remainingAmount;
    }

    public boolean getHasPaid() {
        return this.hasPaid;
    }

    public void billsPayable() {
        this.remainingAmount = (super.getCourseDuration() - this.numOfMonthsAttended) * super.getTuitionFee();
        if (this.remainingAmount > 0) {
            System.out.println(this.remainingAmount + "remaining dues.");
            this.hasPaid = false;
        } else {
            System.out.println("All dues cleared.");
            this.hasPaid = true;
        }

    }

    public void removeStudent() {
        if (this.hasPaid = true) {
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            super.setEnrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.remainingAmount = 0;
            this.dateOfDropout = "";
        } else {
            System.out.println("All bills not cleared.");
        }

    }

    public void display() {
        super.display();
        System.out.println("Years Enrolled: " + this.numOfRemainingModules);
        System.out.println("Months attended: " + this.numOfMonthsAttended);
        System.out.println("DropOut date: " + this.dateOfDropout);
        System.out.println("Fee remaining amount: " + this.remainingAmount);
    }
}
