package design_pattern.factory_pattern;

public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mail sender!");
    }
}
