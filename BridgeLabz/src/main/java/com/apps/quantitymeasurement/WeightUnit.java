package com.apps.quantitymeasurement;

import java.text.DecimalFormat;

public enum WeightUnit{
        GRAM(0.001),KG(1.0), POUND(0.453592);
        private final double conversionFactor;

        //constructor
        WeightUnit(double conversionFactor) {
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


        public static void main(String[] args) {

                double kilograms = 10.0;
                double grams = WeightUnit.KG.convertToBaseUnit(kilograms);
                System.out.println("Kilogram: " + kilograms + " Gram: " + grams);
        }
}