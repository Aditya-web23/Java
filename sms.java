import java.util.Scanner;

class Student {

    public String name;
    public String blood_group;
    private int roll_no;
    private String dob;
    private String reg_no;

    Student(String name, int roll_no, String blood_group, String dob, String reg_no) {
        this.name = name;
        this.roll_no = roll_no;
        this.blood_group = blood_group;
        this.dob = dob;
        this.reg_no = reg_no;
    }


    public int getRollNo() {
        return roll_no;
    }

    public String getDob() {
        return dob;
    }

    public String getRegNo() {
        return reg_no;
    }
}

class Branch extends Student {

    private String branch;

    Branch(String name, int roll_no, String blood_group, String dob, String branch, String reg_no) {
        super(name, roll_no, blood_group, dob, reg_no);
        this.branch = branch;
    }

    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Registration No: " + getRegNo());
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Blood Group: " + blood_group);
        System.out.println("DOB: " + getDob());
        System.out.println("Branch: " + branch.toUpperCase());
    }
}

public class Sms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student Regular or DSY? (Enter R for Regular, D for DSY): ");
        char type = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        String yearPrefix = "";
        if (type == 'R') {
            yearPrefix = "2023";
        } else if (type == 'D') {
            yearPrefix = "2024";
        } else {
            System.out.println("Invalid input! Defaulting to 2023.");
            yearPrefix = "2023";
        }

        System.out.println("Enter Student's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Blood Group: ");
        String blood_group = sc.nextLine();

        System.out.print("Enter DOB (dd/mm/yyyy): ");
        String dob = sc.nextLine();

        System.out.print("Enter Branch (example: CSE, IT, ENTC): ");
        String branch = sc.nextLine().toUpperCase();

      
        String branchCode = "BXX";
        if (branch.equals("CSE")) {
            branchCode = "BCS";
        } else if (branch.equals("IT")) {
            branchCode = "BIT";
        } else if (branch.equals("ENTC")) {
            branchCode = "BEN";
        } else if (branch.equals("MECH")) {
            branchCode = "BME";
        } else if (branch.equals("CIVIL")) {
            branchCode = "BCE";
        }


        String reg_no = yearPrefix + branchCode + String.format("%03d", roll_no);

        Branch student = new Branch(name, roll_no, blood_group, dob, branch, reg_no);
        student.display();
    }
}
