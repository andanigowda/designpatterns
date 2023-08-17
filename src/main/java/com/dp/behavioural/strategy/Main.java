package com.dp.behavioural.strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Treatment patient1Treatment = new Treatment("John Duke");
        Treatment patient2Treatment = new Treatment("Elisa Muratti");
        Treatment patient3Treatment = new Treatment("Jeff People");

        patient1Treatment.setVaccination(new S1Covid19Treatment());
        patient2Treatment.setVaccination(new S2EbovTreatment());
        patient3Treatment.setVaccination(new S3SarsTreatment());

        patient1Treatment.treatment();
        patient2Treatment.treatment();
        patient3Treatment.treatment();

        System.out.println("All patients cured. The world is saved!");

        
        
        Invoice invoice = new Invoice(new BigDecimal("1500"));
        Context federal = new Context(new T3FederalTax());
        Context vat = new Context(new T1VatTax());
        Context duty = new Context(new T2DutyTax());

        System.out.println(federal.calculateTax(invoice));
        System.out.println(vat.calculateTax(invoice));
        System.out.println(duty.calculateTax(invoice));

//        Result:
//        105.00
//        150.0
//        270.00
    }

//    RESULT:
//The treatment of the patient: John Duke has started
//    The patient have been cured of infection with Coronavirus
//    The patient left the hospital
//--------------------------------------------------------------------
//    The treatment of the patient: Elisa Muratti has started
//    The patient have been cured of infection with Ebov
//    The patient left the hospital
//--------------------------------------------------------------------
//    The treatment of the patient: Jeff People has started
//    The patient have been cured of infection with SARS
//    The patient left the hospital
//--------------------------------------------------------------------
//    All patients cured. The world is saved!
}