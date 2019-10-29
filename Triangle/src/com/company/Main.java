package com.company;

import java.util.Vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a=0,b=0,c=0;
                int k=0,l=0;
        System.out.println("Введите К и L");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        l = in.nextInt();
        System.out.print("Input a number: ");
        Vector vk = new Vector();
        Vector vl = new Vector();
        for(int i = 0;i < k;i++) {
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
            vk.add(new Triangle(a,b,c));
        }
        for(int i = 0;i < l;i++) {
            a=in.nextDouble();
            b=in.nextDouble();
            c=in.nextDouble();
            vl.add(new Rtriangle(a,b,c));
        }
        float s=0;
        for(int i = 0;i<k;i++){
            Triangle t = (Triangle)vk.get(i);
            s += t.getS();
        }
        s /= k;
        System.out.print("Средняя площадь ");
        System.out.println(s);
        double max=0;
        int m=1;
        Triangle t = (Triangle)vl.get(0);
        for(int i = 1;i<l;i++) {
            t = (Triangle)vl.get(i);
            double S = t.getS();
            if(max<S){
                max=S;
                m=i+1;
            }
        }
        System.out.print("Треугольник ");
        System.out.println(m);
        System.out.print("с наибольшей плошадью");
        System.out.println(max);
    }
}
