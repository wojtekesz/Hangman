package com.WordsParser.FileReader;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TxtFileReader extends Reader {


    public TxtFileReader() {
        super();
    }

    @Override
    public String code() {
        return "C";
    }

    @Override
    public List<String> readFileToList() {
        List<String> list = new ArrayList<>();
        String txtFilePath = "./countries_and_capitals.txt";

        try {
            Scanner scanner = new Scanner(new File(txtFilePath));

            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }

            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
        }
}
