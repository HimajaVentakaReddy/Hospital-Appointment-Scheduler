public class Doctor {

    private int doctorId;
    private String name;
    private String specialization;
    private boolean available;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.available = true;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
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
    public String toString() {
        return "Doctor ID: " + doctorId
                + " | Name: Dr. " + name
                + " | Specialization: " + specialization
                + " | Available: " + (available ? "Yes" : "No");
    }
}