import java.util.*;

class Bounds<T>{

    private List<T> list;

    Bounds(List<T> list){
        this.list=list;
    }

    public void addToList(List<? extends T> list){
        for(T t:list){
            this.list.add(t);
        }
    }

    public void addFromList(List<? super T> list){
        for(T t: this.list){
            list.add(t);
        }
    }
}
