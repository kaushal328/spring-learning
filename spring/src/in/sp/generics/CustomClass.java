package in.sp.generics;

import java.util.ArrayList;

public class CustomClass <T> {
    // t stand for type //
        ArrayList<T> list = new ArrayList<>();

        public void addElement(T element){
            list.add(element);
        }

        public void removeElement(T element){
            list.remove(element);
        }



}
