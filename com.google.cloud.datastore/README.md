# Bindings for com.google.cloud.datastore

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.datastore "1.0.0"]
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

- class **com.google.cloud.datastore.BaseDatastoreBatchWriter**
- class **com.google.cloud.datastore.BaseEntity$Builder**
- class **com.google.cloud.datastore.BaseEntity**
- class **com.google.cloud.datastore.BaseKey$Builder**
- class **com.google.cloud.datastore.BaseKey**
- interface **com.google.cloud.datastore.Batch$Response**
- interface **com.google.cloud.datastore.Batch**
- class **com.google.cloud.datastore.Blob**
- class **com.google.cloud.datastore.BlobValue$Builder**
- class **com.google.cloud.datastore.BlobValue**
- class **com.google.cloud.datastore.BooleanValue$Builder**
- class **com.google.cloud.datastore.BooleanValue**
- class **com.google.cloud.datastore.Cursor**
- interface **com.google.cloud.datastore.Datastore$TransactionCallable**
- interface **com.google.cloud.datastore.Datastore**
- interface **com.google.cloud.datastore.DatastoreBatchWriter**
- class **com.google.cloud.datastore.DatastoreException**
- interface **com.google.cloud.datastore.DatastoreFactory**
- class **com.google.cloud.datastore.DatastoreOptions$Builder**
- class **com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreFactory**
- class **com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreRpcFactory**
- class **com.google.cloud.datastore.DatastoreOptions**
- interface **com.google.cloud.datastore.DatastoreReader**
- interface **com.google.cloud.datastore.DatastoreReaderWriter**
- interface **com.google.cloud.datastore.DatastoreWriter**
- class **com.google.cloud.datastore.DoubleValue$Builder**
- class **com.google.cloud.datastore.DoubleValue**
- class **com.google.cloud.datastore.Entity$Builder**
- class **com.google.cloud.datastore.Entity**
- class **com.google.cloud.datastore.EntityQuery$Builder**
- class **com.google.cloud.datastore.EntityQuery**
- class **com.google.cloud.datastore.EntityValue$Builder**
- class **com.google.cloud.datastore.EntityValue**
- class **com.google.cloud.datastore.FullEntity$Builder**
- class **com.google.cloud.datastore.FullEntity**
- class **com.google.cloud.datastore.GqlQuery$Builder**
- class **com.google.cloud.datastore.GqlQuery**
- class **com.google.cloud.datastore.IncompleteKey$Builder**
- class **com.google.cloud.datastore.IncompleteKey**
- class **com.google.cloud.datastore.Key$Builder**
- class **com.google.cloud.datastore.Key**
- class **com.google.cloud.datastore.KeyFactory**
- class **com.google.cloud.datastore.KeyQuery$Builder**
- class **com.google.cloud.datastore.KeyQuery**
- class **com.google.cloud.datastore.KeyValue$Builder**
- class **com.google.cloud.datastore.KeyValue**
- class **com.google.cloud.datastore.LatLng**
- class **com.google.cloud.datastore.LatLngValue$Builder**
- class **com.google.cloud.datastore.LatLngValue**
- class **com.google.cloud.datastore.ListValue$Builder**
- class **com.google.cloud.datastore.ListValue**
- class **com.google.cloud.datastore.LongValue$Builder**
- class **com.google.cloud.datastore.LongValue**
- class **com.google.cloud.datastore.NullValue$Builder**
- class **com.google.cloud.datastore.NullValue**
- class **com.google.cloud.datastore.PathElement**
- class **com.google.cloud.datastore.ProjectionEntity$Builder**
- class **com.google.cloud.datastore.ProjectionEntity**
- class **com.google.cloud.datastore.ProjectionEntityQuery$Builder**
- class **com.google.cloud.datastore.ProjectionEntityQuery**
- class **com.google.cloud.datastore.Query$ResultType**
- class **com.google.cloud.datastore.Query**
- interface **com.google.cloud.datastore.QueryResults**
- class **com.google.cloud.datastore.RawValue$Builder**
- class **com.google.cloud.datastore.RawValue**
- class **com.google.cloud.datastore.ReadOption$EventualConsistency**
- class **com.google.cloud.datastore.ReadOption**
- class **com.google.cloud.datastore.StringValue$Builder**
- class **com.google.cloud.datastore.StringValue**
- interface **com.google.cloud.datastore.StructuredQuery$Builder**
- class **com.google.cloud.datastore.StructuredQuery$CompositeFilter**
- class **com.google.cloud.datastore.StructuredQuery$Filter**
- class **com.google.cloud.datastore.StructuredQuery$OrderBy$Direction**
- class **com.google.cloud.datastore.StructuredQuery$OrderBy**
- class **com.google.cloud.datastore.StructuredQuery$PropertyFilter**
- class **com.google.cloud.datastore.StructuredQuery**
- class **com.google.cloud.datastore.TimestampValue$Builder**
- class **com.google.cloud.datastore.TimestampValue**
- interface **com.google.cloud.datastore.Transaction$Response**
- interface **com.google.cloud.datastore.Transaction**
- class **com.google.cloud.datastore.TransactionExceptionHandler**
- class **com.google.cloud.datastore.Value**
- interface **com.google.cloud.datastore.ValueBuilder**
- enum **com.google.cloud.datastore.ValueType**
- interface **com.google.cloud.datastore.spi.DatastoreRpcFactory**
- interface **com.google.cloud.datastore.spi.v1.DatastoreRpc**
- class **com.google.cloud.datastore.spi.v1.HttpDatastoreRpc**
- class **com.google.cloud.datastore.testing.LocalDatastoreHelper**
- class **com.google.cloud.datastore.testing.RemoteDatastoreHelper**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
