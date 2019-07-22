(ns com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient$ListTopicsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (TopicAdminClient$ListTopicsPagedResponse/createAsync context future-response)))

