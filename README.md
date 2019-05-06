```
Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid":
  9827.974 ±(99.9%) 217.080 ops/ms [Average]
  (min, avg, max) = (9739.210, 9827.974, 9874.977), stdev = 56.375
  CI (99.9%): [9610.894, 10045.054] (assumes normal distribution)



Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid":
  1153.407 ±(99.9%) 50.958 ops/ms [Average]
  (min, avg, max) = (1140.002, 1153.407, 1168.201), stdev = 13.234
  CI (99.9%): [1102.448, 1204.365] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49213:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid
# Parameters: (validatorType = BV)

# Run progress: 50.00% complete, ETA 00:01:42
# Fork: 1 of 1
# Warmup Iteration   1: 2019-05-06 14:02:09.647  INFO --- [id-jmh-worker-8] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.0.16.Final
852.654 ops/ms
# Warmup Iteration   2: 1153.444 ops/ms
# Warmup Iteration   3: 1141.731 ops/ms
# Warmup Iteration   4: 1133.103 ops/ms
# Warmup Iteration   5: 1145.567 ops/ms
Iteration   1: 1140.002 ops/ms
Iteration   2: 1168.201 ops/ms
Iteration   3: 1143.335 ops/ms
Iteration   4: 1166.771 ops/ms
Iteration   5: 1148.725 ops/ms

# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49213:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid
# Parameters: (validatorType = YAVI)

# Run progress: 75.00% complete, ETA 00:00:51
# Fork: 1 of 1
# Warmup Iteration   1: 2019-05-06 14:03:00.869  INFO --- [id-jmh-worker-8] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.0.16.Final
1007.262 ops/ms
# Warmup Iteration   2: 1146.233 ops/ms
# Warmup Iteration   3: 1135.066 ops/ms
# Warmup Iteration   4: 1155.200 ops/ms
# Warmup Iteration   5: 1170.623 ops/ms
Iteration   1: 1146.341 ops/ms
Iteration   2: 1149.244 ops/ms
Iteration   3: 1151.416 ops/ms
Iteration   4: 1150.041 ops/ms
Iteration   5: 1169.346 ops/ms

# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49213:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid
# Parameters: (validatorType = BV)

# Run progress: 0.00% complete, ETA 00:03:20
# Fork: 1 of 1
# Warmup Iteration   1: 2019-05-06 14:00:26.959  INFO --- [id-jmh-worker-4] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.0.16.Final
813.837 ops/ms
# Warmup Iteration   2: 1396.239 ops/ms
# Warmup Iteration   3: 1358.417 ops/ms
# Warmup Iteration   4: 1378.572 ops/ms
# Warmup Iteration   5: 1360.011 ops/ms
Iteration   1: 1350.180 ops/ms
Iteration   2: 1313.916 ops/ms
Iteration   3: 1330.536 ops/ms
Iteration   4: 1318.493 ops/ms
Iteration   5: 1309.818 ops/ms


Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid":
  1324.589 ±(99.9%) 62.670 ops/ms [Average]
  (min, avg, max) = (1309.818, 1324.589, 1350.180), stdev = 16.275
  CI (99.9%): [1261.919, 1387.259] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49213:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid
# Parameters: (validatorType = YAVI)

# Run progress: 25.00% complete, ETA 00:02:34
# Fork: 1 of 1
# Warmup Iteration   1: 2019-05-06 14:01:18.379  INFO --- [id-jmh-worker-6] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.0.16.Final
9160.174 ops/ms
# Warmup Iteration   2: 9945.233 ops/ms
# Warmup Iteration   3: 9847.591 ops/ms
# Warmup Iteration   4: 9744.712 ops/ms
# Warmup Iteration   5: 9690.528 ops/ms
Iteration   1: 9874.977 ops/ms
Iteration   2: 9739.210 ops/ms
Iteration   3: 9867.132 ops/ms
Iteration   4: 9852.594 ops/ms
Iteration   5: 9805.959 ops/ms


Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid":
  1153.278 ±(99.9%) 35.319 ops/ms [Average]
  (min, avg, max) = (1146.341, 1153.278, 1169.346), stdev = 9.172
  CI (99.9%): [1117.959, 1188.597] (assumes normal distribution)


# Run complete. Total time: 00:03:25

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                    (validatorType)   Mode  Cnt     Score     Error   Units
YaviBenchmark.simpleInvalid               BV  thrpt    5  1324.589 ±  62.670  ops/ms
YaviBenchmark.simpleInvalid             YAVI  thrpt    5  9827.974 ± 217.080  ops/ms
YaviBenchmark.simpleValid                 BV  thrpt    5  1153.407 ±  50.958  ops/ms
YaviBenchmark.simpleValid               YAVI  thrpt    5  1153.278 ±  35.319  ops/ms
```