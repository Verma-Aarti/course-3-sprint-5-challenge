package com.jap.course3;

public class TransmissionImpl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Demo for Manual Transmission :");
        Transmission t=new ManualTransmission("Manual","MP4");
        t.showSpecs();
        System.out.println("Demo for Automated Transmission :");
        t=new AutomatedTransmission("Automated","AMTD5");
        ((AutomatedTransmission)t).showSpecs();
    }

}



