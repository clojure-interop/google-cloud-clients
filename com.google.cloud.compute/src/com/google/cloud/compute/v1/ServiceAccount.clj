(ns com.google.cloud.compute.v1.ServiceAccount
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ServiceAccount]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ServiceAccount`

  returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^com.google.cloud.compute.v1.ServiceAccount prototype]
    (ServiceAccount/newBuilder prototype))
  (^com.google.cloud.compute.v1.ServiceAccount$Builder []
    (ServiceAccount/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ServiceAccount`"
  (^com.google.cloud.compute.v1.ServiceAccount []
    (ServiceAccount/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ServiceAccount this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ServiceAccount this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ServiceAccount this]
    (-> this (.getApiMessageRequestBody))))

(defn get-scopes-list
  "The list of scopes to be made available for this service account.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ServiceAccount this]
    (-> this (.getScopesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ServiceAccount this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ServiceAccount this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-email
  "Email address of the service account.

  returns: `java.lang.String`"
  (^java.lang.String [^ServiceAccount this]
    (-> this (.getEmail))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ServiceAccount$Builder`"
  (^com.google.cloud.compute.v1.ServiceAccount$Builder [^ServiceAccount this]
    (-> this (.toBuilder))))

