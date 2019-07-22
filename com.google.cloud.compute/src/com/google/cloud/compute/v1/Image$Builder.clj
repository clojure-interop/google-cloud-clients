(ns com.google.cloud.compute.v1.Image$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Image$Builder]))

(defn set-archive-size-bytes
  "Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).

  archive-size-bytes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String archive-size-bytes]
    (-> this (.setArchiveSizeBytes archive-size-bytes))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-family
  "The name of the image family to which this image belongs. You can create disks by specifying
   an image family instead of a specific image name. The image family always returns its latest
   image that is not deprecated. The name of the image family must comply with RFC1035.

  family - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String family]
    (-> this (.setFamily family))))

(defn get-source-disk-id
  "[Output Only] The ID value of the disk used to create this image. This value may be used to
   determine whether the image was taken from the current or a previous instance of a given disk
   name.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceDiskId))))

(defn set-source-disk-encryption-key
  "The customer-supplied encryption key of the source disk. Required if the source disk is
   protected by a customer-supplied encryption key.

  source-disk-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-disk-encryption-key]
    (-> this (.setSourceDiskEncryptionKey source-disk-encryption-key))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn put-all-labels
  "Labels to apply to this image. These can be later modified by the setLabels method.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn set-source-image-id
  "[Output Only] The ID value of the image used to create this image. This value may be used to
   determine whether the image was taken from the current or a previous instance of a given
   image name.

  source-image-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-image-id]
    (-> this (.setSourceImageId source-image-id))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#image for images.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the image. An image can be used to create other resources, such
   as instances, only after the image has been successfully created and the status is set to
   READY. Possible values are FAILED, PENDING, or READY.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getStatus))))

(defn set-source-disk
  "URL of the source disk used to create this image. This can be a full or valid partial URL.
   You must provide either this property or the rawDisk.source property but not both to create
   an image. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk -
   projects/project/zones/zone/disks/disk - zones/zone/disks/disk

  source-disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn get-source-disk
  "URL of the source disk used to create this image. This can be a full or valid partial URL.
   You must provide either this property or the rawDisk.source property but not both to create
   an image. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk -
   projects/project/zones/zone/disks/disk - zones/zone/disks/disk

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceDisk))))

(defn get-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot. Required if the source snapshot
   is protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Image$Builder this]
    (-> this (.getSourceSnapshotEncryptionKey))))

(defn set-source-disk-id
  "[Output Only] The ID value of the disk used to create this image. This value may be used to
   determine whether the image was taken from the current or a previous instance of a given disk
   name.

  source-disk-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-disk-id]
    (-> this (.setSourceDiskId source-disk-id))))

(defn add-all-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.util.List guest-os-features]
    (-> this (.addAllGuestOsFeatures guest-os-features))))

(defn add-license-codes
  "Integer license codes indicating which licenses are attached to this image.

  license-codes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String license-codes]
    (-> this (.addLicenseCodes license-codes))))

(defn set-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

  source-image-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-image-encryption-key]
    (-> this (.setSourceImageEncryptionKey source-image-encryption-key))))

(defn get-labels-map
  "Labels to apply to this image. These can be later modified by the setLabels method.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Image$Builder this]
    (-> this (.getLabelsMap))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#image for images.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-all-licenses
  "Any applicable license URI.

  licenses - `java.util.List`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.util.List licenses]
    (-> this (.addAllLicenses licenses))))

(defn set-source-snapshot-id
  "[Output Only] The ID value of the snapshot used to create this image. This value may be used
   to determine whether the snapshot was taken from the current or a previous instance of a
   given snapshot name.

  source-snapshot-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-snapshot-id]
    (-> this (.setSourceSnapshotId source-snapshot-id))))

(defn get-source-disk-encryption-key
  "The customer-supplied encryption key of the source disk. Required if the source disk is
   protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Image$Builder this]
    (-> this (.getSourceDiskEncryptionKey))))

(defn set-disk-size-gb
  "Size of the image when restored onto a persistent disk (in GB).

  disk-size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String disk-size-gb]
    (-> this (.setDiskSizeGb disk-size-gb))))

(defn set-source-type
  "The type of the image used to create this disk. The default and only value is RAW

  source-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-type]
    (-> this (.setSourceType source-type))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-licenses-list
  "Any applicable license URI.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Image$Builder this]
    (-> this (.getLicensesList))))

(defn add-licenses
  "Any applicable license URI.

  licenses - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String licenses]
    (-> this (.addLicenses licenses))))

(defn get-source-image
  "URL of the source image used to create this image. This can be a full or valid partial URL.
   You must provide exactly one of: - this property, or - the rawDisk.source property, or - the
   sourceDisk property in order to create an image.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceImage))))

(defn get-deprecated
  "The deprecation status associated with this image.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^Image$Builder this]
    (-> this (.getDeprecated))))

(defn get-label-fingerprint
  "A fingerprint for the labels being applied to this image, which is essentially a hash of the
   labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an image.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getLabelFingerprint))))

(defn set-source-image
  "URL of the source image used to create this image. This can be a full or valid partial URL.
   You must provide exactly one of: - this property, or - the rawDisk.source property, or - the
   sourceDisk property in order to create an image.

  source-image - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-image]
    (-> this (.setSourceImage source-image))))

