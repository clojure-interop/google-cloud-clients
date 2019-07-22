(ns com.google.cloud.compute.v1.LogConfigCounterOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigCounterOptions]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LogConfigCounterOptions`

  returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^com.google.cloud.compute.v1.LogConfigCounterOptions prototype]
    (LogConfigCounterOptions/newBuilder prototype))
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder []
    (LogConfigCounterOptions/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LogConfigCounterOptions`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions []
    (LogConfigCounterOptions/getDefaultInstance )))

(defn get-metric
  "The metric to update.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCounterOptions this]
    (-> this (.getMetric))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LogConfigCounterOptions this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCounterOptions this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LogConfigCounterOptions this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-field
  "The field value to attribute.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigCounterOptions this]
    (-> this (.getField))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LogConfigCounterOptions this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogConfigCounterOptions this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogConfigCounterOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LogConfigCounterOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigCounterOptions$Builder [^LogConfigCounterOptions this]
    (-> this (.toBuilder))))

