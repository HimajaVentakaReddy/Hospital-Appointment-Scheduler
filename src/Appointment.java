public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;

    public Appointment(int appointmentId, Patient patient, Doctor doctor,
                       String date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Scheduled";
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public void cancelAppointment() {
        status = "Cancelled";
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId
                + "\nPatient: " + patient.getName()
                + "\nDoctor: Dr. " + doctor.getName()
                + "\nSpecialization: " + doctor.getSpecialization()
                + "\nDate: " + date
                + "\nTime: " + time
                + "\nStatus: " + status;
    }
}
