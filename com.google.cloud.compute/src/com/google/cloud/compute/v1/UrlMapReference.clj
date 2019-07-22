(ns com.google.cloud.compute.v1.UrlMapReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMapReference`

  returns: `com.google.cloud.compute.v1.UrlMapReference$Builder`"
  (^com.google.cloud.compute.v1.UrlMapReference$Builder [^com.google.cloud.compute.v1.UrlMapReference prototype]
    (UrlMapReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMapReference$Builder []
    (UrlMapReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMapReference`"
  (^com.google.cloud.compute.v1.UrlMapReference []
    (UrlMapReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMapReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMapReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapReference this]
    (-> this (.getFieldMask))))

(defn get-url-map
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapReference this]
    (-> this (.getUrlMap))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMapReference$Builder`"
  (^com.google.cloud.compute.v1.UrlMapReference$Builder [^UrlMapReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMapReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMapReference this]
    (-> this (.hashCode))))

