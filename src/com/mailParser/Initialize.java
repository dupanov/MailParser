package com.mailParser;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;

/**
 * Created by Vadik on 16.01.2016.
 */
public class Initialize {
    final private String user = "vd@reality.sh";
    final private String pass = "bobby1979";
    final private String host = "imap.yandex.com";
    final private Properties props;
    final private Store store;
    final private Session session;
    final private Folder inbox;

    public Initialize() throws Exception {

        this.props = new Properties();

        this.props.put("mail.debug", "false");

        this.props.put("mail.store.protocol", "imaps");
        this.session = Session.getInstance(props);
        this.store = session.getStore();


        this.store.connect(host, user, pass);


        this.inbox = store.getFolder("INBOX");

        this.inbox.open(Folder.READ_ONLY);
    }

    public Folder getInbox() {
        return inbox;
    }
}
