# Bindings for com.google.cloud.asset

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.asset "1.0.0"]
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

- class **com.google.cloud.asset.v1.AssetServiceClient**
- class **com.google.cloud.asset.v1.AssetServiceSettings$Builder**
- class **com.google.cloud.asset.v1.AssetServiceSettings**
- class **com.google.cloud.asset.v1.stub.AssetServiceStub**
- class **com.google.cloud.asset.v1.stub.AssetServiceStubSettings$Builder**
- class **com.google.cloud.asset.v1.stub.AssetServiceStubSettings**
- class **com.google.cloud.asset.v1.stub.GrpcAssetServiceCallableFactory**
- class **com.google.cloud.asset.v1.stub.GrpcAssetServiceStub**
- class **com.google.cloud.asset.v1beta1.AssetServiceClient**
- class **com.google.cloud.asset.v1beta1.AssetServiceSettings$Builder**
- class **com.google.cloud.asset.v1beta1.AssetServiceSettings**
- class **com.google.cloud.asset.v1beta1.stub.AssetServiceStub**
- class **com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings$Builder**
- class **com.google.cloud.asset.v1beta1.stub.AssetServiceStubSettings**
- class **com.google.cloud.asset.v1beta1.stub.GrpcAssetServiceCallableFactory**
- class **com.google.cloud.asset.v1beta1.stub.GrpcAssetServiceStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
