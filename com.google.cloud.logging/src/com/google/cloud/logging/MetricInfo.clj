(ns com.google.cloud.logging.MetricInfo
  "Stackdriver Logging metrics describe logs-based metric. The value of the metric is the number of
  log entries that match a logs filter (see getFilter())."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging MetricInfo]))

(defn *new-builder
  "Returns a builder for MetricInfo objects given the name of the metric and its filter.

  name - `java.lang.String`
  filter - `java.lang.String`

  returns: `com.google.cloud.logging.MetricInfo$Builder`"
  (^com.google.cloud.logging.MetricInfo$Builder [^java.lang.String name ^java.lang.String filter]
    (MetricInfo/newBuilder name filter)))

(defn *of
  "Creates a MetricInfo object given the name of the metric and its filter.

  name - `java.lang.String`
  filter - `java.lang.String`

  returns: `com.google.cloud.logging.MetricInfo`"
  (^com.google.cloud.logging.MetricInfo [^java.lang.String name ^java.lang.String filter]
    (MetricInfo/of name filter)))

(defn get-name
  "Returns the name of the metric. Example: severe-errors. Metric identifiers are limited
   to 1000 characters and can include only the following characters: A-Z, a-z,
   0-9, and the special characters _-.,+!*',()%/\\. The forward-slash character
   (/) denotes a hierarchy of name pieces, and it cannot be the first character of the
   name.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricInfo this]
    (-> this (.getName))))

(defn get-description
  "Returns an optional description for this metric. Used for documentation purpose.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricInfo this]
    (-> this (.getDescription))))

(defn get-filter
  "Returns an advanced logs filter. The value of the metric is the number of log entries that
   match this filter. Example: logName=projects/my-projectid/logs/syslog AND
   severity>=ERROR.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricInfo this]
    (-> this (.getFilter))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MetricInfo this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MetricInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MetricInfo this]
    (-> this (.hashCode))))

(defn to-builder
  "Returns a builder for this MetricInfo object.

  returns: `com.google.cloud.logging.MetricInfo$Builder`"
  (^com.google.cloud.logging.MetricInfo$Builder [^MetricInfo this]
    (-> this (.toBuilder))))

