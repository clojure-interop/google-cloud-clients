# Bindings for com.google.cloud.texttospeech

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.texttospeech "1.0.0"]
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

- class **com.google.cloud.texttospeech.v1.TextToSpeechClient**
- class **com.google.cloud.texttospeech.v1.TextToSpeechSettings$Builder**
- class **com.google.cloud.texttospeech.v1.TextToSpeechSettings**
- class **com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechCallableFactory**
- class **com.google.cloud.texttospeech.v1.stub.GrpcTextToSpeechStub**
- class **com.google.cloud.texttospeech.v1.stub.TextToSpeechStub**
- class **com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings$Builder**
- class **com.google.cloud.texttospeech.v1.stub.TextToSpeechStubSettings**
- class **com.google.cloud.texttospeech.v1beta1.TextToSpeechClient**
- class **com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings$Builder**
- class **com.google.cloud.texttospeech.v1beta1.TextToSpeechSettings**
- class **com.google.cloud.texttospeech.v1beta1.stub.GrpcTextToSpeechCallableFactory**
- class **com.google.cloud.texttospeech.v1beta1.stub.GrpcTextToSpeechStub**
- class **com.google.cloud.texttospeech.v1beta1.stub.TextToSpeechStub**
- class **com.google.cloud.texttospeech.v1beta1.stub.TextToSpeechStubSettings$Builder**
- class **com.google.cloud.texttospeech.v1beta1.stub.TextToSpeechStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
