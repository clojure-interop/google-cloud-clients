(ns com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminClient$ListSubscriptionsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPage>`"
  (^com.google.api.core.ApiFuture [^SubscriptionAdminClient$ListSubscriptionsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

