```
Result "am.ik.yavi.yavibenchmark.YaviBenchmark.bench":
  3867.676 ±(99.9%) 130.883 ops/ms [Average]
  (min, avg, max) = (3499.663, 3867.676, 3989.458), stdev = 150.725
  CI (99.9%): [3736.793, 3998.558] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63005:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 10 iterations, 10 s each
# Measurement: 20 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 50 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.bench
# Parameters: (validatorType = BV)

# Run progress: 0.00% complete, ETA 00:10:00
# Fork: 1 of 1
# Warmup Iteration   1: 2071.731 ops/ms
# Warmup Iteration   2: 3784.231 ops/ms
# Warmup Iteration   3: 3788.609 ops/ms
# Warmup Iteration   4: 3849.492 ops/ms
# Warmup Iteration   5: 3878.689 ops/ms
# Warmup Iteration   6: 3832.554 ops/ms
# Warmup Iteration   7: 3920.488 ops/ms
# Warmup Iteration   8: 3963.646 ops/ms
# Warmup Iteration   9: 3939.322 ops/ms
# Warmup Iteration  10: 3854.816 ops/ms
Iteration   1: 3917.025 ops/ms
Iteration   2: 3922.439 ops/ms
Iteration   3: 3855.086 ops/ms
Iteration   4: 3532.795 ops/ms
Iteration   5: 3701.989 ops/ms
Iteration   6: 3499.663 ops/ms
Iteration   7: 3643.293 ops/ms
Iteration   8: 3884.637 ops/ms
Iteration   9: 3945.698 ops/ms
Iteration  10: 3970.701 ops/ms
Iteration  11: 3952.949 ops/ms
Iteration  12: 3837.384 ops/ms
Iteration  13: 3976.662 ops/ms
Iteration  14: 3945.726 ops/ms
Iteration  15: 3979.594 ops/ms
Iteration  16: 3899.954 ops/ms
Iteration  17: 3966.997 ops/ms
Iteration  18: 3969.491 ops/ms
Iteration  19: 3961.973 ops/ms
Iteration  20: 3989.458 ops/ms

# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63005:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 10 iterations, 10 s each
# Measurement: 20 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 50 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.bench
# Parameters: (validatorType = YAVI)

# Run progress: 50.00% complete, ETA 00:05:08
# Fork: 1 of 1
# Warmup Iteration   1: 30980.584 ops/ms
# Warmup Iteration   2: 44231.559 ops/ms
# Warmup Iteration   3: 43572.940 ops/ms
# Warmup Iteration   4: 44335.787 ops/ms
# Warmup Iteration   5: 43941.495 ops/ms
# Warmup Iteration   6: 44374.245 ops/ms
# Warmup Iteration   7: 44645.679 ops/ms
# Warmup Iteration   8: 44437.350 ops/ms
# Warmup Iteration   9: 44665.146 ops/ms
# Warmup Iteration  10: 44542.247 ops/ms
Iteration   1: 44595.399 ops/ms
Iteration   2: 44633.269 ops/ms
Iteration   3: 44839.713 ops/ms
Iteration   4: 44826.982 ops/ms
Iteration   5: 44702.597 ops/ms
Iteration   6: 44606.187 ops/ms
Iteration   7: 44686.729 ops/ms
Iteration   8: 43812.979 ops/ms
Iteration   9: 43608.027 ops/ms
Iteration  10: 44706.472 ops/ms
Iteration  11: 44573.029 ops/ms
Iteration  12: 44691.904 ops/ms
Iteration  13: 44727.785 ops/ms
Iteration  14: 44587.012 ops/ms
Iteration  15: 44441.135 ops/ms
Iteration  16: 42737.586 ops/ms
Iteration  17: 43585.906 ops/ms
Iteration  18: 44947.687 ops/ms
Iteration  19: 44878.178 ops/ms
Iteration  20: 44743.364 ops/ms


Result "am.ik.yavi.yavibenchmark.YaviBenchmark.bench":
  44446.597 ±(99.9%) 489.557 ops/ms [Average]
  (min, avg, max) = (42737.586, 44446.597, 44947.687), stdev = 563.775
  CI (99.9%): [43957.040, 44936.154] (assumes normal distribution)


# Run complete. Total time: 00:10:18

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark            (validatorType)   Mode  Cnt      Score     Error   Units
YaviBenchmark.bench               BV  thrpt   20   3867.676 ± 130.883  ops/ms
YaviBenchmark.bench             YAVI  thrpt   20  44446.597 ± 489.557  ops/ms
```