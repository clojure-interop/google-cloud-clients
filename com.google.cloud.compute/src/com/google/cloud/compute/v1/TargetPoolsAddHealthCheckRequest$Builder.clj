(ns com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsAddHealthCheckRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^TargetPoolsAddHealthCheckRequest$Builder this ^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest other]
    (-> this (.mergeFrom other))))

(defn get-health-checks-list
  "The HttpHealthCheck to add to the target pool.

  returns: `java.util.List<com.google.cloud.compute.v1.HealthCheckReference>`"
  (^java.util.List [^TargetPoolsAddHealthCheckRequest$Builder this]
    (-> this (.getHealthChecksList))))

(defn add-all-health-checks
  "The HttpHealthCheck to add to the target pool.

  health-checks - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^TargetPoolsAddHealthCheckRequest$Builder this ^java.util.List health-checks]
    (-> this (.addAllHealthChecks health-checks))))

(defn add-health-checks
  "The HttpHealthCheck to add to the target pool.

  health-checks - `com.google.cloud.compute.v1.HealthCheckReference`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^TargetPoolsAddHealthCheckRequest$Builder this ^com.google.cloud.compute.v1.HealthCheckReference health-checks]
    (-> this (.addHealthChecks health-checks))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest [^TargetPoolsAddHealthCheckRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^TargetPoolsAddHealthCheckRequest$Builder this]
    (-> this (.clone))))

