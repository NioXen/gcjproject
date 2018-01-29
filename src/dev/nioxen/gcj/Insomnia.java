package dev.nioxen.gcj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Insomnia {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        HashSet<Integer> full = new HashSet<>();
        for (int i = 0; i < 10; ++i) {
            full.add(i);
        }
        int testCases = scnr.nextInt();
        for (int i = 1; i <= testCases; ++i){
            int n = scnr.nextInt();
            int initialn = n;
            if (n==0) {
                System.out.println("Case #" + i + ": INSOMNIA");
                continue;
            }
            HashSet<Integer> seen = new HashSet<>();
            while (true){
                int current = n;
                while (current > 0){
                    seen.add(current%10);
                    current = current / 10;
                }
                if (seen.containsAll(full)) break;
                n = n + initialn;
            }
            System.out.println("Case #" + i + ": " + n);
        }
    }
}
