import java.util.Map;

public class Simulation {

    Integer simulationNumOfDice;
    Integer numberOfTosses;
    Dice simulationDice;
    Bins simulationBin;
    Simulation(Integer simulationNumOfDice, Integer numberOfTosses){
        this.simulationNumOfDice = simulationNumOfDice;
        this.numberOfTosses = numberOfTosses;
        this.simulationDice = new Dice(simulationNumOfDice);
        this.simulationBin = new Bins(simulationNumOfDice,simulationNumOfDice*6);
    }
    public void runSimulation(){
        simulationBin.InitializeBin();
        Integer sum=0;
        //Change the line below to 10000 after testing
        for(int i = 2 ; i <= numberOfTosses;i++){
            sum=simulationDice.tossAndSum();
            simulationBin.incrementBin(sum);
        }
    }
    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of 2 dice tossed for 1000000 times.");
        System.out.println("***");
        StringBuilder sbr = new StringBuilder();
        Integer key=0;
        Integer value =0;
        Double percentage = 0.0;

        for(Map.Entry<Integer,Integer>binmap: simulationBin.sumOfBins.entrySet()){
            key= binmap.getKey();
            value = binmap.getValue();

            percentage= (double)value/(double)numberOfTosses;
            double roundOff=Math.round(percentage*100)/100.0;


            System.out.println(key +"  :     "+ value+" :"+"  "+roundOff);
        }
    }


    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();

    }
}
