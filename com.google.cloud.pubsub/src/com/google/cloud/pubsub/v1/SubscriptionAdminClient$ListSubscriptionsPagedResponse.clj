(ns com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminClient$ListSubscriptionsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SubscriptionAdminClient$ListSubscriptionsPagedResponse/createAsync context future-response)))

