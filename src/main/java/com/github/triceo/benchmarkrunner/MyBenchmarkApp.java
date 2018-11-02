package com.github.triceo.benchmarkrunner;

import org.optaplanner.examples.common.app.CommonBenchmarkApp;

public class MyBenchmarkApp extends CommonBenchmarkApp {

    public MyBenchmarkApp() {
        super(new ArgOption[]{ new ArgOption("template", "com/github/triceo/benchmarkrunner/cloudBalancingBenchmarkConfigTemplate.xml.ftl", true)});
    }

}
