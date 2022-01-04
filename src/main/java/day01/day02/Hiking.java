package day01.day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> elevations){
        double totalElevation = 0;

        for (int i = elevations.size()-1; i > 0; i--){

            if (elevations.get(i) > elevations.get(i-1)){
                totalElevation += elevations.get(i) - elevations.get(i-1);
            }
        }
        return totalElevation;
    }
}
