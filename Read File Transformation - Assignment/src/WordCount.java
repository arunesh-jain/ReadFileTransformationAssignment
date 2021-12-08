import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCount {

    public static void main(String[] args) throws IOException {
        File filePath = new File("/home/knoldus/IdeaProjects/Read File Transformation - Assignment/src/Global Warming.txt");

        BufferedReader bufferedReaderr = new BufferedReader(new FileReader(filePath));

        Map<String,Integer> map=new HashMap<String,Integer>();

        String stringInput;

        while ((stringInput = bufferedReaderr.readLine()) != null) {
            String[] stringArray=stringInput.split(" ");
            for (String stringArrayItration : stringArray) {
                if (!map.containsKey(stringArrayItration))
                    map.put(stringArrayItration, 1);
                else
                    map.put(stringArrayItration, map.get(stringArrayItration) + 1);
            }
        }

        for (String key: map.keySet()){
            System.out.println(key +" = "+map.get(key));
        }
    }
}