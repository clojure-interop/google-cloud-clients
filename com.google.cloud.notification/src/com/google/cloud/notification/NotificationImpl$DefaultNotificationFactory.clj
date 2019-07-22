(ns com.google.cloud.notification.NotificationImpl$DefaultNotificationFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.notification NotificationImpl$DefaultNotificationFactory]))

(defn ->default-notification-factory
  "Constructor."
  (^NotificationImpl$DefaultNotificationFactory []
    (new NotificationImpl$DefaultNotificationFactory )))

(defn create
  "storage - `com.google.cloud.storage.Storage`

  returns: `com.google.cloud.notification.Notification`"
  (^com.google.cloud.notification.Notification [^NotificationImpl$DefaultNotificationFactory this ^com.google.cloud.storage.Storage storage]
    (-> this (.create storage))))

