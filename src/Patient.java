public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String phoneNumber;

    public Patient(int patientId, String name, int age, String phoneNumber) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId
                + " | Name: " + name
                + " | Age: " + age
                + " | Phone: " + phoneNumber;
    }
}