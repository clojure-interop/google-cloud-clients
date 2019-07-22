# Bindings for com.google.cloud.scheduler

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.scheduler "1.0.0"]
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

- class **com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsFixedSizeCollection**
- class **com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPage**
- class **com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse**
- class **com.google.cloud.scheduler.v1.CloudSchedulerClient**
- class **com.google.cloud.scheduler.v1.CloudSchedulerSettings$Builder**
- class **com.google.cloud.scheduler.v1.CloudSchedulerSettings**
- class **com.google.cloud.scheduler.v1.stub.CloudSchedulerStub**
- class **com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings$Builder**
- class **com.google.cloud.scheduler.v1.stub.CloudSchedulerStubSettings**
- class **com.google.cloud.scheduler.v1.stub.GrpcCloudSchedulerCallableFactory**
- class **com.google.cloud.scheduler.v1.stub.GrpcCloudSchedulerStub**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsFixedSizeCollection**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPage**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerClient**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings$Builder**
- class **com.google.cloud.scheduler.v1beta1.CloudSchedulerSettings**
- class **com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStub**
- class **com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings$Builder**
- class **com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings**
- class **com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerCallableFactory**
- class **com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
