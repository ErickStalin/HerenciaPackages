package Geometria3D;

import java.lang.*;
import java.util.Scanner;

public class volumenAreaCilindro extends cilindro {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;

    public volumenAreaCilindro(double alturaCil, double radioCil, double areaCil, double volumenCil) {
        super(alturaCil, radioCil, areaCil, volumenCil);
        CalcularVolumen();
        CalcularArea();
    }
    @Override
    public void CalcularArea(){
        areaCil = 2*pi*radioCil*(alturaCil+radioCil);
    }
    @Override
    public void CalcularVolumen(){
        volumenCil = (pi*(radioCil*radioCil))*alturaCil;
    }
    //Solicitud de datos mediante metodos
    public void mostrarCilindro(){
        System.out.print("Ingrese el radio del cilindro:");
        radioCil = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro:");
        alturaCil = entrada.nextDouble();
        CalcularArea();
        CalcularVolumen();
        System.out.println("---DATOS DEL CILINDRO---");
        System.out.println("El volumen del cilindor es es: " + getVolumenCil());
        System.out.println("El area del cilindor es: " + getAreaCil());
    }
}
