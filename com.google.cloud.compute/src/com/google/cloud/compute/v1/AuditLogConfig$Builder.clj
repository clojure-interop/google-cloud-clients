(ns com.google.cloud.compute.v1.AuditLogConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuditLogConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AuditLogConfig`

  returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig$Builder this ^com.google.cloud.compute.v1.AuditLogConfig other]
    (-> this (.mergeFrom other))))

(defn get-exempted-members-list
  "Specifies the identities that do not cause logging for this type of permission. Follows the
   same format of [Binding.members][].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuditLogConfig$Builder this]
    (-> this (.getExemptedMembersList))))

(defn add-all-exempted-members
  "Specifies the identities that do not cause logging for this type of permission. Follows the
   same format of [Binding.members][].

  exempted-members - `java.util.List`

  returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig$Builder this ^java.util.List exempted-members]
    (-> this (.addAllExemptedMembers exempted-members))))

(defn add-exempted-members
  "Specifies the identities that do not cause logging for this type of permission. Follows the
   same format of [Binding.members][].

  exempted-members - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig$Builder this ^java.lang.String exempted-members]
    (-> this (.addExemptedMembers exempted-members))))

(defn get-log-type
  "The log type that this config enables.

  returns: `java.lang.String`"
  (^java.lang.String [^AuditLogConfig$Builder this]
    (-> this (.getLogType))))

(defn set-log-type
  "The log type that this config enables.

  log-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig$Builder this ^java.lang.String log-type]
    (-> this (.setLogType log-type))))

(defn build
  "returns: `com.google.cloud.compute.v1.AuditLogConfig`"
  (^com.google.cloud.compute.v1.AuditLogConfig [^AuditLogConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AuditLogConfig$Builder`"
  (^com.google.cloud.compute.v1.AuditLogConfig$Builder [^AuditLogConfig$Builder this]
    (-> this (.clone))))

