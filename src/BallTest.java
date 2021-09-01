public class BallTest {
    public static void testMyBalls() {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(109, 420);
        Ball ball3= new Ball(119, 500);

        ball1.whatType();
        ball2.whatType();
        ball3.whatType();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
