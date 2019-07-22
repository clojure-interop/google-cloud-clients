# Bindings for com.google.cloud.logging

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.logging "1.0.0"]
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

- class **com.google.cloud.logging.HttpRequest$Builder**
- class **com.google.cloud.logging.HttpRequest$RequestMethod**
- class **com.google.cloud.logging.HttpRequest**
- class **com.google.cloud.logging.LogEntry$Builder**
- class **com.google.cloud.logging.LogEntry**
- class **com.google.cloud.logging.Logging$EntryListOption**
- class **com.google.cloud.logging.Logging$ListOption**
- enum **com.google.cloud.logging.Logging$SortingField**
- enum **com.google.cloud.logging.Logging$SortingOrder**
- class **com.google.cloud.logging.Logging$WriteOption**
- interface **com.google.cloud.logging.Logging**
- interface **com.google.cloud.logging.LoggingEnhancer**
- class **com.google.cloud.logging.LoggingException**
- interface **com.google.cloud.logging.LoggingFactory**
- class **com.google.cloud.logging.LoggingHandler**
- class **com.google.cloud.logging.LoggingLevel**
- class **com.google.cloud.logging.LoggingOptions$Builder**
- class **com.google.cloud.logging.LoggingOptions$DefaultLoggingFactory**
- class **com.google.cloud.logging.LoggingOptions$DefaultLoggingRpcFactory**
- class **com.google.cloud.logging.LoggingOptions**
- class **com.google.cloud.logging.Metric$Builder**
- class **com.google.cloud.logging.Metric**
- class **com.google.cloud.logging.MetricInfo$Builder**
- class **com.google.cloud.logging.MetricInfo**
- class **com.google.cloud.logging.MonitoredResourceUtil**
- class **com.google.cloud.logging.Operation$Builder**
- class **com.google.cloud.logging.Operation**
- class **com.google.cloud.logging.Payload$JsonPayload**
- class **com.google.cloud.logging.Payload$ProtoPayload**
- class **com.google.cloud.logging.Payload$StringPayload**
- enum **com.google.cloud.logging.Payload$Type**
- class **com.google.cloud.logging.Payload**
- enum **com.google.cloud.logging.Severity**
- class **com.google.cloud.logging.Sink$Builder**
- class **com.google.cloud.logging.Sink**
- class **com.google.cloud.logging.SinkInfo$Builder**
- class **com.google.cloud.logging.SinkInfo$Destination$BucketDestination**
- class **com.google.cloud.logging.SinkInfo$Destination$DatasetDestination**
- class **com.google.cloud.logging.SinkInfo$Destination$TopicDestination**
- enum **com.google.cloud.logging.SinkInfo$Destination$Type**
- class **com.google.cloud.logging.SinkInfo$Destination**
- enum **com.google.cloud.logging.SinkInfo$VersionFormat**
- class **com.google.cloud.logging.SinkInfo**
- class **com.google.cloud.logging.SourceLocation$Builder**
- class **com.google.cloud.logging.SourceLocation**
- enum **com.google.cloud.logging.Synchronicity**
- class **com.google.cloud.logging.TraceLoggingEnhancer**
- class **com.google.cloud.logging.logback.LoggingAppender**
- interface **com.google.cloud.logging.logback.LoggingEventEnhancer**
- interface **com.google.cloud.logging.spi.LoggingRpcFactory**
- class **com.google.cloud.logging.spi.v2.GrpcLoggingRpc**
- interface **com.google.cloud.logging.spi.v2.LoggingRpc**
- class **com.google.cloud.logging.testing.RemoteLoggingHelper$LoggingHelperException**
- class **com.google.cloud.logging.testing.RemoteLoggingHelper**
- class **com.google.cloud.logging.v2.ConfigClient$ListExclusionsFixedSizeCollection**
- class **com.google.cloud.logging.v2.ConfigClient$ListExclusionsPage**
- class **com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse**
- class **com.google.cloud.logging.v2.ConfigClient$ListSinksFixedSizeCollection**
- class **com.google.cloud.logging.v2.ConfigClient$ListSinksPage**
- class **com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse**
- class **com.google.cloud.logging.v2.ConfigClient**
- class **com.google.cloud.logging.v2.ConfigSettings$Builder**
- class **com.google.cloud.logging.v2.ConfigSettings**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogEntriesFixedSizeCollection**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPage**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogsFixedSizeCollection**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogsPage**
- class **com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse**
- class **com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsFixedSizeCollection**
- class **com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPage**
- class **com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse**
- class **com.google.cloud.logging.v2.LoggingClient**
- class **com.google.cloud.logging.v2.LoggingSettings$Builder**
- class **com.google.cloud.logging.v2.LoggingSettings**
- class **com.google.cloud.logging.v2.MetricsClient$ListLogMetricsFixedSizeCollection**
- class **com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPage**
- class **com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse**
- class **com.google.cloud.logging.v2.MetricsClient**
- class **com.google.cloud.logging.v2.MetricsSettings$Builder**
- class **com.google.cloud.logging.v2.MetricsSettings**
- class **com.google.cloud.logging.v2.stub.ConfigServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder**
- class **com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings**
- class **com.google.cloud.logging.v2.stub.GrpcConfigServiceV2CallableFactory**
- class **com.google.cloud.logging.v2.stub.GrpcConfigServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2CallableFactory**
- class **com.google.cloud.logging.v2.stub.GrpcLoggingServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2CallableFactory**
- class **com.google.cloud.logging.v2.stub.GrpcMetricsServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.LoggingServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings$Builder**
- class **com.google.cloud.logging.v2.stub.LoggingServiceV2StubSettings**
- class **com.google.cloud.logging.v2.stub.MetricsServiceV2Stub**
- class **com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings$Builder**
- class **com.google.cloud.logging.v2.stub.MetricsServiceV2StubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
