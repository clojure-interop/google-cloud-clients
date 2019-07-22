(ns com.google.cloud.compute.v1.AttachedDiskInitializeParams
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AttachedDiskInitializeParams]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AttachedDiskInitializeParams`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^com.google.cloud.compute.v1.AttachedDiskInitializeParams prototype]
    (AttachedDiskInitializeParams/newBuilder prototype))
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder []
    (AttachedDiskInitializeParams/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams []
    (AttachedDiskInitializeParams/getDefaultInstance )))

(defn get-disk-name
  "Specifies the disk name. If not specified, the default is to use the name of the instance. If
   the disk with the instance name exists already in the given zone/region, a new name will be
   automatically generated.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getDiskName))))

(defn get-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDiskInitializeParams this]
    (-> this (.getSourceSnapshotEncryptionKey))))

(defn get-disk-type
  "Specifies the disk type to use to create the instance. If not specified, the default is
   pd-standard, specified using the full URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard

   Other values include pd-ssd and local-ssd. If you define this field, you can provide either
   the full or partial URL. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
   projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   InstanceTemplate, this is the name of the disk type, not URL.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getDiskType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AttachedDiskInitializeParams this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.toString))))

(defn get-labels-map
  "Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   field is only applicable for persistent disks.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^AttachedDiskInitializeParams this]
    (-> this (.getLabelsMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AttachedDiskInitializeParams this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-source-image
  "The source image to create this disk. When creating a new instance, one of
   initializeParams.sourceImage or disks.source is required except for local SSD.

   To create a disk with one of the public operating system images, specify the image by its
   family name. For example, specify family/debian-9 to use the latest Debian 9 image:
   projects/debian-cloud/global/images/family/debian-9

   Alternatively, use a specific version of a public operating system image:
   projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD

   To create a disk with a custom image that you created, specify the image name in the
   following format: global/images/my-custom-image

   You can also specify a custom image by its image family, which returns the latest version of
   the image in that family. Replace the image name with family/family-name:
   global/images/family/my-image-family

   If the source image is deleted later, this field will not be set.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getSourceImage))))

(defn get-description
  "An optional description. Provide this property when creating the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getDescription))))

(defn get-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

   Instance templates do not store customer-supplied encryption keys, so you cannot create
   disks for instances in a managed instance group if the source images are encrypted with your
   own keys.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDiskInitializeParams this]
    (-> this (.getSourceImageEncryptionKey))))

(defn get-disk-size-gb
  "Specifies the size of the disk in base-2 GB.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getDiskSizeGb))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AttachedDiskInitializeParams this]
    (-> this (.getApiMessageRequestBody))))

(defn get-source-snapshot
  "The source snapshot to create this disk. When creating a new instance, one of
   initializeParams.sourceSnapshot or disks.source is required except for local SSD.

   To create a disk with a snapshot that you created, specify the snapshot name in the
   following format: global/snapshots/my-backup

   If the source snapshot is deleted later, this field will not be set.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams this]
    (-> this (.getSourceSnapshot))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDiskInitializeParams this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDiskInitializeParams this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams this]
    (-> this (.toBuilder))))

