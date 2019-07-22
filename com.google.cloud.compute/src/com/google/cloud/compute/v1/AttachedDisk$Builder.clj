(ns com.google.cloud.compute.v1.AttachedDisk$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AttachedDisk$Builder]))

(defn get-mode
  "The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   default is to attach the disk in READ_WRITE mode.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getMode))))

(defn set-device-name
  "Specifies a unique device name of your choice that is reflected into the
   /dev/disk/by-id/google-* tree of a Linux operating system running within the instance.
   This name can be used to reference the device for mounting, resizing, and so on, from within
   the instance.

   If not specified, the server chooses a default device name to apply to this disk, in the
   form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is
   only applicable for persistent disks.

  device-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String device-name]
    (-> this (.setDeviceName device-name))))

(defn get-type
  "Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default
   is PERSISTENT.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getType))))

(defn get-interface
  "Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
   The default is SCSI. Persistent disks must always use SCSI and the request will fail if you
   attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either
   NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getInterface))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#attachedDisk for attached disks.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getKind))))

(defn set-mode
  "The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   default is to attach the disk in READ_WRITE mode.

  mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String mode]
    (-> this (.setMode mode))))

(defn get-index
  "[Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   have many disks attached to an instance, each disk would have a unique index number.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AttachedDisk$Builder this]
    (-> this (.getIndex))))

(defn set-type
  "Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default
   is PERSISTENT.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn add-all-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.util.List guest-os-features]
    (-> this (.addAllGuestOsFeatures guest-os-features))))

(defn set-boot
  "Indicates that this is a boot disk. The virtual machine will use the first partition of the
   disk for its root filesystem.

  boot - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.Boolean boot]
    (-> this (.setBoot boot))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#attachedDisk for attached disks.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-all-licenses
  "[Output Only] Any valid publicly visible licenses.

  licenses - `java.util.List`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.util.List licenses]
    (-> this (.addAllLicenses licenses))))

(defn get-device-name
  "Specifies a unique device name of your choice that is reflected into the
   /dev/disk/by-id/google-* tree of a Linux operating system running within the instance.
   This name can be used to reference the device for mounting, resizing, and so on, from within
   the instance.

   If not specified, the server chooses a default device name to apply to this disk, in the
   form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is
   only applicable for persistent disks.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getDeviceName))))

(defn set-initialize-params
  "[Input Only] Specifies the parameters for a new disk that will be created alongside the new
   instance. Use initialization parameters to create boot disks or local SSDs attached to the
   new instance.

   This property is mutually exclusive with the source property; you can only define one or
   the other, but not both.

  initialize-params - `com.google.cloud.compute.v1.AttachedDiskInitializeParams`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^com.google.cloud.compute.v1.AttachedDiskInitializeParams initialize-params]
    (-> this (.setInitializeParams initialize-params))))

(defn set-interface
  "Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
   The default is SCSI. Persistent disks must always use SCSI and the request will fail if you
   attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either
   NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.

  interface-2 - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String interface-2]
    (-> this (.setInterface interface-2))))

(defn get-licenses-list
  "[Output Only] Any valid publicly visible licenses.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AttachedDisk$Builder this]
    (-> this (.getLicensesList))))

(defn add-licenses
  "[Output Only] Any valid publicly visible licenses.

  licenses - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String licenses]
    (-> this (.addLicenses licenses))))

(defn get-auto-delete?
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when
   the disk is detached from the instance).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk$Builder this]
    (-> this (.getAutoDelete))))

(defn get-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating
   a new instance, one of initializeParams.sourceImage or disks.source is required except for
   local SSD.

   If desired, you can also attach existing non-root persistent disks using this property.
   This field is only applicable for persistent disks.

   Note that for InstanceTemplate, specify the disk name, not the URL for the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk$Builder this]
    (-> this (.getSource))))

(defn build
  "returns: `com.google.cloud.compute.v1.AttachedDisk`"
  (^com.google.cloud.compute.v1.AttachedDisk [^AttachedDisk$Builder this]
    (-> this (.build))))

(defn get-boot?
  "Indicates that this is a boot disk. The virtual machine will use the first partition of the
   disk for its root filesystem.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk$Builder this]
    (-> this (.getBoot))))

(defn add-guest-os-features
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  guest-os-features - `com.google.cloud.compute.v1.GuestOsFeature`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^com.google.cloud.compute.v1.GuestOsFeature guest-os-features]
    (-> this (.addGuestOsFeatures guest-os-features))))

(defn set-disk-encryption-key
  "Encrypts or decrypts a disk using a customer-supplied encryption key.

   If you are creating a new disk, this field encrypts the new disk using an encryption key
   that you provide. If you are attaching an existing disk that is already encrypted, this field
   decrypts the disk using the customer-supplied encryption key.

   If you encrypt a disk using a customer-supplied key, you must provide the same key again
   when you attempt to use this resource at a later time. For example, you must provide the key
   when you create a snapshot or an image from the disk or when you attach the disk to a virtual
   machine instance.

   If you do not provide an encryption key, then the disk will be encrypted using an
   automatically generated key and you do not need to provide a key to use the disk later.

   Instance templates do not store customer-supplied encryption keys, so you cannot use your
   own keys to encrypt disks in a managed instance group.

  disk-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey disk-encryption-key]
    (-> this (.setDiskEncryptionKey disk-encryption-key))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AttachedDisk`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^com.google.cloud.compute.v1.AttachedDisk other]
    (-> this (.mergeFrom other))))

(defn set-index
  "[Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   have many disks attached to an instance, each disk would have a unique index number.

  index - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.Integer index]
    (-> this (.setIndex index))))

(defn get-guest-os-features-list
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  returns: `java.util.List<com.google.cloud.compute.v1.GuestOsFeature>`"
  (^java.util.List [^AttachedDisk$Builder this]
    (-> this (.getGuestOsFeaturesList))))

(defn get-initialize-params
  "[Input Only] Specifies the parameters for a new disk that will be created alongside the new
   instance. Use initialization parameters to create boot disks or local SSDs attached to the
   new instance.

   This property is mutually exclusive with the source property; you can only define one or
   the other, but not both.

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams [^AttachedDisk$Builder this]
    (-> this (.getInitializeParams))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this]
    (-> this (.clone))))

(defn get-disk-encryption-key
  "Encrypts or decrypts a disk using a customer-supplied encryption key.

   If you are creating a new disk, this field encrypts the new disk using an encryption key
   that you provide. If you are attaching an existing disk that is already encrypted, this field
   decrypts the disk using the customer-supplied encryption key.

   If you encrypt a disk using a customer-supplied key, you must provide the same key again
   when you attempt to use this resource at a later time. For example, you must provide the key
   when you create a snapshot or an image from the disk or when you attach the disk to a virtual
   machine instance.

   If you do not provide an encryption key, then the disk will be encrypted using an
   automatically generated key and you do not need to provide a key to use the disk later.

   Instance templates do not store customer-supplied encryption keys, so you cannot use your
   own keys to encrypt disks in a managed instance group.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDisk$Builder this]
    (-> this (.getDiskEncryptionKey))))

(defn set-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating
   a new instance, one of initializeParams.sourceImage or disks.source is required except for
   local SSD.

   If desired, you can also attach existing non-root persistent disks using this property.
   This field is only applicable for persistent disks.

   Note that for InstanceTemplate, specify the disk name, not the URL for the disk.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.String source]
    (-> this (.setSource source))))

(defn set-auto-delete
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when
   the disk is detached from the instance).

  auto-delete - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk$Builder this ^java.lang.Boolean auto-delete]
    (-> this (.setAutoDelete auto-delete))))

