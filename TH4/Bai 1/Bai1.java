// package TH4.Bai 1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static ArrayList<Integer> readFile() throws FileNotFoundException {
        File txt = new File("./dayso.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<Integer> data = new ArrayList<Integer>();
        while (scan.hasNextInt()) {
            data.add(scan.nextInt());
        }
        return data;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = readFile();
        data.sort(null);
        try {
            FileWriter  myWriter  = new FileWriter("./sapxep.txt");
            for (int i = 0; i < data.size(); i++) {
                myWriter.write(data.get(i) + " ");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
