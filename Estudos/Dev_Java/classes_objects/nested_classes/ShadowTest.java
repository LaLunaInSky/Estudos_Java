package nested_classes;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodFirstLevel(int x) {
            IO.println(
                "x = " +
                    x +
                    "\nthis.x = " +
                    this.x +
                    "\nShadowTest.this.x = " +
                    ShadowTest.this.x
            );
        }
    }
}
