/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pumaf
 */
public class CalculadoraFraccion {
    Fraction ans;

    public Fraction getAns() {
        return ans;
    }

    public void setAns(Fraction ans) {
        this.ans = ans;
    }
    public CalculadoraFraccion(){
    }
    public Fraction calcularsumar(Fraction a, Fraction b){
        int new_numerador  = (a.numerator*b.denominator) + (b.numerator*a.denominator);
        int new_denominador = (a.denominator) * (b.denominator);
        return new Fraction(new_numerador, new_denominador);
    }
    public Fraction calcularResta(Fraction a, Fraction b){
        int new_numerador  = (a.numerator*b.denominator) - (b.numerator*a.denominator);
        int new_denominador = (a.denominator) * (b.denominator);
        return new Fraction(new_numerador, new_denominador);
    }
    public Fraction calcularMultiplicacion(Fraction a, Fraction b){
        int new_numerador  = a.numerator*b.numerator;
        int new_denominador = a.denominator* b.denominator;
        return new Fraction(new_numerador, new_denominador);
    }
    public Fraction calcularDivision(Fraction a, Fraction b){
        int new_numerador  = a.numerator*b.denominator;
        int new_denominador = a.denominator* b.numerator;
        return new Fraction(new_numerador, new_denominador);
    }
}
