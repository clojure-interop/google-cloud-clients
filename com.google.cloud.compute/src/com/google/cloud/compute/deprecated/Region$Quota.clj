(ns com.google.cloud.compute.deprecated.Region$Quota
  "A quota assigned to this region."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Region$Quota]))

(defn get-metric
  "Returns the name of the quota metric.

  returns: `java.lang.String`"
  (^java.lang.String [^Region$Quota this]
    (-> this (.getMetric))))

(defn get-limit
  "Returns the quota limit for this metric.

  returns: `double`"
  (^Double [^Region$Quota this]
    (-> this (.getLimit))))

(defn get-usage
  "Returns the current usage for this quota.

  returns: `double`"
  (^Double [^Region$Quota this]
    (-> this (.getUsage))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Region$Quota this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Region$Quota this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Region$Quota this ^java.lang.Object obj]
    (-> this (.equals obj))))

