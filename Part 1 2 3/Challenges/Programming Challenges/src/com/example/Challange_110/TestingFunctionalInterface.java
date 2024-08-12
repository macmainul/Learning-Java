package com.example.Challange_110;

public class TestingFunctionalInterface {
    public static void main(String[] args) {
        Candidate cadidate = num -> {
            for (int i = 2; i < num/2; i++) {
                if(num % i == 0)    {
                    return false;
                }
            }
            return true;
        };

        System.out.println(cadidate.isCandidate(5));
    }
}
