package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int  m=scanner.nextInt();
        double inch=0.0254;
        double metr=m*inch;
        System.out.println(m+"inch= "+metr+" meters");
    }
}
