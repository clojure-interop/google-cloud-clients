(ns com.google.cloud.notification.NotificationInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.notification NotificationInfo$Builder]))

(defn set-topic
  "topic - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo$Builder this ^com.google.pubsub.v1.ProjectTopicName topic]
    (-> this (.setTopic topic))))

(defn set-payload-format
  "payload-format - `com.google.cloud.notification.NotificationInfo$PayloadFormat`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo$Builder this ^com.google.cloud.notification.NotificationInfo$PayloadFormat payload-format]
    (-> this (.setPayloadFormat payload-format))))

(defn set-object-name-prefix
  "GcpLaunchStage.Alpha

  object-name-prefix - `java.lang.String`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo$Builder this ^java.lang.String object-name-prefix]
    (-> this (.setObjectNamePrefix object-name-prefix))))

(defn set-event-types
  "event-types - `java.lang.Iterable`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo$Builder this ^java.lang.Iterable event-types]
    (-> this (.setEventTypes event-types))))

(defn set-custom-attributes
  "custom-attributes - `java.util.Map`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo$Builder this ^java.util.Map custom-attributes]
    (-> this (.setCustomAttributes custom-attributes))))

(defn build
  "returns: `com.google.cloud.notification.NotificationInfo`"
  (^com.google.cloud.notification.NotificationInfo [^NotificationInfo$Builder this]
    (-> this (.build))))

