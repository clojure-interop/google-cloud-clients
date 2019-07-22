(ns com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesStartWithEncryptionKeyRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest`

  returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest prototype]
    (InstancesStartWithEncryptionKeyRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder []
    (InstancesStartWithEncryptionKeyRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest []
    (InstancesStartWithEncryptionKeyRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesStartWithEncryptionKeyRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.getFieldMask))))

(defn get-disks-list
  "Array of disks associated with this instance that are protected with a customer-supplied
   encryption key.

   In order to start the instance, the disk url and its corresponding key must be provided.

   If the disk is not protected with a customer-supplied encryption key it should not be
   specified.

  returns: `java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>`"
  (^java.util.List [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.getDisksList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest$Builder [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesStartWithEncryptionKeyRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesStartWithEncryptionKeyRequest this]
    (-> this (.hashCode))))

