package dbo;


public class Course {
    private int id;
    private String firstName;
    private String idNumber;
    private String courseName;
    private String address;
    private String phoneNumber;

    public Course() {
    }
    
    

    public Course(int id, String firstName, String idNumber, String courseName, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.courseName = courseName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Course(String firstName, String idNumber, String courseName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.courseName = courseName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    

}