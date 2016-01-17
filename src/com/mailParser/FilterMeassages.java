package com.mailParser;

import javax.mail.Message;
import javax.mail.MessagingException;

/**
 * Created by ????? on 16.01.2016.
 */
public class FilterMeassages implements ParserMessage {

    private Messages messages;


    public String getMessage(int i) {
        return null;
    }

    public int getMessageCount() {
        return 0;
    }

    public Message[] getMessages() throws MessagingException {
        return new Message[0];
    }
}
