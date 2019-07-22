(ns com.google.cloud.compute.v1.ManagedInstanceLastAttempt
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstanceLastAttempt]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`

  returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder [^com.google.cloud.compute.v1.ManagedInstanceLastAttempt prototype]
    (ManagedInstanceLastAttempt/newBuilder prototype))
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder []
    (ManagedInstanceLastAttempt/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt []
    (ManagedInstanceLastAttempt/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ManagedInstanceLastAttempt this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ManagedInstanceLastAttempt this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ManagedInstanceLastAttempt this]
    (-> this (.getFieldMask))))

(defn get-errors
  "[Output Only] Encountered errors during the last attempt to create or delete the instance.

  returns: `com.google.cloud.compute.v1.Errors`"
  (^com.google.cloud.compute.v1.Errors [^ManagedInstanceLastAttempt this]
    (-> this (.getErrors))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder [^ManagedInstanceLastAttempt this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ManagedInstanceLastAttempt this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ManagedInstanceLastAttempt this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ManagedInstanceLastAttempt this]
    (-> this (.hashCode))))

