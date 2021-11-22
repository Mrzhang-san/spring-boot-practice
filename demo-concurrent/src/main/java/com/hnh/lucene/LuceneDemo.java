package com.hnh.lucene;


import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttributeImpl;

import java.io.IOException;

/**
 * @author user
 * @date 2021-11-22 10:29
 */
public class LuceneDemo {
    public static void main(String[] args) {

        String text = "An AttributeSource contains a list of different AttributeImpls, and methods to add and get them. ";

        try (Analyzer ana = new MyWhitespaceAnalyzer()) {

            TokenStream tokenStream = ana.tokenStream("", text);
            MyCharAttribute ca = tokenStream.getAttribute(MyCharAttribute.class);
            tokenStream.reset();
            while (tokenStream.incrementToken()) {
                System.out.print(ca.getString() + "|");
            }
            tokenStream.end();
            tokenStream.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
