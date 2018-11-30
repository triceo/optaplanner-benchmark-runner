package com.github.triceo.benchmarkrunner;

import java.nio.file.Path;

import org.optaplanner.examples.common.app.CommonBenchmarkApp;

public class MyBenchmarkApp extends CommonBenchmarkApp {

    public MyBenchmarkApp(final Path path) {
        super(new ArgOption[]{ new FileBasedArgOption("template", path, true)});
    }

}
