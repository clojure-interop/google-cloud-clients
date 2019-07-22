# Bindings for com.google.cloud.websecurityscanner

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.websecurityscanner "1.0.0"]
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

- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPage**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListCrawledUrlsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPage**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListFindingsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPage**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanConfigsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPage**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient$ListScanRunsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings$Builder**
- class **com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerSettings**
- class **com.google.cloud.websecurityscanner.v1alpha.stub.GrpcWebSecurityScannerCallableFactory**
- class **com.google.cloud.websecurityscanner.v1alpha.stub.GrpcWebSecurityScannerStub**
- class **com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStub**
- class **com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings$Builder**
- class **com.google.cloud.websecurityscanner.v1alpha.stub.WebSecurityScannerStubSettings**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPage**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListCrawledUrlsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPage**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListFindingsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPage**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanConfigsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsFixedSizeCollection**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPage**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient$ListScanRunsPagedResponse**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerClient**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings$Builder**
- class **com.google.cloud.websecurityscanner.v1beta.WebSecurityScannerSettings**
- class **com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerCallableFactory**
- class **com.google.cloud.websecurityscanner.v1beta.stub.GrpcWebSecurityScannerStub**
- class **com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStub**
- class **com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings$Builder**
- class **com.google.cloud.websecurityscanner.v1beta.stub.WebSecurityScannerStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
