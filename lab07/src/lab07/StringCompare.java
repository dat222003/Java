package lab07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringCompare {

    public static void main(String[] args) {

        Path read_path = Paths.get("src/lab07/random_words.txt");
        Path word_path = Paths.get("longest_word.txt");
        Path vowel_path = Paths.get("vowel_word.txt");

        try (
                BufferedReader reader = Files.newBufferedReader(read_path, StandardCharsets.UTF_8);
                BufferedWriter writer = Files.newBufferedWriter(word_path, StandardCharsets.UTF_8);
                BufferedWriter vowel = Files.newBufferedWriter(vowel_path, StandardCharsets.UTF_8);
        ) {
            ArrayList<String> read = new ArrayList<>();
            // read input
            String line;
            while ((line = reader.readLine()) != null) {
                read.add(line);
            }

            // sort by length
            read.sort(Comparator.comparingInt(String::length));

            //sml & lg
            writer.write("smallest: ");
            for (String s : read) {
                if ( s.length() != read.get(0).length() ) break;
                writer.write(s + " ");
            }

            writer.write("\n" + "longest: ");
            for (int j = 0; j < read.size(); j++) {
                if ( read.get(read.size() - 1 - j).length() != read.get(read.size() - 1).length() )
                    break;
                writer.write(read.get(read.size() - 1 - j) + " ");
            }

            //vowel
            ArrayList<Long> count_vowel = new ArrayList<>();
            for (String s : read) { //count
                long count_u = s.chars().filter(ch -> ch == 'u').count();
                long count_e = s.chars().filter(ch -> ch == 'e').count();
                long count_o = s.chars().filter(ch -> ch == 'o').count();
                long count_a = s.chars().filter(ch -> ch == 'a').count();
                long count_i = s.chars().filter(ch -> ch == 'i').count();
                count_vowel.add(count_u + count_e + count_o + count_a + count_i);
            }

            Long max = Collections.max(count_vowel); //max vowel counted
            ArrayList<Integer> indexList = new ArrayList<>();// list of index contain max vowel counted
            for (int i = 0; i < count_vowel.size(); i++) {
                if (max.equals(count_vowel.get(i))) {
                    indexList.add(i);
                }
            }
            vowel.write("max vowel counted: " + max + "\n");
            for (int i : indexList) {
                vowel.write(read.get(i) + "\n");
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
