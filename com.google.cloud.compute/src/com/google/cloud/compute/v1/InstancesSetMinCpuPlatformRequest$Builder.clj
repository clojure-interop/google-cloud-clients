(ns com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMinCpuPlatformRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder [^InstancesSetMinCpuPlatformRequest$Builder this ^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest other]
    (-> this (.mergeFrom other))))

(defn get-min-cpu-platform
  "Minimum cpu/platform this instance should be started at.

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMinCpuPlatformRequest$Builder this]
    (-> this (.getMinCpuPlatform))))

(defn set-min-cpu-platform
  "Minimum cpu/platform this instance should be started at.

  min-cpu-platform - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder [^InstancesSetMinCpuPlatformRequest$Builder this ^java.lang.String min-cpu-platform]
    (-> this (.setMinCpuPlatform min-cpu-platform))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest [^InstancesSetMinCpuPlatformRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder [^InstancesSetMinCpuPlatformRequest$Builder this]
    (-> this (.clone))))

