(ns com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMinCpuPlatformRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder [^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest prototype]
    (InstancesSetMinCpuPlatformRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder []
    (InstancesSetMinCpuPlatformRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest []
    (InstancesSetMinCpuPlatformRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesSetMinCpuPlatformRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.getFieldMask))))

(defn get-min-cpu-platform
  "Minimum cpu/platform this instance should be started at.

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.getMinCpuPlatform))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest$Builder [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesSetMinCpuPlatformRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesSetMinCpuPlatformRequest this]
    (-> this (.hashCode))))

