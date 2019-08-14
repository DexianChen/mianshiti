package design_pattern.factory_pattern.factory.abstact;

import design_pattern.factory_pattern.Sender;
import design_pattern.factory_pattern.SmsSender;

public class SmsFactory implements AbstactFactory {
    public Sender create() {
        return new SmsSender();
    }
}
