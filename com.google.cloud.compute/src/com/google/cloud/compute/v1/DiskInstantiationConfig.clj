(ns com.google.cloud.compute.v1.DiskInstantiationConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskInstantiationConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DiskInstantiationConfig`

  returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^com.google.cloud.compute.v1.DiskInstantiationConfig prototype]
    (DiskInstantiationConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder []
    (DiskInstantiationConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DiskInstantiationConfig`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig []
    (DiskInstantiationConfig/getDefaultInstance )))

(defn get-instantiate-from
  "Specifies whether to include the disk and what image to use. Possible values are: -
   source-image: to use the same image that was used to create the source instance's corresponding
   disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to
   use the same image family that was used to create the source instance's corresponding disk.
   Applicable to the boot disk and additional read-write disks. - custom-image: to use a
   user-provided image url for disk creation. Applicable to the boot disk and additional
   read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only
   disks. - do-not-include: to exclude a disk from the template. Applicable to additional
   read-write disks, local SSDs, and read-only disks.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig this]
    (-> this (.getInstantiateFrom))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DiskInstantiationConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DiskInstantiationConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-device-name
  "Specifies the device name of the disk to which the configurations apply to.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig this]
    (-> this (.getDeviceName))))

(defn get-custom-image
  "The custom source image to be used to restore this disk when instantiating this instance
   template.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskInstantiationConfig this]
    (-> this (.getCustomImage))))

(defn get-auto-delete?
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   disk is detached from the instance).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^DiskInstantiationConfig this]
    (-> this (.getAutoDelete))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DiskInstantiationConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskInstantiationConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskInstantiationConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DiskInstantiationConfig$Builder`"
  (^com.google.cloud.compute.v1.DiskInstantiationConfig$Builder [^DiskInstantiationConfig this]
    (-> this (.toBuilder))))

