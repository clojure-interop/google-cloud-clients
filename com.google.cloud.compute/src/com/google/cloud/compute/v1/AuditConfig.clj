(ns com.google.cloud.compute.v1.AuditConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuditConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AuditConfig`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^com.google.cloud.compute.v1.AuditConfig prototype]
    (AuditConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.AuditConfig$Builder []
    (AuditConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AuditConfig`"
  (^com.google.cloud.compute.v1.AuditConfig []
    (AuditConfig/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AuditConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AuditConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-service
  "Specifies a service that will be enabled for audit logging. For example,
   `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   covers all services.

  returns: `java.lang.String`"
  (^java.lang.String [^AuditConfig this]
    (-> this (.getService))))

(defn get-exempted-members-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditConfig this]
    (-> this (.getExemptedMembersList))))

(defn get-audit-log-configs-list
  "The configuration for logging of each type of permission.

  returns: `java.util.List<com.google.cloud.compute.v1.AuditLogConfig>`"
  (^java.util.List [^AuditConfig this]
    (-> this (.getAuditLogConfigsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AuditConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AuditConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AuditConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig this]
    (-> this (.toBuilder))))

