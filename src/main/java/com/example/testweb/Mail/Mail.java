package com.example.testweb.Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mail {
    private static String username = "hoangminh11282@gmail.com";
    private static String password = "jkybokmjbzqozqdn";

    public static boolean send(String email,String pass) {
        Properties prop = new Properties();

        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port","587");
        prop.put("mail.smtp.auth","true");
        prop.put("mail.smtp.starttls.enable","true");

        Session session = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username,password);
            }


        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username,"Mouse Store"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
            message.setSubject("Quên mật khẩu Mouse Store");
            message.setText(pass);
            Transport.send(message);

            return true;

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }


}
