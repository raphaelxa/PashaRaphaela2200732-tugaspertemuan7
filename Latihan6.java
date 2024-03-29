/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan6;

/**
 *
 * @author pasha
 */
import java.util.Scanner;

public class Latihan6 {
    private double a, b, c, d, e, f;

    public Latihan6() {
        
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            return Double.NaN; // jika persamaan tidak memiliki solusi, kembalikan NaN (Not a Number)
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            return Double.NaN; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        Latihan6 equation = new Latihan6();
        equation.a = a;
        equation.b = b;
        equation.c = c;
        equation.d = d;
        equation.e = e;
        equation.f = f;

        if (equation.isSolvable()) {
            System.out.println("Persamaan memiliki solusi.");
            System.out.println("Nilai x adalah: " + equation.getX());
            System.out.println("Nilai y adalah: " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }

        scanner.close();
    }
}
