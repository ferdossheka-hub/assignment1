public class CarTest {

    private static void testTurbo() {
        Saab95 car1 = new Saab95();
        Saab95 car2 = new Saab95();

        car1.setTurboOff();
        car2.setTurboOn();

        car1.gas(0.5);
        car2.gas(0.5);

        boolean result =
                car1.getCurrentSpeed() < car2.getCurrentSpeed();

        reportResult("Turbo test", result);
    }

    private static void reportResult(String testName, boolean success) {
        System.out.println(
                (success ? "SUCCESS: " : "FAILURE: ") + testName
        );
    }

    public static void main(String[] args) {
        testTurbo();
    }
}