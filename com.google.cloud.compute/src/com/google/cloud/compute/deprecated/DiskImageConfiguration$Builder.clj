(ns com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder
  "A builder for DiskImageConfiguration objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskImageConfiguration$Builder]))

(defn set-source-disk
  "Sets the identity of the source disk used to create the image.

  source-disk - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder`"
  (^com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder [^DiskImageConfiguration$Builder this ^com.google.cloud.compute.deprecated.DiskId source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn build
  "Creates a DiskImageConfiguration object.

  returns: `com.google.cloud.compute.deprecated.DiskImageConfiguration`"
  (^com.google.cloud.compute.deprecated.DiskImageConfiguration [^DiskImageConfiguration$Builder this]
    (-> this (.build))))

