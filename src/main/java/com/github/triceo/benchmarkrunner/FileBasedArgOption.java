package com.github.triceo.benchmarkrunner;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.optaplanner.benchmark.api.PlannerBenchmarkFactory;
import org.optaplanner.examples.common.app.CommonBenchmarkApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.optaplanner.benchmark.api.PlannerBenchmarkFactory.*;

public class FileBasedArgOption extends CommonBenchmarkApp.ArgOption {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileBasedArgOption.class);

    public FileBasedArgOption(final String name, final Path benchmarkConfig, final boolean template) {
        super(name, toString(benchmarkConfig), template);
    }

    private static String toString(final Path path) {
        return path.toAbsolutePath().toString();
    }

    @Override
    public PlannerBenchmarkFactory buildPlannerBenchmarkFactory() {
        final Path p = Paths.get(getBenchmarkConfig());
        final File f = p.toFile();
        if (!f.exists()) {
            throw new IllegalArgumentException("Benchmark config file does not exist: " + f);
        }
        LOGGER.info("Loading benchmark config from {}.", p);
        return this.isTemplate() ? createFromFreemarkerXmlFile(f) : createFromXmlFile(f);
    }
}
