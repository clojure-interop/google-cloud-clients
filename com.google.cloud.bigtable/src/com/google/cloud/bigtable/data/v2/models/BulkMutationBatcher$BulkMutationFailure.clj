(ns com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher$BulkMutationFailure
  "Thrown when at least one mutation failed in a batch.

  Note that this exception only tracks that some item failed, it is the callers responsibility
  to track the results of the ApiFutures to figure out which item failed."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models BulkMutationBatcher$BulkMutationFailure]))

