package com.mailParser;

/**
 * Created by ????? on 16.01.2016.
 */


    import javax.mail.*;
    import java.io.IOException;

public class Messages implements ParserMessage{

              private Multipart mp;
              private BodyPart bp;
              private Message m;
              private int messageCount = 0;
              final private Folder inbox;
                private Initialize folder;
                private String body = "";

        public Messages(){
            this.folder = null;
            try {
                this.folder = new Initialize();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.inbox = folder.getInbox();
        }



        /**
         * @return i-th message from inbox
         */
        public String getMessage(int i) {
            String message = null;
            try {
                m =  inbox.getMessage(i);
                if(m.getContent() instanceof String)
                    {message = (String) m.getContent();

                    }
                else if(m.getContent() instanceof Multipart)
                    {
                        mp = (Multipart) m.getContent();
                        bp = mp.getBodyPart(0);
                        message = (String) bp.getContent();
                    }
//                System.out.println(message);

            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return message;
        }



        public int getMessageCount(){
            try {
                messageCount = inbox.getMessageCount();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            return messageCount;
        }

        public Message[] getMessages() throws MessagingException {
            return inbox.getMessages();
        }

    }

