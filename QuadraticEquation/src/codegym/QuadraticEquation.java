package codegym;

import java.text.DecimalFormat;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double  getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2*a);
    }

    @Override
    public String toString() {
        String text="";
        DecimalFormat df=new DecimalFormat("#.####");
        if(getDiscriminant() > 0){
            text="The equation has roots "+ df.format(getRoot1())+ " and " + df.format(getRoot2());
        }else if( getDiscriminant()==0){
            text="The Equation has one root " + df.format(getRoot1());
        }else{
            text="The equation has no real roots";
        }
        return text;
    }
}
