(ns com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1 FirestoreAdminClient$ListFieldsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.firestore.v1.FirestoreAdminClient$ListFieldsPage>`"
  (^com.google.api.core.ApiFuture [^FirestoreAdminClient$ListFieldsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

