/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

class MnopA {

    static int x = 10, y = 10, z = 10;

    public MnopA() {
        x *= 2;
    }
    
    {
        y += 5;
        z += 10;
    }
}

class MnopB extends MnopA {

    public MnopB(int c) {
        y *= c;
    }
    
    {
        z += y;
    }

    static {
        x = y = z = 1;
    }
}

public class Main {

    public static void main(String[] args) {
        MnopB o = new MnopB(2);
        System.out.println(MnopB.x + MnopB.y + MnopB.z);
        System.out.println(MnopB.x);
        System.out.println(MnopB.y);
        System.out.println(MnopB.z);
    }
}