import java.util.ArrayList;
import java.util.List;

public class AppointmentScheduler {

    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }

        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public Doctor findDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    public void bookAppointment(int appointmentId, int patientId, int doctorId,
                                String date, String time) {

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().getDoctorId() == doctorId
                    && appointment.getDate().equalsIgnoreCase(date)
                    && appointment.getTime().equalsIgnoreCase(time)
                    && appointment.getStatus().equalsIgnoreCase("Scheduled")) {

                System.out.println("Doctor is already booked at this date and time.");
                return;
            }
        }

        Appointment appointment =
                new Appointment(appointmentId, patient, doctor, date, time);

        appointments.add(appointment);

        System.out.println("Appointment booked successfully.");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment appointment : appointments) {
            System.out.println("------------------------------");
            System.out.println(appointment);
        }
    }

    public void cancelAppointment(int appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appointmentId) {

                if (appointment.getStatus().equalsIgnoreCase("Cancelled")) {
                    System.out.println("Appointment is already cancelled.");
                    return;
                }

                appointment.cancelAppointment();
                System.out.println("Appointment cancelled successfully.");
                return;
            }
        }

        System.out.println("Appointment not found.");
    }
}
