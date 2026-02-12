package com.apps.quantitymeasurement;

import java.text.DecimalFormat;

public class Length {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),INCHES(1.0), YARD(36), CM(0.393701);

        private final double conversionFactor;

        //constructor
        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    // constructor
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    //length -> base unit (INCHES)
    private double convertToBaseUnit(Length length){
        return length.value * length.unit.getConversionFactor();
    }

    public boolean compare(Length length){

        // convert values into base unit
        double value1 = convertToBaseUnit(length);
        double value2 = convertToBaseUnit(this);

        // keep values up to two decimals only
        DecimalFormat df = new DecimalFormat("#.00");
        value1 = Double.parseDouble(df.format(value1));
        value2 = Double.parseDouble(df.format(value2));

        return Double.compare(value2, value1) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        if(length.unit == null){
            return false;
        }
        return compare(length);
    }

    // main for standalone testing
    public static void main(String[] args) {
        Length length1 = new Length(3.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, LengthUnit.YARD);
        System.out.println(length1.equals(length2) + " validation");
    }
}