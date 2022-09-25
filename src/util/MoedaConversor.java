package util;

public class MoedaConversor {
    public static final double IOF = 0.06;
    public static void valor(int tipo){
        switch (tipo){
            case 1 -> System.out.println("Quanto está o dolar? ");
            case 2 -> System.out.println("Quanto está o euro? ");
            case 3 -> System.out.println("Quantas está a libra? ");
        }
    }
    public static void moeda(int tipo){
        switch (tipo){
            case 1 -> System.out.println("Quantos dolares deseja comprar? ");
            case 2 -> System.out.println("Quantos euros deseja comprar? ");
            case 3 -> System.out.println("Quantas libras deseja comprar? ");
        }
    }
    public static void conversor(double valor, double qnt){
        System.out.println("R$ " + ((valor * qnt) + (valor * qnt * IOF)));
    }




}
