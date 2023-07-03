package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = String.valueOf(t);
        str = str.replaceAll("[^0-9]", "");
        char[] mass = str.toCharArray();
        int answer = 0;

        for (int i = 0; i < mass.length; i++) {
            answer = answer + Character.getNumericValue(mass[i]);
        }
        System.out.println(answer);
    }
}
