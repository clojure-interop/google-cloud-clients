(ns com.google.cloud.compute.v1.LicenseCode$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCode$Builder]))

(defn set-description
  "[Output Only] Description of this License Code.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#licenseCode for licenses.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getKind))))

(defn add-all-license-alias
  "[Output Only] URL and description aliases of Licenses with the same License Code.

  license-alias - `java.util.List`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.util.List license-alias]
    (-> this (.addAllLicenseAlias license-alias))))

(defn set-name
  "[Output Only] Name of the resource. The name is 1-20 characters long and must be a valid 64
   bit integer.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#licenseCode for licenses.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-state
  "[Output Only] Current state of this License Code.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-name
  "[Output Only] Name of the resource. The name is 1-20 characters long and must be a valid 64
   bit integer.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-state
  "[Output Only] Current state of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getState))))

(defn set-transferable
  "[Output Only] If true, the license will remain attached when creating images or snapshots
   from disks. Otherwise, the license is not transferred.

  transferable - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.Boolean transferable]
    (-> this (.setTransferable transferable))))

(defn get-transferable?
  "[Output Only] If true, the license will remain attached when creating images or snapshots
   from disks. Otherwise, the license is not transferred.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^LicenseCode$Builder this]
    (-> this (.getTransferable))))

(defn add-license-alias
  "[Output Only] URL and description aliases of Licenses with the same License Code.

  license-alias - `com.google.cloud.compute.v1.LicenseCodeLicenseAlias`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^com.google.cloud.compute.v1.LicenseCodeLicenseAlias license-alias]
    (-> this (.addLicenseAlias license-alias))))

(defn build
  "returns: `com.google.cloud.compute.v1.LicenseCode`"
  (^com.google.cloud.compute.v1.LicenseCode [^LicenseCode$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] Description of this License Code.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LicenseCode`

  returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this ^com.google.cloud.compute.v1.LicenseCode other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LicenseCode$Builder`"
  (^com.google.cloud.compute.v1.LicenseCode$Builder [^LicenseCode$Builder this]
    (-> this (.clone))))

(defn get-license-alias-list
  "[Output Only] URL and description aliases of Licenses with the same License Code.

  returns: `java.util.List<com.google.cloud.compute.v1.LicenseCodeLicenseAlias>`"
  (^java.util.List [^LicenseCode$Builder this]
    (-> this (.getLicenseAliasList))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^LicenseCode$Builder this]
    (-> this (.getCreationTimestamp))))

