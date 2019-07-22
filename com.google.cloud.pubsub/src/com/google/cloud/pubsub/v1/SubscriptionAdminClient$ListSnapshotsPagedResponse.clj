(ns com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminClient$ListSnapshotsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (SubscriptionAdminClient$ListSnapshotsPagedResponse/createAsync context future-response)))

