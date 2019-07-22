(ns com.google.cloud.compute.v1.License
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 License]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.License`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^com.google.cloud.compute.v1.License prototype]
    (License/newBuilder prototype))
  (^com.google.cloud.compute.v1.License$Builder []
    (License/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.License`"
  (^com.google.cloud.compute.v1.License []
    (License/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#license for licenses.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getKind))))

(defn get-charges-use-fee?
  "[Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^License this]
    (-> this (.getChargesUseFee))))

(defn get-license-code
  "[Output Only] The unique code used to attach this license to images, snapshots, and disks.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getLicenseCode))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^License this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^License this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getName))))

(defn get-transferable?
  "If false, licenses will not be copied from the source resource when creating an image from a
   disk, disk from snapshot, or snapshot from disk.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^License this]
    (-> this (.getTransferable))))

(defn get-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^License this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^License this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^License this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^License this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License this]
    (-> this (.toBuilder))))

(defn get-resource-requirements
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements [^License this]
    (-> this (.getResourceRequirements))))

