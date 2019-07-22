(ns com.google.cloud.compute.v1.DiskInstantiationConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskInstantiationConfig$Builder]))

(defn get-instantiate-from
  "Specifies whether to include the disk and what image to use. Possible values are: -
   source-image: to use the same image that was used to create the source instance's
   corresponding disk. Applicable to the boot disk and additional read-write disks. -
   source-image-family: to use the same image family that was used to create the source
   instance's corresponding disk. Applicable to the boot disk and additional read-write disks. -
   custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk
   and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable
   to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to
   additional read-write disks, local SSDs, and read-only disks.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig$Builder this]
    (-> this (.getInstantiateFrom))))

(defn set-custom-image
  "The custom source image to be used to restore this disk when instantiating this instance
   template.

  custom-image - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this ^java.lang.String custom-image]
    (-> this (.setCustomImage custom-image))))

(defn set-device-name
  "Specifies the device name of the disk to which the configurations apply to.

  device-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this ^java.lang.String device-name]
    (-> this (.setDeviceName device-name))))

(defn set-instantiate-from
  "Specifies whether to include the disk and what image to use. Possible values are: -
   source-image: to use the same image that was used to create the source instance's
   corresponding disk. Applicable to the boot disk and additional read-write disks. -
   source-image-family: to use the same image family that was used to create the source
   instance's corresponding disk. Applicable to the boot disk and additional read-write disks. -
   custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk
   and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable
   to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to
   additional read-write disks, local SSDs, and read-only disks.

  instantiate-from - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this ^java.lang.String instantiate-from]
    (-> this (.setInstantiateFrom instantiate-from))))

(defn get-device-name
  "Specifies the device name of the disk to which the configurations apply to.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig$Builder this]
    (-> this (.getDeviceName))))

(defn get-custom-image
  "The custom source image to be used to restore this disk when instantiating this instance
   template.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig$Builder this]
    (-> this (.getCustomImage))))

(defn get-auto-delete?
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when
   the disk is detached from the instance).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^DiskInstantiationConfig$Builder this]
    (-> this (.getAutoDelete))))

(defn build
  "returns: `com.google.cloud.compute.v1.DiskInstantiationConfig`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig [^DiskInstantiationConfig$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DiskInstantiationConfig`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this ^com.google.cloud.compute.v1.DiskInstantiationConfig other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this]
    (-> this (.clone))))

(defn set-auto-delete
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when
   the disk is detached from the instance).

  auto-delete - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig$Builder this ^java.lang.Boolean auto-delete]
    (-> this (.setAutoDelete auto-delete))))

