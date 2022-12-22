package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int up= scan.nextInt(), down = scan.nextInt(), height = scan.nextInt();
        int grind = 0;
        int steps = 0;
        if (up > down || up >= height){
            while (grind <= height){
                if (grind + up < height) {
                    grind += up - down;
                    steps++;
                } else {
                    System.out.println(++steps);
                    break;
                }
            }
        } else {
            System.out.println("Impossible");
        }
    }
}
