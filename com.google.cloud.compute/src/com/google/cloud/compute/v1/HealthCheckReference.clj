(ns com.google.cloud.compute.v1.HealthCheckReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheckReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HealthCheckReference`

  returns: `com.google.cloud.compute.v1.HealthCheckReference$Builder`"
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder [^com.google.cloud.compute.v1.HealthCheckReference prototype]
    (HealthCheckReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder []
    (HealthCheckReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HealthCheckReference`"
  (^com.google.cloud.compute.v1.HealthCheckReference []
    (HealthCheckReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HealthCheckReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HealthCheckReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HealthCheckReference this]
    (-> this (.getFieldMask))))

(defn get-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthCheckReference this]
    (-> this (.getHealthCheck))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HealthCheckReference$Builder`"
  (^com.google.cloud.compute.v1.HealthCheckReference$Builder [^HealthCheckReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthCheckReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HealthCheckReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HealthCheckReference this]
    (-> this (.hashCode))))

