package day01.day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking = new Hiking();

    @Test
    void testWithNoElevationGain(){
        List<Double> elevationList = Arrays.asList(50.0,40.0,30.0);
        assertEquals(0,hiking.getPlusElevation(elevationList));
    }

    @Test
    void testWithElevationGain(){
        List<Double> elevationList = Arrays.asList(50.0,70.0,30.0,100.0);
        assertEquals(90,hiking.getPlusElevation(elevationList));
    }

}