(defn get-archive-size-bytes
  "Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getArchiveSizeBytes))))

(defn build
  "returns: `com.google.cloud.compute.v1.Image`"
  (^com.google.cloud.compute.v1.Image [^Image$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getDescription))))

(defn get-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Image$Builder this]
    (-> this (.getSourceImageEncryptionKey))))

(defn add-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `com.google.cloud.compute.v1.GuestOsFeature`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.GuestOsFeature guest-os-features]
    (-> this (.addGuestOsFeatures guest-os-features))))

(defn add-all-license-codes
  "Integer license codes indicating which licenses are attached to this image.

  license-codes - `java.util.List`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.util.List license-codes]
    (-> this (.addAllLicenseCodes license-codes))))

(defn get-family
  "The name of the image family to which this image belongs. You can create disks by specifying
   an image family instead of a specific image name. The image family always returns its latest
   image that is not deprecated. The name of the image family must comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getFamily))))

(defn get-disk-size-gb
  "Size of the image when restored onto a persistent disk (in GB).

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getDiskSizeGb))))

(defn get-image-encryption-key
  "Encrypts the image using a customer-supplied encryption key.

   After you encrypt an image with a customer-supplied key, you must provide the same key if
   you use the image later (e.g. to create a disk from the image).

   Customer-supplied encryption keys do not protect access to metadata of the disk.

   If you do not provide an encryption key when creating the image, then the disk will be
   encrypted using an automatically generated key and you do not need to provide a key to use
   the image later.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Image$Builder this]
    (-> this (.getImageEncryptionKey))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Image`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.Image other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSelfLink))))

(defn get-source-snapshot
  "URL of the source snapshot used to create this image. This can be a full or valid partial
   URL. You must provide exactly one of: - this property, or - the sourceImage property, or -
   the rawDisk.source property, or - the sourceDisk property in order to create an image.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceSnapshot))))

(defn get-guest-os-features-list
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  returns: `java.util.List<com.google.cloud.compute.v1.GuestOsFeature>`"
  (^java.util.List [^Image$Builder this]
    (-> this (.getGuestOsFeaturesList))))

(defn get-source-type
  "The type of the image used to create this disk. The default and only value is RAW

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceType))))

(defn get-raw-disk
  "The parameters of the raw disk image.

  returns: `com.google.cloud.compute.v1.RawDisk`"
  (^com.google.cloud.compute.v1.RawDisk [^Image$Builder this]
    (-> this (.getRawDisk))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this]
    (-> this (.clone))))

(defn get-license-codes-list
  "Integer license codes indicating which licenses are attached to this image.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Image$Builder this]
    (-> this (.getLicenseCodesList))))

(defn get-source-snapshot-id
  "[Output Only] The ID value of the snapshot used to create this image. This value may be used
   to determine whether the snapshot was taken from the current or a previous instance of a
   given snapshot name.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceSnapshotId))))

(defn set-image-encryption-key
  "Encrypts the image using a customer-supplied encryption key.

   After you encrypt an image with a customer-supplied key, you must provide the same key if
   you use the image later (e.g. to create a disk from the image).

   Customer-supplied encryption keys do not protect access to metadata of the disk.

   If you do not provide an encryption key when creating the image, then the disk will be
   encrypted using an automatically generated key and you do not need to provide a key to use
   the image later.

  image-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey image-encryption-key]
    (-> this (.setImageEncryptionKey image-encryption-key))))

(defn set-label-fingerprint
  "A fingerprint for the labels being applied to this image, which is essentially a hash of the
   labels used for optimistic locking. The fingerprint is initially generated by Compute Engine
   and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an image.

  label-fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String label-fingerprint]
    (-> this (.setLabelFingerprint label-fingerprint))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-source-snapshot
  "URL of the source snapshot used to create this image. This can be a full or valid partial
   URL. You must provide exactly one of: - this property, or - the sourceImage property, or -
   the rawDisk.source property, or - the sourceDisk property in order to create an image.

  source-snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String source-snapshot]
    (-> this (.setSourceSnapshot source-snapshot))))

(defn set-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot. Required if the source snapshot
   is protected by a customer-supplied encryption key.

  source-snapshot-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-snapshot-encryption-key]
    (-> this (.setSourceSnapshotEncryptionKey source-snapshot-encryption-key))))

(defn set-raw-disk
  "The parameters of the raw disk image.

  raw-disk - `com.google.cloud.compute.v1.RawDisk`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.RawDisk raw-disk]
    (-> this (.setRawDisk raw-disk))))

(defn set-deprecated
  "The deprecation status associated with this image.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn get-source-image-id
  "[Output Only] The ID value of the image used to create this image. This value may be used to
   determine whether the image was taken from the current or a previous instance of a given
   image name.

  returns: `java.lang.String`"
  (^java.lang.String [^Image$Builder this]
    (-> this (.getSourceImageId))))

(defn set-status
  "[Output Only] The status of the image. An image can be used to create other resources, such
   as instances, only after the image has been successfully created and the status is set to
   READY. Possible values are FAILED, PENDING, or READY.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Image$Builder`"
  (^com.google.cloud.compute.v1.Image$Builder [^Image$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

