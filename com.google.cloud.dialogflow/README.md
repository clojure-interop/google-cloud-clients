# Bindings for com.google.cloud.dialogflow

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.dialogflow "1.0.0"]
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

- class **com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPage**
- class **com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPagedResponse**
- class **com.google.cloud.dialogflow.v2.AgentsClient**
- class **com.google.cloud.dialogflow.v2.AgentsSettings$Builder**
- class **com.google.cloud.dialogflow.v2.AgentsSettings**
- class **com.google.cloud.dialogflow.v2.ContextsClient$ListContextsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2.ContextsClient$ListContextsPage**
- class **com.google.cloud.dialogflow.v2.ContextsClient$ListContextsPagedResponse**
- class **com.google.cloud.dialogflow.v2.ContextsClient**
- class **com.google.cloud.dialogflow.v2.ContextsSettings$Builder**
- class **com.google.cloud.dialogflow.v2.ContextsSettings**
- class **com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPage**
- class **com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse**
- class **com.google.cloud.dialogflow.v2.EntityTypesClient**
- class **com.google.cloud.dialogflow.v2.EntityTypesSettings$Builder**
- class **com.google.cloud.dialogflow.v2.EntityTypesSettings**
- class **com.google.cloud.dialogflow.v2.IntentsClient$ListIntentsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2.IntentsClient$ListIntentsPage**
- class **com.google.cloud.dialogflow.v2.IntentsClient$ListIntentsPagedResponse**
- class **com.google.cloud.dialogflow.v2.IntentsClient**
- class **com.google.cloud.dialogflow.v2.IntentsSettings$Builder**
- class **com.google.cloud.dialogflow.v2.IntentsSettings**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPage**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesClient**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesSettings$Builder**
- class **com.google.cloud.dialogflow.v2.SessionEntityTypesSettings**
- class **com.google.cloud.dialogflow.v2.SessionsClient**
- class **com.google.cloud.dialogflow.v2.SessionsSettings$Builder**
- class **com.google.cloud.dialogflow.v2.SessionsSettings**
- class **com.google.cloud.dialogflow.v2.stub.AgentsStub**
- class **com.google.cloud.dialogflow.v2.stub.AgentsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.AgentsStubSettings**
- class **com.google.cloud.dialogflow.v2.stub.ContextsStub**
- class **com.google.cloud.dialogflow.v2.stub.ContextsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.ContextsStubSettings**
- class **com.google.cloud.dialogflow.v2.stub.EntityTypesStub**
- class **com.google.cloud.dialogflow.v2.stub.EntityTypesStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.EntityTypesStubSettings**
- class **com.google.cloud.dialogflow.v2.stub.GrpcAgentsCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcAgentsStub**
- class **com.google.cloud.dialogflow.v2.stub.GrpcContextsCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcContextsStub**
- class **com.google.cloud.dialogflow.v2.stub.GrpcEntityTypesCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcEntityTypesStub**
- class **com.google.cloud.dialogflow.v2.stub.GrpcIntentsCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcIntentsStub**
- class **com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcSessionEntityTypesStub**
- class **com.google.cloud.dialogflow.v2.stub.GrpcSessionsCallableFactory**
- class **com.google.cloud.dialogflow.v2.stub.GrpcSessionsStub**
- class **com.google.cloud.dialogflow.v2.stub.IntentsStub**
- class **com.google.cloud.dialogflow.v2.stub.IntentsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.IntentsStubSettings**
- class **com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStub**
- class **com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings**
- class **com.google.cloud.dialogflow.v2.stub.SessionsStub**
- class **com.google.cloud.dialogflow.v2.stub.SessionsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2.stub.SessionsStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPage**
- class **com.google.cloud.dialogflow.v2beta1.AgentsClient$SearchAgentsPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.AgentsClient**
- class **com.google.cloud.dialogflow.v2beta1.AgentsSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.AgentsSettings**
- class **com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPage**
- class **com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.ContextsClient**
- class **com.google.cloud.dialogflow.v2beta1.ContextsSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.ContextsSettings**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPage**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsClient$ListDocumentsPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsClient**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.DocumentsSettings**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPage**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesClient**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.EntityTypesSettings**
- class **com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPage**
- class **com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.IntentsClient**
- class **com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.IntentsSettings**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPage**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesFixedSizeCollection**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPage**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings**
- class **com.google.cloud.dialogflow.v2beta1.SessionsClient**
- class **com.google.cloud.dialogflow.v2beta1.SessionsSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.SessionsSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.AgentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.AgentsStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.ContextsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.ContextsStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.DocumentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.DocumentsStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcAgentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcContextsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcDocumentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcEntityTypesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcIntentsCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcIntentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcKnowledgeBasesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionEntityTypesCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionEntityTypesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsCallableFactory**
- class **com.google.cloud.dialogflow.v2beta1.stub.GrpcSessionsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.IntentsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionsStub**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings$Builder**
- class **com.google.cloud.dialogflow.v2beta1.stub.SessionsStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
