(ns com.google.cloud.compute.v1.ShieldedInstanceConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ShieldedInstanceConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ShieldedInstanceConfig`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^com.google.cloud.compute.v1.ShieldedInstanceConfig prototype]
    (ShieldedInstanceConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder []
    (ShieldedInstanceConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig []
    (ShieldedInstanceConfig/getDefaultInstance )))

(defn get-enable-integrity-monitoring?
  "Defines whether the instance has integrity monitoring enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig this]
    (-> this (.getEnableIntegrityMonitoring))))

(defn get-enable-secure-boot?
  "Defines whether the instance has Secure Boot enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig this]
    (-> this (.getEnableSecureBoot))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ShieldedInstanceConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShieldedInstanceConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ShieldedInstanceConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ShieldedInstanceConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ShieldedInstanceConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ShieldedInstanceConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-enable-vtpm?
  "Defines whether the instance has the vTPM enabled.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^ShieldedInstanceConfig this]
    (-> this (.getEnableVtpm))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig$Builder [^ShieldedInstanceConfig this]
    (-> this (.toBuilder))))

