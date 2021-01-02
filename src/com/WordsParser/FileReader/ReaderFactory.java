package com.WordsParser.FileReader;

import java.util.HashMap;
import java.util.Map;

public class ReaderFactory {

    private Map<String, Reader> readerTypes = new HashMap<String, Reader>();

    public ReaderFactory() {
        add(new PdfFileReader());
        add(new TxtFileReader());
    }

    private void add(Reader reader) {
        readerTypes.put(reader.code(), reader);
    }

    public Reader create(String type) throws Exception {
        Reader reader = readerTypes.get(type);
        if (reader == null)
            throw new Exception("Type not found");

        return reader;
    }
}
