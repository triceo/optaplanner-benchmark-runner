package com.github.triceo.benchmarkrunner;

import org.optaplanner.examples.cloudbalancing.optional.benchmark.CloudBalancingBenchmarkApp;
import org.optaplanner.examples.common.app.CommonBenchmarkApp;

public class Main {

    public static void main(final String... args) {
        final CommonBenchmarkApp app = new CloudBalancingBenchmarkApp();
        app.buildAndBenchmark(args);
    }

}
