(ns com.google.cloud.bigtable.data.v2.models.MutateRowsException
  "Thrown by the MutateRows when at least one Mutation failed. If the last failure was caused by an
  RPC error (as opposed to a single entry failing), then this exception's cause will be set to that
  error and getFailedMutations() will contain synthetic errors for all of the entries that
  were part of that RPC."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models MutateRowsException]))

(defn ->mutate-rows-exception
  "Constructor.

  This constructor is considered an internal implementation detail and not meant to be used by
   applications.

  rpc-error - `java.lang.Throwable`
  failed-mutations - `java.util.List`
  retryable - `boolean`"
  (^MutateRowsException [^java.lang.Throwable rpc-error ^java.util.List failed-mutations ^Boolean retryable]
    (new MutateRowsException rpc-error failed-mutations retryable)))

(defn get-failed-mutations
  "Retrieve all of the failed mutations. This list will contain failures for all of the mutations
   that have failed across all of the retry attempts so far.

  returns: `java.util.List<com.google.cloud.bigtable.data.v2.models.MutateRowsException$FailedMutation>`"
  (^java.util.List [^MutateRowsException this]
    (-> this (.getFailedMutations))))

