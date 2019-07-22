# Bindings for com.google.cloud.translate

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.translate "1.0.0"]
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

- class **com.google.cloud.translate.Detection**
- class **com.google.cloud.translate.Language**
- class **com.google.cloud.translate.Translate$LanguageListOption**
- class **com.google.cloud.translate.Translate$TranslateOption**
- interface **com.google.cloud.translate.Translate**
- class **com.google.cloud.translate.TranslateException**
- interface **com.google.cloud.translate.TranslateFactory**
- class **com.google.cloud.translate.TranslateOptions$Builder**
- class **com.google.cloud.translate.TranslateOptions$DefaultTranslateFactory**
- class **com.google.cloud.translate.TranslateOptions$DefaultTranslateRpcFactory**
- class **com.google.cloud.translate.TranslateOptions**
- class **com.google.cloud.translate.Translation**
- interface **com.google.cloud.translate.spi.TranslateRpcFactory**
- class **com.google.cloud.translate.spi.v2.HttpTranslateRpc**
- enum **com.google.cloud.translate.spi.v2.TranslateRpc$Option**
- interface **com.google.cloud.translate.spi.v2.TranslateRpc**
- class **com.google.cloud.translate.testing.RemoteTranslateHelper$TranslateHelperException**
- class **com.google.cloud.translate.testing.RemoteTranslateHelper**
- class **com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesFixedSizeCollection**
- class **com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPage**
- class **com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse**
- class **com.google.cloud.translate.v3beta1.TranslationServiceClient**
- class **com.google.cloud.translate.v3beta1.TranslationServiceSettings$Builder**
- class **com.google.cloud.translate.v3beta1.TranslationServiceSettings**
- class **com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceCallableFactory**
- class **com.google.cloud.translate.v3beta1.stub.GrpcTranslationServiceStub**
- class **com.google.cloud.translate.v3beta1.stub.TranslationServiceStub**
- class **com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings$Builder**
- class **com.google.cloud.translate.v3beta1.stub.TranslationServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
