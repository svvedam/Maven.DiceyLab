import java.util.Random;

public class Dice {

    Integer numberOfDice;


    Dice(Integer numberOfDice){

        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        Integer toss = 0;
        for(int i=1;i<=numberOfDice;i++){
            toss = randomGenerator();
            sum+=toss;
        }
        return sum;
    }

    public Integer randomGenerator(){

        int random = (int)(Math.random() * 6 + 1);

        return random;
    }

}
