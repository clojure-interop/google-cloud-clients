(ns com.google.cloud.compute.v1.TestPermissionsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestPermissionsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^com.google.cloud.compute.v1.TestPermissionsRequest prototype]
    (TestPermissionsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder []
    (TestPermissionsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TestPermissionsRequest`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest []
    (TestPermissionsRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TestPermissionsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TestPermissionsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsRequest this]
    (-> this (.getFieldMask))))

(defn get-permissions-list
  "The set of permissions to check for the 'resource'. Permissions with wildcards (such as '*'
   or 'storage.*') are not allowed.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsRequest this]
    (-> this (.getPermissionsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TestPermissionsRequest$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsRequest$Builder [^TestPermissionsRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TestPermissionsRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TestPermissionsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TestPermissionsRequest this]
    (-> this (.hashCode))))

