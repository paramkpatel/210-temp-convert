package com.example.tempfx;


/**
 * This class contains two static methods for converting between Celsius and
 * Fahrenheit temperatures.
 *
 * @author Param Patel
 */

public class TemperatureConverter {
    /**
     * Return the Celsius equivalent of Fahrenheit rounded to one decimal place
     *
     * @param f Integer to convert from F to C
     */
    public static double FtoC(double f) {
        return helperOneDecimal((5.0 / 9.0) * (f - 32.0));
    }

    /**
     * Return the Fahrenheit equivalent of Celsius rounded to one decimal place
     *
     * @param c Integer to convert from C to F
     */
    public static double CtoF(double c) {
        return helperOneDecimal((9.0 / 5.0) * c + 32.0);
    }

    /**
     * This private method helper is to help the answer be rounded to one decimal
     * place
     *
     * @param number
     */
    private static double helperOneDecimal(double number) {
        return Math.round(number * 10) / 10.0;

    }

}