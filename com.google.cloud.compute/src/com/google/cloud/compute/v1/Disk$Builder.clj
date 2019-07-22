(ns com.google.cloud.compute.v1.Disk$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Disk$Builder]))

(defn set-options
  "Internal use only.

  options - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String options]
    (-> this (.setOptions options))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-physical-block-size-bytes
  "Physical block size of the persistent disk, in bytes. If not present in a request, a default
   value is used. Currently supported sizes are 4096 and 16384, other sizes may be added in the
   future. If an unsupported value is requested, the error message will list the supported
   values for the caller's project.

  physical-block-size-bytes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String physical-block-size-bytes]
    (-> this (.setPhysicalBlockSizeBytes physical-block-size-bytes))))

(defn add-all-replica-zones
  "URLs of the zones where the disk should be replicated to. Only applicable for regional
   resources.

  replica-zones - `java.util.List`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.List replica-zones]
    (-> this (.addAllReplicaZones replica-zones))))

(defn set-region
  "[Output Only] URL of the region where the disk resides. Only applicable for regional
   resources. You must specify this field as part of the HTTP request URL. It is not settable as
   a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn put-all-labels
  "Labels to apply to this disk. These can be later modified by the setLabels method.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn set-source-image-id
  "[Output Only] The ID value of the image used to create this disk. This value identifies the
   exact image that was used to create this persistent disk. For example, if you created the
   persistent disk from an image that was later deleted and recreated under the same name, the
   source image ID would identify the exact version of the image that was used.

  source-image-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String source-image-id]
    (-> this (.setSourceImageId source-image-id))))

(defn get-type
  "URL of the disk type resource describing which disk type to use to create the disk. Provide
   this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard
   or pd-ssd

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#disk for disks.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of disk creation.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getStatus))))

(defn set-type
  "URL of the disk type resource describing which disk type to use to create the disk. Provide
   this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard
   or pd-ssd

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn get-replica-zones-list
  "URLs of the zones where the disk should be replicated to. Only applicable for regional
   resources.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Disk$Builder this]
    (-> this (.getReplicaZonesList))))

(defn add-replica-zones
  "URLs of the zones where the disk should be replicated to. Only applicable for regional
   resources.

  replica-zones - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String replica-zones]
    (-> this (.addReplicaZones replica-zones))))

(defn get-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot. Required if the source snapshot
   is protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Disk$Builder this]
    (-> this (.getSourceSnapshotEncryptionKey))))

(defn set-size-gb
  "Size of the persistent disk, specified in GB. You can specify this field when creating a
   persistent disk using the sourceImage or sourceSnapshot parameter, or specify it alone to
   create an empty persistent disk.

   If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb
   must not be less than the size of the sourceImage or the size of the snapshot. Acceptable
   values are 1 to 65536, inclusive.

  size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String size-gb]
    (-> this (.setSizeGb size-gb))))

(defn set-last-attach-timestamp
  "[Output Only] Last attach timestamp in RFC3339 text format.

  last-attach-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String last-attach-timestamp]
    (-> this (.setLastAttachTimestamp last-attach-timestamp))))

(defn add-all-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.List guest-os-features]
    (-> this (.addAllGuestOsFeatures guest-os-features))))

(defn add-license-codes
  "Integer license codes indicating which licenses are attached to this disk.

  license-codes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String license-codes]
    (-> this (.addLicenseCodes license-codes))))

(defn get-users-list
  "[Output Only] Links to the users of the disk (attached instances) in form:
   projects/project/zones/zone/instances/instance

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Disk$Builder this]
    (-> this (.getUsersList))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-all-users
  "[Output Only] Links to the users of the disk (attached instances) in form:
   projects/project/zones/zone/instances/instance

  users - `java.util.List`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.List users]
    (-> this (.addAllUsers users))))

(defn set-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

  source-image-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-image-encryption-key]
    (-> this (.setSourceImageEncryptionKey source-image-encryption-key))))

