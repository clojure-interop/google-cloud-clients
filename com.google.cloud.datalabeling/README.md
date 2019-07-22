# Bindings for com.google.cloud.datalabeling

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.datalabeling "1.0.0"]
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

- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsFixedSizeCollection**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPage**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings$Builder**
- class **com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings**
- class **com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStub**
- class **com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder**
- class **com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings**
- class **com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceCallableFactory**
- class **com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
