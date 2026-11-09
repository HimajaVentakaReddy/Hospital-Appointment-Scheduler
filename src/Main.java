
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppointmentScheduler scheduler = new AppointmentScheduler();

        int choice;

        do {
            System.out.println("\n===== HOSPITAL APPOINTMENT SCHEDULER =====");
            System.out.println("1. Register Doctor");
            System.out.println("2. Register Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. View All People");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();

                    scheduler.registerDoctor(
                            new Doctor(doctorId, doctorName, specialization));
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    scheduler.registerPatient(
                            new Patient(patientId, patientName, age, phone));
                    break;

                case 3:
                    scheduler.viewDoctors();
                    break;

                case 4:
                    scheduler.viewPatients();
                    break;

                case 5:
                    System.out.print("Enter Patient ID: ");
                    int pId = scanner.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int dId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Date (DD-MM-YYYY): ");
                    String date = scanner.nextLine();

                    System.out.print("Enter Time: ");
                    String time = scanner.nextLine();

                    scheduler.bookAppointment(pId, dId, date, time);
                    break;

                case 6:
                    scheduler.viewAppointments();
                    break;

                case 7:
                    System.out.print("Enter Appointment ID to cancel: ");
                    int appointmentId = scanner.nextInt();

                    scheduler.cancelAppointment(appointmentId);
                    break;

                case 8:
                    scheduler.viewAllPeople();
                    break;

                case 9:
                    System.out.println("Thank you for using Hospital Appointment Scheduler!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 9);

        scanner.close();
    }
}
