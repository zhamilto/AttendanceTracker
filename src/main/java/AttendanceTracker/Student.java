package AttendanceTracker;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }

    public Student(String firstName, String lastName, String idNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
    }
    public Student(String dataLine) {
        String[] parts = dataLine.split(",");
        firstName = parts[0];
        lastName = parts[1];
        idNum = parts[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }


    private String firstName;
    private String lastName;
    private String idNum;
}
