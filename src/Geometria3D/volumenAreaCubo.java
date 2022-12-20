package Geometria3D;

import java.lang.*;
import java.util.Scanner;


public class volumenAreaCubo extends cubo{
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;

    public volumenAreaCubo(double lCu, double areaCu, double volumenCu) {
        super(lCu, areaCu, volumenCu);
    }
    @Override
    public void CalcularArea(){
        areaCu = 6*(lCu*lCu);
    }
    @Override
    public void CalcularVolumen(){
        volumenCu = (lCu*lCu*lCu);
    }
    //Solicitud de datos mediante metodos
    public void mostrarCubo(){
        double area, volumen, lado;
        System.out.print("Ingrese el lado del cubo:");
        lCu = entrada.nextDouble();
        System.out.println("---DATOS DEL CUBO---");
        System.out.println("El volumen del cubo es es: " + getVolumenCu());
        System.out.println("El area del cubo es: " + getAreaCu());
    }
}
