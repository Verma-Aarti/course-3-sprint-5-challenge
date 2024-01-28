package com.jap.course3;

abstract public class Transmission {
    private String type;
    private String modelNo;
    private int forwardGears;
    private double gearRatio[];

    Transmission(){
        this("","");
    }
    Transmission(String t,String no){
        type=t;
        modelNo=no;

    }
    public void setType(String t) {
        type=t;
    }
    public String getType() {
        return type;
    }
    public void setModelNo(String no) {
        modelNo=no;
    }
    public String getModelNo() {
        return modelNo;
    }
    public void setForwardGears(int gears) {
        forwardGears=gears;
    }
    public int getForwardGears() {
        return forwardGears;
    }
    public void setGearRatio(double gRatio[]) {
        gearRatio=gRatio;
    }
    public double[] getGearRatio() {
        return gearRatio;
    }
    public abstract void showSpecs();
}

