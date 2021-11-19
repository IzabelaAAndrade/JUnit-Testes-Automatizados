package com.izabela;
public class Bhaskara {

    public static double calculaBhaskara(double a, double b, double c){
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(a != 0 && delta ==0){
            return (-b)/(2*a);
        }
        return -1;
    }
}
