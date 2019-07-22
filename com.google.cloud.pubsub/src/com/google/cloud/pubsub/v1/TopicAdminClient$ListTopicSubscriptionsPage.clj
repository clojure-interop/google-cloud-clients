(ns com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient$ListTopicSubscriptionsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPage>`"
  (^com.google.api.core.ApiFuture [^TopicAdminClient$ListTopicSubscriptionsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

(defn iterate-all-as-project-subscription-name
  "returns: `java.lang.Iterable<com.google.pubsub.v1.ProjectSubscriptionName>`"
  (^java.lang.Iterable [^TopicAdminClient$ListTopicSubscriptionsPage this]
    (-> this (.iterateAllAsProjectSubscriptionName))))

(defn get-values-as-project-subscription-name
  "returns: `java.lang.Iterable<com.google.pubsub.v1.ProjectSubscriptionName>`"
  (^java.lang.Iterable [^TopicAdminClient$ListTopicSubscriptionsPage this]
    (-> this (.getValuesAsProjectSubscriptionName))))

