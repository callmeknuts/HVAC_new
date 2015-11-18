package com.mike;

import java.util.Date;

/**
 * Created by Mike on 11/11/2015.
 *
 *
 */

public class WaterHeater extends ServiceCall  {
    private int age;  // amount of years

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age){
        super(serviceAddress, problemDescription, date);

        //TODO validation
        this.age = age;
    }
    @Override
    public String toString() {
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);

        double cityFee = 20.00;
        double feeTotal = fee + cityFee; // not right
        return "Water Heater Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service Fee = " + feeString + "\n" +
                "City Removal Fee = $" + cityFee + "\n" +
                "Fee Total = $" + feeTotal;

    }


    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
