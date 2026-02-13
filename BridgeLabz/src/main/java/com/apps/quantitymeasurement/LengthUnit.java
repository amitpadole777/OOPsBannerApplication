package com.apps.quantitymeasurement;

import java.text.DecimalFormat;

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


        public double convertToBaseUnit(double value){
                value = value * this.getConversionFactor();

                // keep values up to three decimals only
                DecimalFormat df = new DecimalFormat("#.###");
                value = Double.parseDouble(df.format(value));

                return  value;
        }

        public double convertFromBaseUnit(double value){

                value = value / this.getConversionFactor();

                // keep values up to three decimals only
                DecimalFormat df = new DecimalFormat("#.###");
                value = Double.parseDouble(df.format(value));

                return  value;
        }
}