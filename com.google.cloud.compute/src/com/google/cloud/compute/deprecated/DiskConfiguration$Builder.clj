(ns com.google.cloud.compute.deprecated.DiskConfiguration$Builder
  "Base builder for disk configurations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskConfiguration$Builder]))

(defn set-size-gb
  "Sets the size of the persistent disk, in GB.

  size-gb - `java.lang.Long`

  returns: `B`"
  ([^DiskConfiguration$Builder this ^java.lang.Long size-gb]
    (-> this (.setSizeGb size-gb))))

(defn set-disk-type
  "Sets the identity of the disk type. If not set pd-standard will be used.

  disk-type - `com.google.cloud.compute.deprecated.DiskTypeId`

  returns: `B`"
  ([^DiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.DiskTypeId disk-type]
    (-> this (.setDiskType disk-type))))

(defn build
  "Creates an object.

  returns: `T`"
  ([^DiskConfiguration$Builder this]
    (-> this (.build))))

