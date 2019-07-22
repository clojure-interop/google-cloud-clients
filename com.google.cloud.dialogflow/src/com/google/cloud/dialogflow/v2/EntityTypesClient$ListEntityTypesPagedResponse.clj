(ns com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 EntityTypesClient$ListEntityTypesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (EntityTypesClient$ListEntityTypesPagedResponse/createAsync context future-response)))

