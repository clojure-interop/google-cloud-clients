(ns com.google.cloud.compute.deprecated.DiskType
  "A Google Compute Engine disk type. A disk type represents the type of disk to use, such as pd-ssd or pd-standard."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskType]))

(defn get-default-disk-size-gb
  "Returns the service-defined default disk size in GB.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskType this]
    (-> this (.getDefaultDiskSizeGb))))

(defn get-deprecation-status
  "Returns the deprecation status of the disk type. If DeprecationStatus.getStatus() is
   either DeprecationStatus.Status.DELETED or DeprecationStatus.Status.OBSOLETE
   the disk type should not be used. Returns null if the disk type is not deprecated.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<com.google.cloud.compute.deprecated.DiskTypeId>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^DiskType this]
    (-> this (.getDeprecationStatus))))

(defn get-valid-disk-size
  "Returns an optional textual description of the valid disk size, such as \"10GB-10TB\".

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getValidDiskSize))))

(defn get-disk-type-id
  "Returns the disk type's identity.

  returns: `com.google.cloud.compute.deprecated.DiskTypeId`"
  (^com.google.cloud.compute.deprecated.DiskTypeId [^DiskType this]
    (-> this (.getDiskTypeId))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.toString))))

(defn get-description
  "Returns a textual description of the disk type.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskType this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DiskType this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the disk type.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskType this ^java.lang.Object obj]
    (-> this (.equals obj))))

