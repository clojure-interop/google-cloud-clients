(ns com.google.cloud.compute.v1.BackendServiceReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceReference`

  returns: `com.google.cloud.compute.v1.BackendServiceReference$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder [^com.google.cloud.compute.v1.BackendServiceReference prototype]
    (BackendServiceReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder []
    (BackendServiceReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceReference`"
  (^com.google.cloud.compute.v1.BackendServiceReference []
    (BackendServiceReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceReference this]
    (-> this (.getFieldMask))))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceReference this]
    (-> this (.getBackendService))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceReference$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder [^BackendServiceReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceReference this]
    (-> this (.hashCode))))

