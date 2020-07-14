package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

            int x = max1(num1, num2);
            int y = max2(num3, num4);
            x = max1(x, y);
            System.out.println(x);  }


        public static int max1 ( int a, int b){
                if (a > b) {
                    return (a);
                } else
                    return (b);
            }//напишите тут ваш код
            public static int max2 ( int a, int b){
                if (a > b) {
                    return (a);
                } else
                    return (b);
            }


    }
