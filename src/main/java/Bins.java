import java.util.HashMap;
import java.util.Map;

public class Bins {
    Integer minTotal;
    Integer maxTotal;
    HashMap<Integer, Integer> sumOfBins = new HashMap<Integer, Integer>();
    Bins(Integer minTotal, Integer maxTotal){
        this.minTotal = minTotal;
        this.maxTotal = maxTotal;
    }
    public void InitializeBin(){
        for(int i =minTotal ; i<=maxTotal; i++){
            sumOfBins.put(i,0);
        }

    }

    public Integer getBin(Integer binNumber){
        Integer returnValue = 0;
        for(Map.Entry<Integer,Integer>binmap: sumOfBins.entrySet()){
            if(binmap.getKey()==binNumber){
                returnValue = binmap.getValue();
            }
        }
        return returnValue;
    }

    public void incrementBin(Integer incrementBinValue){
        Integer key = 0;
        Integer value = 0;
        for(Map.Entry<Integer,Integer>binmap: sumOfBins.entrySet()){
            key = binmap.getKey();
            value = binmap.getValue();

            if(key==incrementBinValue){
                sumOfBins.put(key, sumOfBins.get(key)+1);

            }

        }

    }

}
