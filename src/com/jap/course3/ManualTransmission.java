package com.jap.course3;

public class ManualTransmission extends Transmission{
    ManualTransmission(){
        this("","");
    }
    ManualTransmission(String t,String no){
        super(t,no);
        super.setForwardGears(calculateNoOfGears(super.getModelNo()));
        super.setGearRatio(calculateGearRatio(super.getForwardGears()));
    }
    private int calculateNoOfGears(String n) {
        return Character.getNumericValue(n.charAt(n.length()-1));

    }
    private double[] calculateGearRatio(int n) {
        double[] temp=new double[n];
        int i;
        if(n==4) {
            temp[0]=2.540;
            temp[1]=1.920;
            temp[2]=1.510;
            temp[3]=1.000;
        }
        else if(n==5) {
            temp[0]=3.545;
            temp[1]=1.904;
            temp[2]=1.280;
            temp[3]=0.914;
            temp[4]=0.757;
        }
        else if(n==6){
            temp[0]=3.010;
            temp[1]=2.070;
            temp[2]=1.430;
            temp[3]=1.000;
            temp[4]=0.710;
            temp[5]=0.570;
        }
        else {
            System.out.println("Please enter proper Mode");
            for(i=0;i<n;i++) {
                temp[i]=0;
            }
        }
        return temp;
    }
    private String getGearRatios() {
        int i;
        int n=super.getForwardGears();
        String s="";
        for(i=0;i<n;i++) {
            s+=(i+1)+" Gear Ratio : "+super.getGearRatio()[i]+"\n";
        }
        return s;
    }
    public void showSpecs() {
        System.out.println(toString());
    }
    public String toString() {
        return "Transmission Type : "+super.getType()+"\n Transmission Model number : "+super.getModelNo()+"\n\n Key Specifications : "+
                "\n Forward Gears : "+super.getForwardGears()+"\n Gear Ratio\n "+getGearRatios();
    }

}
