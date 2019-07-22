(ns com.google.cloud.logging.SinkInfo$Destination$TopicDestination
  "Class for specifying a Google Cloud BigQuery dataset as destination for the sink."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Destination$TopicDestination]))

(defn *of
  "Creates a TopicDestination object given the name of the project and topic to be
   used as sink destination.

  project - `java.lang.String`
  topic - `java.lang.String`

  returns: `com.google.cloud.logging.SinkInfo$Destination$TopicDestination`"
  (^com.google.cloud.logging.SinkInfo$Destination$TopicDestination [^java.lang.String project ^java.lang.String topic]
    (SinkInfo$Destination$TopicDestination/of project topic))
  (^com.google.cloud.logging.SinkInfo$Destination$TopicDestination [^java.lang.String topic]
    (SinkInfo$Destination$TopicDestination/of topic)))

(defn get-project
  "Returns the name of the project where the Google Cloud Pub/Sub topic resides. If null, the default project is used.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$TopicDestination this]
    (-> this (.getProject))))

(defn get-topic
  "Returns the name of the Google Cloud Pub/Sub topic this destination represents.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$TopicDestination this]
    (-> this (.getTopic))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SinkInfo$Destination$TopicDestination this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SinkInfo$Destination$TopicDestination this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$TopicDestination this]
    (-> this (.toString))))

