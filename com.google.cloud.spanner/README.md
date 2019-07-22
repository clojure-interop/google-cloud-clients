# Bindings for com.google.cloud.spanner

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.spanner "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.spanner.AbortedException**
- class **com.google.cloud.spanner.AbstractStructReader**
- interface **com.google.cloud.spanner.BatchClient**
- class **com.google.cloud.spanner.BatchClientImpl**
- interface **com.google.cloud.spanner.BatchReadOnlyTransaction**
- class **com.google.cloud.spanner.BatchTransactionId**
- class **com.google.cloud.spanner.Database**
- interface **com.google.cloud.spanner.DatabaseAdminClient**
- interface **com.google.cloud.spanner.DatabaseClient**
- class **com.google.cloud.spanner.DatabaseId**
- enum **com.google.cloud.spanner.DatabaseInfo$State**
- class **com.google.cloud.spanner.DatabaseInfo**
- enum **com.google.cloud.spanner.ErrorCode**
- class **com.google.cloud.spanner.ForwardingResultSet**
- class **com.google.cloud.spanner.ForwardingStructReader**
- class **com.google.cloud.spanner.Instance$Builder**
- class **com.google.cloud.spanner.Instance**
- interface **com.google.cloud.spanner.InstanceAdminClient**
- class **com.google.cloud.spanner.InstanceConfig**
- class **com.google.cloud.spanner.InstanceConfigId**
- class **com.google.cloud.spanner.InstanceConfigInfo**
- class **com.google.cloud.spanner.InstanceId**
- class **com.google.cloud.spanner.InstanceInfo$Builder**
- enum **com.google.cloud.spanner.InstanceInfo$InstanceField**
- enum **com.google.cloud.spanner.InstanceInfo$State**
- class **com.google.cloud.spanner.InstanceInfo**
- class **com.google.cloud.spanner.Key$Builder**
- class **com.google.cloud.spanner.Key**
- class **com.google.cloud.spanner.KeyRange$Builder**
- enum **com.google.cloud.spanner.KeyRange$Endpoint**
- class **com.google.cloud.spanner.KeyRange**
- class **com.google.cloud.spanner.KeySet$Builder**
- class **com.google.cloud.spanner.KeySet**
- enum **com.google.cloud.spanner.Mutation$Op**
- class **com.google.cloud.spanner.Mutation$WriteBuilder**
- class **com.google.cloud.spanner.Mutation**
- class **com.google.cloud.spanner.Operation**
- interface **com.google.cloud.spanner.Options$ListOption**
- interface **com.google.cloud.spanner.Options$QueryOption**
- interface **com.google.cloud.spanner.Options$ReadAndQueryOption**
- interface **com.google.cloud.spanner.Options$ReadOption**
- class **com.google.cloud.spanner.Options**
- class **com.google.cloud.spanner.Partition**
- class **com.google.cloud.spanner.PartitionOptions$Builder**
- class **com.google.cloud.spanner.PartitionOptions**
- enum **com.google.cloud.spanner.ReadContext$QueryAnalyzeMode**
- interface **com.google.cloud.spanner.ReadContext**
- interface **com.google.cloud.spanner.ReadOnlyTransaction**
- interface **com.google.cloud.spanner.ResultSet**
- class **com.google.cloud.spanner.ResultSets**
- interface **com.google.cloud.spanner.Session**
- class **com.google.cloud.spanner.SessionNotFoundException**
- class **com.google.cloud.spanner.SessionPoolOptions$Builder**
- class **com.google.cloud.spanner.SessionPoolOptions**
- interface **com.google.cloud.spanner.Spanner**
- class **com.google.cloud.spanner.SpannerBatchUpdateException**
- class **com.google.cloud.spanner.SpannerException**
- class **com.google.cloud.spanner.SpannerExceptionFactory**
- interface **com.google.cloud.spanner.SpannerFactory**
- class **com.google.cloud.spanner.SpannerOptions$Builder**
- class **com.google.cloud.spanner.SpannerOptions**
- class **com.google.cloud.spanner.Statement$Builder**
- class **com.google.cloud.spanner.Statement**
- class **com.google.cloud.spanner.Struct$Builder**
- class **com.google.cloud.spanner.Struct**
- interface **com.google.cloud.spanner.StructReader**
- enum **com.google.cloud.spanner.TimestampBound$Mode**
- class **com.google.cloud.spanner.TimestampBound**
- interface **com.google.cloud.spanner.TransactionContext**
- enum **com.google.cloud.spanner.TransactionManager$TransactionState**
- interface **com.google.cloud.spanner.TransactionManager**
- interface **com.google.cloud.spanner.TransactionRunner$TransactionCallable**
- interface **com.google.cloud.spanner.TransactionRunner**
- enum **com.google.cloud.spanner.Type$Code**
- class **com.google.cloud.spanner.Type$StructField**
- class **com.google.cloud.spanner.Type**
- class **com.google.cloud.spanner.Value**
- class **com.google.cloud.spanner.ValueBinder**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesFixedSizeCollection**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPage**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings$Builder**
- class **com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings**
- class **com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStub**
- class **com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings$Builder**
- class **com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStubSettings**
- class **com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminCallableFactory**
- class **com.google.cloud.spanner.admin.database.v1.stub.GrpcDatabaseAdminStub**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsFixedSizeCollection**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPage**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesFixedSizeCollection**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPage**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings$Builder**
- class **com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings**
- class **com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminCallableFactory**
- class **com.google.cloud.spanner.admin.instance.v1.stub.GrpcInstanceAdminStub**
- class **com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStub**
- class **com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings$Builder**
- class **com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStubSettings**
- interface **com.google.cloud.spanner.spi.SpannerRpcFactory**
- class **com.google.cloud.spanner.spi.v1.GapicSpannerRpc**
- class **com.google.cloud.spanner.spi.v1.SpannerErrorInterceptor**
- class **com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider**
- enum **com.google.cloud.spanner.spi.v1.SpannerRpc$Option**
- class **com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated**
- interface **com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer**
- interface **com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall**
- interface **com.google.cloud.spanner.spi.v1.SpannerRpc**
- class **com.google.cloud.spanner.testing.RemoteSpannerHelper**
- class **com.google.cloud.spanner.v1.SpannerClient$ListSessionsFixedSizeCollection**
- class **com.google.cloud.spanner.v1.SpannerClient$ListSessionsPage**
- class **com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse**
- class **com.google.cloud.spanner.v1.SpannerClient**
- class **com.google.cloud.spanner.v1.SpannerSettings$Builder**
- class **com.google.cloud.spanner.v1.SpannerSettings**
- class **com.google.cloud.spanner.v1.stub.GrpcSpannerCallableFactory**
- class **com.google.cloud.spanner.v1.stub.GrpcSpannerStub**
- class **com.google.cloud.spanner.v1.stub.SpannerStub**
- class **com.google.cloud.spanner.v1.stub.SpannerStubSettings$Builder**
- class **com.google.cloud.spanner.v1.stub.SpannerStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
