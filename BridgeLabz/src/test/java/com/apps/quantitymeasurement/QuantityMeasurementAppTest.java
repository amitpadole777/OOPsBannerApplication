package com.apps.quantitymeasurement;
import org.junit.jupiter.api.Test;

import static com.apps.quantitymeasurement.Length.convert;
import static com.apps.quantitymeasurement.QuantityMeasurementApp.demonstrateLengthAddition;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class QuantityMeasurementAppTest {

    // UC 1
    @Test
    public void testFeetEquality_SameValue(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(2.0, LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Integer length2 = 1;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_SameReference(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // UC 2
    @Test
    public void testInchesEquality_SameValue(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(2.0, LengthUnit.INCHES);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_NullComparison(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_DifferentClass(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Integer length2 = 1;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_SameReference(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // UC 3
    @Test
    public void testFeetEquality_SameValue_UC3(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_SameValue_UC3(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetInchesComparison(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetInequality_DifferentValue(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(2.0, LengthUnit.FEET);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesInequality_DifferentValue(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(2.0, LengthUnit.INCHES);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCrossUnitInequality(){
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.FEET);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualitySameReference(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualityNullComparison(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualityNullUnit(){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //UC 4
    // 1
    @Test
    public void testFeetEquality_YardToYard_SameValue(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(1.0, LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 2
    @Test
    public void testFeetEquality_YardToYard_DifferentValue(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(2.0, LengthUnit.YARD);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testEquality_YardToFeet_EquivalentValue(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //4
    @Test
    public void testEquality_FeetToYard_EquivalentValue(){
        Length length1 = new Length(3.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //5
    @Test
    public void testEquality_YardToInches_EquivalentValue(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(36.0, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //6
    @Test
    public void testEquality_InchesToYard_EquivalentValue(){
        Length length1 = new Length(36.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //7
    @Test
    public void testEquality_YardToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(2.0, LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //8
    @Test
    public void testEquality_centimetersToInches_EquivalentValue(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = new Length(0.393701, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //9
    @Test
    public void testEquality_centimetersToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = new Length(1.0, LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testEquality_MultiUnit_TransitiveProperty(){

        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        Length length3 = new Length(36.0, LengthUnit.INCHES);

        assertAll(
                () ->   assertEquals(true, length1.equals(length2)),
                () ->   assertEquals(true, length2.equals(length3)),
                () ->   assertEquals(true, length1.equals(length3))
        );
    }

    //11
    @Test
    public void testEquality_YardWithNullUnit(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //12
    @Test
    public void testEquality_YardSameReference(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //13
    @Test
    public void testEquality_YardNullComparison(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //14
    @Test
    public void testEquality_CentimetersWithNullUnit(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //15
    @Test
    public void testEquality_CentimetersSameReference(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //16
    @Test
    public void testEquality_CentimetersNullComparison(){
        Length length1 = new Length(1.0, LengthUnit.CM);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //17
    @Test
    public void testEquality_AllUnits_ComplexScenario(){
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        Length length3 = new Length(36.0, LengthUnit.INCHES);

        assertAll(
                () ->   assertEquals(true, length1.equals(length2)),
                () ->   assertEquals(true, length2.equals(length3)),
                () ->   assertEquals(true, length1.equals(length3))
        );
    }

    // UC 5
    @Test
    public void testConversion_FeetToInches() throws MyException {
        double actualResult = convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        double expectedResult = 12.0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConvertestConversion_InchesToFeetsion_FeetToInches() throws MyException {
        double actualResult = convert(24.0, LengthUnit.INCHES, LengthUnit.FEET);
        double expectedResult = 2.0;
        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testConversion_YardsToInches() throws MyException {
        double actualResult = convert(1.0, LengthUnit.YARD, LengthUnit.INCHES);
        double expectedResult = 36.0;
        assertEquals(expectedResult, actualResult);
    }

    // 4
    @Test
    public void testConversion_InchesToYards() throws MyException {
        double actualResult = convert(72.0, LengthUnit.INCHES, LengthUnit.YARD);
        double expectedResult = 2.0;
        assertEquals(expectedResult, actualResult);
    }

    // 5
    @Test
    public void testConversion_CentimetersToInches() throws MyException {
        double actualResult = convert(2.54, LengthUnit.CM, LengthUnit.INCHES);
        double expectedResult = 1.0;
        assertEquals(expectedResult, actualResult);
    }

    // 6
    @Test
    public void testConversion_FeatToYard() throws MyException {
        double actualResult = convert(6.0, LengthUnit.FEET, LengthUnit.YARD);
        double expectedResult = 2.0;
        assertEquals(expectedResult, actualResult);
    }

    // 7
    @Test
    public void testConversion_RoundTrip_PreservesValue() throws MyException {
        // convert(convert(v, A, B), B, A) ≈ v
        double expectedResult = 1.0;
        double actualResult = convert(convert(1.0, LengthUnit.FEET, LengthUnit.INCHES),LengthUnit.INCHES, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // 8
    @Test
    public void testConversion_ZeroValue() throws MyException {
        double actualResult = convert(0.0, LengthUnit.FEET, LengthUnit.INCHES);
        double expectedResult = 0.0;
        assertEquals(expectedResult, actualResult);
    }

    // 9
    @Test
    public void testConversion_NegativeValue() throws MyException {
        double actualResult = convert(-1.0, LengthUnit.FEET, LengthUnit.INCHES);
        double expectedResult = -12;
        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testConversion_InvalidUnit_Throws() throws MyException {
        MyException exception = assertThrows(MyException.class, () -> {
            convert(1.0, LengthUnit.FEET, null);
        });
        boolean result = exception.getMessage().equals("Please enter source and target");
        assertEquals(true, result);
    }

    // 11
    @Test
    public void testConversion_NaNOrInfinite_Throws() throws MyException {
        MyException exception = assertThrows(MyException.class, () -> {
            convert(Double.POSITIVE_INFINITY, LengthUnit.FEET, LengthUnit.INCHES);
        });
        boolean result = exception.getMessage().equals("Please enter a finite value");
        assertEquals(true, result);
    }

    // 12
    @Test
    public void testConversion_PrecisionTolerance() throws MyException {
        MyException exception = assertThrows(MyException.class, () -> {
            convert(1.0, LengthUnit.FEET, null);
        });
        boolean result = exception.getMessage().equals("Please enter source and target");
        assertEquals(true, result);
    }

    // UC 6
    @Test
    public void testAddition_SameUnit_FeetPlusFeet() throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(2.0, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(3.0, LengthUnit.FEET);

        assertEquals(expectedResult, actualResult);
    }

    // 2
    @Test
    public void testAddition_SameUnit_InchPlusInch() throws MyException {
        Length length1 = new Length(6.0, LengthUnit.FEET);
        Length length2 = new Length(6.0, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(12.0, LengthUnit.FEET);;
        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testAddition_CrossUnit_FeetPlusInches() throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(2.0, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // 4
    @Test
    public void testAddition_CrossUnit_InchPlusFeet() throws MyException {
        Length length1 = new Length(12.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(24.0, LengthUnit.INCHES);
        assertEquals(expectedResult, actualResult);
    }

    // 5
    @Test
    public void testAddition_CrossUnit_YardPlusFeet() throws MyException {
        Length length1 = new Length(1.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(2.0, LengthUnit.YARD);;
        assertEquals(expectedResult, actualResult);
    }

    // 6
    @Test
    public void testAddition_CrossUnit_CentimeterPlusInch() throws MyException {
        Length length1 = new Length(2.54, LengthUnit.CM);
        Length length2 = new Length(1.0, LengthUnit.INCHES);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(5.08, LengthUnit.CM);
        assertEquals(expectedResult, actualResult);
    }

    // 7
    @Test
    public void testAddition_Commutativity() throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);

        Length length3 = new Length(12.0, LengthUnit.INCHES);
        Length length4 = new Length(1.0, LengthUnit.FEET);

        Length result1 =  length1.add(length2);
        Length result2 =  length3.add(length4);

        assertEquals(result1, result2);
    }

    // 8
    @Test
    public void testAddition_WithZero() throws MyException {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(0.0, LengthUnit.INCHES);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(5.0, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // 9
    @Test
    public void testAddition_NegativeValues() throws MyException {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(-2.0, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(3.0, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testAddition_NullSecondOperand() throws MyException {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = null;
        MyException exception = assertThrows(MyException.class, () -> {
            length1.add(length2);
        });
        boolean result = exception.getMessage().equals("Please enter source and target");
        assertEquals(true, result);
    }

    // 11
    @Test
    public void testAddition_LargeValues() throws MyException {
        Length length1 = new Length(1e6, LengthUnit.FEET);
        Length length2 = new Length(1e6, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(2e6, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // 12
    @Test
    public void testAddition_SmallValues() throws MyException {
        Length length1 = new Length(0.001, LengthUnit.FEET);
        Length length2 = new Length(0.002, LengthUnit.FEET);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(0.003, LengthUnit.FEET);
        assertEquals(expectedResult, actualResult);
    }

    // UC 7
    @Test
    public void testAddition_ExplicitTargetUnit_Feet
    () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.FEET;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(2.0, LengthUnit.FEET);

        assertEquals(expectedResult, actualResult);
    }

    // 2
    @Test
    public void testAddition_ExplicitTargetUnit_Inches

    () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.INCHES;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(24.0, LengthUnit.INCHES);

        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testAddition_ExplicitTargetUnit_Yards
    () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.YARD;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(0.667, LengthUnit.YARD);

        assertEquals(expectedResult, actualResult);
    }

    // 4
    @Test
    public void testAddition_ExplicitTargetUnit_Centimeters() throws MyException {
        Length length1 = new Length(1.0, LengthUnit.INCHES);
        Length length2 = new Length(1.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.CM;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(5.08, LengthUnit.CM);

        assertEquals(expectedResult, actualResult);
    }

    // 5
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsFirstOperand () throws MyException {
        Length length1 = new Length(2.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        final LengthUnit feet = LengthUnit.YARD;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(3.0, LengthUnit.YARD);

        assertEquals(expectedResult, actualResult);
    }

    // 6
    @Test
    public void testAddition_ExplicitTargetUnit_SameAsSecondOperand() throws MyException {
        Length length1 = new Length(2.0, LengthUnit.YARD);
        Length length2 = new Length(3.0, LengthUnit.FEET);
        final LengthUnit feet = LengthUnit.FEET;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(9.0, LengthUnit.FEET);

        assertEquals(expectedResult, actualResult);
    }

    // 7
    @Test
    public void testAddition_ExplicitTargetUnit_Commutativity
    () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.YARD;
        Length actualResult1 = demonstrateLengthAddition(length1, length2, feet);

        Length length3 = new Length(12.0, LengthUnit.INCHES);
        Length length4 = new Length(1.0, LengthUnit.FEET);
        final LengthUnit yard = LengthUnit.YARD;
        Length actualResult2 = demonstrateLengthAddition(length3, length4, yard);

        assertEquals(actualResult1, actualResult2);
    }

    // 8
    @Test
    public void testAddition_ExplicitTargetUnit_WithZero
    () throws MyException {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(0.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.YARD;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(1.667, LengthUnit.YARD);

        assertEquals(expectedResult, actualResult);
    }

    // 9
    @Test
    public void testAddition_ExplicitTargetUnit_NegativeValues

    () throws MyException {
        Length length1 = new Length(5.0, LengthUnit.FEET);
        Length length2 = new Length(-2.0, LengthUnit.FEET);
        final LengthUnit feet = LengthUnit.INCHES;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(36.0, LengthUnit.INCHES);

        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testAddition_ExplicitTargetUnit_NullTargetUnit

    () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = null;

        MyException exception = assertThrows(MyException.class, () -> {
            demonstrateLengthAddition(length1, length2, feet);
        });

        boolean result = exception.getMessage().equals("Please enter target unit");
        assertEquals(true, result);
    }

    // 11
    @Test
    public void testAddition_ExplicitTargetUnit_LargeToSmallScale


    () throws MyException {
        Length length1 = new Length(1000.0, LengthUnit.FEET);
        Length length2 = new Length(500.0, LengthUnit.FEET);
        final LengthUnit feet = LengthUnit.INCHES;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(18000.0, LengthUnit.INCHES);

        assertEquals(expectedResult, actualResult);
    }

    // 12
    @Test
    public void testAddition_ExplicitTargetUnit_SmallToLargeScale

    () throws MyException {
        Length length1 = new Length(12.0, LengthUnit.INCHES);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.YARD;

        Length actualResult = demonstrateLengthAddition(length1, length2, feet);
        Length expectedResult = new Length(0.667, LengthUnit.YARD);

        assertEquals(expectedResult, actualResult);
    }

    // 13
    @Test
    public void testAddition_ExplicitTargetUnit_AllUnitCombinations
    () throws MyException {

        Length length1 = new Length(12.0, LengthUnit.INCHES);
        Length length2 = new Length(12.0, LengthUnit.FEET);
        final LengthUnit yard = LengthUnit.YARD;
        Length actualResult1 = demonstrateLengthAddition(length1, length2, yard);
        Length expectedResult1 = new Length(4.333, LengthUnit.YARD);
        assertEquals(expectedResult1, actualResult1);

        Length length3 = new Length(12.0, LengthUnit.INCHES);
        Length length4 = new Length(12.0, LengthUnit.FEET);
        final LengthUnit cm = LengthUnit.CM;
        Length actualResult2 = demonstrateLengthAddition(length3, length4, cm);
        Length expectedResult2 = new Length(396.24, LengthUnit.CM);
        assertEquals(expectedResult2, actualResult2);
    }

    // 14
    @Test
    public void testAddition_ExplicitTargetUnit_PrecisionToleance

    () throws MyException {

        Length length1 = new Length(12.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.YARD);
        final LengthUnit inches = LengthUnit.INCHES;
        Length actualResult1 = demonstrateLengthAddition(length1, length2, inches);
        Length expectedResult1 = new Length(576, LengthUnit.INCHES);
        assertEquals(expectedResult1, actualResult1);

        Length length3 = new Length(12.0, LengthUnit.YARD);
        Length length4 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit feet = LengthUnit.FEET;
        Length actualResult2 = demonstrateLengthAddition(length3, length4, feet);
        Length expectedResult2 = new Length(37.0, LengthUnit.FEET);
        assertEquals(expectedResult2, actualResult2);
    }

    // UC 8
    @Test
    public void testLengthUnitEnum_FeetConstant
            (){
        double actualResult = LengthUnit.FEET.getConversionFactor();
        double expectedResult = 12.0;
        assertEquals(expectedResult, actualResult);
    }

    // 2
    @Test
    public void testLengthUnitEnum_InchesConstant

            (){
        double actualResult = LengthUnit.INCHES.getConversionFactor();
        double expectedResult = 1.0;
        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testLengthUnitEnum_YardConstant

            (){
        double actualResult = LengthUnit.YARD.getConversionFactor();
        double expectedResult = 36.0;
        assertEquals(expectedResult, actualResult);
    }

    // 4
    @Test
    public void testLengthUnitEnum_CMConstant


            (){
        double actualResult = LengthUnit.CM.getConversionFactor();
        double expectedResult = 0.393701;
        assertEquals(expectedResult, actualResult);
    }

    // 5
    @Test
    public void testConvertToBaseUnit_FeetToInches
            (){
        double actualResult = LengthUnit.FEET.convertToBaseUnit(5.0);
        double expectedResult = 60.0;
        assertEquals(expectedResult, actualResult);
    }

    // 6
    @Test
    public void testConvertToBaseUnit_InchesToInches
            (){
        double actualResult = LengthUnit.INCHES.convertToBaseUnit(12.0);
        double expectedResult = 12.0;
        assertEquals(expectedResult, actualResult);
    }

    // 7
    @Test
    public void testConvertToBaseUnit_YardsToInches

            (){
        double actualResult = LengthUnit.YARD.convertToBaseUnit(1.0);
        double expectedResult = 36.0;
        assertEquals(expectedResult, actualResult);
    }

    // 8
    @Test
    public void testConvertToBaseUnit_CMToInches

            (){
        double actualResult = LengthUnit.CM.convertToBaseUnit(30.48);
        double expectedResult = 12.00;
        assertEquals(expectedResult, actualResult);
    }

    // 9
    @Test
    public void testConvertFromBaseUnit_InchesToFeet

            (){
        double actualResult = LengthUnit.FEET.convertFromBaseUnit(2.0);
        double expectedResult = 0.167;
        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testConvertFromBaseUnit_InchesToInches
            (){
        double actualResult = LengthUnit.INCHES.convertFromBaseUnit(1.0);
        double expectedResult = 1.0;
        assertEquals(expectedResult, actualResult);
    }

    // 11
    @Test
    public void testConvertFromBaseUnit_InchesToYards

            (){
        double actualResult = LengthUnit.YARD.convertFromBaseUnit(3.0);
        double expectedResult = 0.083;
        assertEquals(expectedResult, actualResult);
    }

    // 12
    @Test
    public void testConvertFromBaseUnit_InchesToCM
            (){
        double actualResult = LengthUnit.CM.convertFromBaseUnit(1.0);
        double expectedResult = 2.54;
        assertEquals(expectedResult, actualResult);
    }

    // 13
    @Test
    public void testQuantityLengthRefactored_Equality
            (){
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 14
    @Test
    public void testQuantityLengthRefactored_ConvertTo
            () throws MyException {

        double actualResult = convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        double expectedResult = 12.0;
        assertEquals(expectedResult, actualResult);
    }

    // 15
    @Test
    public void testQuantityLengthRefactored_add
            () throws MyException {

        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        Length actualResult =  length1.add(length2);
        Length expectedResult = new Length(2.0, LengthUnit.FEET);

        assertEquals(expectedResult, actualResult);
    }

    // 16
    @Test
    public void testQuantityLengthRefactored_AddWithTargetUnit
            () throws MyException {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        final LengthUnit yard = LengthUnit.YARD;

        Length actualResult = demonstrateLengthAddition(length1, length2, yard);
        Length expectedResult = new Length(0.667, LengthUnit.YARD);

        assertEquals(expectedResult, actualResult);
    }

    // 17
    @Test
    public void testQuantityLengthRefactored_NullUnit
            () throws MyException {

        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 18
    @Test
    public void testQuantityLengthRefactored_InvalidValue

            () throws MyException {
        MyException exception = assertThrows(MyException.class, () -> {
            convert(Double.POSITIVE_INFINITY, LengthUnit.FEET, LengthUnit.INCHES);
        });
        boolean result = exception.getMessage().equals("Please enter a finite value");
        assertEquals(true, result);
    }

    // 19 - All UC1 test cases are already included.
    // 20 - All UC5 test cases are already included.
    // 21 - All UC6 test cases are already included.
    // 22 - All UC7 test cases are already included.

}