/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias2;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Dias2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int op;
        String o = null;
        do {
            //System.out.println("1. Ingresar Numero");
            //System.out.println("2. Salir");
            //System.out.println(" ");
            System.out.println("Ingrese el numero del dia");
            op= read.nextInt();
            
            switch (op){
                case 1:
                    System.out.println("Lunes");
                   break;
                case 2:
                    System.out.println("Martes");
                   break;
                case 3:
                    System.out.println("Miercoles");
                   break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                   break;
                case 6:
                    System.out.println("Sabado");
                   break;
                case 7:
                    System.out.println("Domingo");
                   break;
                default:
                    System.out.println("El numero ingresado no es valido");
            }
            System.out.println(" ");
            System.out.println("Desea continuar? si/no");
            o= read.next();
        } while (o.equals("si"));
    }
}
