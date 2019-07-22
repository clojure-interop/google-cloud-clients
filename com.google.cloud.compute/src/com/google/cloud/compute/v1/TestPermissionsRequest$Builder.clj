(ns com.google.cloud.compute.v1.TestPermissionsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestPermissionsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^TestPermissionsRequest$Builder this ^com.google.cloud.compute.v1.TestPermissionsRequest other]
    (-> this (.mergeFrom other))))

(defn get-permissions-list
  "The set of permissions to check for the 'resource'. Permissions with wildcards (such as
   '*' or 'storage.*') are not allowed.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsRequest$Builder this]
    (-> this (.getPermissionsList))))

(defn add-all-permissions
  "The set of permissions to check for the 'resource'. Permissions with wildcards (such as
   '*' or 'storage.*') are not allowed.

  permissions - `java.util.List`

  returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^TestPermissionsRequest$Builder this ^java.util.List permissions]
    (-> this (.addAllPermissions permissions))))

(defn add-permissions
  "The set of permissions to check for the 'resource'. Permissions with wildcards (such as
   '*' or 'storage.*') are not allowed.

  permissions - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^TestPermissionsRequest$Builder this ^java.lang.String permissions]
    (-> this (.addPermissions permissions))))

(defn build
  "returns: `com.google.cloud.compute.v1.TestPermissionsRequest`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest [^TestPermissionsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^TestPermissionsRequest$Builder this]
    (-> this (.clone))))

