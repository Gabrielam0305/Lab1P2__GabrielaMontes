/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2__gabrielamontes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author Gabriela Montes
 */
public class Lab1P2__GabrielaMontes {

/**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
          Scanner entrada = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("1. Ejercicio 1 ");
        System.out.println("2. Ejercicio 2 ");
        System.out.println("3. Ejercicio 3 ");
        System.out.println("4. Salir ");
        int op=entrada.nextInt();
        if ((op<1)||(op>4)){
            System.out.println("No valido");
        }else{
        while (op!=4){
            switch(op){
                case 1:
                    System.out.println("Torres de Hanoi");
                    System.out.println("Numero de discos: ");
                    int num=entrada.nextInt();
                    hanoi(num,1, 1, 2,3);
                    break;
                case 2:
                      entrada = new Scanner(System.in);
                    System.out.println("Ingrese la cadena");
                    String fecha=entrada.nextLine();
                    fecha(fecha);
                    break;
                case 3:
                    System.out.println("Ingrese el limite: ");
                    int k=entrada.nextInt();
                    double suma=0;
                    int numero=0;
                    double g=pi(numero,k,suma);
                    System.out.println(g);
                    break;
            }
        //while
        System.out.println("---Menu---");
        System.out.println("1. Ejercicio 1 ");
        System.out.println("2. Ejercicio 2 ");
        System.out.println("3. Ejercicio 3 ");
        System.out.println("4. Salir ");
        op=entrada.nextInt();
        }
        //else
    }
   //main 
}
    public static void hanoi(int num, int paso, int origen, int auxiliar, int destino) { 
        if (num==1) {          
          System.out.println("Mover disco " +num+ " de "+origen+ " a "+destino);
    } else {
       hanoi(num-1,paso, origen, destino,auxiliar);
       System.out.println("Mover disco " +num+ " de "+origen+ " a "+destino);
       hanoi(num-1,paso, auxiliar, origen,destino);
    }
}
    
        public static void fecha (String date) throws ParseException {
       String fecha []=date.split(",");
        
       DateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
            for (int i = 0; i < fecha.length; i++) {
                String obj=fecha[i];
                if((obj.charAt(2)=='/')&&(obj.charAt(5)=='/')){
                  System.out.println(Date.parse(fecha[i]));   
            }
            }
        }
        
     public static double pi (int n, int lim, double sum) {
    if (n==lim) {          
          return 4*sum;
    } else {
       sum+=(pot(-1,n))/(2*(n)+1);
       return pi(n+1,lim,sum);
    }
}
 
     public static double pot (double b,double p) {
    if (p==0) {          
          return 1;
    } else {
        return b*pot(b,p-1);
    }
}

//class
}