package code;

import java.beans.beancontext.BeanContextServiceAvailableEvent;

public class BeanA implements Comparable<BeanA>{

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BeanA(int x) {
        super();
        this.x = x;
    }

    public BeanA() {
        super();
    }

    @Override
    public String toString(){
        return "BeanA [x="+ x +"]";
    }
    @Override
    public int compareTo(BeanA ba){
        return x - ba.x;
    }
}
