(ns com.google.cloud.compute.v1.UrlMapsValidateResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapsValidateResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMapsValidateResponse`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder [^com.google.cloud.compute.v1.UrlMapsValidateResponse prototype]
    (UrlMapsValidateResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder []
    (UrlMapsValidateResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse []
    (UrlMapsValidateResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMapsValidateResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMapsValidateResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapsValidateResponse this]
    (-> this (.getFieldMask))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult [^UrlMapsValidateResponse this]
    (-> this (.getResult))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder [^UrlMapsValidateResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapsValidateResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMapsValidateResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMapsValidateResponse this]
    (-> this (.hashCode))))

