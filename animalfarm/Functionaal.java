import java.util.Optional;

class Functionaal {


    public static void main(String[] args) {

        Optional<Double> o1 = average(100,90);
        Optional<Double> o2 = average(1,2);

        printOpt(o1);
        printOpt(o2);

        





    }

    public static Optional<Double> average(int... scores){
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum =0;
        for(int score: scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);

    }

    public static void printOpt(Optional<Double> opt) {
        if(opt.isPresent()){
            System.out.println(opt.get());

        }
    }
}

