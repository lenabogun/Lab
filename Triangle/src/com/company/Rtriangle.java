package com.company;

public class Rtriangle extends Triangle {
    public boolean Proverka(){
        if ((a==b)&&(a==c)) return true;
        return false;
    }
    public Rtriangle(double a,double b,double c){this.a=a;this.b=b;this.c=c;};

}
