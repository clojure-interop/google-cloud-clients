# Bindings for com.google.cloud.securitycenter

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.securitycenter "1.0.0"]
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

- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPage**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPage**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPage**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPage**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPage**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse**
- class **com.google.cloud.securitycenter.v1.SecurityCenterClient**
- class **com.google.cloud.securitycenter.v1.SecurityCenterSettings$Builder**
- class **com.google.cloud.securitycenter.v1.SecurityCenterSettings**
- class **com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterCallableFactory**
- class **com.google.cloud.securitycenter.v1.stub.GrpcSecurityCenterStub**
- class **com.google.cloud.securitycenter.v1.stub.SecurityCenterStub**
- class **com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings$Builder**
- class **com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupAssetsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupAssetsPage**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupAssetsPagedResponse**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupFindingsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupFindingsPage**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$GroupFindingsPagedResponse**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListAssetsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListAssetsPage**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListAssetsPagedResponse**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListFindingsFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListFindingsPage**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListFindingsPagedResponse**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListSourcesFixedSizeCollection**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListSourcesPage**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient$ListSourcesPagedResponse**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterClient**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterSettings$Builder**
- class **com.google.cloud.securitycenter.v1beta1.SecurityCenterSettings**
- class **com.google.cloud.securitycenter.v1beta1.stub.GrpcSecurityCenterCallableFactory**
- class **com.google.cloud.securitycenter.v1beta1.stub.GrpcSecurityCenterStub**
- class **com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStub**
- class **com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStubSettings$Builder**
- class **com.google.cloud.securitycenter.v1beta1.stub.SecurityCenterStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
