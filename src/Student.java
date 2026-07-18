public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String qualification;
    private String email;
    private String phoneNumber;

    public Student(int studentId,
                   String firstName,
                   String lastName,
                   int age,
                   String gender,
                   String qualification,
                   String email,
                   String phoneNumber) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.qualification = qualification;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getQualification() {
        return qualification;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student ID : " + studentId +
                "\nName      : " + firstName + " " + lastName +
                "\nAge       : " + age +
                "\nGender    : " + gender +
                "\nCourse    : " + qualification +
                "\nEmail     : " + email +
                "\nPhone     : " + phoneNumber;
    }
}