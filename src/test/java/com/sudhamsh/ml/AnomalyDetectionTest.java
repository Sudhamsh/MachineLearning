package com.sudhamsh.ml;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.Assert;
import org.junit.Test;
public class AnomalyDetectionTest {

    @Test
    public void getProbailityDensityTest() {
        final double THRESHOLD = .0001;
        DescriptiveStatistics stats = new DescriptiveStatistics();

        // Add the data from the array
        for (int i = 0; i < 10; i++) {
            stats.addValue(i);
        }

        // True test
        double probabilityDensity = AnomalyDetection.getProbabilityDensity(5, stats.getMean(),
                stats.getStandardDeviation());
        double expectedProbabilityDensity = 0.12998168086968445d;
        Assert.assertTrue("Probability Density is not same as expected",
                Math.abs(probabilityDensity - expectedProbabilityDensity) < THRESHOLD);

        // False test
        probabilityDensity = AnomalyDetection.getProbabilityDensity(100, stats.getMean(), stats.getStandardDeviation());

        Assert.assertFalse("Probability Density is not same as expected",
                Math.abs(probabilityDensity - expectedProbabilityDensity) < THRESHOLD);

    }
}
