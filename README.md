# optaplanner-benchmark-runner
Small Maven wrapper, allowing to run OptaPlanner benchmarks easily from the command-line.

## How to build

This is a standard Maven project. First download and install Maven. When done, run `mvn clean install` in the root 
folder of this repository. Wait for it to finish successfully.

Your IDE will also be able to import this project and let you modify it easily.

## How to run

Maven will have built a file in the `target` directory called 
`optaplanner-benchmark-runner-1.0-SNAPSHOT-jar-with-dependencies.jar`. This is an executable Java JAR file. Run it 
like this: `java -jar optaplanner-benchmark-runner-1.0-SNAPSHOT-jar-with-dependencies.jar`. This will execute the 
benchmark.

## How to configure

See `MyBenchmarkApp` class in the source directory. It contains references to a benchmark template config, located in
resources directory. From here, it should be fairly obvious how to configure this application to run any other kind of
benchmark.
