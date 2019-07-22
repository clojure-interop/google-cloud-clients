# Bindings for com.google.cloud.kms

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.kms "1.0.0"]
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

- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsFixedSizeCollection**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPage**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysFixedSizeCollection**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPage**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsFixedSizeCollection**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPage**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsFixedSizeCollection**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPage**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse**
- class **com.google.cloud.kms.v1.KeyManagementServiceClient**
- class **com.google.cloud.kms.v1.KeyManagementServiceSettings$Builder**
- class **com.google.cloud.kms.v1.KeyManagementServiceSettings**
- class **com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceCallableFactory**
- class **com.google.cloud.kms.v1.stub.GrpcKeyManagementServiceStub**
- class **com.google.cloud.kms.v1.stub.KeyManagementServiceStub**
- class **com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings$Builder**
- class **com.google.cloud.kms.v1.stub.KeyManagementServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
