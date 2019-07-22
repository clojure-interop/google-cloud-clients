(ns com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta2 CloudTasksClient$ListQueuesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (CloudTasksClient$ListQueuesPagedResponse/createAsync context future-response)))

