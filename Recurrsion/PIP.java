package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void pip(int n){
        if(n==0) return;
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
pip(n-1);
        System.out.print(n);

    }
    public static void main(String[] args) {
        int n=3;
        pip(3);
    }
}