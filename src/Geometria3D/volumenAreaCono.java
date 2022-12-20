package Geometria3D;

import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;

public class volumenAreaCono {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarCono(){
        //Atributos
        double radio, generatriz, area, volumen, altura;
        System.out.print("Ingrese el radio del cono:");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la generatiz del cono:");
        generatriz = entrada.nextDouble();
        System.out.print("Ingrese la altura del cono:");
        altura = entrada.nextDouble();
        area = pi * (radio*radio) + pi * radio * generatriz;
        volumen = (pi*(radio*radio)*area)/3;
        cono miCono = new cono(radio,generatriz,area ,volumen); //Objetos de los packages
        System.out.println("---DATOS DEL CONO---");
        System.out.println("El volumen del cono es: " + miCono.getVolumenCo());
        System.out.println("El area del cono es: " + miCono.getAreaCo());
    }
}
