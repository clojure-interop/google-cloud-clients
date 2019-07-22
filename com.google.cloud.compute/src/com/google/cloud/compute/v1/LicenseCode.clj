(ns com.google.cloud.compute.v1.LicenseCode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCode]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LicenseCode`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^com.google.cloud.compute.v1.LicenseCode prototype]
    (LicenseCode/newBuilder prototype))
  (^com.google.cloud.compute.v1.LicenseCode$Builder []
    (LicenseCode/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LicenseCode`"
  (^com.google.cloud.compute.v1.LicenseCode []
    (LicenseCode/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#licenseCode for licenses.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LicenseCode this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LicenseCode this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource. The name is 1-20 characters long and must be a valid 64 bit
   integer.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getName))))

(defn get-state
  "[Output Only] Current state of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getState))))

(defn get-transferable?
  "[Output Only] If true, the license will remain attached when creating images or snapshots from
   disks. Otherwise, the license is not transferred.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LicenseCode this]
    (-> this (.getTransferable))))

(defn get-description
  "[Output Only] Description of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LicenseCode this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LicenseCode this]
    (-> this (.hashCode))))

(defn get-license-alias-list
  "[Output Only] URL and description aliases of Licenses with the same License Code.

  returns: `java.util.List<com.google.cloud.compute.v1.LicenseCodeLicenseAlias>`"
  (^java.util.List [^LicenseCode this]
    (-> this (.getLicenseAliasList))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LicenseCode this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode this]
    (-> this (.toBuilder))))

