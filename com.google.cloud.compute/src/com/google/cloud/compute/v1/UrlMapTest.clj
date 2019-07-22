(ns com.google.cloud.compute.v1.UrlMapTest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapTest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMapTest`

  returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^com.google.cloud.compute.v1.UrlMapTest prototype]
    (UrlMapTest/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMapTest$Builder []
    (UrlMapTest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMapTest`"
  (^com.google.cloud.compute.v1.UrlMapTest []
    (UrlMapTest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapTest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMapTest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-path
  "Path portion of the URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest this]
    (-> this (.getPath))))

(defn get-service
  "Expected BackendService resource the given URL should be mapped to.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest this]
    (-> this (.getService))))

(defn get-description
  "Description of this test case.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMapTest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMapTest this]
    (-> this (.hashCode))))

(defn get-host
  "Host portion of the URL.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMapTest this]
    (-> this (.getHost))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMapTest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMapTest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapTest$Builder [^UrlMapTest this]
    (-> this (.toBuilder))))

