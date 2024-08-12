package com.example.Challange_82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperation opr = new ArrayOperation(new int[] {32,34,12});
        ArrayOperation.Statistics opr2 = opr.new Statistics();

        System.out.println(opr2.mean());
    }
}
