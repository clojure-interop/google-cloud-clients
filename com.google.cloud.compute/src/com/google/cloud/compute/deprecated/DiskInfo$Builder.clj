(ns com.google.cloud.compute.deprecated.DiskInfo$Builder
  "Builder for DiskInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskInfo$Builder]))

(defn ->builder
  "Constructor."
  (^DiskInfo$Builder []
    (new DiskInfo$Builder )))

(defn set-configuration
  "Sets the disk configuration.

  configuration - `com.google.cloud.compute.deprecated.DiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.DiskInfo$Builder`"
  (^com.google.cloud.compute.deprecated.DiskInfo$Builder [^DiskInfo$Builder this ^com.google.cloud.compute.deprecated.DiskConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn set-disk-id
  "Sets the disk identity.

  disk-id - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.DiskInfo$Builder`"
  (^com.google.cloud.compute.deprecated.DiskInfo$Builder [^DiskInfo$Builder this ^com.google.cloud.compute.deprecated.DiskId disk-id]
    (-> this (.setDiskId disk-id))))

(defn set-description
  "Sets an optional textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.DiskInfo$Builder`"
  (^com.google.cloud.compute.deprecated.DiskInfo$Builder [^DiskInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn build
  "Creates a DiskInfo object.

  returns: `com.google.cloud.compute.deprecated.DiskInfo`"
  (^com.google.cloud.compute.deprecated.DiskInfo [^DiskInfo$Builder this]
    (-> this (.build))))

