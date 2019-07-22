(ns com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolInstanceHealth$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolInstanceHealth`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth$Builder this ^com.google.cloud.compute.v1.TargetPoolInstanceHealth other]
    (-> this (.mergeFrom other))))

(defn get-health-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.HealthStatus>`"
  (^java.util.List [^TargetPoolInstanceHealth$Builder this]
    (-> this (.getHealthStatusList))))

(defn add-all-health-status
  "health-status - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth$Builder this ^java.util.List health-status]
    (-> this (.addAllHealthStatus health-status))))

(defn add-health-status
  "health-status - `com.google.cloud.compute.v1.HealthStatus`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth$Builder this ^com.google.cloud.compute.v1.HealthStatus health-status]
    (-> this (.addHealthStatus health-status))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the
   health of an instance.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolInstanceHealth$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the
   health of an instance.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth [^TargetPoolInstanceHealth$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth$Builder this]
    (-> this (.clone))))

