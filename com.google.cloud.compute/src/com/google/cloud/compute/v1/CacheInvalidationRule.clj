(ns com.google.cloud.compute.v1.CacheInvalidationRule
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CacheInvalidationRule]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.CacheInvalidationRule`

  returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^com.google.cloud.compute.v1.CacheInvalidationRule prototype]
    (CacheInvalidationRule/newBuilder prototype))
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder []
    (CacheInvalidationRule/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.CacheInvalidationRule`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule []
    (CacheInvalidationRule/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheInvalidationRule this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CacheInvalidationRule this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CacheInvalidationRule this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^CacheInvalidationRule this]
    (-> this (.getPath))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^CacheInvalidationRule this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CacheInvalidationRule this]
    (-> this (.hashCode))))

(defn get-host
  "If set, this invalidation rule will only apply to requests with a Host header matching host.

  returns: `java.lang.String`"
  (^java.lang.String [^CacheInvalidationRule this]
    (-> this (.getHost))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CacheInvalidationRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^CacheInvalidationRule this]
    (-> this (.toBuilder))))

