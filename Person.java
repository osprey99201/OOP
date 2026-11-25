
abstract class Person {

    protected String name;
    protected String CNIC;
    protected String DOB;

    public Person(String n, String c, String d) {
        name = n;
        CNIC = c;
        DOB = d;
    }

    public abstract void showProfile();
}
