(ns com.google.cloud.compute.v1.LicenseCodeLicenseAlias
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCodeLicenseAlias]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LicenseCodeLicenseAlias`

  returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^com.google.cloud.compute.v1.LicenseCodeLicenseAlias prototype]
    (LicenseCodeLicenseAlias/newBuilder prototype))
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder []
    (LicenseCodeLicenseAlias/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias []
    (LicenseCodeLicenseAlias/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LicenseCodeLicenseAlias this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LicenseCodeLicenseAlias this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LicenseCodeLicenseAlias this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-description
  "[Output Only] Description of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCodeLicenseAlias this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LicenseCodeLicenseAlias this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] URL of license corresponding to this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCodeLicenseAlias this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LicenseCodeLicenseAlias this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LicenseCodeLicenseAlias this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeLicenseAlias$Builder [^LicenseCodeLicenseAlias this]
    (-> this (.toBuilder))))

