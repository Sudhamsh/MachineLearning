package com.sudhamsh.ml;

import org.apache.commons.math3.distribution.NormalDistribution;

public class AnomalyDetection {

    /**
     * Return probability of a given number based on the mean and standard deviation of the data set
     * 
     * @param x
     *            probability density will be calculated for this value
     * @param mean
     *            data set mean
     * @param standardDeviation
     *            data set standard deviation
     * @return
     */
    public static double getProbabilityDensity(final int x, final double mean, final double standardDeviation) {
        NormalDistribution normalDistribution = new NormalDistribution(mean, standardDeviation);
        return normalDistribution.density(x);

    }

}
