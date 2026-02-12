package com.apps.quantitymeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
public class QuantityMeasurementAppTest {

    // UC 1
    @Test
    public void testFeetEquality_SameValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(1.0, Length.LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(2.0, Length.LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Integer length2 = 1;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetEquality_SameReference(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // UC 2
    @Test
    public void testInchesEquality_SameValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(1.0, Length.LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(2.0, Length.LengthUnit.INCHES);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_NullComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_DifferentClass(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Integer length2 = 1;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_SameReference(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // UC 3
    @Test
    public void testFeetEquality_SameValue_UC3(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(1.0, Length.LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesEquality_SameValue_UC3(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(1.0, Length.LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetInchesComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(12.0, Length.LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFeetInequality_DifferentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(2.0, Length.LengthUnit.FEET);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInchesInequality_DifferentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(2.0, Length.LengthUnit.INCHES);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCrossUnitInequality(){
        Length length1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(1.0, Length.LengthUnit.FEET);
        System.out.println(length1.equals(length2));
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualitySameReference(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualityNullComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEqualityNullUnit(){
        Length length1 = new Length(1.0, Length.LengthUnit.FEET);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //UC 4
    // 1
    @Test
    public void testFeetEquality_YardToYard_SameValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(1.0, Length.LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 2
    @Test
    public void testFeetEquality_YardToYard_DifferentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(2.0, Length.LengthUnit.YARD);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 3
    @Test
    public void testEquality_YardToFeet_EquivalentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(3.0, Length.LengthUnit.FEET);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //4
    @Test
    public void testEquality_FeetToYard_EquivalentValue(){
        Length length1 = new Length(3.0, Length.LengthUnit.FEET);
        Length length2 = new Length(1.0, Length.LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //5
    @Test
    public void testEquality_YardToInches_EquivalentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(36.0, Length.LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //6
    @Test
    public void testEquality_InchesToYard_EquivalentValue(){
        Length length1 = new Length(36.0, Length.LengthUnit.INCHES);
        Length length2 = new Length(1.0, Length.LengthUnit.YARD);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //7
    @Test
    public void testEquality_YardToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(2.0, Length.LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //8
    @Test
    public void testEquality_centimetersToInches_EquivalentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = new Length(0.393701, Length.LengthUnit.INCHES);
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //9
    @Test
    public void testEquality_centimetersToFeet_NonEquivalentValue(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = new Length(1.0, Length.LengthUnit.FEET);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    // 10
    @Test
    public void testEquality_MultiUnit_TransitiveProperty(){

        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(3.0, Length.LengthUnit.FEET);
        Length length3 = new Length(36.0, Length.LengthUnit.INCHES);

        assertAll(
                () ->   assertEquals(true, length1.equals(length2)),
                () ->   assertEquals(true, length2.equals(length3)),
                () ->   assertEquals(true, length1.equals(length3))
        );
    }

    //11
    @Test
    public void testEquality_YardWithNullUnit(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //12
    @Test
    public void testEquality_YardSameReference(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //13
    @Test
    public void testEquality_YardNullComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //14
    @Test
    public void testEquality_CentimetersWithNullUnit(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = new Length(1.0, null);
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //15
    @Test
    public void testEquality_CentimetersSameReference(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = length1;
        boolean expectedResult = true;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //16
    @Test
    public void testEquality_CentimetersNullComparison(){
        Length length1 = new Length(1.0, Length.LengthUnit.CM);
        Length length2 = null;
        boolean expectedResult = false;
        boolean actualResult = length1.equals(length2);
        assertEquals(expectedResult, actualResult);
    }

    //17
    @Test
    public void testEquality_AllUnits_ComplexScenario(){
        Length length1 = new Length(1.0, Length.LengthUnit.YARD);
        Length length2 = new Length(3.0, Length.LengthUnit.FEET);
        Length length3 = new Length(36.0, Length.LengthUnit.INCHES);

        assertAll(
                () ->   assertEquals(true, length1.equals(length2)),
                () ->   assertEquals(true, length2.equals(length3)),
                () ->   assertEquals(true, length1.equals(length3))
        );
    }
}