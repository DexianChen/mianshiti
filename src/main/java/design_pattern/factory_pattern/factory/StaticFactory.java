package design_pattern.factory_pattern.factory;

import design_pattern.factory_pattern.MailSender;
import design_pattern.factory_pattern.Sender;
import design_pattern.factory_pattern.SmsSender;

public class StaticFactory {
    public static Sender createMail(){
        return new MailSender();
    }

    public static Sender createSms(){
        return new SmsSender();
    }
}
