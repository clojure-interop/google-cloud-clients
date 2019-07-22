(ns com.google.cloud.compute.v1.InstancesSetServiceAccountRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetServiceAccountRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest$Builder [^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest prototype]
    (InstancesSetServiceAccountRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest$Builder []
    (InstancesSetServiceAccountRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest`"
  (^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest []
    (InstancesSetServiceAccountRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetServiceAccountRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetServiceAccountRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesSetServiceAccountRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesSetServiceAccountRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-scopes-list
  "The list of scopes to be made available for this service account.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetServiceAccountRequest this]
    (-> this (.getScopesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesSetServiceAccountRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesSetServiceAccountRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-email
  "Email address of the service account.

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetServiceAccountRequest this]
    (-> this (.getEmail))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest$Builder [^InstancesSetServiceAccountRequest this]
    (-> this (.toBuilder))))

