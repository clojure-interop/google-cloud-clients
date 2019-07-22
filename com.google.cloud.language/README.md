# Bindings for com.google.cloud.language

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.language "1.0.0"]
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

- class **com.google.cloud.language.v1.LanguageServiceClient**
- class **com.google.cloud.language.v1.LanguageServiceSettings$Builder**
- class **com.google.cloud.language.v1.LanguageServiceSettings**
- class **com.google.cloud.language.v1.stub.GrpcLanguageServiceCallableFactory**
- class **com.google.cloud.language.v1.stub.GrpcLanguageServiceStub**
- class **com.google.cloud.language.v1.stub.LanguageServiceStub**
- class **com.google.cloud.language.v1.stub.LanguageServiceStubSettings$Builder**
- class **com.google.cloud.language.v1.stub.LanguageServiceStubSettings**
- class **com.google.cloud.language.v1beta2.LanguageServiceClient**
- class **com.google.cloud.language.v1beta2.LanguageServiceSettings$Builder**
- class **com.google.cloud.language.v1beta2.LanguageServiceSettings**
- class **com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceCallableFactory**
- class **com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub**
- class **com.google.cloud.language.v1beta2.stub.LanguageServiceStub**
- class **com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings$Builder**
- class **com.google.cloud.language.v1beta2.stub.LanguageServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
