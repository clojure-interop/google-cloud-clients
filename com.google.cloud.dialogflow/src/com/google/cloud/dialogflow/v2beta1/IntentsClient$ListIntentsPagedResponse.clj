(ns com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 IntentsClient$ListIntentsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (IntentsClient$ListIntentsPagedResponse/createAsync context future-response)))

