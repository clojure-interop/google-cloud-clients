(ns com.google.cloud.compute.v1.TargetReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.TargetReference$Builder`"
  (^com.google.cloud.compute.v1.TargetReference$Builder [^com.google.cloud.compute.v1.TargetReference prototype]
    (TargetReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetReference$Builder []
    (TargetReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetReference`"
  (^com.google.cloud.compute.v1.TargetReference []
    (TargetReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetReference this]
    (-> this (.getFieldMask))))

(defn get-target
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetReference this]
    (-> this (.getTarget))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetReference$Builder`"
  (^com.google.cloud.compute.v1.TargetReference$Builder [^TargetReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetReference this]
    (-> this (.hashCode))))

