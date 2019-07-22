(ns com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceIntegrityPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder [^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy prototype]
    (ShieldedInstanceIntegrityPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder []
    (ShieldedInstanceIntegrityPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy []
    (ShieldedInstanceIntegrityPolicy/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ShieldedInstanceIntegrityPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.getFieldMask))))

(defn get-update-auto-learn-policy?
  "Updates the integrity policy baseline using the measurements from the VM instance's most recent
   boot.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.getUpdateAutoLearnPolicy))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy$Builder [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ShieldedInstanceIntegrityPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ShieldedInstanceIntegrityPolicy this]
    (-> this (.hashCode))))

