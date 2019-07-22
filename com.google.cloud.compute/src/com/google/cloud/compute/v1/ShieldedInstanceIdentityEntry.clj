(ns com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIdentityEntry]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry prototype]
    (ShieldedInstanceIdentityEntry/newBuilder prototype))
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder []
    (ShieldedInstanceIdentityEntry/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry []
    (ShieldedInstanceIdentityEntry/getDefaultInstance )))

(defn get-ek-cert
  "A PEM-encoded X.509 certificate. This field can be empty.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentityEntry this]
    (-> this (.getEkCert))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ShieldedInstanceIdentityEntry this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentityEntry this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ShieldedInstanceIdentityEntry this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ShieldedInstanceIdentityEntry this]
    (-> this (.getApiMessageRequestBody))))

(defn get-ek-pub
  "A PEM-encoded public key.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentityEntry this]
    (-> this (.getEkPub))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ShieldedInstanceIdentityEntry this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ShieldedInstanceIdentityEntry this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry$Builder [^ShieldedInstanceIdentityEntry this]
    (-> this (.toBuilder))))

