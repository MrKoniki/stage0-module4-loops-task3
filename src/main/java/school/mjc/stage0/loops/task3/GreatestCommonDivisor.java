package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int answer = 1;
        int smallest = first > second ? first : second;
        for(int i = 1; i < smallest + 1; i++) {
            if (first % i == 0 & second % i == 0) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
