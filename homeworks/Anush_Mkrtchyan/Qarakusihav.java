package com.company;

import java.util.Scanner;

public class Qarakusihav {
    public static void main (String []args){
        Scanner input= new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        if(a==0 && b==0 && c==0 ) {
            System.out.println("Duq nermucel eq 0-ner");}
        if(a!=0 && b!=0 && c!=0 ) {
            double d=b*b-4*a*c;
            if(d<0){
                System.out.println("lucum chuni");
            }
            else if(d==0){
                System.out.println("x1=x2"+-b/2*a);
            }
                else{
                System.out.println("x1="+((-b+Math.sqrt(d))/ (2*a)));
                System.out.println("x2="+((-b-Math.sqrt(d))/ (2*a)));
                     }
        }
        if(a==0 && b!=0 && c!=0){
            System.out.println("x="+-c/b);
        }
        if(a!=0 && b==0 &&  c!=0 ){
            if( (-c/a)>=0){
                System.out.println("x1="+Math.sqrt(c/a)+"x2="+-Math.sqrt(c/a));}
            else {System.out.println("lucumy irakan tiv che");}
        }
        if(a!=0 && b!=0 &&  c==0 ){
            System.out.println("x1=0 "+"x2= "+(-b/a));
        }
    }
}
