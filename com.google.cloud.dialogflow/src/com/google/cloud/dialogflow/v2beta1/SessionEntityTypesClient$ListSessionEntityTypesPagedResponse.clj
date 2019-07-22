(ns com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 SessionEntityTypesClient$ListSessionEntityTypesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SessionEntityTypesClient$ListSessionEntityTypesPagedResponse/createAsync context future-response)))

