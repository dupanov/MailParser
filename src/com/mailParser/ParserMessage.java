package com.mailParser;

import javax.mail.Message;
import javax.mail.MessagingException;

/**
 * Created by ????? on 16.01.2016.
 */
interface ParserMessage  {

    String getMessage(int i);

    int getMessageCount();

    Message[] getMessages() throws MessagingException;



}
