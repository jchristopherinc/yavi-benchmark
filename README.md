* Hibernate Validator 6.2.0.Final
* YAVI 0.7.0

```
Benchmark                    (validatorType)   Mode  Cnt      Score      Error   Units
YaviBenchmark.simpleEmpty                 BV  thrpt    5   2061.831 ±  199.046  ops/ms
YaviBenchmark.simpleEmpty               YAVI  thrpt    5  14620.155 ±  955.283  ops/ms
YaviBenchmark.simpleInvalid               BV  thrpt    5   1267.494 ±  626.617  ops/ms
YaviBenchmark.simpleInvalid             YAVI  thrpt    5   9997.469 ± 1073.762  ops/ms
YaviBenchmark.simpleValid                 BV  thrpt    5   3428.626 ±  506.949  ops/ms
YaviBenchmark.simpleValid               YAVI  thrpt    5  27125.236 ± 1521.967  ops/ms
```

on MacBook Pro (16-inch, 2019)<br>
Processor: 2.3 GHz 8 cores Intel Core i9<br>
Memory: 64 GB 2667 MHz DDR4<br>