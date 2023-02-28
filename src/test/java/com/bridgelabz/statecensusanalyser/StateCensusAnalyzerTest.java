package com.bridgelabz.statecensusanalyser;
import com.opencsv.exceptions.CsvException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.util.List;
public class StateCensusAnalyzerTest {
	List<StateCensus> expectedList;
    List<StateCensus> actualList;
    @Test
    void readCSV() throws IOException, CsvException {
        File actualFile = new File("C:\\Users\\User\\Desktop\\243-rfp\\IndianStatesCensusAnalyser\\src\\main\\resources\\StateCensusData.csv");
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        actualList = stateCensusAnalyser.readCSV(actualFile);
        int actual = actualList.size();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
