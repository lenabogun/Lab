package com.company;

public class Triangle {

    public double a,b,c;
    public Triangle(){};
    public Triangle(double a, double b, double c){this.a=a;this.b=b;this.c=c;};
    public boolean Proverka(){
        if((a+b)<c){
            return true;
        }else if((a+c)<b){
            return true;
        }else if((b+c)<a){
            return true;
        }
        return false;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    public double getS(){
        double p = (a+b+c)/2;
        return java.lang.Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getAlf(){
        return java.lang.Math.acos((a*a+c*c-b*b)/(2*a*c));
    }
    public double getBet(){
        return java.lang.Math.acos((a*a+b*b-c*c)/(2*a*b));
    }
    public double getGam(){
        return java.lang.Math.acos((b*b+c*c-a*a)/(2*b*c));
    }
    public double getP(){
        return a+b+c;
    }
}
