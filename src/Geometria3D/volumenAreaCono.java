package Geometria3D;

import java.lang.*;
import java.util.Scanner;

public class volumenAreaCono extends cono {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;

    public volumenAreaCono(double radioCo, double generatrizCO, double areaCo, double volumenCo) {
        super(radioCo, generatrizCO, areaCo, volumenCo);
        CalcularArea();
        CalcularVolumen();
    }
    @Override
    public void CalcularArea(){
        areaCo = pi * (radioCo*radioCo) + pi * radioCo * generatrizCO;
    }
    @Override
    public void CalcularVolumen(){
        volumenCo = (pi*(radioCo*radioCo)*areaCo)/3;
    }
    //Solicitud de datos mediante metodos
    public void mostrarCono(){
        //Atributos
        double radio, generatriz, area, volumen, altura;
        System.out.print("Ingrese el radio del cono:");
        radioCo = entrada.nextDouble();
        System.out.print("Ingrese la generatiz del cono:");
        generatrizCO = entrada.nextDouble();
        CalcularArea();
        CalcularVolumen();
        System.out.println("---DATOS DEL CONO---");
        System.out.println("El volumen del cono es: " + getVolumenCo());
        System.out.println("El area del cono es: " + getAreaCo());
    }
}
