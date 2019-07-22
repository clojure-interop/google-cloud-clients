(ns com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 NotificationChannelServiceClient$ListNotificationChannelsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPage>`"
  (^com.google.api.core.ApiFuture [^NotificationChannelServiceClient$ListNotificationChannelsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

