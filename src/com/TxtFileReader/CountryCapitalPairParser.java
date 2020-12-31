package com.TxtFileReader;

import java.util.ArrayList;
import java.util.List;

public class CountryCapitalPairParser implements IParser {

    private List<String> countryCapitalPair = new ArrayList<>();
    private final TxtFileReader txtFileReader;

    public CountryCapitalPairParser(TxtFileReader txtFileReader) {
        this.txtFileReader = txtFileReader;
    }

    public void parse() {
        countryCapitalPair = txtFileReader.CountryCapitalPair();
    }

    public List<String> messages() {
        return countryCapitalPair;
    }
}
