package Geometria3D;

import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;

public class volumenAreaCilindro {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarCilindro(){
        double radio, area, volumen, altura;
        System.out.print("Ingrese el radio del cilindro:");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro:");
        altura = entrada.nextDouble();
        area = 2*pi*radio*(altura+radio);
        volumen = (pi*(radio*radio))*altura;
        cilindro miCilindro = new cilindro(altura,radio,area,volumen);
        System.out.println("---DATOS DEL CILINDRO---");
        System.out.println("El volumen del cilindor es es: " + miCilindro.getVolumenCil());
        System.out.println("El area del cilindor es: " + miCilindro.getAreaCil());
    }
}
