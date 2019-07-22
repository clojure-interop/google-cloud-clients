(ns com.google.cloud.compute.v1.DiskType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskType$Builder]))

(defn get-default-disk-size-gb
  "[Output Only] Server-defined default disk size in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getDefaultDiskSizeGb))))

(defn set-description
  "[Output Only] An optional description of this resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URL of the region where the disk type resides. Only applicable for regional
   resources. You must specify this field as part of the HTTP request URL. It is not settable as
   a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#diskType for disk types.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getKind))))

(defn get-valid-disk-size
  "[Output Only] An optional textual description of the valid disk size, such as \"10GB-10TB\".

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getValidDiskSize))))

(defn set-valid-disk-size
  "[Output Only] An optional textual description of the valid disk size, such as \"10GB-10TB\".

  valid-disk-size - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String valid-disk-size]
    (-> this (.setValidDiskSize valid-disk-size))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#diskType for disk types.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this disk type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^DiskType$Builder this]
    (-> this (.getDeprecated))))

(defn build
  "returns: `com.google.cloud.compute.v1.DiskType`"
  (^com.google.cloud.compute.v1.DiskType [^DiskType$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] An optional description of this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getDescription))))

(defn set-default-disk-size-gb
  "[Output Only] Server-defined default disk size in GB.

  default-disk-size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String default-disk-size-gb]
    (-> this (.setDefaultDiskSizeGb default-disk-size-gb))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DiskType`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^com.google.cloud.compute.v1.DiskType other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] URL of the zone where the disk type resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the disk type resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getZone))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this disk type.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn get-region
  "[Output Only] URL of the region where the disk type resides. Only applicable for regional
   resources. You must specify this field as part of the HTTP request URL. It is not settable as
   a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType$Builder this]
    (-> this (.getRegion))))

