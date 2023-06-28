package org.example;

public class Zwemles {

    public static boolean magGratisZwemlesVolgen(int leeftijd, boolean eersteKeer, boolean heeftOoievaarspas) {
        return ((((isOudGenoegZwemles(leeftijd)) && eersteKeer) || (isOudGenoegZwemles(leeftijd)) && heeftOoievaarspas));
    }

    public static boolean isOudGenoegZwemles(int leeftijd) {
        return ((7 <= leeftijd) && (leeftijd <= 18));
    }
}
