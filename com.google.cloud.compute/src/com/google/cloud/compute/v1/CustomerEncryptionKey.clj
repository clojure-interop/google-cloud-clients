(ns com.google.cloud.compute.v1.CustomerEncryptionKey
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CustomerEncryptionKey]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^com.google.cloud.compute.v1.CustomerEncryptionKey prototype]
    (CustomerEncryptionKey/newBuilder prototype))
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder []
    (CustomerEncryptionKey/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey []
    (CustomerEncryptionKey/getDefaultInstance )))

(defn get-sha-256
  "[Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key
   that protects this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey this]
    (-> this (.getSha256))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CustomerEncryptionKey this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CustomerEncryptionKey this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-raw-key
  "Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either
   encrypt or decrypt this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey this]
    (-> this (.getRawKey))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^CustomerEncryptionKey this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CustomerEncryptionKey this]
    (-> this (.hashCode))))

(defn get-kms-key-name
  "The name of the encryption key that is stored in Google Cloud KMS.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey this]
    (-> this (.getKmsKeyName))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CustomerEncryptionKey this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey this]
    (-> this (.toBuilder))))

