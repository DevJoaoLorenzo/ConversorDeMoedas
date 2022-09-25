package application;

import util.MoedaConversor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a moeda que você deseja comprar? \n1 - Dolar\n2 - Euro\n3 - Libras");
        int tipo = sc.nextInt();
        MoedaConversor.valor(tipo);
        double valor = sc.nextDouble();
        MoedaConversor.moeda(tipo);
        double qnt = sc.nextDouble();
        System.out.print("Valor a ser pago em reais (conversão + imposto): ");
        MoedaConversor.conversor(qnt, valor);

        sc.close();
    }
}
