package com.main;

import com.TxtFileReader.CountryCapitalPairParser;
import com.TxtFileReader.TxtFileReader;


public class Main {

    public static void main(String[] args) {
        CountryCapitalPairParser parser = new CountryCapitalPairParser(new TxtFileReader());
        parser.parse();
        System.out.println(parser.messages());
    }
}
