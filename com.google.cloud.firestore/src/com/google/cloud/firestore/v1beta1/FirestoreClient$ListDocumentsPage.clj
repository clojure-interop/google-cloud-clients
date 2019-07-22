(ns com.google.cloud.firestore.v1beta1.FirestoreClient$ListDocumentsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.v1beta1 FirestoreClient$ListDocumentsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.firestore.v1beta1.FirestoreClient$ListDocumentsPage>`"
  (^com.google.api.core.ApiFuture [^FirestoreClient$ListDocumentsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

