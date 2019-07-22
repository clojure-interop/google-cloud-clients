(ns com.google.cloud.compute.v1.HealthStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HealthStatus`

  returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^com.google.cloud.compute.v1.HealthStatus prototype]
    (HealthStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.HealthStatus$Builder []
    (HealthStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HealthStatus`"
  (^com.google.cloud.compute.v1.HealthStatus []
    (HealthStatus/getDefaultInstance )))

(defn get-ip-address
  "The IP address represented by this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus this]
    (-> this (.getIpAddress))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HealthStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HealthStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "URL of the instance resource.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus this]
    (-> this (.getInstance))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HealthStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn get-port
  "The port on the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^HealthStatus this]
    (-> this (.getPort))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HealthStatus this]
    (-> this (.hashCode))))

(defn get-health-state
  "Health state of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatus this]
    (-> this (.getHealthState))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HealthStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HealthStatus$Builder`"
  (^com.google.cloud.compute.v1.HealthStatus$Builder [^HealthStatus this]
    (-> this (.toBuilder))))

