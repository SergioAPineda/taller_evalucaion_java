package exercice3;

public class Circle {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double calculateArea(){
        double area = Math.PI * Math.pow(this.radio,2);
        return area;
    }
}
