(ns com.google.cloud.compute.deprecated.Disk$Builder
  "A builder for Disk objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Disk$Builder]))

(defn set-configuration
  "Description copied from class: DiskInfo.Builder

  configuration - `com.google.cloud.compute.deprecated.DiskConfiguration`

  returns: `com.google.cloud.compute.deprecated.Disk$Builder`"
  (^com.google.cloud.compute.deprecated.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.deprecated.DiskConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn set-disk-id
  "Description copied from class: DiskInfo.Builder

  disk-id - `com.google.cloud.compute.deprecated.DiskId`

  returns: `com.google.cloud.compute.deprecated.Disk$Builder`"
  (^com.google.cloud.compute.deprecated.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.deprecated.DiskId disk-id]
    (-> this (.setDiskId disk-id))))

(defn set-description
  "Description copied from class: DiskInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Disk$Builder`"
  (^com.google.cloud.compute.deprecated.Disk$Builder [^Disk$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn build
  "Description copied from class: DiskInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Disk`"
  (^com.google.cloud.compute.deprecated.Disk [^Disk$Builder this]
    (-> this (.build))))

