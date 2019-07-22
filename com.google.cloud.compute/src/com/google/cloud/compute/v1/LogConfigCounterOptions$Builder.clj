(ns com.google.cloud.compute.v1.LogConfigCounterOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigCounterOptions$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LogConfigCounterOptions`

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^LogConfigCounterOptions$Builder this ^com.google.cloud.compute.v1.LogConfigCounterOptions other]
    (-> this (.mergeFrom other))))

(defn get-field
  "The field value to attribute.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCounterOptions$Builder this]
    (-> this (.getField))))

(defn set-field
  "The field value to attribute.

  field - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^LogConfigCounterOptions$Builder this ^java.lang.String field]
    (-> this (.setField field))))

(defn get-metric
  "The metric to update.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCounterOptions$Builder this]
    (-> this (.getMetric))))

(defn set-metric
  "The metric to update.

  metric - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^LogConfigCounterOptions$Builder this ^java.lang.String metric]
    (-> this (.setMetric metric))))

(defn build
  "returns: `com.google.cloud.compute.v1.LogConfigCounterOptions`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions [^LogConfigCounterOptions$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^LogConfigCounterOptions$Builder this]
    (-> this (.clone))))

