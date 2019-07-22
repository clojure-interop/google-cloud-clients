(ns com.google.cloud.compute.v1.TestPermissionsResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TestPermissionsResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TestPermissionsResponse`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^com.google.cloud.compute.v1.TestPermissionsResponse prototype]
    (TestPermissionsResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder []
    (TestPermissionsResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TestPermissionsResponse`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse []
    (TestPermissionsResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TestPermissionsResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TestPermissionsResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsResponse this]
    (-> this (.getFieldMask))))

(defn get-permissions-list
  "A subset of `TestPermissionsRequest.permissions` that the caller is allowed.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestPermissionsResponse this]
    (-> this (.getPermissionsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TestPermissionsResponse$Builder`"
  (^com.google.cloud.compute.v1.TestPermissionsResponse$Builder [^TestPermissionsResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TestPermissionsResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TestPermissionsResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TestPermissionsResponse this]
    (-> this (.hashCode))))

