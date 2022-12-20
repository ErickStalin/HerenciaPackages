package Geometria3D;

import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;


public class volumenAreaCubo {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarCubo(){
        double area, volumen, lado;
        System.out.print("Ingrese el lado del cubo:");
        lado = entrada.nextDouble();
        area = 6*(lado*lado);
        volumen = (lado*lado*lado);
        cubo miCubo = new cubo(lado,area,volumen);
        System.out.println("---DATOS DEL CUBO---");
        System.out.println("El volumen del cubo es es: " + miCubo.getVolumenCu());
        System.out.println("El area del cubo es: " + miCubo.getAreaCu());
    }
}
