/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class AppointmentScheduler {
  

    private List<Doctor> doctors;
    private List<String> appointments;

    public AppointmentScheduler() {
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public Doctor findDoctor(String name) {
        return doctors.stream()
                      .filter(doctor -> doctor.name.equals(name))
                      .findFirst()
                      .orElse(null);
    }

    public String bookAppointment(String doctorName, Person patient, LocalDate date) {
        Doctor doctor = findDoctor(doctorName);
        if (doctor != null && List.of(doctor.getAvailableDays()).contains(date)) {
            doctor.removeAvailableDay(date);
            String appointment = "Appointment with " + doctor + " on " + date + " for " + patient;
            appointments.add(appointment);
            return appointment;
        } else {
            return "Failed to book appointment. Either the doctor does not exist or the date is not available.";
        }
    }

    public LocalDate[] showAvailableDays(String doctorName) {
        Doctor doctor = findDoctor(doctorName);
        return doctor != null ? doctor.getAvailableDays() : new LocalDate[0];
    }

    public void listAppointments() {
        appointments.forEach(System.out::println);
    }

    
    
}

    

