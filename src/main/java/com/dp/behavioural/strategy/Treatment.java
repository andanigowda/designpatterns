package com.dp.behavioural.strategy;

public class Treatment {
	private String patientName;
	private VStrategy vaccinationStrategy;
 
    public Treatment(String patientName) {
        this.patientName = patientName;
    }

    public void setVaccination(VStrategy vaccination) {
        this.vaccinationStrategy = vaccination;
    }

    public void treatment() {
        System.out.println("The treatment of the patient: " + this.patientName + " has started");
        System.out.println(vaccinationStrategy.vaccineInjection());
        System.out.println("The patient left the hospital");
        System.out.println("--------------------------------------------------------------------");
    }
}