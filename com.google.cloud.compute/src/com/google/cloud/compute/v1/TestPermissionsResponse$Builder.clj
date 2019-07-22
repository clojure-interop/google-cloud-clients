(ns com.google.cloud.compute.v1.TestPermissionsResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestPermissionsResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TestPermissionsResponse`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^TestPermissionsResponse$Builder this ^com.google.cloud.compute.v1.TestPermissionsResponse other]
    (-> this (.mergeFrom other))))

(defn get-permissions-list
  "A subset of `TestPermissionsRequest.permissions` that the caller is allowed.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsResponse$Builder this]
    (-> this (.getPermissionsList))))

(defn add-all-permissions
  "A subset of `TestPermissionsRequest.permissions` that the caller is allowed.

  permissions - `java.util.List`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^TestPermissionsResponse$Builder this ^java.util.List permissions]
    (-> this (.addAllPermissions permissions))))

(defn add-permissions
  "A subset of `TestPermissionsRequest.permissions` that the caller is allowed.

  permissions - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^TestPermissionsResponse$Builder this ^java.lang.String permissions]
    (-> this (.addPermissions permissions))))

(defn build
  "returns: `com.google.cloud.compute.v1.TestPermissionsResponse`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^TestPermissionsResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^TestPermissionsResponse$Builder this]
    (-> this (.clone))))

