(ns com.google.cloud.compute.v1.LogConfigCloudAuditOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigCloudAuditOptions]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^com.google.cloud.compute.v1.LogConfigCloudAuditOptions prototype]
    (LogConfigCloudAuditOptions/newBuilder prototype))
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder []
    (LogConfigCloudAuditOptions/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions []
    (LogConfigCloudAuditOptions/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LogConfigCloudAuditOptions this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCloudAuditOptions this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LogConfigCloudAuditOptions this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LogConfigCloudAuditOptions this]
    (-> this (.getApiMessageRequestBody))))

(defn get-authorization-logging-options
  "Information used by the Cloud Audit Logging pipeline.

  returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions [^LogConfigCloudAuditOptions this]
    (-> this (.getAuthorizationLoggingOptions))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogConfigCloudAuditOptions this]
    (-> this (.hashCode))))

(defn get-log-name
  "The log_name to populate in the Cloud Audit Record.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCloudAuditOptions this]
    (-> this (.getLogName))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogConfigCloudAuditOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^LogConfigCloudAuditOptions this]
    (-> this (.toBuilder))))

