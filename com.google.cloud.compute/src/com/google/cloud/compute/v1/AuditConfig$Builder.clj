(ns com.google.cloud.compute.v1.AuditConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuditConfig$Builder]))

(defn set-service
  "Specifies a service that will be enabled for audit logging. For example,
   `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   covers all services.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn add-audit-log-configs
  "The configuration for logging of each type of permission.

  audit-log-configs - `com.google.cloud.compute.v1.AuditLogConfig`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^com.google.cloud.compute.v1.AuditLogConfig audit-log-configs]
    (-> this (.addAuditLogConfigs audit-log-configs))))

(defn add-all-audit-log-configs
  "The configuration for logging of each type of permission.

  audit-log-configs - `java.util.List`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^java.util.List audit-log-configs]
    (-> this (.addAllAuditLogConfigs audit-log-configs))))

(defn get-service
  "Specifies a service that will be enabled for audit logging. For example,
   `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   covers all services.

  returns: `java.lang.String`"
  (^java.lang.String [^AuditConfig$Builder this]
    (-> this (.getService))))

(defn get-exempted-members-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditConfig$Builder this]
    (-> this (.getExemptedMembersList))))

(defn build
  "returns: `com.google.cloud.compute.v1.AuditConfig`"
  (^com.google.cloud.compute.v1.AuditConfig [^AuditConfig$Builder this]
    (-> this (.build))))

(defn get-audit-log-configs-list
  "The configuration for logging of each type of permission.

  returns: `java.util.List<com.google.cloud.compute.v1.AuditLogConfig>`"
  (^java.util.List [^AuditConfig$Builder this]
    (-> this (.getAuditLogConfigsList))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AuditConfig`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^com.google.cloud.compute.v1.AuditConfig other]
    (-> this (.mergeFrom other))))

(defn add-exempted-members
  "exempted-members - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^java.lang.String exempted-members]
    (-> this (.addExemptedMembers exempted-members))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this]
    (-> this (.clone))))

(defn add-all-exempted-members
  "exempted-members - `java.util.List`

  returns: `com.google.cloud.compute.v1.AuditConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditConfig$Builder [^AuditConfig$Builder this ^java.util.List exempted-members]
    (-> this (.addAllExemptedMembers exempted-members))))

