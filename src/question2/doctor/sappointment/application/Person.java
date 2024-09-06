/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2.doctor.sappointment.application;
import java.time.LocalDate;
/**
 *
 * @author RC_Student_lab
 */


// Base class Person
public class Person {
    protected String name;
    protected String contactInfo;

    public Person(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return name + " (" + contactInfo + ")";
    }

}