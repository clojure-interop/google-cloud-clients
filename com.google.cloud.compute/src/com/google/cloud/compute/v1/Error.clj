(ns com.google.cloud.compute.v1.Error
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Error]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Error`

  returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^com.google.cloud.compute.v1.Error prototype]
    (Error/newBuilder prototype))
  (^com.google.cloud.compute.v1.Error$Builder []
    (Error/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Error`"
  (^com.google.cloud.compute.v1.Error []
    (Error/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Error this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Error this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Error this]
    (-> this (.getFieldMask))))

(defn get-errors-list
  "[Output Only] The array of errors encountered while processing this operation.

  returns: `java.util.List<com.google.cloud.compute.v1.Errors>`"
  (^java.util.List [^Error this]
    (-> this (.getErrorsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^Error this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Error this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Error this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Error this]
    (-> this (.hashCode))))

