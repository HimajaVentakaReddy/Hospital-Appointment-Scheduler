public class Doctor extends Person {

    private String specialization;
    private boolean available;

    public Doctor(int doctorId, String name, String specialization) {
        super(doctorId, name);
        this.specialization = specialization;
        this.available = true;
    }

    public int getDoctorId() {
        return getId();
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId()
                + " | Name: Dr. " + getName()
                + " | Specialization: " + specialization
                + " | Available: " + (available ? "Yes" : "No"));
    }
}