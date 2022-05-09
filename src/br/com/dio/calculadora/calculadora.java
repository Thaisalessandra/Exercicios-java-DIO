package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("digite o primeiro número: ");
        a=scan.nextInt();
        System.out.println("digite o segundo número: ");
        b=scan.nextInt();
        int somar = somar(a, b);
        int sub = sub(a, b);
        int dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);
        System.out.println("soma: "+somar);
        System.out.println("Subtrair: "+sub);
        System.out.println("multiplicar: "+multiplicar);
        System.out.println("dividir: "+dividir);
    }
    public static int somar(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int dividir(int a,int b){
        return a/b;
    }
    public static int multiplicar(int a,int b){
        return a*b;
    }
}

