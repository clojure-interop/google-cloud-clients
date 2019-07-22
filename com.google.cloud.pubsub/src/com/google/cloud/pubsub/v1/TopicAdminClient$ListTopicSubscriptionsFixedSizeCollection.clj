(ns com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsFixedSizeCollection
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient$ListTopicSubscriptionsFixedSizeCollection]))

(defn get-values-as-project-subscription-name
  "returns: `java.lang.Iterable<com.google.pubsub.v1.ProjectSubscriptionName>`"
  (^java.lang.Iterable [^TopicAdminClient$ListTopicSubscriptionsFixedSizeCollection this]
    (-> this (.getValuesAsProjectSubscriptionName))))

