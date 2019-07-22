(ns com.google.cloud.compute.v1.SignedUrlKey
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SignedUrlKey]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SignedUrlKey`

  returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^com.google.cloud.compute.v1.SignedUrlKey prototype]
    (SignedUrlKey/newBuilder prototype))
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder []
    (SignedUrlKey/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SignedUrlKey`"
  (^com.google.cloud.compute.v1.SignedUrlKey []
    (SignedUrlKey/getDefaultInstance )))

(defn get-key-value
  "128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
   base64url encoded string.

  returns: `java.lang.String`"
  (^java.lang.String [^SignedUrlKey this]
    (-> this (.getKeyValue))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SignedUrlKey this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SignedUrlKey this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SignedUrlKey this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SignedUrlKey this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SignedUrlKey this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SignedUrlKey this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SignedUrlKey$Builder`"
  (^com.google.cloud.compute.v1.SignedUrlKey$Builder [^SignedUrlKey this]
    (-> this (.toBuilder))))

(defn get-key-name
  "Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically,
   the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SignedUrlKey this]
    (-> this (.getKeyName))))

