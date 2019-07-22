(ns com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxiesSetProxyHeaderRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder [^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest prototype]
    (TargetTcpProxiesSetProxyHeaderRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder []
    (TargetTcpProxiesSetProxyHeaderRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest []
    (TargetTcpProxiesSetProxyHeaderRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetTcpProxiesSetProxyHeaderRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.getFieldMask))))

(defn get-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are
   allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.getProxyHeader))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetTcpProxiesSetProxyHeaderRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetTcpProxiesSetProxyHeaderRequest this]
    (-> this (.hashCode))))

