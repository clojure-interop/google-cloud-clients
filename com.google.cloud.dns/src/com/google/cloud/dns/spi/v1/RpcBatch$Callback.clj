(ns com.google.cloud.dns.spi.v1.RpcBatch$Callback
  "An interface for batch callbacks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 RpcBatch$Callback]))

(defn on-success
  "This method will be called upon success of the batch operation.

  response - `T`"
  ([^RpcBatch$Callback this response]
    (-> this (.onSuccess response))))

(defn on-failure
  "This method will be called upon failure of the batch operation.

  google-json-error - `com.google.api.client.googleapis.json.GoogleJsonError`"
  ([^RpcBatch$Callback this ^com.google.api.client.googleapis.json.GoogleJsonError google-json-error]
    (-> this (.onFailure google-json-error))))

