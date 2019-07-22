(ns com.google.cloud.compute.v1.LogConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfig$Builder]))

(defn set-cloud-audit
  "Cloud audit options.

  cloud-audit - `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`

  returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig$Builder this ^com.google.cloud.compute.v1.LogConfigCloudAuditOptions cloud-audit]
    (-> this (.setCloudAudit cloud-audit))))

(defn set-data-access
  "Data access options.

  data-access - `com.google.cloud.compute.v1.LogConfigDataAccessOptions`

  returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig$Builder this ^com.google.cloud.compute.v1.LogConfigDataAccessOptions data-access]
    (-> this (.setDataAccess data-access))))

(defn get-counter
  "Counter options.

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions [^LogConfig$Builder this]
    (-> this (.getCounter))))

(defn get-cloud-audit
  "Cloud audit options.

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions [^LogConfig$Builder this]
    (-> this (.getCloudAudit))))

(defn build
  "returns: `com.google.cloud.compute.v1.LogConfig`"
  (^com.google.cloud.compute.v1.LogConfig [^LogConfig$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LogConfig`

  returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig$Builder this ^com.google.cloud.compute.v1.LogConfig other]
    (-> this (.mergeFrom other))))

(defn get-data-access
  "Data access options.

  returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions [^LogConfig$Builder this]
    (-> this (.getDataAccess))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig$Builder this]
    (-> this (.clone))))

(defn set-counter
  "Counter options.

  counter - `com.google.cloud.compute.v1.LogConfigCounterOptions`

  returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig$Builder this ^com.google.cloud.compute.v1.LogConfigCounterOptions counter]
    (-> this (.setCounter counter))))

