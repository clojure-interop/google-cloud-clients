(ns com.google.cloud.bigquery.EncryptionConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery EncryptionConfiguration$Builder]))

(defn ->builder
  "Constructor.

  encryption-configuration-pb - `com.google.api.services.bigquery.model.EncryptionConfiguration`"
  (^EncryptionConfiguration$Builder [^com.google.api.services.bigquery.model.EncryptionConfiguration encryption-configuration-pb]
    (new EncryptionConfiguration$Builder encryption-configuration-pb)))

(defn set-kms-key-name
  "kms-key-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.EncryptionConfiguration$Builder`"
  (^com.google.cloud.bigquery.EncryptionConfiguration$Builder [^EncryptionConfiguration$Builder this ^java.lang.String kms-key-name]
    (-> this (.setKmsKeyName kms-key-name))))

(defn build
  "Creates a EncryptionConfiguration object.

  returns: `com.google.cloud.bigquery.EncryptionConfiguration`"
  (^com.google.cloud.bigquery.EncryptionConfiguration [^EncryptionConfiguration$Builder this]
    (-> this (.build))))

