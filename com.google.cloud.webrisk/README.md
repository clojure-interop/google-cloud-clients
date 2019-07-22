# Bindings for com.google.cloud.webrisk

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.webrisk "1.0.0"]
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

- class **com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Client**
- class **com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings$Builder**
- class **com.google.cloud.webrisk.v1beta1.WebRiskServiceV1Beta1Settings**
- class **com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1CallableFactory**
- class **com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1Stub**
- class **com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1Stub**
- class **com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings$Builder**
- class **com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
