# Bindings for com.google.cloud.firestore

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.firestore "1.0.0"]
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

- class **com.google.cloud.firestore.BasePath**
- class **com.google.cloud.firestore.Blob**
- class **com.google.cloud.firestore.CollectionReference**
- enum **com.google.cloud.firestore.DocumentChange$Type**
- class **com.google.cloud.firestore.DocumentChange**
- class **com.google.cloud.firestore.DocumentReference**
- class **com.google.cloud.firestore.DocumentSnapshot**
- interface **com.google.cloud.firestore.EventListener**
- class **com.google.cloud.firestore.FieldMask**
- class **com.google.cloud.firestore.FieldPath**
- class **com.google.cloud.firestore.FieldValue**
- interface **com.google.cloud.firestore.Firestore**
- class **com.google.cloud.firestore.FirestoreException**
- interface **com.google.cloud.firestore.FirestoreFactory**
- class **com.google.cloud.firestore.FirestoreOptions$Builder**
- class **com.google.cloud.firestore.FirestoreOptions$DefaultFirestoreFactory**
- class **com.google.cloud.firestore.FirestoreOptions$DefaultFirestoreRpcFactory**
- class **com.google.cloud.firestore.FirestoreOptions**
- interface **com.google.cloud.firestore.FirestoreRpcFactory**
- class **com.google.cloud.firestore.GeoPoint**
- interface **com.google.cloud.firestore.ListenerRegistration**
- class **com.google.cloud.firestore.Precondition**
- enum **com.google.cloud.firestore.Query$Direction**
- class **com.google.cloud.firestore.Query**
- class **com.google.cloud.firestore.QueryDocumentSnapshot**
- class **com.google.cloud.firestore.QuerySnapshot**
- class **com.google.cloud.firestore.SetOptions**
- interface **com.google.cloud.firestore.Transaction$Function**
- class **com.google.cloud.firestore.Transaction**
- class **com.google.cloud.firestore.TransactionOptions**
- class **com.google.cloud.firestore.UpdateBuilder**
- class **com.google.cloud.firestore.WriteBatch**
- class **com.google.cloud.firestore.WriteResult**
- annotation **com.google.cloud.firestore.annotation.Exclude**
- annotation **com.google.cloud.firestore.annotation.IgnoreExtraProperties**
- annotation **com.google.cloud.firestore.annotation.PropertyName**
- annotation **com.google.cloud.firestore.annotation.ServerTimestamp**
- annotation **com.google.cloud.firestore.annotation.ThrowOnExtraProperties**
- class **com.google.cloud.firestore.collection.ArraySortedMap**
- interface **com.google.cloud.firestore.collection.ImmutableSortedMap$Builder$KeyTranslator**
- class **com.google.cloud.firestore.collection.ImmutableSortedMap$Builder**
- class **com.google.cloud.firestore.collection.ImmutableSortedMap**
- class **com.google.cloud.firestore.collection.ImmutableSortedMapIterator**
- class **com.google.cloud.firestore.collection.ImmutableSortedSet**
- class **com.google.cloud.firestore.collection.LLRBBlackValueNode**
- class **com.google.cloud.firestore.collection.LLRBEmptyNode**
- enum **com.google.cloud.firestore.collection.LLRBNode$Color**
- class **com.google.cloud.firestore.collection.LLRBNode$NodeVisitor**
- interface **com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor**
- interface **com.google.cloud.firestore.collection.LLRBNode**
- class **com.google.cloud.firestore.collection.LLRBRedValueNode**
- class **com.google.cloud.firestore.collection.LLRBValueNode**
- class **com.google.cloud.firestore.collection.RBTreeSortedMap**
- class **com.google.cloud.firestore.collection.StandardComparator**
- interface **com.google.cloud.firestore.spi.v1.FirestoreRpc**
- class **com.google.cloud.firestore.spi.v1.GrpcFirestoreRpc**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsFixedSizeCollection**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPage**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPagedResponse**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesFixedSizeCollection**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPage**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse**
- class **com.google.cloud.firestore.v1.FirestoreAdminClient**
- class **com.google.cloud.firestore.v1.FirestoreAdminSettings$Builder**
- class **com.google.cloud.firestore.v1.FirestoreAdminSettings**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsFixedSizeCollection**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPage**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListCollectionIdsPagedResponse**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsFixedSizeCollection**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPage**
- class **com.google.cloud.firestore.v1.FirestoreClient$ListDocumentsPagedResponse**
- class **com.google.cloud.firestore.v1.FirestoreClient**
- class **com.google.cloud.firestore.v1.FirestoreSettings$Builder**
- class **com.google.cloud.firestore.v1.FirestoreSettings**
- class **com.google.cloud.firestore.v1.stub.FirestoreAdminStub**
- class **com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings$Builder**
- class **com.google.cloud.firestore.v1.stub.FirestoreAdminStubSettings**
- class **com.google.cloud.firestore.v1.stub.FirestoreStub**
- class **com.google.cloud.firestore.v1.stub.FirestoreStubSettings$Builder**
- class **com.google.cloud.firestore.v1.stub.FirestoreStubSettings**
- class **com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminCallableFactory**
- class **com.google.cloud.firestore.v1.stub.GrpcFirestoreAdminStub**
- class **com.google.cloud.firestore.v1.stub.GrpcFirestoreCallableFactory**
- class **com.google.cloud.firestore.v1.stub.GrpcFirestoreStub**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListCollectionIdsFixedSizeCollection**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListCollectionIdsPage**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListCollectionIdsPagedResponse**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListDocumentsFixedSizeCollection**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListDocumentsPage**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient$ListDocumentsPagedResponse**
- class **com.google.cloud.firestore.v1beta1.FirestoreClient**
- class **com.google.cloud.firestore.v1beta1.FirestoreSettings$Builder**
- class **com.google.cloud.firestore.v1beta1.FirestoreSettings**
- class **com.google.cloud.firestore.v1beta1.stub.FirestoreStub**
- class **com.google.cloud.firestore.v1beta1.stub.FirestoreStubSettings$Builder**
- class **com.google.cloud.firestore.v1beta1.stub.FirestoreStubSettings**
- class **com.google.cloud.firestore.v1beta1.stub.GrpcFirestoreCallableFactory**
- class **com.google.cloud.firestore.v1beta1.stub.GrpcFirestoreStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
