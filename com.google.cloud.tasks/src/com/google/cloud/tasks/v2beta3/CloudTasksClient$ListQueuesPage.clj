(ns com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta3 CloudTasksClient$ListQueuesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPage>`"
  (^com.google.api.core.ApiFuture [^CloudTasksClient$ListQueuesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

