package JavaAdvanced.SetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountSymbols {
    static final int MAX_CHAR = 256;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char tempArray[] = bufferedReader.readLine().toCharArray();
        Arrays.sort(tempArray);
        var str = new String(tempArray);
        getOccuringChar(str);

    }
    static void getOccuringChar(String theText) {
        int count[] = new int[MAX_CHAR];


        for(int i = 0; i < theText.length();i++) {
            count[theText.charAt(i)]++;
        }

        char characters [] = new char[theText.length()];

        for (int i = 0; i < theText.length();i++) {
            characters[i] = theText.charAt(i);
            int find = 0;
            for (int j = 0;  j <= i; j++) {
                if (theText.charAt(i) == characters[j])
                    find++;
            }

            if (find == 1)
                System.out.println((theText.charAt(i)) + ": " +count[theText.charAt(i)] + " time/s");
        }


    }
}