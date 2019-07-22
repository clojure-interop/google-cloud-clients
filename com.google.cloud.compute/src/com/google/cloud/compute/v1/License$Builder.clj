(ns com.google.cloud.compute.v1.License$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 License$Builder]))

(defn set-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#license for licenses.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getKind))))

(defn get-charges-use-fee?
  "[Output Only] Deprecated. This field no longer reflects whether a license charges a usage
   fee.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^License$Builder this]
    (-> this (.getChargesUseFee))))

(defn get-license-code
  "[Output Only] The unique code used to attach this license to images, snapshots, and disks.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getLicenseCode))))

(defn set-name
  "Name of the resource. The name must be 1-63 characters long and comply with RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#license for licenses.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-transferable
  "If false, licenses will not be copied from the source resource when creating an image from a
   disk, disk from snapshot, or snapshot from disk.

  transferable - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.Boolean transferable]
    (-> this (.setTransferable transferable))))

(defn get-transferable?
  "If false, licenses will not be copied from the source resource when creating an image from a
   disk, disk from snapshot, or snapshot from disk.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^License$Builder this]
    (-> this (.getTransferable))))

(defn build
  "returns: `com.google.cloud.compute.v1.License`"
  (^com.google.cloud.compute.v1.License [^License$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional textual description of the resource; provided by the client when the resource is
   created.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getDescription))))

(defn set-charges-use-fee
  "[Output Only] Deprecated. This field no longer reflects whether a license charges a usage
   fee.

  charges-use-fee - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.Boolean charges-use-fee]
    (-> this (.setChargesUseFee charges-use-fee))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.License`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^com.google.cloud.compute.v1.License other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this]
    (-> this (.clone))))

(defn set-license-code
  "[Output Only] The unique code used to attach this license to images, snapshots, and disks.

  license-code - `java.lang.String`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^java.lang.String license-code]
    (-> this (.setLicenseCode license-code))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^License$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-resource-requirements
  "resource-requirements - `com.google.cloud.compute.v1.LicenseResourceRequirements`

  returns: `com.google.cloud.compute.v1.License$Builder`"
  (^com.google.cloud.compute.v1.License$Builder [^License$Builder this ^com.google.cloud.compute.v1.LicenseResourceRequirements resource-requirements]
    (-> this (.setResourceRequirements resource-requirements))))

(defn get-resource-requirements
  "returns: `com.google.cloud.compute.v1.LicenseResourceRequirements`"
  (^com.google.cloud.compute.v1.LicenseResourceRequirements [^License$Builder this]
    (-> this (.getResourceRequirements))))

