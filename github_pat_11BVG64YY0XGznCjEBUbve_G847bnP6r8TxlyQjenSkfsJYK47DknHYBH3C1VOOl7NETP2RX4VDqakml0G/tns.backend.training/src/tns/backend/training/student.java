// Demo for static variable
public class student {
    int rollNo;
    String sname;
    String branch;
    static String collegeName = "AVN";

    void print() {
        System.out.println("The student details are: " +
                "Roll No: " + rollNo + ", " +
                "Name: " + sname + ", " +
                "Branch: " + branch + ", " +
                "College: " + collegeName);
    }
}
