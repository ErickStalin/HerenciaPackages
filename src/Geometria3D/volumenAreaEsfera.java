package Geometria3D;

import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;

public class volumenAreaEsfera {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarEsfera(){
        double radio, area , volumen;
        System.out.print("Ingrese el radio de la esfera:");
        radio = entrada.nextDouble();
        area = 4*pi*(radio*radio);
        volumen = (1.33)*pi*(radio*radio*radio);
        esfera miEsfera = new esfera(radio,area,volumen);
        System.out.println("---DATOS DEL ESFERA---");
        System.out.println("El volumen de la esfera es es: " + miEsfera.getVolumenEs());
        System.out.println("El area de la esfera es: " + miEsfera.getAreaEs());
    }
}
