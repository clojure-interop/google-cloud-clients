(ns com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigCloudAuditOptions$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^LogConfigCloudAuditOptions$Builder this ^com.google.cloud.compute.v1.LogConfigCloudAuditOptions other]
    (-> this (.mergeFrom other))))

(defn get-authorization-logging-options
  "Information used by the Cloud Audit Logging pipeline.

  returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions [^LogConfigCloudAuditOptions$Builder this]
    (-> this (.getAuthorizationLoggingOptions))))

(defn set-authorization-logging-options
  "Information used by the Cloud Audit Logging pipeline.

  authorization-logging-options - `com.google.cloud.compute.v1.AuthorizationLoggingOptions`

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^LogConfigCloudAuditOptions$Builder this ^com.google.cloud.compute.v1.AuthorizationLoggingOptions authorization-logging-options]
    (-> this (.setAuthorizationLoggingOptions authorization-logging-options))))

(defn get-log-name
  "The log_name to populate in the Cloud Audit Record.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCloudAuditOptions$Builder this]
    (-> this (.getLogName))))

(defn set-log-name
  "The log_name to populate in the Cloud Audit Record.

  log-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^LogConfigCloudAuditOptions$Builder this ^java.lang.String log-name]
    (-> this (.setLogName log-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions [^LogConfigCloudAuditOptions$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCloudAuditOptions$Builder [^LogConfigCloudAuditOptions$Builder this]
    (-> this (.clone))))

