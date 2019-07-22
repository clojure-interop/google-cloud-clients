(ns com.google.cloud.notification.NotificationInfo
  "Google Storage Notification metadata;"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.notification NotificationInfo]))

(defn *of
  "Creates a NotificationInfo object for the provided topic name.

  topic - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.cloud.notification.NotificationInfo`"
  (^com.google.cloud.notification.NotificationInfo [^com.google.pubsub.v1.ProjectTopicName topic]
    (NotificationInfo/of topic)))

(defn *new-builder
  "Returns a NotificationInfo builder where the topic's name is set to the provided name.

  topic - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^com.google.pubsub.v1.ProjectTopicName topic]
    (NotificationInfo/newBuilder topic)))

(defn get-custom-attributes
  "Returns the list of additional attributes to attach to each Cloud PubSub message published for\\
   this notification subscription.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^NotificationInfo this]
    (-> this (.getCustomAttributes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NotificationInfo this]
    (-> this (.toString))))

(defn get-event-types
  "Returns the list of event types that this notification will apply to. If empty, notifications
   will be sent on all event types.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NotificationInfo this]
    (-> this (.getEventTypes))))

(defn get-etag
  "Returns HTTP 1.1 Entity tag for the notification.

  returns: `java.lang.String`"
  (^java.lang.String [^NotificationInfo this]
    (-> this (.getEtag))))

(defn get-self-link
  "Returns the canonical URI of this topic as a string.

  returns: `java.lang.String`"
  (^java.lang.String [^NotificationInfo this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NotificationInfo this]
    (-> this (.hashCode))))

(defn get-topic
  "Returns the Cloud PubSub topic to which this subscription publishes.

  returns: `com.google.pubsub.v1.ProjectTopicName`"
  (^com.google.pubsub.v1.ProjectTopicName [^NotificationInfo this]
    (-> this (.getTopic))))

(defn get-generated-id
  "Returns the service-generated id for the notification.

  returns: `java.lang.String`"
  (^java.lang.String [^NotificationInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NotificationInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-object-name-prefix
  "Returns the object name prefix for which this notification configuration applies.

  returns: `java.lang.String`"
  (^java.lang.String [^NotificationInfo this]
    (-> this (.getObjectNamePrefix))))

(defn to-builder
  "Returns a builder for the current notification.

  returns: `com.google.cloud.notification.NotificationInfo$Builder`"
  (^com.google.cloud.notification.NotificationInfo$Builder [^NotificationInfo this]
    (-> this (.toBuilder))))

(defn get-payload-format
  "Returns the desired content of the Payload.

  returns: `com.google.cloud.notification.NotificationInfo$PayloadFormat`"
  (^com.google.cloud.notification.NotificationInfo$PayloadFormat [^NotificationInfo this]
    (-> this (.getPayloadFormat))))

