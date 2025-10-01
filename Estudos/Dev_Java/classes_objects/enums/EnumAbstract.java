package enums;

public enum EnumAbstract {
    A {
        @Override
        void doSomething() {
            IO.println("a");
        }
    },
    B {
        @Override
        void doSomething() {
            IO.println("b");
        }
    };

    abstract void doSomething();
}
