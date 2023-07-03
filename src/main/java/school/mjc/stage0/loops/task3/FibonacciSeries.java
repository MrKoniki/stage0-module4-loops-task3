package school.mjc.stage0.loops.task3;

import java.util.Arrays;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
     int[] mass = new int[] {0, 1};
     for (int i = 0; i < lastFibonacci; i++) {
         if (i >= 2) {
             mass = Arrays.copyOf(mass,mass.length + 1);
             mass[i] = mass[i-1] + mass[i-2];
         }
         System.out.println(mass[i]);
     }
    }
}
