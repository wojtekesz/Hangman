package com.WordsParser.FileReader;

import java.util.List;

public abstract class Reader {

    private List<String> wordsList;

    public Reader() {

    }

    abstract public String code();

    abstract public List<String> readFileToList();

    public int listLength() {
        return getWordsList().size();
    }

    public int randomNumber() {
        return RandomNumberGenerator.getRandomNumber(listLength());
    }

    public String randomWords() {
        return getWordsList().get(randomNumber());
    }

    public String[] randomWordsPair() {
        return randomWords().split("\\s\\|\\s");
    }

    public void setWordsList() {
        this.wordsList = readFileToList();
    }

    public List<String> getWordsList() {
        return wordsList;
    }
}
