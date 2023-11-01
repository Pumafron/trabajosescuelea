/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pumaf
 */
public class Fraction {
    int numerator,denominator;

    public Fraction(){
        numerator = 0;
        denominator = 1;
                
    }
    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
                
    }
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    

            
}
