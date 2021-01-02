package com.WordsParser;

import com.WordsParser.FileReader.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsPairParser implements IParser {
    private List<String> secretAndHintWordsPair = new ArrayList<>();
    private Reader reader;

    public WordsPairParser(Reader reader) {
        this.reader = reader;
    }

    public void setWordsPair() {
        this.secretAndHintWordsPair = Arrays.asList(reader.randomWordsPair());
    }

    public List<String> getWordsPair() {
        return secretAndHintWordsPair;
    }
}
