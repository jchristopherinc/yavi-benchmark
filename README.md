```
Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid":
  9372.550 ±(99.9%) 866.412 ops/ms [Average]
  (min, avg, max) = (9034.937, 9372.550, 9552.686), stdev = 225.004
  CI (99.9%): [8506.138, 10238.962] (assumes normal distribution)



Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid":
  1285.474 ±(99.9%) 93.541 ops/ms [Average]
  (min, avg, max) = (1245.289, 1285.474, 1306.467), stdev = 24.292
  CI (99.9%): [1191.934, 1379.015] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63422:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid
# Parameters: (validatorType = BV)

# Run progress: 50.00% complete, ETA 00:01:42
# Fork: 1 of 1
# Warmup Iteration   1: 1074.648 ops/ms
# Warmup Iteration   2: 1291.523 ops/ms
# Warmup Iteration   3: 1267.935 ops/ms
# Warmup Iteration   4: 1294.757 ops/ms
# Warmup Iteration   5: 1251.371 ops/ms
Iteration   1: 1306.467 ops/ms
Iteration   2: 1294.759 ops/ms
Iteration   3: 1281.219 ops/ms
Iteration   4: 1299.638 ops/ms
Iteration   5: 1245.289 ops/ms

# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63422:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid
# Parameters: (validatorType = YAVI)

# Run progress: 75.00% complete, ETA 00:00:51
# Fork: 1 of 1
# Warmup Iteration   1: 1110.079 ops/ms
# Warmup Iteration   2: 1250.249 ops/ms
# Warmup Iteration   3: 1223.054 ops/ms
# Warmup Iteration   4: 1233.853 ops/ms
# Warmup Iteration   5: 1243.206 ops/ms
Iteration   1: 1223.001 ops/ms
Iteration   2: 1217.829 ops/ms
Iteration   3: 1197.054 ops/ms
Iteration   4: 1196.359 ops/ms
Iteration   5: 1241.520 ops/ms

# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63422:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid
# Parameters: (validatorType = BV)

# Run progress: 0.00% complete, ETA 00:03:20
# Fork: 1 of 1
# Warmup Iteration   1: 708.490 ops/ms
# Warmup Iteration   2: 1182.919 ops/ms
# Warmup Iteration   3: 1204.333 ops/ms
# Warmup Iteration   4: 1172.978 ops/ms
# Warmup Iteration   5: 1144.653 ops/ms
Iteration   1: 1191.387 ops/ms
Iteration   2: 1176.501 ops/ms
Iteration   3: 1194.663 ops/ms
Iteration   4: 1197.689 ops/ms
Iteration   5: 1195.957 ops/ms


Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid":
  1191.239 ±(99.9%) 32.946 ops/ms [Average]
  (min, avg, max) = (1176.501, 1191.239, 1197.689), stdev = 8.556
  CI (99.9%): [1158.293, 1224.186] (assumes normal distribution)


# JMH version: 1.21
# VM version: JDK 1.8.0_152, Java HotSpot(TM) 64-Bit Server VM, 25.152-b16
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre/bin/java
# VM options: -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63422:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
# Warmup: 5 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 8 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: am.ik.yavi.yavibenchmark.YaviBenchmark.simpleInvalid
# Parameters: (validatorType = YAVI)

# Run progress: 25.00% complete, ETA 00:02:34
# Fork: 1 of 1
# Warmup Iteration   1: 9877.239 ops/ms
# Warmup Iteration   2: 9388.269 ops/ms
# Warmup Iteration   3: 9380.177 ops/ms
# Warmup Iteration   4: 9445.757 ops/ms
# Warmup Iteration   5: 9413.667 ops/ms
Iteration   1: 9514.268 ops/ms
Iteration   2: 9514.349 ops/ms
Iteration   3: 9552.686 ops/ms
Iteration   4: 9034.937 ops/ms
Iteration   5: 9246.511 ops/ms


Result "am.ik.yavi.yavibenchmark.YaviBenchmark.simpleValid":
  1215.153 ±(99.9%) 73.181 ops/ms [Average]
  (min, avg, max) = (1196.359, 1215.153, 1241.520), stdev = 19.005
  CI (99.9%): [1141.971, 1288.334] (assumes normal distribution)


# Run complete. Total time: 00:03:25

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                    (validatorType)   Mode  Cnt     Score     Error   Units
YaviBenchmark.simpleInvalid               BV  thrpt    5  1191.239 ±  32.946  ops/ms
YaviBenchmark.simpleInvalid             YAVI  thrpt    5  9372.550 ± 866.412  ops/ms
YaviBenchmark.simpleValid                 BV  thrpt    5  1285.474 ±  93.541  ops/ms
YaviBenchmark.simpleValid               YAVI  thrpt    5  1215.153 ±  73.181  ops/ms
```