(defn get-labels-map
  "Labels to apply to this disk. These can be later modified by the setLabels method.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Disk$Builder this]
    (-> this (.getLabelsMap))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#disk for disks.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-all-licenses
  "A list of publicly visible licenses. Reserved for Google's use.

  licenses - `java.util.List`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.List licenses]
    (-> this (.addAllLicenses licenses))))

(defn set-source-snapshot-id
  "[Output Only] The unique ID of the snapshot used to create this disk. This value identifies
   the exact snapshot that was used to create this persistent disk. For example, if you created
   the persistent disk from a snapshot that was later deleted and recreated under the same name,
   the source snapshot ID would identify the exact version of the snapshot that was used.

  source-snapshot-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String source-snapshot-id]
    (-> this (.setSourceSnapshotId source-snapshot-id))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-licenses-list
  "A list of publicly visible licenses. Reserved for Google's use.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Disk$Builder this]
    (-> this (.getLicensesList))))

(defn add-licenses
  "A list of publicly visible licenses. Reserved for Google's use.

  licenses - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String licenses]
    (-> this (.addLicenses licenses))))

(defn get-source-image
  "The source image used to create this disk. If the source image is deleted, this field will
   not be set.

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

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSourceImage))))

(defn get-label-fingerprint
  "A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   labels set used for optimistic locking. The fingerprint is initially generated by Compute
   Engine and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a disk.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getLabelFingerprint))))

(defn set-source-image
  "The source image used to create this disk. If the source image is deleted, this field will
   not be set.

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

  source-image - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String source-image]
    (-> this (.setSourceImage source-image))))

(defn build
  "returns: `com.google.cloud.compute.v1.Disk`"
  (^com.google.cloud.compute.v1.Disk [^Disk$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getDescription))))

(defn set-last-detach-timestamp
  "[Output Only] Last detach timestamp in RFC3339 text format.

  last-detach-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String last-detach-timestamp]
    (-> this (.setLastDetachTimestamp last-detach-timestamp))))

(defn get-source-image-encryption-key
  "The customer-supplied encryption key of the source image. Required if the source image is
   protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Disk$Builder this]
    (-> this (.getSourceImageEncryptionKey))))

(defn add-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `com.google.cloud.compute.v1.GuestOsFeature`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.v1.GuestOsFeature guest-os-features]
    (-> this (.addGuestOsFeatures guest-os-features))))

(defn add-all-license-codes
  "Integer license codes indicating which licenses are attached to this disk.

  license-codes - `java.util.List`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.util.List license-codes]
    (-> this (.addAllLicenseCodes license-codes))))

