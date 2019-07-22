(ns com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxiesSetBackendServiceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder [^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest prototype]
    (TargetTcpProxiesSetBackendServiceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder []
    (TargetTcpProxiesSetBackendServiceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest []
    (TargetTcpProxiesSetBackendServiceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetTcpProxiesSetBackendServiceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.getFieldMask))))

(defn get-service
  "The URL of the new BackendService resource for the targetTcpProxy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.getService))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetTcpProxiesSetBackendServiceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetTcpProxiesSetBackendServiceRequest this]
    (-> this (.hashCode))))

