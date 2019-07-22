# Bindings for com.google.cloud.speech

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.speech "1.0.0"]
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

- class **com.google.cloud.speech.v1.SpeechClient**
- class **com.google.cloud.speech.v1.SpeechSettings$Builder**
- class **com.google.cloud.speech.v1.SpeechSettings**
- class **com.google.cloud.speech.v1.stub.GrpcSpeechCallableFactory**
- class **com.google.cloud.speech.v1.stub.GrpcSpeechStub**
- class **com.google.cloud.speech.v1.stub.SpeechStub**
- class **com.google.cloud.speech.v1.stub.SpeechStubSettings$Builder**
- class **com.google.cloud.speech.v1.stub.SpeechStubSettings**
- class **com.google.cloud.speech.v1p1beta1.SpeechClient**
- class **com.google.cloud.speech.v1p1beta1.SpeechSettings$Builder**
- class **com.google.cloud.speech.v1p1beta1.SpeechSettings**
- class **com.google.cloud.speech.v1p1beta1.stub.GrpcSpeechCallableFactory**
- class **com.google.cloud.speech.v1p1beta1.stub.GrpcSpeechStub**
- class **com.google.cloud.speech.v1p1beta1.stub.SpeechStub**
- class **com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings$Builder**
- class **com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
