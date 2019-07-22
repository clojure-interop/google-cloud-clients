(ns com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher
  "Tracker for outstanding bulk mutations. Allows for the caller to wait for all of the outstanding
  mutations to complete."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models BulkMutationBatcher]))

(defn ->bulk-mutation-batcher
  "Constructor.

  callable - `com.google.api.gax.rpc.UnaryCallable`"
  (^BulkMutationBatcher [^com.google.api.gax.rpc.UnaryCallable callable]
    (new BulkMutationBatcher callable)))

(defn close
  "Prevents further mutations and waits for all outstanding mutations to complete.

  duration - `org.threeten.bp.Duration`

  throws: com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher$BulkMutationFailure - If any mutations failed."
  ([^BulkMutationBatcher this ^org.threeten.bp.Duration duration]
    (-> this (.close duration)))
  ([^BulkMutationBatcher this]
    (-> this (.close))))

(defn add
  "Queues the mutation to be batched and sent. Please note that the order of mutations is not
   guaranteed.

  row-mutation - `com.google.cloud.bigtable.data.v2.models.RowMutation`

  returns: `com.google.api.core.ApiFuture<java.lang.Void>`

  throws: java.lang.IllegalStateException - If this instance has been closed."
  (^com.google.api.core.ApiFuture [^BulkMutationBatcher this ^com.google.cloud.bigtable.data.v2.models.RowMutation row-mutation]
    (-> this (.add row-mutation))))

