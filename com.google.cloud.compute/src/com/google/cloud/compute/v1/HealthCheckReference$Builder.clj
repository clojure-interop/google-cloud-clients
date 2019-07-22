(ns com.google.cloud.compute.v1.HealthCheckReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheckReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HealthCheckReference`

  returns: `com.google.cloud.compute.v1.HealthCheckReference$Builder`"
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder [^HealthCheckReference$Builder this ^com.google.cloud.compute.v1.HealthCheckReference other]
    (-> this (.mergeFrom other))))

(defn get-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthCheckReference$Builder this]
    (-> this (.getHealthCheck))))

(defn set-health-check
  "health-check - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthCheckReference$Builder`"
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder [^HealthCheckReference$Builder this ^java.lang.String health-check]
    (-> this (.setHealthCheck health-check))))

(defn build
  "returns: `com.google.cloud.compute.v1.HealthCheckReference`"
  (^com.google.cloud.compute.v1.HealthCheckReference [^HealthCheckReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HealthCheckReference$Builder`"
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder [^HealthCheckReference$Builder this]
    (-> this (.clone))))

