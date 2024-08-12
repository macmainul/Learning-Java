package com.example.Challange_82;

public class ArrayOperation {
    private int num[];

    public ArrayOperation(int[] num) {
        this.num = num;
    }

    public class Statistics {
        double mean()   {
            double sum = 0;
            for (int i : num) {
                sum += i;
            }
            return sum / num.length;
        }

        double median() {
            return 0;
        }
    }

}
