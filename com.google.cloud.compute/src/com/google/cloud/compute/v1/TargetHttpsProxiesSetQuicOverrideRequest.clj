(ns com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxiesSetQuicOverrideRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder [^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest prototype]
    (TargetHttpsProxiesSetQuicOverrideRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder []
    (TargetHttpsProxiesSetQuicOverrideRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest []
    (TargetHttpsProxiesSetQuicOverrideRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetHttpsProxiesSetQuicOverrideRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.getFieldMask))))

(defn get-quic-override
  "QUIC policy for the TargetHttpsProxy resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.getQuicOverride))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetHttpsProxiesSetQuicOverrideRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetHttpsProxiesSetQuicOverrideRequest this]
    (-> this (.hashCode))))

