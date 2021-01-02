package com.WordsParser.FileReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class PdfFileReader extends Reader {

    public PdfFileReader() {
        super();
    }

    @Override
    public String code() {
        return "I";
    }

    @Override
    public List<String> readFileToList() {
        List<String> list = new ArrayList<>();
        String pdfFileName = "islands_and_countries.pdf";

        try {
            PDDocument pdDocument = PDDocument.load(new File(pdfFileName));
            PDFTextStripper pts = new PDFTextStripper();

            String pages = pts.getText(pdDocument);
            String [] lines = pages.split("\r\n|\r|\n");

            list = Arrays.asList(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
