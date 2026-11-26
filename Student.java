public class Student {
    String fName;
    String lName;
    String stuId;
    String stuStatus;

    public Student(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}
