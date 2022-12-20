package geometria2D;
public class circulo {
    double radioCir, perimetroCir, areaCir;

    public circulo(double radioCir, double perimetroCir, double areaCir) {
        this.radioCir = radioCir;
        this.perimetroCir = perimetroCir;
        this.areaCir = areaCir;
    }


    public double getRadioCir() {
        return radioCir;
    }

    public void setRadioCir(double radioCir) {
        this.radioCir = radioCir;
    }

    public double getPerimetroCir() {
        return perimetroCir;
    }

    public void setPerimetroCir(double perimetroCir) {
        this.perimetroCir = perimetroCir;
    }

    public double getAreaCir() {
        return areaCir;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }
}

