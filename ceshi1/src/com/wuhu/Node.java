package com.wuhu;

public class Node {
    int a;
    int b;
    String c;

//    @Override
//    public String toString() {
//        return "Node{" +
//                "a=" + a +
//                ", b=" + b +
//                ", c='" + c + '\'' +
//                '}';
//    }

    public Node(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
