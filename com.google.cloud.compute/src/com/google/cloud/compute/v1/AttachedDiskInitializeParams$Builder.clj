(ns com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AttachedDiskInitializeParams$Builder]))

(defn set-description
  "An optional description. Provide this property when creating the disk.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-disk-name
  "Specifies the disk name. If not specified, the default is to use the name of the instance. If
   the disk with the instance name exists already in the given zone/region, a new name will be
   automatically generated.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getDiskName))))

(defn put-all-labels
  "Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   field is only applicable for persistent disks.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn get-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getSourceSnapshotEncryptionKey))))

(defn get-disk-type
  "Specifies the disk type to use to create the instance. If not specified, the default is
   pd-standard, specified using the full URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard

   Other values include pd-ssd and local-ssd. If you define this field, you can provide
   either the full or partial URL. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
   projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   InstanceTemplate, this is the name of the disk type, not URL.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getDiskType))))

(defn set-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

   Instance templates do not store customer-supplied encryption keys, so you cannot create
   disks for instances in a managed instance group if the source images are encrypted with your
   own keys.

  source-image-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-image-encryption-key]
    (-> this (.setSourceImageEncryptionKey source-image-encryption-key))))

(defn get-labels-map
  "Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   field is only applicable for persistent disks.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getLabelsMap))))

(defn set-disk-size-gb
  "Specifies the size of the disk in base-2 GB.

  disk-size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String disk-size-gb]
    (-> this (.setDiskSizeGb disk-size-gb))))

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

   You can also specify a custom image by its image family, which returns the latest version
   of the image in that family. Replace the image name with family/family-name:
   global/images/family/my-image-family

   If the source image is deleted later, this field will not be set.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getSourceImage))))

(defn set-source-image
  "The source image to create this disk. When creating a new instance, one of
   initializeParams.sourceImage or disks.source is required except for local SSD.

   To create a disk with one of the public operating system images, specify the image by its
   family name. For example, specify family/debian-9 to use the latest Debian 9 image:
   projects/debian-cloud/global/images/family/debian-9

   Alternatively, use a specific version of a public operating system image:
   projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD

   To create a disk with a custom image that you created, specify the image name in the
   following format: global/images/my-custom-image

   You can also specify a custom image by its image family, which returns the latest version
   of the image in that family. Replace the image name with family/family-name:
   global/images/family/my-image-family

   If the source image is deleted later, this field will not be set.

  source-image - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String source-image]
    (-> this (.setSourceImage source-image))))

(defn set-disk-type
  "Specifies the disk type to use to create the instance. If not specified, the default is
   pd-standard, specified using the full URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard

   Other values include pd-ssd and local-ssd. If you define this field, you can provide
   either the full or partial URL. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
   projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   InstanceTemplate, this is the name of the disk type, not URL.

  disk-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String disk-type]
    (-> this (.setDiskType disk-type))))

(defn build
  "returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams [^AttachedDiskInitializeParams$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description. Provide this property when creating the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getDescription))))

(defn get-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

   Instance templates do not store customer-supplied encryption keys, so you cannot create
   disks for instances in a managed instance group if the source images are encrypted with your
   own keys.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getSourceImageEncryptionKey))))

(defn get-disk-size-gb
  "Specifies the size of the disk in base-2 GB.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getDiskSizeGb))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AttachedDiskInitializeParams`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^com.google.cloud.compute.v1.AttachedDiskInitializeParams other]
    (-> this (.mergeFrom other))))

(defn set-disk-name
  "Specifies the disk name. If not specified, the default is to use the name of the instance. If
   the disk with the instance name exists already in the given zone/region, a new name will be
   automatically generated.

  disk-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String disk-name]
    (-> this (.setDiskName disk-name))))

(defn get-source-snapshot
  "The source snapshot to create this disk. When creating a new instance, one of
   initializeParams.sourceSnapshot or disks.source is required except for local SSD.

   To create a disk with a snapshot that you created, specify the snapshot name in the
   following format: global/snapshots/my-backup

   If the source snapshot is deleted later, this field will not be set.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDiskInitializeParams$Builder this]
    (-> this (.getSourceSnapshot))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this]
    (-> this (.clone))))

(defn set-source-snapshot
  "The source snapshot to create this disk. When creating a new instance, one of
   initializeParams.sourceSnapshot or disks.source is required except for local SSD.

   To create a disk with a snapshot that you created, specify the snapshot name in the
   following format: global/snapshots/my-backup

   If the source snapshot is deleted later, this field will not be set.

  source-snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^java.lang.String source-snapshot]
    (-> this (.setSourceSnapshot source-snapshot))))

(defn set-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot.

  source-snapshot-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams$Builder [^AttachedDiskInitializeParams$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-snapshot-encryption-key]
    (-> this (.setSourceSnapshotEncryptionKey source-snapshot-encryption-key))))