(defn set-disk-encryption-key
  "Encrypts the disk using a customer-supplied encryption key.

   After you encrypt a disk with a customer-supplied key, you must provide the same key if
   you use the disk later (e.g. to create a disk snapshot, to create a disk image, to create a
   machine image, or to attach the disk to a virtual machine).

   Customer-supplied encryption keys do not protect access to metadata of the disk.

   If you do not provide an encryption key when creating the disk, then the disk will be
   encrypted using an automatically generated key and you do not need to provide a key to use
   the disk later.

  disk-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey disk-encryption-key]
    (-> this (.setDiskEncryptionKey disk-encryption-key))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Disk`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.v1.Disk other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] URL of the zone where the disk resides. You must specify this field as part of
   the HTTP request URL. It is not settable as a field in the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-options
  "Internal use only.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getOptions))))

(defn get-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSelfLink))))

(defn add-users
  "[Output Only] Links to the users of the disk (attached instances) in form:
   projects/project/zones/zone/instances/instance

  users - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String users]
    (-> this (.addUsers users))))

(defn get-source-snapshot
  "The source snapshot used to create this disk. You can provide this as a partial or full URL
   to the resource. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot -
   projects/project/global/snapshots/snapshot - global/snapshots/snapshot

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSourceSnapshot))))

(defn get-zone
  "[Output Only] URL of the zone where the disk resides. You must specify this field as part of
   the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getZone))))

(defn get-guest-os-features-list
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  returns: `java.util.List<com.google.cloud.compute.v1.GuestOsFeature>`"
  (^java.util.List [^Disk$Builder this]
    (-> this (.getGuestOsFeaturesList))))

(defn get-last-detach-timestamp
  "[Output Only] Last detach timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getLastDetachTimestamp))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this]
    (-> this (.clone))))

(defn get-disk-encryption-key
  "Encrypts the disk using a customer-supplied encryption key.

   After you encrypt a disk with a customer-supplied key, you must provide the same key if
   you use the disk later (e.g. to create a disk snapshot, to create a disk image, to create a
   machine image, or to attach the disk to a virtual machine).

   Customer-supplied encryption keys do not protect access to metadata of the disk.

   If you do not provide an encryption key when creating the disk, then the disk will be
   encrypted using an automatically generated key and you do not need to provide a key to use
   the disk later.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Disk$Builder this]
    (-> this (.getDiskEncryptionKey))))

(defn get-license-codes-list
  "Integer license codes indicating which licenses are attached to this disk.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Disk$Builder this]
    (-> this (.getLicenseCodesList))))

(defn get-source-snapshot-id
  "[Output Only] The unique ID of the snapshot used to create this disk. This value identifies
   the exact snapshot that was used to create this persistent disk. For example, if you created
   the persistent disk from a snapshot that was later deleted and recreated under the same name,
   the source snapshot ID would identify the exact version of the snapshot that was used.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSourceSnapshotId))))

(defn get-last-attach-timestamp
  "[Output Only] Last attach timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getLastAttachTimestamp))))

(defn set-label-fingerprint
  "A fingerprint for the labels being applied to this disk, which is essentially a hash of the
   labels set used for optimistic locking. The fingerprint is initially generated by Compute
   Engine and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a disk.

  label-fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String label-fingerprint]
    (-> this (.setLabelFingerprint label-fingerprint))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-source-snapshot
  "The source snapshot used to create this disk. You can provide this as a partial or full URL
   to the resource. For example, the following are valid values: -
   https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot -
   projects/project/global/snapshots/snapshot - global/snapshots/snapshot

  source-snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String source-snapshot]
    (-> this (.setSourceSnapshot source-snapshot))))

(defn get-physical-block-size-bytes
  "Physical block size of the persistent disk, in bytes. If not present in a request, a default
   value is used. Currently supported sizes are 4096 and 16384, other sizes may be added in the
   future. If an unsupported value is requested, the error message will list the supported
   values for the caller's project.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getPhysicalBlockSizeBytes))))

(defn set-source-snapshot-encryption-key
  "The customer-supplied encryption key of the source snapshot. Required if the source snapshot
   is protected by a customer-supplied encryption key.

  source-snapshot-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-snapshot-encryption-key]
    (-> this (.setSourceSnapshotEncryptionKey source-snapshot-encryption-key))))

(defn get-source-image-id
  "[Output Only] The ID value of the image used to create this disk. This value identifies the
   exact image that was used to create this persistent disk. For example, if you created the
   persistent disk from an image that was later deleted and recreated under the same name, the
   source image ID would identify the exact version of the image that was used.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSourceImageId))))

(defn get-size-gb
  "Size of the persistent disk, specified in GB. You can specify this field when creating a
   persistent disk using the sourceImage or sourceSnapshot parameter, or specify it alone to
   create an empty persistent disk.

   If you specify this field along with sourceImage or sourceSnapshot, the value of sizeGb
   must not be less than the size of the sourceImage or the size of the snapshot. Acceptable
   values are 1 to 65536, inclusive.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getSizeGb))))

(defn set-status
  "[Output Only] The status of disk creation.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Disk$Builder`"
  (^com.google.cloud.compute.v1.Disk$Builder [^Disk$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] URL of the region where the disk resides. Only applicable for regional
   resources. You must specify this field as part of the HTTP request URL. It is not settable as
   a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Disk$Builder this]
    (-> this (.getRegion))))

