# Bindings for com.google.cloud.vision

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.vision "1.0.0"]
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

- class **com.google.cloud.vision.v1.ImageAnnotatorClient**
- class **com.google.cloud.vision.v1.ImageAnnotatorSettings$Builder**
- class **com.google.cloud.vision.v1.ImageAnnotatorSettings**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsFixedSizeCollection**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPage**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPagedResponse**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsFixedSizeCollection**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsInProductSetFixedSizeCollection**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsInProductSetPage**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsInProductSetPagedResponse**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsPage**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListProductsPagedResponse**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListReferenceImagesFixedSizeCollection**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListReferenceImagesPage**
- class **com.google.cloud.vision.v1.ProductSearchClient$ListReferenceImagesPagedResponse**
- class **com.google.cloud.vision.v1.ProductSearchClient**
- class **com.google.cloud.vision.v1.ProductSearchSettings$Builder**
- class **com.google.cloud.vision.v1.ProductSearchSettings**
- class **com.google.cloud.vision.v1.stub.GrpcImageAnnotatorCallableFactory**
- class **com.google.cloud.vision.v1.stub.GrpcImageAnnotatorStub**
- class **com.google.cloud.vision.v1.stub.GrpcProductSearchCallableFactory**
- class **com.google.cloud.vision.v1.stub.GrpcProductSearchStub**
- class **com.google.cloud.vision.v1.stub.ImageAnnotatorStub**
- class **com.google.cloud.vision.v1.stub.ImageAnnotatorStubSettings$Builder**
- class **com.google.cloud.vision.v1.stub.ImageAnnotatorStubSettings**
- class **com.google.cloud.vision.v1.stub.ProductSearchStub**
- class **com.google.cloud.vision.v1.stub.ProductSearchStubSettings$Builder**
- class **com.google.cloud.vision.v1.stub.ProductSearchStubSettings**
- class **com.google.cloud.vision.v1p1beta1.ImageAnnotatorClient**
- class **com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings$Builder**
- class **com.google.cloud.vision.v1p1beta1.ImageAnnotatorSettings**
- class **com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorCallableFactory**
- class **com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorStub**
- class **com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStub**
- class **com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings$Builder**
- class **com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings**
- class **com.google.cloud.vision.v1p2beta1.ImageAnnotatorClient**
- class **com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings$Builder**
- class **com.google.cloud.vision.v1p2beta1.ImageAnnotatorSettings**
- class **com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorCallableFactory**
- class **com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorStub**
- class **com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStub**
- class **com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings$Builder**
- class **com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings**
- class **com.google.cloud.vision.v1p3beta1.ImageAnnotatorClient**
- class **com.google.cloud.vision.v1p3beta1.ImageAnnotatorSettings$Builder**
- class **com.google.cloud.vision.v1p3beta1.ImageAnnotatorSettings**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsFixedSizeCollection**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPage**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPagedResponse**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsFixedSizeCollection**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetFixedSizeCollection**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPage**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPagedResponse**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPage**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesFixedSizeCollection**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPage**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPagedResponse**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchClient**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchSettings$Builder**
- class **com.google.cloud.vision.v1p3beta1.ProductSearchSettings**
- class **com.google.cloud.vision.v1p3beta1.stub.GrpcImageAnnotatorCallableFactory**
- class **com.google.cloud.vision.v1p3beta1.stub.GrpcImageAnnotatorStub**
- class **com.google.cloud.vision.v1p3beta1.stub.GrpcProductSearchCallableFactory**
- class **com.google.cloud.vision.v1p3beta1.stub.GrpcProductSearchStub**
- class **com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStub**
- class **com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings$Builder**
- class **com.google.cloud.vision.v1p3beta1.stub.ImageAnnotatorStubSettings**
- class **com.google.cloud.vision.v1p3beta1.stub.ProductSearchStub**
- class **com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder**
- class **com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings**
- class **com.google.cloud.vision.v1p4beta1.ImageAnnotatorClient**
- class **com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings$Builder**
- class **com.google.cloud.vision.v1p4beta1.ImageAnnotatorSettings**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductSetsFixedSizeCollection**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductSetsPage**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductSetsPagedResponse**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsFixedSizeCollection**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetFixedSizeCollection**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetPage**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetPagedResponse**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsPage**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsPagedResponse**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListReferenceImagesFixedSizeCollection**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListReferenceImagesPage**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListReferenceImagesPagedResponse**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchClient**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchSettings$Builder**
- class **com.google.cloud.vision.v1p4beta1.ProductSearchSettings**
- class **com.google.cloud.vision.v1p4beta1.stub.GrpcImageAnnotatorCallableFactory**
- class **com.google.cloud.vision.v1p4beta1.stub.GrpcImageAnnotatorStub**
- class **com.google.cloud.vision.v1p4beta1.stub.GrpcProductSearchCallableFactory**
- class **com.google.cloud.vision.v1p4beta1.stub.GrpcProductSearchStub**
- class **com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStub**
- class **com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStubSettings$Builder**
- class **com.google.cloud.vision.v1p4beta1.stub.ImageAnnotatorStubSettings**
- class **com.google.cloud.vision.v1p4beta1.stub.ProductSearchStub**
- class **com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings$Builder**
- class **com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
