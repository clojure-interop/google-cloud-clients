(ns com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreAdminClient$ListIndexesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.firestore.v1.FirestoreAdminClient$ListIndexesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (FirestoreAdminClient$ListIndexesPagedResponse/createAsync context future-response)))

