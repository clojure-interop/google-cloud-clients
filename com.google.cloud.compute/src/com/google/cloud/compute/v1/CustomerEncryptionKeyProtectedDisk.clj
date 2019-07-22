(ns com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CustomerEncryptionKeyProtectedDisk]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk`

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk prototype]
    (CustomerEncryptionKeyProtectedDisk/newBuilder prototype))
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder []
    (CustomerEncryptionKeyProtectedDisk/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk []
    (CustomerEncryptionKeyProtectedDisk/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CustomerEncryptionKeyProtectedDisk this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   only applicable for persistent disks.

  returns: `java.lang.String`"
  (^java.lang.String [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.getSource))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.getApiMessageRequestBody))))

(defn get-disk-encryption-key
  "Decrypts data associated with the disk with a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.getDiskEncryptionKey))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CustomerEncryptionKeyProtectedDisk this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk$Builder [^CustomerEncryptionKeyProtectedDisk this]
    (-> this (.toBuilder))))

