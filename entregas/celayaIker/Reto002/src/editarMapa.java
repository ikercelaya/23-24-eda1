package Reto002.src;

import java.util.Scanner;

public class editarMapa extends imprimirMapa{
    static void modificar(String[][] hoja, int[] posicion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        String valor = sc.nextLine();
        String resultado = "";
        if (valor.length() > 7) {
            for (int i = 0; i < 7; i++) {
                resultado = resultado + valor.charAt(i);
            }

        } else {
            resultado = valor;
        }
        hoja[posicion[0]][posicion[1]] = resultado;
    }
}