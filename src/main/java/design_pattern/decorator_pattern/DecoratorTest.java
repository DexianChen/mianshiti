package design_pattern.decorator_pattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Work son = new Son();
        Mother mother = new Mother(son);
        mother.paint();
    }
}
