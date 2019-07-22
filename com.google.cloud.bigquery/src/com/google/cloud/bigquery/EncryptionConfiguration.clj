(ns com.google.cloud.bigquery.EncryptionConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery EncryptionConfiguration]))

(defn *new-builder
  "Returns a builder for a EncryptionConfiguration object.

  returns: `com.google.cloud.bigquery.EncryptionConfiguration$Builder`"
  (^com.google.cloud.bigquery.EncryptionConfiguration$Builder []
    (EncryptionConfiguration/newBuilder )))

(defn get-kms-key-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EncryptionConfiguration this]
    (-> this (.getKmsKeyName))))

(defn to-pb
  "returns: `com.google.api.services.bigquery.model.EncryptionConfiguration`"
  (^com.google.api.services.bigquery.model.EncryptionConfiguration [^EncryptionConfiguration this]
    (-> this (.toPb))))

(defn to-builder
  "Returns a builder for the EncryptionConfiguration object.

  returns: `com.google.cloud.bigquery.EncryptionConfiguration$Builder`"
  (^com.google.cloud.bigquery.EncryptionConfiguration$Builder [^EncryptionConfiguration this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EncryptionConfiguration this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^EncryptionConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^EncryptionConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

