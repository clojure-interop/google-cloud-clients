(ns com.google.cloud.compute.v1.InstanceReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.InstanceReference$Builder`"
  (^com.google.cloud.compute.v1.InstanceReference$Builder [^com.google.cloud.compute.v1.InstanceReference prototype]
    (InstanceReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceReference$Builder []
    (InstanceReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceReference`"
  (^com.google.cloud.compute.v1.InstanceReference []
    (InstanceReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceReference this]
    (-> this (.getFieldMask))))

(defn get-instance
  "The URL for a specific instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceReference this]
    (-> this (.getInstance))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceReference$Builder`"
  (^com.google.cloud.compute.v1.InstanceReference$Builder [^InstanceReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceReference this]
    (-> this (.hashCode))))

