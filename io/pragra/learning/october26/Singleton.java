package io.pragra.learning.october26;

import lombok.Data;

@Data
public class Singleton {
    private static Singleton obj;
    int num = 5;

    private Singleton(){ }

    public static Singleton getInstance(){
        if(null == obj){
            synchronized (Singleton.class){
                if(obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }

    public static void main(String[] args){
        Singleton Object1 = Singleton.getInstance();
        System.out.println(Object1);
        Object1.setNum(10);
        Singleton Object2 = Singleton.getInstance();
        System.out.println(Object2);
    }
}
