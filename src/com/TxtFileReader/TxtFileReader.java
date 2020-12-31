package com.TxtFileReader;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TxtFileReader {

    private Integer randomNumber;
    private final List<String> allCountryCapitalPairsList = new ArrayList<>();

    public TxtFileReader() {

    }

    public List<String> CountryCapitalPair() {
        return Arrays.asList(getCountryCapitalPair());
    }

    private void getAllCountryCapitalPairsList() {
        try {
            String txtFilePath = "./countries_and_capitals.txt";
            Scanner scanner = new Scanner(new File(txtFilePath));
            while (scanner.hasNextLine()) {
                allCountryCapitalPairsList.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }

    private Integer getListLength() {
        return allCountryCapitalPairsList.size();
    }

    private String getRandomCountryCapitalPair() {
        return allCountryCapitalPairsList.get(randomNumber);
    }

    private String[] getCountryCapitalPair() {
        getAllCountryCapitalPairsList();
        setRandomNumber();
        return getRandomCountryCapitalPair().split("\\s\\|\\s");
    }

    private void setRandomNumber() {
        randomNumber = RandomNumberGenerator.getRandomNumber(getListLength());
    }

}
