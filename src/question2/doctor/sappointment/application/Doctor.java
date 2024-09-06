/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2.doctor.sappointment.application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */

public class Doctor extends Person {
    private String specialty;
    private LocalDate[] availableDays;
    
    public Doctor(String name, String contactInfo, String specialty, LocalDate[] availableDays) {
        super(name, contactInfo);
        this.specialty = specialty;
        this.availableDays = availableDays;
    }

    public LocalDate[] getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(LocalDate[] availableDays) {
        this.availableDays = availableDays;
    }

    public void removeAvailableDay(LocalDate date) {
        List<LocalDate> dayList = new ArrayList<>(List.of(availableDays));
        dayList.remove(date);
        availableDays = dayList.toArray(new LocalDate[0]);
    }

    @Override
    public String toString() {
        return "Dr. " + name + " - Specialty: " + specialty + " - Contact: " + contactInfo;
    
}


}
