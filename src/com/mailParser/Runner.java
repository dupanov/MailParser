package com.mailParser;

/**
 * Created by Vadik on 16.01.2016.
 */
public class Runner {
    public static void main(String[] args) {
        ParserMessage m = new FilterMeassages();
        String text = m.getMessage(m.getMessageCount());
        System.out.println(text);
        String newstring = text.substring(text.indexOf("<title>"),text.indexOf("</title>"));
        System.out.println(newstring);

    }
}
