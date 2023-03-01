package code;

public class MySingle {

    private static MySingle instance;

    private MySingle(){

    }
    public static MySingle getInstance(){
        if (instance == null){
            synchronized (MySingle.class){
                if(instance == null){
                    instance = new MySingle();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        MySingle s1 = getInstance();
        System.out.println(s1);
        MySingle s2 = getInstance();
        System.out.println(s2);

    }
}
