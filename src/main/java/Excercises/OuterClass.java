package Excercises;

public class OuterClass {

    class Inner {
        private int aField;

        public Inner(int aField) {
            this.aField = aField;
        }

        public int getaField() {
            return aField;
        }
    }

    static class StaticInnerClass {
        private int bField;

        public StaticInnerClass(int bField) {
            this.bField = bField;
        }

        public int getbField() {
            return bField;
        }
    }
}
