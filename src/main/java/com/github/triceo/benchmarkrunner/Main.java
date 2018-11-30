package com.github.triceo.benchmarkrunner;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.optaplanner.examples.common.app.CommonBenchmarkApp;

public class Main {

    private static final String[] EMPTY = new String[0];

    public static void main(final String... args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Need exactly one arg, file system path to benchmark configuration.");
        }
        final Path p = Paths.get(args[0]);
        final CommonBenchmarkApp app = new MyBenchmarkApp(p);
        app.buildAndBenchmark(EMPTY);
    }

}
