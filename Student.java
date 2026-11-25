public class Student extends Person {



    private String regNo;
    private String degree;
    private String department;


    private boolean graduated;
    private int yearOfGraduation;



    public Student(String name, String CNIC, String DOB, String regNo, String degree, String department) {
        super(name, CNIC, DOB);
        this.regNo = regNo;
        this.degree = degree;
        this.department = department;
        this.graduated = false;
        this.yearOfGraduation = 0;
    }


    public void showProfile() {
        
        System.out.println("Name: " + name);
        System.out.println("CNIC: " + CNIC);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Degree: " + degree);
        System.out.println("Department: " + department);
        if (graduated) {
            System.out.println("Graduated: Yes");
            System.out.println("Year of Graduation: " + yearOfGraduation);
        } else {
            System.out.println("Graduated: No");
        }


    };





    public void graduate(int year) {
        this.graduated = true;
        this.yearOfGraduation = year;
    }
}