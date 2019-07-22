(ns com.google.cloud.compute.deprecated.DiskImageConfiguration
  "A Google Compute Engine disk image configuration. This class can be used to create images from an
  existing Google Compute Engine disk."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskImageConfiguration]))

(defn *new-builder
  "Creates a builder for a DiskImageConfiguration given the source disk identity.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder [^com.google.cloud.compute.deprecated.DiskId source-disk]
    (DiskImageConfiguration/newBuilder source-disk)))

(defn *of
  "Creates a DiskImageConfiguration object given the source disk identity.

  source-id - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.DiskImageConfiguration`"
  (^com.google.cloud.compute.deprecated.DiskImageConfiguration [^com.google.cloud.compute.deprecated.DiskId source-id]
    (DiskImageConfiguration/of source-id)))

(defn get-source-disk
  "Returns the identity of the source disk used to create this image.

  returns: `com.google.cloud.compute.deprecated.DiskId`"
  (^com.google.cloud.compute.deprecated.DiskId [^DiskImageConfiguration this]
    (-> this (.getSourceDisk))))

(defn get-source-disk-id
  "Returns the service-generated unique id of the disk used to create this image. This value may
   be used to determine whether the image was taken from the current or a previous instance of a
   given disk name.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskImageConfiguration this]
    (-> this (.getSourceDiskId))))

(defn to-builder
  "Description copied from class: ImageConfiguration

  returns: `com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder [^DiskImageConfiguration this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskImageConfiguration this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskImageConfiguration this ^java.lang.Object obj]
    (-> this (.equals obj))))

