(ns com.google.cloud.compute.v1.ShieldedInstanceIdentity
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIdentity]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ShieldedInstanceIdentity`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^com.google.cloud.compute.v1.ShieldedInstanceIdentity prototype]
    (ShieldedInstanceIdentity/newBuilder prototype))
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder []
    (ShieldedInstanceIdentity/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity []
    (ShieldedInstanceIdentity/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#shieldedInstanceIdentity for shielded
   Instance identity entry.

  returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentity this]
    (-> this (.getKind))))

(defn get-signing-key
  "An Attestation Key (AK) issued to the Shielded Instance's vTPM.

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry [^ShieldedInstanceIdentity this]
    (-> this (.getSigningKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ShieldedInstanceIdentity this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIdentity this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ShieldedInstanceIdentity this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-encryption-key
  "An Endorsement Key (EK) issued to the Shielded Instance's vTPM.

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentityEntry [^ShieldedInstanceIdentity this]
    (-> this (.getEncryptionKey))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ShieldedInstanceIdentity this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ShieldedInstanceIdentity this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ShieldedInstanceIdentity this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity$Builder [^ShieldedInstanceIdentity this]
    (-> this (.toBuilder))))

