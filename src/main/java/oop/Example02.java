package oop;

public class Example02 {

    private static class Base{
        public Base(){
            System.out.println("Base");
        }
        public Base(String str){
            System.out.println(str + "in Base");
        }
    }

    private static class Sub extends Base{
        public Sub(String str){
            super(); // 无参构造函数 // 也可以调用有参构造函数
            System.out.println(str + "in Sub");
        }
    }

    public static void main(String[] args){
        new Sub("Bob");
    }


}
