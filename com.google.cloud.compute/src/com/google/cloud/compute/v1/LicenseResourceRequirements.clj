(ns com.google.cloud.compute.v1.LicenseResourceRequirements
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseResourceRequirements]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LicenseResourceRequirements`

  returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^com.google.cloud.compute.v1.LicenseResourceRequirements prototype]
    (LicenseResourceRequirements/newBuilder prototype))
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder []
    (LicenseResourceRequirements/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements []
    (LicenseResourceRequirements/getDefaultInstance )))

(defn get-min-memory-mb
  "Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LicenseResourceRequirements this]
    (-> this (.getMinMemoryMb))))

(defn get-min-guest-cpu-count
  "Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and
   Instance start.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^LicenseResourceRequirements this]
    (-> this (.getMinGuestCpuCount))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LicenseResourceRequirements this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LicenseResourceRequirements this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LicenseResourceRequirements this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LicenseResourceRequirements this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LicenseResourceRequirements this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LicenseResourceRequirements this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements$Builder`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements$Builder [^LicenseResourceRequirements this]
    (-> this (.toBuilder))))

