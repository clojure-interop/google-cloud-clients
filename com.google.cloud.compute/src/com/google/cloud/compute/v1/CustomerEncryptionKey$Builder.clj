(ns com.google.cloud.compute.v1.CustomerEncryptionKey$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CustomerEncryptionKey$Builder]))

(defn get-sha-256
  "[Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption
   key that protects this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey$Builder this]
    (-> this (.getSha256))))

(defn set-kms-key-name
  "The name of the encryption key that is stored in Google Cloud KMS.

  kms-key-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey$Builder this ^java.lang.String kms-key-name]
    (-> this (.setKmsKeyName kms-key-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^CustomerEncryptionKey$Builder this]
    (-> this (.build))))

(defn get-raw-key
  "Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either
   encrypt or decrypt this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey$Builder this]
    (-> this (.getRawKey))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey$Builder this]
    (-> this (.clone))))

(defn set-raw-key
  "Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either
   encrypt or decrypt this resource.

  raw-key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey$Builder this ^java.lang.String raw-key]
    (-> this (.setRawKey raw-key))))

(defn get-kms-key-name
  "The name of the encryption key that is stored in Google Cloud KMS.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKey$Builder this]
    (-> this (.getKmsKeyName))))

(defn set-sha-256
  "[Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption
   key that protects this resource.

  sha-256 - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey$Builder [^CustomerEncryptionKey$Builder this ^java.lang.String sha-256]
    (-> this (.setSha256 sha-256))))

