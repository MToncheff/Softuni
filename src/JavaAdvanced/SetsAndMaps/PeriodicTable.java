package JavaAdvanced.SetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> elements = new TreeSet<>();
        int numberOfChemicals = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i <numberOfChemicals; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
           while (st.hasMoreTokens())
               elements.add(st.nextToken());
        }
        String elementsToString = String.join(" ", elements);
        System.out.println(elementsToString);

    }


}
