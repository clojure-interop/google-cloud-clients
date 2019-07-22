# Bindings for com.google.cloud.devtools

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.devtools "1.0.0"]
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

- class **com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient**
- class **com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings**
- class **com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStub**
- class **com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings**
- class **com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisCallableFactory**
- class **com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisStub**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsFixedSizeCollection**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPage**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesFixedSizeCollection**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPage**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesFixedSizeCollection**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPage**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesFixedSizeCollection**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPage**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Settings**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1Stub**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1Stub**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings$Builder**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1CallableFactory**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1Stub**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1CallableFactory**
- class **com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1Stub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
