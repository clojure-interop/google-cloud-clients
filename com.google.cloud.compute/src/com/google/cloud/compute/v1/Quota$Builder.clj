(ns com.google.cloud.compute.v1.Quota$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Quota$Builder]))

(defn set-owner
  "[Output Only] Owning resource. This is the resource on which this quota is applied.

  owner - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this ^java.lang.String owner]
    (-> this (.setOwner owner))))

(defn get-metric
  "[Output Only] Name of the quota metric.

  returns: `java.lang.String`"
  (^java.lang.String [^Quota$Builder this]
    (-> this (.getMetric))))

(defn get-usage
  "[Output Only] Current usage of this metric.

  returns: `java.lang.Double`"
  (^java.lang.Double [^Quota$Builder this]
    (-> this (.getUsage))))

(defn build
  "returns: `com.google.cloud.compute.v1.Quota`"
  (^com.google.cloud.compute.v1.Quota [^Quota$Builder this]
    (-> this (.build))))

(defn set-metric
  "[Output Only] Name of the quota metric.

  metric - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this ^java.lang.String metric]
    (-> this (.setMetric metric))))

(defn get-owner
  "[Output Only] Owning resource. This is the resource on which this quota is applied.

  returns: `java.lang.String`"
  (^java.lang.String [^Quota$Builder this]
    (-> this (.getOwner))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Quota`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this ^com.google.cloud.compute.v1.Quota other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this]
    (-> this (.clone))))

(defn set-usage
  "[Output Only] Current usage of this metric.

  usage - `java.lang.Double`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this ^java.lang.Double usage]
    (-> this (.setUsage usage))))

(defn set-limit
  "[Output Only] Quota limit for this metric.

  limit - `java.lang.Double`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota$Builder this ^java.lang.Double limit]
    (-> this (.setLimit limit))))

(defn get-limit
  "[Output Only] Quota limit for this metric.

  returns: `java.lang.Double`"
  (^java.lang.Double [^Quota$Builder this]
    (-> this (.getLimit))))

