/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2.doctor.sappointment.application;
   import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Question2DoctorSAppointmentApplication {

    public static void main(String[] args) {
 

        Scanner scanner = new Scanner(System.in);
        AppointmentScheduler scheduler = new AppointmentScheduler();

        // Define default available days for simplicity
        LocalDate[] defaultAvailableDays = {
            LocalDate.now().plusDays(1), LocalDate.now().plusDays(2), LocalDate.now().plusDays(3)
        };

        // Adding doctors
        System.out.println("Enter Doctor details:");
        System.out.print("Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Contact Info: ");
        String doctorContact = scanner.nextLine();
        System.out.print("Specialty: ");
        String specialty = scanner.nextLine();
        Doctor doctor = new Doctor(doctorName, doctorContact, specialty, defaultAvailableDays);
        scheduler.addDoctor(doctor);

        // Adding a patient
        System.out.println("Enter Patient details:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Contact Info: ");
        String patientContact = scanner.nextLine();
        Person patient = new Person(patientName, patientContact);

        // Showing available days
        System.out.println("Available days for " + doctorName + ":");
        LocalDate[] availableDays = scheduler.showAvailableDays(doctorName);
        for (LocalDate day : availableDays) {
            System.out.println(day);
        }

        // Booking an appointment
        System.out.print("Enter a date for the appointment (YYYY-MM-DD): ");
        LocalDate appointmentDate = LocalDate.parse(scanner.nextLine());
        String appointment = scheduler.bookAppointment(doctorName, patient, appointmentDate);
        System.out.println(appointment);

        
        // Listing all appointments
        System.out.println("\nAll appointments:");
        scheduler.listAppointments();

        scanner.close();
    }

    
}    
