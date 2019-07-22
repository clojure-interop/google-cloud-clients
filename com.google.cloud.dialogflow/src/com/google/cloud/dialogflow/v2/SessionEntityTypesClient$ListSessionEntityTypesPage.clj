(ns com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 SessionEntityTypesClient$ListSessionEntityTypesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPage>`"
  (^com.google.api.core.ApiFuture [^SessionEntityTypesClient$ListSessionEntityTypesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

