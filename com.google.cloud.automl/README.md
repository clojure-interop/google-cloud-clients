# Bindings for com.google.cloud.automl

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.automl "1.0.0"]
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

- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsFixedSizeCollection**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPage**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsFixedSizeCollection**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPage**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsFixedSizeCollection**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPage**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsFixedSizeCollection**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPage**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsFixedSizeCollection**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPage**
- class **com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse**
- class **com.google.cloud.automl.v1beta1.AutoMlClient**
- class **com.google.cloud.automl.v1beta1.AutoMlSettings$Builder**
- class **com.google.cloud.automl.v1beta1.AutoMlSettings**
- class **com.google.cloud.automl.v1beta1.PredictionServiceClient**
- class **com.google.cloud.automl.v1beta1.PredictionServiceSettings$Builder**
- class **com.google.cloud.automl.v1beta1.PredictionServiceSettings**
- class **com.google.cloud.automl.v1beta1.stub.AutoMlStub**
- class **com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder**
- class **com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings**
- class **com.google.cloud.automl.v1beta1.stub.GrpcAutoMlCallableFactory**
- class **com.google.cloud.automl.v1beta1.stub.GrpcAutoMlStub**
- class **com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceCallableFactory**
- class **com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceStub**
- class **com.google.cloud.automl.v1beta1.stub.PredictionServiceStub**
- class **com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings$Builder**
- class **com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
