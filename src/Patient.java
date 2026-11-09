public class Patient extends Person {

    private int age;
    private String phoneNumber;

    public Patient(int patientId, String name, int age, String phoneNumber) {
        super(patientId, name);
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getPatientId() {
        return getId();
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + getId()
                + " | Name: " + getName()
                + " | Age: " + age
                + " | Phone: " + phoneNumber);
    }
}