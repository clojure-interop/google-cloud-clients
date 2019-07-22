(ns com.google.cloud.logging.SinkInfo
  "Stackdriver Logging sinks can be used to control the export of your logs. Each sink specifies the
  export of a set of log entries to a certain destination. A sink consists of a name, unique to the
  project, a filter for choosing the log entries to export and a destination for the log entries.

  Sink destination can either be a Google Cloud Storage bucket (see SinkInfo.Destination.BucketDestination, a Google Cloud BigQuery dataset (see SinkInfo.Destination.DatasetDestination) or a Google Cloud Pub/Sub topic (see SinkInfo.Destination.TopicDestination)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo]))

(defn *new-builder
  "Returns a builder for SinkInfo objects given the name of the sink and its destination.

  name - `java.lang.String`
  destination - `com.google.cloud.logging.SinkInfo$Destination`

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^java.lang.String name ^com.google.cloud.logging.SinkInfo$Destination destination]
    (SinkInfo/newBuilder name destination)))

(defn *of
  "Creates a SinkInfo object given the name of the sink and its destination.

  name - `java.lang.String`
  destination - `com.google.cloud.logging.SinkInfo$Destination`

  returns: `com.google.cloud.logging.SinkInfo`"
  (^com.google.cloud.logging.SinkInfo [^java.lang.String name ^com.google.cloud.logging.SinkInfo$Destination destination]
    (SinkInfo/of name destination)))

(defn get-name
  "Returns the name of the sink. Example: my-severe-errors-to-pubsub. Sink identifiers are
   limited to 1000 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-..

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo this]
    (-> this (.getName))))

(defn get-destination
  "Returns the export destination. This method returns a SinkInfo.Destination.BucketDestination for
   sinks that export logs to Google Cloud Storage buckets. Returns SinkInfo.Destination.DatasetDestination for sinks that export logs to Google Cloud BigQuery datasets.
   Returns SinkInfo.Destination.TopicDestination for sinks that export logs to Google Cloud Pub/Sub
   topics.

  returns: `<T extends com.google.cloud.logging.SinkInfo$Destination> T`"
  ([^SinkInfo this]
    (-> this (.getDestination))))

(defn get-filter
  "Returns an advanced logs filter. Only log entries matching that filter are exported. The filter
   must be consistent with the log entry format specified in getVersionFormat(),
   regardless of the format of the log entry that wa originally written to Stackdriver Logging.
   Example (V2 format): logName=projects/my-projectid/logs/syslog AND severity>=ERROR.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo this]
    (-> this (.getFilter))))

(defn get-version-format
  "Returns the log entry version to use for this sink's exported log entries. This version does
   not have to correspond to the version of the log entry when it was written to Google Cloud
   Logging.

  returns: `com.google.cloud.logging.SinkInfo$VersionFormat`"
  (^com.google.cloud.logging.SinkInfo$VersionFormat [^SinkInfo this]
    (-> this (.getVersionFormat))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SinkInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SinkInfo this]
    (-> this (.hashCode))))

(defn to-builder
  "Returns a builder for this SinkInfo object.

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^SinkInfo this]
    (-> this (.toBuilder))))

