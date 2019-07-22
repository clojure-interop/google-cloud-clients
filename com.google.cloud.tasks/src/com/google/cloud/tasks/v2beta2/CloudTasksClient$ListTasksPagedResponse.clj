(ns com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta2 CloudTasksClient$ListTasksPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (CloudTasksClient$ListTasksPagedResponse/createAsync context future-response)))

