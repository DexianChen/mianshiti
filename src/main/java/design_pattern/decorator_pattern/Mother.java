package design_pattern.decorator_pattern;

public class Mother implements Work {
    private Work work;

    public Mother(Work work) {
        this.work = work;
    }

    public void paint() {
        //妈妈装饰者做的职责
        System.out.println("妈妈正在做给画上颜色前的准备工作。");

        //被装饰者做的职责
        work.paint();

        //妈妈装饰者做的职责
        System.out.println("妈妈给画上好了颜色。");
    }
}
