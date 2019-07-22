# Bindings for com.google.cloud.videointelligence

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.videointelligence "1.0.0"]
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

- class **com.google.cloud.videointelligence.v1.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1.stub.VideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1beta1.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1beta1.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1beta1.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1beta1.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1beta1.stub.VideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1beta2.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1beta2.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1beta2.stub.VideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1p2beta1.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1p2beta1.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p2beta1.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p2beta1.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1p2beta1.stub.VideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1p3beta1.StreamingVideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceClient**
- class **com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceSettings$Builder**
- class **com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceSettings**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.GrpcVideoIntelligenceServiceCallableFactory**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.GrpcVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.VideoIntelligenceServiceStub**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.VideoIntelligenceServiceStubSettings$Builder**
- class **com.google.cloud.videointelligence.v1p3beta1.stub.VideoIntelligenceServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
