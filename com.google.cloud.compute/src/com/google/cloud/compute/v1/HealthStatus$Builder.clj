(ns com.google.cloud.compute.v1.HealthStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthStatus$Builder]))

(defn set-health-state
  "Health state of the instance.

  health-state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this ^java.lang.String health-state]
    (-> this (.setHealthState health-state))))

(defn get-ip-address
  "The IP address represented by this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus$Builder this]
    (-> this (.getIpAddress))))

(defn get-instance
  "URL of the instance resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus$Builder this]
    (-> this (.getInstance))))

(defn build
  "returns: `com.google.cloud.compute.v1.HealthStatus`"
  (^com.google.cloud.compute.v1.HealthStatus [^HealthStatus$Builder this]
    (-> this (.build))))

(defn set-port
  "The port on the instance.

  port - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this ^java.lang.Integer port]
    (-> this (.setPort port))))

(defn set-ip-address
  "The IP address represented by this resource.

  ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this ^java.lang.String ip-address]
    (-> this (.setIpAddress ip-address))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HealthStatus`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this ^com.google.cloud.compute.v1.HealthStatus other]
    (-> this (.mergeFrom other))))

(defn set-instance
  "URL of the instance resource.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn get-port
  "The port on the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthStatus$Builder this]
    (-> this (.getPort))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus$Builder this]
    (-> this (.clone))))

(defn get-health-state
  "Health state of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus$Builder this]
    (-> this (.getHealthState))))

