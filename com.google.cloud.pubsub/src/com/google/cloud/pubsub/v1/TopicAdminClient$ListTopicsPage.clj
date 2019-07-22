(ns com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient$ListTopicsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPage>`"
  (^com.google.api.core.ApiFuture [^TopicAdminClient$ListTopicsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

