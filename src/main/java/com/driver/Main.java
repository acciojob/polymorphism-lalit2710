package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        int ans1 = p.product(4,5);
       int ans2 =  p.product(4,5,6);
        double ans3 = p.product(7.8,3.9);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
    public static class Product{
        public int product(int x,int y){

            return x*y;
        }
        public static int product(int x,int y,int z){

            return x*y*z;
        }
        public static double product(double x,double y){

            return x*y;
        }
    }
}
