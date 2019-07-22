# Bindings for com.google.cloud.errorreporting

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.errorreporting "1.0.0"]
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

- class **com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceClient**
- class **com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsFixedSizeCollection**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPage**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsFixedSizeCollection**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPage**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings**
- class **com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceClient**
- class **com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStubSettings**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStubSettings**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceCallableFactory**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorGroupServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceCallableFactory**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcErrorStatsServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceCallableFactory**
- class **com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStub**
- class **com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder**
- class **com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
