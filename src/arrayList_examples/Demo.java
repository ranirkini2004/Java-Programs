package arrayList_examples;

import java.util.ArrayList;

//collection does not support primitive values

public class Demo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add("false");
        l.add(false);

        System.out.println("-------------------------size----------------------");
        System.out.println(l.size());
        System.out.println("-----------------------isEmpty()-------------------------");
        System.out.println(l.isEmpty());
        System.out.println("-----------------------object-------------------------");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
