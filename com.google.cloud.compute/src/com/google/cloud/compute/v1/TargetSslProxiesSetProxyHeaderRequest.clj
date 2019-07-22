(ns com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetProxyHeaderRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder [^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest prototype]
    (TargetSslProxiesSetProxyHeaderRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder []
    (TargetSslProxiesSetProxyHeaderRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest []
    (TargetSslProxiesSetProxyHeaderRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetSslProxiesSetProxyHeaderRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.getFieldMask))))

(defn get-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are
   allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.getProxyHeader))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetSslProxiesSetProxyHeaderRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetSslProxiesSetProxyHeaderRequest this]
    (-> this (.hashCode))))

