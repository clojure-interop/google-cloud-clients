(ns com.google.cloud.spanner.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.google.cloud.spanner.AbortedException])
(require '[com.google.cloud.spanner.AbstractStructReader])
(require '[com.google.cloud.spanner.BatchClient])
(require '[com.google.cloud.spanner.BatchClientImpl])
(require '[com.google.cloud.spanner.BatchReadOnlyTransaction])
(require '[com.google.cloud.spanner.BatchTransactionId])
(require '[com.google.cloud.spanner.Database])
(require '[com.google.cloud.spanner.DatabaseAdminClient])
(require '[com.google.cloud.spanner.DatabaseClient])
(require '[com.google.cloud.spanner.DatabaseId])
(require '[com.google.cloud.spanner.DatabaseInfo$State])
(require '[com.google.cloud.spanner.DatabaseInfo])
(require '[com.google.cloud.spanner.ErrorCode])
(require '[com.google.cloud.spanner.ForwardingResultSet])
(require '[com.google.cloud.spanner.ForwardingStructReader])
(require '[com.google.cloud.spanner.Instance$Builder])
(require '[com.google.cloud.spanner.Instance])
(require '[com.google.cloud.spanner.InstanceAdminClient])
(require '[com.google.cloud.spanner.InstanceConfig])
(require '[com.google.cloud.spanner.InstanceConfigId])
(require '[com.google.cloud.spanner.InstanceConfigInfo])
(require '[com.google.cloud.spanner.InstanceId])
(require '[com.google.cloud.spanner.InstanceInfo$Builder])
(require '[com.google.cloud.spanner.InstanceInfo$InstanceField])
(require '[com.google.cloud.spanner.InstanceInfo$State])
(require '[com.google.cloud.spanner.InstanceInfo])
(require '[com.google.cloud.spanner.Key$Builder])
(require '[com.google.cloud.spanner.Key])
(require '[com.google.cloud.spanner.KeyRange$Builder])
(require '[com.google.cloud.spanner.KeyRange$Endpoint])
(require '[com.google.cloud.spanner.KeyRange])
(require '[com.google.cloud.spanner.KeySet$Builder])
(require '[com.google.cloud.spanner.KeySet])
(require '[com.google.cloud.spanner.Mutation$Op])
(require '[com.google.cloud.spanner.Mutation$WriteBuilder])
(require '[com.google.cloud.spanner.Mutation])
(require '[com.google.cloud.spanner.Operation])
(require '[com.google.cloud.spanner.Options$ListOption])
(require '[com.google.cloud.spanner.Options$QueryOption])
(require '[com.google.cloud.spanner.Options$ReadAndQueryOption])
(require '[com.google.cloud.spanner.Options$ReadOption])
(require '[com.google.cloud.spanner.Options])
(require '[com.google.cloud.spanner.Partition])
(require '[com.google.cloud.spanner.PartitionOptions$Builder])
(require '[com.google.cloud.spanner.PartitionOptions])
(require '[com.google.cloud.spanner.ReadContext$QueryAnalyzeMode])
(require '[com.google.cloud.spanner.ReadContext])
(require '[com.google.cloud.spanner.ReadOnlyTransaction])
(require '[com.google.cloud.spanner.ResultSet])
(require '[com.google.cloud.spanner.ResultSets])
(require '[com.google.cloud.spanner.Session])
(require '[com.google.cloud.spanner.SessionNotFoundException])
(require '[com.google.cloud.spanner.SessionPoolOptions$Builder])
(require '[com.google.cloud.spanner.SessionPoolOptions])
(require '[com.google.cloud.spanner.Spanner])
(require '[com.google.cloud.spanner.SpannerBatchUpdateException])
(require '[com.google.cloud.spanner.SpannerException])
(require '[com.google.cloud.spanner.SpannerExceptionFactory])
(require '[com.google.cloud.spanner.SpannerFactory])
(require '[com.google.cloud.spanner.SpannerOptions$Builder])
(require '[com.google.cloud.spanner.SpannerOptions])
(require '[com.google.cloud.spanner.Statement$Builder])
(require '[com.google.cloud.spanner.Statement])
(require '[com.google.cloud.spanner.Struct$Builder])
(require '[com.google.cloud.spanner.Struct])
(require '[com.google.cloud.spanner.StructReader])
(require '[com.google.cloud.spanner.TimestampBound$Mode])
(require '[com.google.cloud.spanner.TimestampBound])
(require '[com.google.cloud.spanner.TransactionContext])
(require '[com.google.cloud.spanner.TransactionManager$TransactionState])
(require '[com.google.cloud.spanner.TransactionManager])
(require '[com.google.cloud.spanner.TransactionRunner$TransactionCallable])
(require '[com.google.cloud.spanner.TransactionRunner])
(require '[com.google.cloud.spanner.Type$Code])
(require '[com.google.cloud.spanner.Type$StructField])
(require '[com.google.cloud.spanner.Type])
(require '[com.google.cloud.spanner.Value])
(require '[com.google.cloud.spanner.ValueBinder])
