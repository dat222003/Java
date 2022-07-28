package lab07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SentencesCompare {

    public static void main(String[] args) {

        Path read_path = Paths.get("src/lab07/random_sentences.txt");
        Path sentences_path = Paths.get("result.txt");

        try (
                BufferedReader reader = Files.newBufferedReader(read_path, StandardCharsets.UTF_8);
                BufferedWriter writer = Files.newBufferedWriter(sentences_path, StandardCharsets.UTF_8);
        ) {
            ArrayList<String[]> read = new ArrayList<>();
            // read input
            String line;
            while ((line = reader.readLine()) != null) {
                read.add(line.split(" "));
            }

            //sort by numbers of words
            read.sort(Comparator.comparingInt(Array::getLength));

            String[] max = read.get(read.size() - 1);
            System.out.println("max: " + Arrays.toString(max) + "\n");
            writer.write(" largest number of words: " + max.length + "\n");
            Collections.reverse(Arrays.asList(max));
            writer.write(String.join(" ", max));
            System.out.println(String.join(" ", max));


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
