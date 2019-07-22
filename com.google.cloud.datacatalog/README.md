# Bindings for com.google.cloud.datacatalog

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.datacatalog "1.0.0"]
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

- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsFixedSizeCollection**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPage**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogFixedSizeCollection**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPage**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogClient**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogSettings$Builder**
- class **com.google.cloud.datacatalog.v1beta1.DataCatalogSettings**
- class **com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStub**
- class **com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder**
- class **com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings**
- class **com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogCallableFactory**
- class **com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
