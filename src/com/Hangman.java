package com;

import com.WordsParser.FileReader.ReaderFactory;
import com.WordsParser.FileReader.Reader;
import com.WordsParser.IParser;
import com.WordsParser.WordsPairParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hangman {

    public static void main(String[] args) throws Exception {
        String secretWordField = readWordCategory();

        Reader reader = new ReaderFactory().create(secretWordField);
        reader.setWordsList();

        IParser parser = new WordsPairParser(reader);
        parser.setWordsPair();
        System.out.println(parser.getWordsPair());
    }

    private static String readWordCategory() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Select word category: (C)apitals, (I)slands\n");
        return br.readLine();
    }
}
