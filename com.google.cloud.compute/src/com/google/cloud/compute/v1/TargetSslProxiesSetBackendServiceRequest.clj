(ns com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetBackendServiceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder [^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest prototype]
    (TargetSslProxiesSetBackendServiceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder []
    (TargetSslProxiesSetBackendServiceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest []
    (TargetSslProxiesSetBackendServiceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetSslProxiesSetBackendServiceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.getFieldMask))))

(defn get-service
  "The URL of the new BackendService resource for the targetSslProxy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.getService))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetSslProxiesSetBackendServiceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetSslProxiesSetBackendServiceRequest this]
    (-> this (.hashCode))))

