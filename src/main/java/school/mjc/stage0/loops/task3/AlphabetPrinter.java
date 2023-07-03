package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char[] englishAlphabet = new char[] {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        for(int i = 0; i < englishAlphabet.length; i++) {
            System.out.println(englishAlphabet[i]);
        }
    }
}
