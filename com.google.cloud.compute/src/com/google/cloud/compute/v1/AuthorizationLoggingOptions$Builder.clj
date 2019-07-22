(ns com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuthorizationLoggingOptions$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AuthorizationLoggingOptions`

  returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder [^AuthorizationLoggingOptions$Builder this ^com.google.cloud.compute.v1.AuthorizationLoggingOptions other]
    (-> this (.mergeFrom other))))

(defn get-permission-type
  "The type of the permission that was checked.

  returns: `java.lang.String`"
  (^java.lang.String [^AuthorizationLoggingOptions$Builder this]
    (-> this (.getPermissionType))))

(defn set-permission-type
  "The type of the permission that was checked.

  permission-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder [^AuthorizationLoggingOptions$Builder this ^java.lang.String permission-type]
    (-> this (.setPermissionType permission-type))))

(defn build
  "returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions [^AuthorizationLoggingOptions$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder [^AuthorizationLoggingOptions$Builder this]
    (-> this (.clone))))

