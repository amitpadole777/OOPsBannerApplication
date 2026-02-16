package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static boolean demonstrateWeightEquality(Weight weight1, Weight weight2) throws MyException {
        return weight1.equals(weight2);
    }

    public static void main(String[] args) throws MyException {

        Weight weight1 = new Weight(1.0, WeightUnit.KG);
        Weight weight2 = new Weight(1.0, WeightUnit.KG);
        System.out.println(demonstrateWeightEquality(weight1,weight2));

    }
}