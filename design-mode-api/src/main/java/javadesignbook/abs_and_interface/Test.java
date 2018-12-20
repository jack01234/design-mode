package javadesignbook.abs_and_interface;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:25 2018/12/14
 */
public class Test {
    public static void main(String[] args) {
        try {
            IShape shape = (IShape) Class.forName("Circle").getConstructor().newInstance();
            ShapePro shapePro = new ShapePro(shape);
            System.out.println(shapePro.process());
        } catch (Exception e) {
            e.printStackTrace();
        }
          Circle2 circle2 = new Circle2(10);
        Object dispatch = circle2.dispatch(0, null);
        System.out.println(dispatch);
//        IShape circle = new Circle();
//        ShapePro shapePro = new ShapePro(circle);
//        System.out.println(shapePro.process());
//
//        IShape sequare = new Sequare();
//        ShapePro shapePro1 = new ShapePro(sequare);
//        System.out.println(shapePro1.process());
    }
}
