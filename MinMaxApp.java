class MinMaxApp{

    public static void main(String args[]){
        MinMax<Integer> m = new MinMax<>();
        System.out.println(m.min(3,4)); // uitvoer: 3
        System.out.println(m.max(3,4)); // uitvoer: 4
    }
}