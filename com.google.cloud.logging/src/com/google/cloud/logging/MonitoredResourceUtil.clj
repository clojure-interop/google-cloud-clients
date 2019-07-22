(ns com.google.cloud.logging.MonitoredResourceUtil
  "Monitored resource construction utilities to detect resource type and add labels. Used by logging
  framework adapters to configure default resource. See usage in LoggingHandler."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging MonitoredResourceUtil]))

(defn *get-resource
  "project-id - `java.lang.String`
  resource-type-param - `java.lang.String`

  returns: `com.google.cloud.MonitoredResource`"
  (^com.google.cloud.MonitoredResource [^java.lang.String project-id ^java.lang.String resource-type-param]
    (MonitoredResourceUtil/getResource project-id resource-type-param)))

(defn *get-resource-enhancers
  "Returns custom log entry enhancers (if available) for resource type.

  returns: custom log entry enhancers - `java.util.List<com.google.cloud.logging.LoggingEnhancer>`"
  (^java.util.List []
    (MonitoredResourceUtil/getResourceEnhancers )))

