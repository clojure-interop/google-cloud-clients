(ns com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient$ListTopicSubscriptionsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (TopicAdminClient$ListTopicSubscriptionsPagedResponse/createAsync context future-response)))

(defn iterate-all-as-project-subscription-name
  "returns: `java.lang.Iterable<com.google.pubsub.v1.ProjectSubscriptionName>`"
  (^java.lang.Iterable [^TopicAdminClient$ListTopicSubscriptionsPagedResponse this]
    (-> this (.iterateAllAsProjectSubscriptionName))))

