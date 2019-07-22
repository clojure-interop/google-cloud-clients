(ns com.google.cloud.logging.MetricInfo$Builder
  "A builder for MetricInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging MetricInfo$Builder]))

(defn set-name
  "Sets the name of the metric. Example: severe-errors. Metric identifiers are limited
   to 1000 characters and can include only the following characters: A-Z, a-z,
   0-9, and the special characters _-.,+!*',()%/\\. The forward-slash character
   (/) denotes a hierarchy of name pieces, and it cannot be the first character of the
   name.

  name - `java.lang.String`

  returns: `com.google.cloud.logging.MetricInfo$Builder`"
  (^com.google.cloud.logging.MetricInfo$Builder [^MetricInfo$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-description
  "Sets an optional description for this metric. Used for documentation purpose.

  description - `java.lang.String`

  returns: `com.google.cloud.logging.MetricInfo$Builder`"
  (^com.google.cloud.logging.MetricInfo$Builder [^MetricInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-filter
  "Sets an advanced logs filter. The value of the metric is the number of log entries that match
   this filter. Example: logName=projects/my-projectid/logs/syslog AND severity>=ERROR.

  filter - `java.lang.String`

  returns: `com.google.cloud.logging.MetricInfo$Builder`"
  (^com.google.cloud.logging.MetricInfo$Builder [^MetricInfo$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn build
  "Creates a MetricInfo object for this builder.

  returns: `com.google.cloud.logging.MetricInfo`"
  (^com.google.cloud.logging.MetricInfo [^MetricInfo$Builder this]
    (-> this (.build))))

