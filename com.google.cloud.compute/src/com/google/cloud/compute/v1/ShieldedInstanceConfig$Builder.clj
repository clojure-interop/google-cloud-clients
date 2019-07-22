(ns com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceConfig$Builder]))

(defn set-enable-integrity-monitoring
  "Defines whether the instance has integrity monitoring enabled.

  enable-integrity-monitoring - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig$Builder this ^java.lang.Boolean enable-integrity-monitoring]
    (-> this (.setEnableIntegrityMonitoring enable-integrity-monitoring))))

(defn get-enable-integrity-monitoring?
  "Defines whether the instance has integrity monitoring enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig$Builder this]
    (-> this (.getEnableIntegrityMonitoring))))

(defn set-enable-vtpm
  "Defines whether the instance has the vTPM enabled.

  enable-vtpm - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig$Builder this ^java.lang.Boolean enable-vtpm]
    (-> this (.setEnableVtpm enable-vtpm))))

(defn get-enable-secure-boot?
  "Defines whether the instance has Secure Boot enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig$Builder this]
    (-> this (.getEnableSecureBoot))))

(defn build
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig [^ShieldedInstanceConfig$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ShieldedInstanceConfig`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceConfig other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig$Builder this]
    (-> this (.clone))))

(defn set-enable-secure-boot
  "Defines whether the instance has Secure Boot enabled.

  enable-secure-boot - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig$Builder this ^java.lang.Boolean enable-secure-boot]
    (-> this (.setEnableSecureBoot enable-secure-boot))))

(defn get-enable-vtpm?
  "Defines whether the instance has the vTPM enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig$Builder this]
    (-> this (.getEnableVtpm))))

