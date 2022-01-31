package com.geekbrains.com.geekbrains.lesson4;

public class FindAreaOfTriangle {

    public static void main(String[] args) throws Exception {
        findOfAreaTriangle(3, 5, 4);


    }

    public static void findOfAreaTriangle(int s1, int s2, int s3) throws Exception {
        double area, S;
         if(s3<=0 && s2<=0 && s1 <=0) {
            throw new Exception(" значение не может быть нулевым или отрицательным");
        }

        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));

        System.out.format("The Area of triangle = %.2f\n", area);
    }
}

