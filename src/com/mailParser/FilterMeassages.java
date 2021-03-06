package com.mailParser;

import javax.mail.Message;
import javax.mail.MessagingException;

/**
 * Created by Vadik on 16.01.2016.
 */
public class FilterMeassages implements ParserMessage {

    private Messages messages;

    public FilterMeassages(){
        messages = new Messages();
    }

    public String getMessage(int i)
    {

        return messages.getMessage(i);
    }

    public int getMessageCount() {
        return messages.getMessageCount();
    }

    public Message[] getMessages() throws MessagingException {
        return messages.getMessages();
    }
}
