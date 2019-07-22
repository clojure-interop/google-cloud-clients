(ns com.google.cloud.datastore.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.google.cloud.datastore.BaseDatastoreBatchWriter])
(require '[com.google.cloud.datastore.BaseEntity$Builder])
(require '[com.google.cloud.datastore.BaseEntity])
(require '[com.google.cloud.datastore.BaseKey$Builder])
(require '[com.google.cloud.datastore.BaseKey])
(require '[com.google.cloud.datastore.Batch$Response])
(require '[com.google.cloud.datastore.Batch])
(require '[com.google.cloud.datastore.Blob])
(require '[com.google.cloud.datastore.BlobValue$Builder])
(require '[com.google.cloud.datastore.BlobValue])
(require '[com.google.cloud.datastore.BooleanValue$Builder])
(require '[com.google.cloud.datastore.BooleanValue])
(require '[com.google.cloud.datastore.Cursor])
(require '[com.google.cloud.datastore.Datastore$TransactionCallable])
(require '[com.google.cloud.datastore.Datastore])
(require '[com.google.cloud.datastore.DatastoreBatchWriter])
(require '[com.google.cloud.datastore.DatastoreException])
(require '[com.google.cloud.datastore.DatastoreFactory])
(require '[com.google.cloud.datastore.DatastoreOptions$Builder])
(require '[com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreFactory])
(require '[com.google.cloud.datastore.DatastoreOptions$DefaultDatastoreRpcFactory])
(require '[com.google.cloud.datastore.DatastoreOptions])
(require '[com.google.cloud.datastore.DatastoreReader])
(require '[com.google.cloud.datastore.DatastoreReaderWriter])
(require '[com.google.cloud.datastore.DatastoreWriter])
(require '[com.google.cloud.datastore.DoubleValue$Builder])
(require '[com.google.cloud.datastore.DoubleValue])
(require '[com.google.cloud.datastore.Entity$Builder])
(require '[com.google.cloud.datastore.Entity])
(require '[com.google.cloud.datastore.EntityQuery$Builder])
(require '[com.google.cloud.datastore.EntityQuery])
(require '[com.google.cloud.datastore.EntityValue$Builder])
(require '[com.google.cloud.datastore.EntityValue])
(require '[com.google.cloud.datastore.FullEntity$Builder])
(require '[com.google.cloud.datastore.FullEntity])
(require '[com.google.cloud.datastore.GqlQuery$Builder])
(require '[com.google.cloud.datastore.GqlQuery])
(require '[com.google.cloud.datastore.IncompleteKey$Builder])
(require '[com.google.cloud.datastore.IncompleteKey])
(require '[com.google.cloud.datastore.Key$Builder])
(require '[com.google.cloud.datastore.Key])
(require '[com.google.cloud.datastore.KeyFactory])
(require '[com.google.cloud.datastore.KeyQuery$Builder])
(require '[com.google.cloud.datastore.KeyQuery])
(require '[com.google.cloud.datastore.KeyValue$Builder])
(require '[com.google.cloud.datastore.KeyValue])
(require '[com.google.cloud.datastore.LatLng])
(require '[com.google.cloud.datastore.LatLngValue$Builder])
(require '[com.google.cloud.datastore.LatLngValue])
(require '[com.google.cloud.datastore.ListValue$Builder])
(require '[com.google.cloud.datastore.ListValue])
(require '[com.google.cloud.datastore.LongValue$Builder])
(require '[com.google.cloud.datastore.LongValue])
(require '[com.google.cloud.datastore.NullValue$Builder])
(require '[com.google.cloud.datastore.NullValue])
(require '[com.google.cloud.datastore.PathElement])
(require '[com.google.cloud.datastore.ProjectionEntity$Builder])
(require '[com.google.cloud.datastore.ProjectionEntity])
(require '[com.google.cloud.datastore.ProjectionEntityQuery$Builder])
(require '[com.google.cloud.datastore.ProjectionEntityQuery])
(require '[com.google.cloud.datastore.Query$ResultType])
(require '[com.google.cloud.datastore.Query])
(require '[com.google.cloud.datastore.QueryResults])
(require '[com.google.cloud.datastore.RawValue$Builder])
(require '[com.google.cloud.datastore.RawValue])
(require '[com.google.cloud.datastore.ReadOption$EventualConsistency])
(require '[com.google.cloud.datastore.ReadOption])
(require '[com.google.cloud.datastore.StringValue$Builder])
(require '[com.google.cloud.datastore.StringValue])
(require '[com.google.cloud.datastore.StructuredQuery$Builder])
(require '[com.google.cloud.datastore.StructuredQuery$CompositeFilter])
(require '[com.google.cloud.datastore.StructuredQuery$Filter])
(require '[com.google.cloud.datastore.StructuredQuery$OrderBy$Direction])
(require '[com.google.cloud.datastore.StructuredQuery$OrderBy])
(require '[com.google.cloud.datastore.StructuredQuery$PropertyFilter])
(require '[com.google.cloud.datastore.StructuredQuery])
(require '[com.google.cloud.datastore.TimestampValue$Builder])
(require '[com.google.cloud.datastore.TimestampValue])
(require '[com.google.cloud.datastore.Transaction$Response])
(require '[com.google.cloud.datastore.Transaction])
(require '[com.google.cloud.datastore.TransactionExceptionHandler])
(require '[com.google.cloud.datastore.Value])
(require '[com.google.cloud.datastore.ValueBuilder])
(require '[com.google.cloud.datastore.ValueType])
