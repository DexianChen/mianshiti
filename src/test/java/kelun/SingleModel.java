package kelun;

/**
 * @author cdx
 * date: 2019/08/15
 */
public class SingleModel {
//    private final static SingleModel single = new SingleModel();
//    private SingleModel () {
//
//    }
//
//    public static SingleModel getSingle() {
//        return single;
//    }


   private static volatile SingleModel singleModel = null;
   private SingleModel() {}

    public static SingleModel getSingleModel() {
        if (singleModel == null) {
            synchronized(SingleModel.class){
                singleModel = new SingleModel();
            }
        }
        return singleModel;
    }
}
