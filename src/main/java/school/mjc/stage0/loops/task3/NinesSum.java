package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int answer = 0;
        String string = "";
        for (int i = 0; i < lengthOfLastNumber; i++) {
            string = string + "9";
            answer =answer + Integer.parseInt(string);
        }
        System.out.println(answer);
    }
}
