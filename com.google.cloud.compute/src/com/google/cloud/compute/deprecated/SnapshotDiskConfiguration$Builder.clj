(ns com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder
  "A builder for SnapshotDiskConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated SnapshotDiskConfiguration$Builder]))

(defn set-size-gb
  "Sets the size of the persistent disk, in GB. If not set the disk will have the size of the
   snapshot. This value can be larger than the snapshot's size. If the provided size is smaller
   than the snapshot's size then disk creation will fail.

  size-gb - `java.lang.Long`

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder [^SnapshotDiskConfiguration$Builder this ^java.lang.Long size-gb]
    (-> this (.setSizeGb size-gb))))

(defn set-source-snapshot
  "Sets the identity of the source snapshot used to create the disk.

  source-snapshot - `com.google.cloud.compute.deprecated.SnapshotId`

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder [^SnapshotDiskConfiguration$Builder this ^com.google.cloud.compute.deprecated.SnapshotId source-snapshot]
    (-> this (.setSourceSnapshot source-snapshot))))

(defn build
  "Creates a SnapshotDiskConfiguration object.

  returns: `com.google.cloud.compute.deprecated.SnapshotDiskConfiguration`"
  (^com.google.cloud.compute.deprecated.SnapshotDiskConfiguration [^SnapshotDiskConfiguration$Builder this]
    (-> this (.build))))

