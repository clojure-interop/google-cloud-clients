(ns com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsAddHealthCheckRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest prototype]
    (TargetPoolsAddHealthCheckRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder []
    (TargetPoolsAddHealthCheckRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest []
    (TargetPoolsAddHealthCheckRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolsAddHealthCheckRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.getFieldMask))))

(defn get-health-checks-list
  "The HttpHealthCheck to add to the target pool.

  returns: `java.util.List<com.google.cloud.compute.v1.HealthCheckReference>`"
  (^java.util.List [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.getHealthChecksList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest$Builder [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolsAddHealthCheckRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolsAddHealthCheckRequest this]
    (-> this (.hashCode))))

