package oop;

public class Example04 {
    public static class Base {
        String name = "asd";
        public Base() {
            setName();
        }
        private void setName() {
            name = "Base";
        }
    }

    private static class Sub extends Base {
        String name;
        public void setName() {
            name = "Sub";
        }
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.setName();
        System.out.println(sub.name);
    }

}