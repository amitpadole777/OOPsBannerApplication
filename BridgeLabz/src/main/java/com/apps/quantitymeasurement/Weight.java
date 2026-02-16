package com.apps.quantitymeasurement;

import java.text.DecimalFormat;

public class Weight {

    private double value;
    private WeightUnit unit;

    // constructor
    public Weight(double value, WeightUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    //length -> base unit (INCHES)
    private double convertToBaseUnit(Weight weight){
        return weight.value * weight.unit.getConversionFactor();
    }

    public Weight add(Weight weight, WeightUnit targetUnit) throws MyException {

        if(targetUnit == null){
            throw new MyException("Please enter target unit");
        }

        // convert into base unit
        double value1 = convertToBaseUnit(weight);
        double value2 = convertToBaseUnit(this);

        // addition in base unit inches
        double baseValue = value1 + value2;

        // convert base unit to the given unit provided
        double convertedBaseValue = baseValue/targetUnit.getConversionFactor();

        // keep values up to three decimals only
        DecimalFormat df = new DecimalFormat("#.###");
        convertedBaseValue = Double.parseDouble(df.format(convertedBaseValue));

        return new Weight(convertedBaseValue, targetUnit);
    }

    public Weight add(Weight weight) throws MyException {

        final WeightUnit unit = this.unit;

        if( weight == null){
            throw new MyException("Please enter source and target");
        }

        // convert into base unit
        double value1 = convertToBaseUnit(weight);
        double value2 = convertToBaseUnit(this);

        // addition in base unit inches
        double baseValue = value1 + value2;

        // convert base unit to the first unit provided
        double convertedBaseValue = baseValue/this.unit.getConversionFactor();

        // keep values up to three decimals only
        DecimalFormat df = new DecimalFormat("#.###");
        convertedBaseValue = Double.parseDouble(df.format(convertedBaseValue));

        new Weight(convertedBaseValue, unit);

        return new Weight(convertedBaseValue, unit);
    }

    public static double convert(Double value, WeightUnit sourceUnit, WeightUnit targetUnit) throws MyException {

        if (value.isInfinite()){
            throw new MyException("Please enter a finite value");
        }

        if( sourceUnit != null && targetUnit == null){
            throw new MyException("Please enter source and target");
        }

        if(!(sourceUnit instanceof WeightUnit && targetUnit instanceof WeightUnit) ){
            throw new MyException("Either source or target is invalid");
        }

        double sourceUnitCF = sourceUnit.getConversionFactor();
        double targetUnitCF = targetUnit.getConversionFactor();
        double result1 = value * (sourceUnitCF/targetUnitCF);

        // keep values upto two decimals only
        DecimalFormat df = new DecimalFormat("#.00");
        double result = Double.parseDouble(df.format(result1));

        return result;
    }

    public boolean compare(Weight weight){

        // convert values into base unit
        double value1 = convertToBaseUnit(weight);
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
        Weight weight = (Weight) o;
        if(weight.unit == null){
            return false;
        }
        return compare(weight);
    }

    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}