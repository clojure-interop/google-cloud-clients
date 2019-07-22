(ns com.google.cloud.compute.v1.LogConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LogConfig`

  returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^com.google.cloud.compute.v1.LogConfig prototype]
    (LogConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.LogConfig$Builder []
    (LogConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LogConfig`"
  (^com.google.cloud.compute.v1.LogConfig []
    (LogConfig/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LogConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LogConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-counter
  "Counter options.

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions [^LogConfig this]
    (-> this (.getCounter))))

(defn get-cloud-audit
  "Cloud audit options.

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions [^LogConfig this]
    (-> this (.getCloudAudit))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LogConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn get-data-access
  "Data access options.

  returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions [^LogConfig this]
    (-> this (.getDataAccess))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LogConfig$Builder`"
  (^com.google.cloud.compute.v1.LogConfig$Builder [^LogConfig this]
    (-> this (.toBuilder))))

