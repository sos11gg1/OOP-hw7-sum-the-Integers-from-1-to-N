package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        int i,num=0;
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int N = scanner.nextInt();
        for(i=1;i<=N;i++)
            num+=i;
        System.out.println("總合="+num);
    }
}
