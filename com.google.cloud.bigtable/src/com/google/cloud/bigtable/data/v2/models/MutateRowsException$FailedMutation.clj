(ns com.google.cloud.bigtable.data.v2.models.MutateRowsException$FailedMutation
  "Identifies which mutation failed and the reason it failed. The mutation is identified by it's
  index in the original request's MutateRowsRequest.getEntriesList()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models MutateRowsException$FailedMutation]))

(defn ->failed-mutation
  "Constructor."
  (^MutateRowsException$FailedMutation []
    (new MutateRowsException$FailedMutation )))

(defn *create
  "This method is considered an internal implementation detail and not meant to be used by
   applications.

  index - `int`
  error - `com.google.api.gax.rpc.ApiException`

  returns: `com.google.cloud.bigtable.data.v2.models.MutateRowsException$FailedMutation`"
  (^com.google.cloud.bigtable.data.v2.models.MutateRowsException$FailedMutation [^Integer index ^com.google.api.gax.rpc.ApiException error]
    (MutateRowsException$FailedMutation/create index error)))

(defn get-index
  "The index of the mutation in the original request's MutateRowsRequest.getEntriesList().

  returns: `int`"
  (^Integer [^MutateRowsException$FailedMutation this]
    (-> this (.getIndex))))

(defn get-error
  "The error that prevented this mutation from being applied. Please note, that if the entire
   RPC attempt failed, all mutations that were part of the attempt will have take on the same
   error.

  returns: `com.google.api.gax.rpc.ApiException`"
  (^com.google.api.gax.rpc.ApiException [^MutateRowsException$FailedMutation this]
    (-> this (.getError))))

