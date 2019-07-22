(ns com.google.cloud.notification.Notification
  "An interface for Pub/Sub Notifications in Google Cloud Storage.

  This is a light wrapper around a Storage client."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.notification Notification]))

(defn create
  "storage - `com.google.cloud.storage.Storage`

  returns: `com.google.cloud.notification.Notification`"
  (^com.google.cloud.notification.Notification [^Notification this ^com.google.cloud.storage.Storage storage]
    (-> this (.create storage))))

(defn delete-notification
  "bucket - `java.lang.String`
  notification - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Notification this ^java.lang.String bucket ^java.lang.String notification]
    (-> this (.deleteNotification bucket notification))))

(defn list-notifications
  "bucket - `java.lang.String`

  returns: `java.util.List<com.google.cloud.notification.NotificationInfo>`"
  (^java.util.List [^Notification this ^java.lang.String bucket]
    (-> this (.listNotifications bucket))))

(defn create-notification
  "bucket - `java.lang.String`
  notification - `com.google.cloud.notification.NotificationInfo`

  returns: `com.google.cloud.notification.NotificationInfo`"
  (^com.google.cloud.notification.NotificationInfo [^Notification this ^java.lang.String bucket ^com.google.cloud.notification.NotificationInfo notification]
    (-> this (.createNotification bucket notification))))

