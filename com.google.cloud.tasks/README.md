# Bindings for com.google.cloud.tasks

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.tasks "1.0.0"]
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

- class **com.google.cloud.tasks.v2.CloudTasksClient$ListQueuesFixedSizeCollection**
- class **com.google.cloud.tasks.v2.CloudTasksClient$ListQueuesPage**
- class **com.google.cloud.tasks.v2.CloudTasksClient$ListQueuesPagedResponse**
- class **com.google.cloud.tasks.v2.CloudTasksClient$ListTasksFixedSizeCollection**
- class **com.google.cloud.tasks.v2.CloudTasksClient$ListTasksPage**
- class **com.google.cloud.tasks.v2.CloudTasksClient$ListTasksPagedResponse**
- class **com.google.cloud.tasks.v2.CloudTasksClient**
- class **com.google.cloud.tasks.v2.CloudTasksSettings$Builder**
- class **com.google.cloud.tasks.v2.CloudTasksSettings**
- class **com.google.cloud.tasks.v2.stub.CloudTasksStub**
- class **com.google.cloud.tasks.v2.stub.CloudTasksStubSettings$Builder**
- class **com.google.cloud.tasks.v2.stub.CloudTasksStubSettings**
- class **com.google.cloud.tasks.v2.stub.GrpcCloudTasksCallableFactory**
- class **com.google.cloud.tasks.v2.stub.GrpcCloudTasksStub**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesFixedSizeCollection**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPage**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksFixedSizeCollection**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPage**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse**
- class **com.google.cloud.tasks.v2beta2.CloudTasksClient**
- class **com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder**
- class **com.google.cloud.tasks.v2beta2.CloudTasksSettings**
- class **com.google.cloud.tasks.v2beta2.stub.CloudTasksStub**
- class **com.google.cloud.tasks.v2beta2.stub.CloudTasksStubSettings$Builder**
- class **com.google.cloud.tasks.v2beta2.stub.CloudTasksStubSettings**
- class **com.google.cloud.tasks.v2beta2.stub.GrpcCloudTasksCallableFactory**
- class **com.google.cloud.tasks.v2beta2.stub.GrpcCloudTasksStub**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesFixedSizeCollection**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPage**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPagedResponse**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksFixedSizeCollection**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksPage**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksPagedResponse**
- class **com.google.cloud.tasks.v2beta3.CloudTasksClient**
- class **com.google.cloud.tasks.v2beta3.CloudTasksSettings$Builder**
- class **com.google.cloud.tasks.v2beta3.CloudTasksSettings**
- class **com.google.cloud.tasks.v2beta3.stub.CloudTasksStub**
- class **com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings$Builder**
- class **com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings**
- class **com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksCallableFactory**
- class **com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
