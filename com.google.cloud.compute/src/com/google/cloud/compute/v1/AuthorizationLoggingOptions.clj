(ns com.google.cloud.compute.v1.AuthorizationLoggingOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AuthorizationLoggingOptions]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AuthorizationLoggingOptions`

  returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder [^com.google.cloud.compute.v1.AuthorizationLoggingOptions prototype]
    (AuthorizationLoggingOptions/newBuilder prototype))
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder []
    (AuthorizationLoggingOptions/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions []
    (AuthorizationLoggingOptions/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AuthorizationLoggingOptions this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AuthorizationLoggingOptions this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AuthorizationLoggingOptions this]
    (-> this (.getFieldMask))))

(defn get-permission-type
  "The type of the permission that was checked.

  returns: `java.lang.String`"
  (^java.lang.String [^AuthorizationLoggingOptions this]
    (-> this (.getPermissionType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder`"
  (^com.google.cloud.compute.v1.AuthorizationLoggingOptions$Builder [^AuthorizationLoggingOptions this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AuthorizationLoggingOptions this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AuthorizationLoggingOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AuthorizationLoggingOptions this]
    (-> this (.hashCode))))

