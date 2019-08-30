package design_pattern.factory_pattern.factory.abstact;

import design_pattern.factory_pattern.MailSender;
import design_pattern.factory_pattern.Sender;

public class MailFactory implements AbstractFactory {
    public Sender create() {
        return new MailSender();
    }
}
