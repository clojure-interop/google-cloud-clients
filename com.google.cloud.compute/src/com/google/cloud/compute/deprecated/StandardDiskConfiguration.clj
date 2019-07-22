(ns com.google.cloud.compute.deprecated.StandardDiskConfiguration
  "A Google Compute Engine standard persistent disk configuration. This class allows users to create
  a disk given its type and size."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated StandardDiskConfiguration]))

(defn *new-builder
  "Returns a builder for a StandardDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder []
    (StandardDiskConfiguration/newBuilder )))

(defn *of
  "Returns a StandardDiskConfiguration object given the disk type and size in GB.

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`
  size-gb - `long`

  returns: `com.google.cloud.compute.deprecated.StandardDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration [^com.google.cloud.compute.deprecated.DiskTypeId disk-type ^Long size-gb]
    (StandardDiskConfiguration/of disk-type size-gb))
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration [^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (StandardDiskConfiguration/of disk-type)))

(defn to-builder
  "Description copied from class: DiskConfiguration

  returns: `com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder [^StandardDiskConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StandardDiskConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StandardDiskConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

