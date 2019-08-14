package design_pattern.factory_pattern.factory;

import design_pattern.factory_pattern.MailSender;
import design_pattern.factory_pattern.Sender;
import design_pattern.factory_pattern.SmsSender;

public class SimpleFactory {
    public Sender createSender(String type){
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
