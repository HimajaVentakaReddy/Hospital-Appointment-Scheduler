import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppointmentScheduler scheduler = new AppointmentScheduler();

        int doctorIdCounter = 1;
        int patientIdCounter = 1;
        int appointmentIdCounter = 1;

        while (true) {

            System.out.println("\n========================================");
            System.out.println("     HOSPITAL APPOINTMENT SCHEDULER");
            System.out.println("========================================");
            System.out.println("1. Register Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("\n--- Register Doctor ---");

                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();

                    System.out.print("Enter specialization: ");
                    String specialization = scanner.nextLine();

                    Doctor doctor =
                            new Doctor(doctorIdCounter, doctorName, specialization);

                    scheduler.addDoctor(doctor);

                    System.out.println("Doctor ID: " + doctorIdCounter);

                    doctorIdCounter++;
                    break;

                case 2:
                    System.out.println("\n--- Register Patient ---");

                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();

                    System.out.print("Enter patient age: ");

                    int age;

                    try {
                        age = Integer.parseInt(scanner.nextLine());

                        if (age <= 0) {
                            System.out.println("Age must be greater than 0.");
                            break;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age.");
                        break;
                    }

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    Patient patient =
                            new Patient(patientIdCounter, patientName, age, phoneNumber);

                    scheduler.addPatient(patient);

                    System.out.println("Patient ID: " + patientIdCounter);

                    patientIdCounter++;
                    break;

                case 3:
                    System.out.println("\n--- Doctors ---");
                    scheduler.viewDoctors();
                    break;

                case 4:
                    System.out.println("\n--- Patients ---");
                    scheduler.viewPatients();
                    break;

                case 5:
                    System.out.println("\n--- Book Appointment ---");

                    System.out.print("Enter Patient ID: ");
                    int patientId;

                    try {
                        patientId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Patient ID.");
                        break;
                    }

                    System.out.print("Enter Doctor ID: ");
                    int doctorId;

                    try {
                        doctorId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Doctor ID.");
                        break;
                    }

                    System.out.print("Enter appointment date (DD-MM-YYYY): ");
                    String date = scanner.nextLine();

                    System.out.print("Enter appointment time (HH:MM): ");
                    String time = scanner.nextLine();

                    scheduler.bookAppointment(
                            appointmentIdCounter,
                            patientId,
                            doctorId,
                            date,
                            time
                    );

                    appointmentIdCounter++;
                    break;

                case 6:
                    System.out.println("\n--- Appointments ---");
                    scheduler.viewAppointments();
                    break;

                case 7:
                    System.out.println("\n--- Cancel Appointment ---");

                    System.out.print("Enter Appointment ID: ");

                    int appointmentId;

                    try {
                        appointmentId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Appointment ID.");
                        break;
                    }

                    scheduler.cancelAppointment(appointmentId);
                    break;

                case 8:
                    System.out.println("\nThank you for using Hospital Appointment Scheduler!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1-8.");
            }
        }
    }
}