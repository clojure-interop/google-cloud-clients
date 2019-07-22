(ns com.google.cloud.bigtable.data.v2.models.BulkMutation
  "Represents a list of mutations for multiple rows. Each mutation contains multiple changes that
  will be atomically applied to each row. However, ordering between rows is not guaranteed.

  This class is meant for manual batching, while BulkMutationBatcher is meant for
  automatic batching with flow control."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models BulkMutation]))

(defn *create
  "table-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.BulkMutation`"
  (^com.google.cloud.bigtable.data.v2.models.BulkMutation [^java.lang.String table-id]
    (BulkMutation/create table-id)))

(defn add
  "Add mutation for a particular row. The changes in the mutation will be applied atomically.
   However there is no guarantees about the relative ordering between mutations affecting
   different rows.

  row-key - `java.lang.String`
  mutation - `com.google.cloud.bigtable.data.v2.models.Mutation`

  returns: `com.google.cloud.bigtable.data.v2.models.BulkMutation`"
  (^com.google.cloud.bigtable.data.v2.models.BulkMutation [^BulkMutation this ^java.lang.String row-key ^com.google.cloud.bigtable.data.v2.models.Mutation mutation]
    (-> this (.add row-key mutation))))

(defn to-proto
  "request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.MutateRowsRequest`"
  (^com.google.bigtable.v2.MutateRowsRequest [^BulkMutation this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toProto request-context))))

