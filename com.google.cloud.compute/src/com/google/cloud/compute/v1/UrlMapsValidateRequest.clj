(ns com.google.cloud.compute.v1.UrlMapsValidateRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapsValidateRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMapsValidateRequest`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder [^com.google.cloud.compute.v1.UrlMapsValidateRequest prototype]
    (UrlMapsValidateRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder []
    (UrlMapsValidateRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest []
    (UrlMapsValidateRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMapsValidateRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMapsValidateRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapsValidateRequest this]
    (-> this (.getFieldMask))))

(defn get-resource
  "Content of the UrlMap to be validated.

  returns: `com.google.cloud.compute.v1.UrlMap`"
  (^com.google.cloud.compute.v1.UrlMap [^UrlMapsValidateRequest this]
    (-> this (.getResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder [^UrlMapsValidateRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapsValidateRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMapsValidateRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMapsValidateRequest this]
    (-> this (.hashCode))))

