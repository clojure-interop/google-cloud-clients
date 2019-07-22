(ns com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 ContextsClient$ListContextsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPage>`"
  (^com.google.api.core.ApiFuture [^ContextsClient$ListContextsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

