# Bindings for com.google.cloud.dlp

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.dlp "1.0.0"]
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

- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesFixedSizeCollection**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPage**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDeidentifyTemplatesPagedResponse**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsFixedSizeCollection**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPage**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListDlpJobsPagedResponse**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesFixedSizeCollection**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPage**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListInspectTemplatesPagedResponse**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersFixedSizeCollection**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPage**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListJobTriggersPagedResponse**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesFixedSizeCollection**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPage**
- class **com.google.cloud.dlp.v2.DlpServiceClient$ListStoredInfoTypesPagedResponse**
- class **com.google.cloud.dlp.v2.DlpServiceClient**
- class **com.google.cloud.dlp.v2.DlpServiceSettings$Builder**
- class **com.google.cloud.dlp.v2.DlpServiceSettings**
- class **com.google.cloud.dlp.v2.stub.DlpServiceStub**
- class **com.google.cloud.dlp.v2.stub.DlpServiceStubSettings$Builder**
- class **com.google.cloud.dlp.v2.stub.DlpServiceStubSettings**
- class **com.google.cloud.dlp.v2.stub.GrpcDlpServiceCallableFactory**
- class **com.google.cloud.dlp.v2.stub.GrpcDlpServiceStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
