(ns com.google.cloud.logging.SinkInfo$Builder
  "A builder for SinkInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Builder]))

(defn ->builder
  "Constructor."
  (^SinkInfo$Builder []
    (new SinkInfo$Builder )))

(defn set-name
  "Sets the name of the sink. Example: my-severe-errors-to-pubsub. Sink identifiers are
   limited to 1000 characters and can include only the following characters: A-Z, a-z, 0-9, and the special characters _-..

  name - `java.lang.String`

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^SinkInfo$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-destination
  "Sets the export destination. Use a SinkInfo.Destination.BucketDestination object to create a
   sink that exports logs to a Google Cloud Storage bucket. Use a SinkInfo.Destination.DatasetDestination object to create a sink that exports logs to a Google Cloud
   BigQuery dataset. Use a SinkInfo.Destination.TopicDestination object to create a sink that
   exports logs to a Google Cloud Pub/Sub topic.

  destination - `com.google.cloud.logging.SinkInfo$Destination`

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^SinkInfo$Builder this ^com.google.cloud.logging.SinkInfo$Destination destination]
    (-> this (.setDestination destination))))

(defn set-filter
  "Sets an advanced logs filter. Only log entries matching that filter are exported. The filter
   must be consistent with the log entry format specified with #setVersionFormat(VersionFormat), regardless of the format of the log entry that was
   originally written to Stackdriver Logging. Example (V2 format): logName=projects/my-projectid/logs/syslog AND severity>=ERROR.

  filter - `java.lang.String`

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^SinkInfo$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn set-version-format
  "Sets the log entry version to use for this sink's exported log entries. This version does not
   have to correspond to the version of the log entry when it was written to Google Cloud
   Logging.

  version-format - `com.google.cloud.logging.SinkInfo$VersionFormat`

  returns: `com.google.cloud.logging.SinkInfo$Builder`"
  (^com.google.cloud.logging.SinkInfo$Builder [^SinkInfo$Builder this ^com.google.cloud.logging.SinkInfo$VersionFormat version-format]
    (-> this (.setVersionFormat version-format))))

(defn build
  "Creates a SinkInfo object for this builder.

  returns: `com.google.cloud.logging.SinkInfo`"
  (^com.google.cloud.logging.SinkInfo [^SinkInfo$Builder this]
    (-> this (.build))))

