package com.company;

public class Vector {
     double x;
     double y;
     double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector sum(Vector a, Vector b) { //сумма векторов
        Vector result = new Vector(0, 0, 0);
        result.x = a.x + b.x;
        result.y = a.y + b.y;
        result.z = a.z + b.z;
        return result;
    }

    public static Vector difference(Vector a, Vector b) { //разность векторов
        Vector result = new Vector(0, 0, 0);
        result.x = a.x - b.x;
        result.y = a.y - b.y;
        result.z = a.z - b.z;
        return result;
    }

    public static double scalarMultiplication(Vector a, Vector b) { //скалярное произведение векторов
        Vector res = new Vector(0, 0, 0);
        res.x = a.x * b.x;
        res.y = a.y * b.y;
        res.z = a.z * b.z;
        return res.x + res.y + res.z;
    }

    public static Vector multiplicationByNumber(Vector a, double num) { //умножение вектора на число
        Vector result = new Vector(0, 0, 0);
        result.x = a.x*num;
        result.y = a.y*num;
        result.z = a.z*num;
        return result;
    }

    public static double length(Vector a) {  //длина вектора
        return Math.sqrt(Math.pow(a.x, 2)+Math.pow(a.y, 2)+Math.pow(a.z, 2));
    }

    public static double cosine(Vector a, Vector b) { //косинус угла между векторами
        double one = a.x*b.x + a.y*b.y + a.z*b.z;
        double two = (Math.sqrt(Math.pow(a.x, 2)+Math.pow(a.y, 2)+Math.pow(a.z, 2)))*(Math.sqrt(Math.pow(b.x, 2)+Math.pow(b.y, 2)+Math.pow(b.z, 2)));
        return one/two;
    }
}
