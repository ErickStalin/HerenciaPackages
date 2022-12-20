package geometria2D;

import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class perimetroAreaCuadrado {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarCuadrado(){
        double lado, area, perimetro;
        System.out.print("Ingrese el lado del cuadrado:");
        lado = entrada.nextDouble();
        area = lado*lado;
        perimetro = lado+lado+lado+lado;
        cuadrado miCuadrado = new cuadrado(lado,area,perimetro);
        System.out.println("---DATOS DEL CUADRADO---");
        System.out.println("El perimetro del cuadrado es: " + miCuadrado.getPerimetroCua());
        System.out.println("El area del cuadrado es: " + miCuadrado.getAreaCua());
    }
}
