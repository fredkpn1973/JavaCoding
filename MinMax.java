class MinMax<T extends Number>{

    T min(T a, T b){
        return a.doubleValue()<b.doubleValue()?a:b;
    }

    T max(T a, T b){
        return a.doubleValue()>b.doubleValue()?a:b;
    }
}