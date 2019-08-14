package design_pattern.factory_pattern;

import design_pattern.factory_pattern.factory.SimpleFactory;
import design_pattern.factory_pattern.factory.StaticFactory;
import design_pattern.factory_pattern.factory.abstact.AbstactFactory;
import design_pattern.factory_pattern.factory.abstact.MailFactory;

public class FactoryTest {
    public static void main(String[] args) {
        /**
         * 简单工厂模式
         */
        SimpleFactory factory = new SimpleFactory();
        Sender mail = factory.createSender("mail");
        mail.send();

        /**
         * 静态工厂
         */
        Sender sms = StaticFactory.createSms();
        sms.send();

        /**
         * 抽象工厂
         */
        AbstactFactory mailFactory = new MailFactory();
        Sender sender = mailFactory.create();
        sender.send();
    }
}
