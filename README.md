
# 🏥 Hospital Appointment Scheduler

> A Java-based console application designed to simplify the management of doctors, patients, and hospital appointments through an organized scheduling system.

---

## 📌 About the Project

**Hospital Appointment Scheduler** is a Core Java application that simulates a basic hospital appointment management system.

The application allows users to register doctors and patients, schedule appointments, detect scheduling conflicts, view appointment records, and cancel existing appointments.

The project demonstrates how **Object-Oriented Programming (OOP)** and the **Java Collections Framework** can be used to model and manage a real-world scheduling system.

---

## ✨ Key Features

👨‍⚕️ **Doctor Management**
- Register new doctors
- Assign unique doctor IDs
- Store doctor specialization
- View registered doctors

🧑‍🤝‍🧑 **Patient Management**
- Register new patients
- Assign unique patient IDs
- Store patient age and contact information
- View registered patients

📅 **Appointment Management**
- Book appointments between patients and doctors
- Automatically generate appointment IDs
- Store appointment date and time
- View all appointment details
- Cancel scheduled appointments

⚠️ **Conflict Detection**
- Detect existing appointments for a doctor
- Prevent doctors from being double-booked
- Allow cancelled appointment slots to be reused

🛡️ **Input Handling**
- Handles invalid numeric input
- Validates patient age
- Detects invalid doctor and patient IDs
- Handles invalid menu selections

---

## 🧠 How the Scheduling System Works

When a user requests an appointment, the application follows this process:

```text
Patient Selection
       ↓
Doctor Selection
       ↓
Date & Time Selection
       ↓
Doctor Exists?
       ↓
Patient Exists?
       ↓
Check Existing Appointments
       ↓
Scheduling Conflict?
      / \
    Yes  No
     ↓    ↓
  Reject  Book Appointment
             ↓
       Generate Appointment ID
````

This ensures that a doctor cannot have two active appointments at the same date and time.

---

## 🛠️ Tech Stack

| Technology          | Purpose                      |
| ------------------- | ---------------------------- |
| ☕ Java              | Core application development |
| 🧩 OOP              | Application architecture     |
| 📚 ArrayList / List | In-memory data management    |
| 💻 VS Code          | Development environment      |
| 🔧 Git              | Version control              |
| 🌐 GitHub           | Source-code hosting          |

---

## 📚 Java Concepts Demonstrated

The project applies several important Core Java concepts:

* ✅ Classes and Objects
* ✅ Constructors
* ✅ Encapsulation
* ✅ Getters and Setters
* ✅ Object Relationships
* ✅ Method Overriding
* ✅ ArrayList and List
* ✅ Enhanced `for` Loops
* ✅ Conditional Statements
* ✅ Switch Statements
* ✅ Exception Handling
* ✅ Input Validation
* ✅ Modular Programming

---

## 📂 Project Structure

```text
Hospital-Appointment-Scheduler/
│
├── src/
│   ├── Appointment.java
│   ├── AppointmentScheduler.java
│   ├── Doctor.java
│   ├── Main.java
│   └── Patient.java
│
├── .gitignore
└── README.md
```

### 📄 File Responsibilities

| File                        | Responsibility                                          |
| --------------------------- | ------------------------------------------------------- |
| `Doctor.java`               | Stores doctor information and specialization            |
| `Patient.java`              | Stores patient information                              |
| `Appointment.java`          | Represents an appointment between a doctor and patient  |
| `AppointmentScheduler.java` | Handles scheduling, conflict detection and cancellation |
| `Main.java`                 | Provides the console menu and user interaction          |

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone <repository-url>
```

### 2️⃣ Navigate to the Project

```bash
cd Hospital-Appointment-Scheduler
```

### 3️⃣ Compile the Application

```bash
javac src/*.java
```

### 4️⃣ Run the Application

```bash
java -cp src Main
```

---

## 🖥️ Application Menu

```text
========================================
     HOSPITAL APPOINTMENT SCHEDULER
========================================
1. Register Doctor
2. Register Patient
3. View Doctors
4. View Patients
5. Book Appointment
6. View Appointments
7. Cancel Appointment
8. Exit
========================================
Enter your choice:
```

---

## 🔄 Application Workflow

```text
                START
                  │
                  ▼
          ┌─────────────────┐
          │    Main Menu    │
          └────────┬────────┘
                   │
       ┌───────────┼────────────┐
       ▼           ▼            ▼
 Register Doctor Register Patient View Records
       │           │            │
       └───────────┼────────────┘
                   ▼
            Book Appointment
                   │
                   ▼
            Validate IDs
                   │
                   ▼
          Check Time Conflict
              │          │
             YES         NO
              │          │
              ▼          ▼
           Reject       Book
                         │
                         ▼
                 View / Cancel
                         │
                         ▼
                        EXIT
```

---

## 💡 Example Scenario

```text
Doctor:
ID             : 1
Name           : Dr. Ananya
Specialization : Cardiologist

Patient:
ID             : 1
Name           : Himaja
Age            : 19

Appointment:
Appointment ID : 1
Date           : 28-08-2026
Time           : 10:30
Status         : Scheduled
```

If another patient attempts to book **Dr. Ananya** for `28-08-2026` at `10:30`, the system detects the conflict and rejects the booking.

---

## 🔮 Future Enhancements

Future versions of the project can include:

* 🔍 Search doctors by specialization
* 🕒 Doctor working-hour management
* 🔄 Appointment rescheduling
* 📜 Patient appointment history
* 📆 Advanced date and time validation
* 💾 File-based persistent storage
* 🗄️ MySQL database integration
* 🖥️ Java Swing / JavaFX graphical interface
* 🔐 Admin and patient authentication
* 🌐 REST API / web application version

---

## 🎯 Project Objective

The objective of this project is to demonstrate how **Core Java, Object-Oriented Programming, Collections, validation, and scheduling logic** can be combined to solve a practical healthcare-management problem.

---

## 👩‍💻 Author

**Himaja Venkata Reddy**

Java Learner | Software Development Enthusiast

---

⭐ **If you find this project useful, consider giving the repository a star!**

```

This version will look much stronger on GitHub because it has a clear **About**, feature breakdown, scheduling algorithm, workflow, tech-stack table, file responsibilities, example scenario, future scope, and clean symbols without making it look overloaded.

After replacing the old README, press **`Ctrl + S`**.

Then **stop there broo**. Don't run `git init` yet if you haven't already. Tell me **saved**, and I'll take you through the GitHub part one command at a time.
```
