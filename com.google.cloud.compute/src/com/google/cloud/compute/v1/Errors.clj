(ns com.google.cloud.compute.v1.Errors
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Errors]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Errors`

  returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^com.google.cloud.compute.v1.Errors prototype]
    (Errors/newBuilder prototype))
  (^com.google.cloud.compute.v1.Errors$Builder []
    (Errors/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Errors`"
  (^com.google.cloud.compute.v1.Errors []
    (Errors/getDefaultInstance )))

(defn get-location
  "[Output Only] Indicates the field in the request that caused the error. This property is
   optional.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors this]
    (-> this (.getLocation))))

(defn get-code
  "[Output Only] The error type identifier for this error.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors this]
    (-> this (.getCode))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Errors this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Errors this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Errors this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Errors this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Errors this]
    (-> this (.hashCode))))

(defn get-message
  "[Output Only] An optional, human-readable error message.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors this]
    (-> this (.getMessage))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Errors this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors this]
    (-> this (.toBuilder))))

