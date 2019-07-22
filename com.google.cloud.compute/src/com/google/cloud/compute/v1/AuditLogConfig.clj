(ns com.google.cloud.compute.v1.AuditLogConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuditLogConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AuditLogConfig`

  returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^com.google.cloud.compute.v1.AuditLogConfig prototype]
    (AuditLogConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder []
    (AuditLogConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AuditLogConfig`"
  (^com.google.cloud.compute.v1.AuditLogConfig []
    (AuditLogConfig/getDefaultInstance )))

(defn get-log-type
  "The log type that this config enables.

  returns: `java.lang.String`"
  (^java.lang.String [^AuditLogConfig this]
    (-> this (.getLogType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditLogConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AuditLogConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AuditLogConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-exempted-members-list
  "Specifies the identities that do not cause logging for this type of permission. Follows the
   same format of [Binding.members][].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditLogConfig this]
    (-> this (.getExemptedMembersList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AuditLogConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AuditLogConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AuditLogConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig this]
    (-> this (.toBuilder))))

