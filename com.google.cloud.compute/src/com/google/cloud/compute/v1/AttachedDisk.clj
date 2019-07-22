(ns com.google.cloud.compute.v1.AttachedDisk
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AttachedDisk]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AttachedDisk`

  returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^com.google.cloud.compute.v1.AttachedDisk prototype]
    (AttachedDisk/newBuilder prototype))
  (^com.google.cloud.compute.v1.AttachedDisk$Builder []
    (AttachedDisk/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AttachedDisk`"
  (^com.google.cloud.compute.v1.AttachedDisk []
    (AttachedDisk/getDefaultInstance )))

(defn get-mode
  "The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   default is to attach the disk in READ_WRITE mode.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getMode))))

(defn get-type
  "Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is
   PERSISTENT.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getType))))

(defn get-interface
  "Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The
   default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt
   to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or
   SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getInterface))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#attachedDisk for attached disks.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getKind))))

(defn get-index
  "[Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   have many disks attached to an instance, each disk would have a unique index number.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AttachedDisk this]
    (-> this (.getIndex))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AttachedDisk this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AttachedDisk this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-device-name
  "Specifies a unique device name of your choice that is reflected into the
   /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This
   name can be used to reference the device for mounting, resizing, and so on, from within the
   instance.

   If not specified, the server chooses a default device name to apply to this disk, in the
   form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is
   only applicable for persistent disks.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getDeviceName))))

(defn get-licenses-list
  "[Output Only] Any valid publicly visible licenses.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AttachedDisk this]
    (-> this (.getLicensesList))))

(defn get-auto-delete?
  "Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   disk is detached from the instance).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk this]
    (-> this (.getAutoDelete))))

(defn get-source
  "Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a
   new instance, one of initializeParams.sourceImage or disks.source is required except for local
   SSD.

   If desired, you can also attach existing non-root persistent disks using this property. This
   field is only applicable for persistent disks.

   Note that for InstanceTemplate, specify the disk name, not the URL for the disk.

  returns: `java.lang.String`"
  (^java.lang.String [^AttachedDisk this]
    (-> this (.getSource))))

(defn get-boot?
  "Indicates that this is a boot disk. The virtual machine will use the first partition of the
   disk for its root filesystem.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AttachedDisk this]
    (-> this (.getBoot))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AttachedDisk this]
    (-> this (.getApiMessageRequestBody))))

(defn get-guest-os-features-list
  "A list of features to enable on the guest operating system. Applicable only for bootable
   images. Read Enabling guest operating system features to see a list of available options.

  returns: `java.util.List<com.google.cloud.compute.v1.GuestOsFeature>`"
  (^java.util.List [^AttachedDisk this]
    (-> this (.getGuestOsFeaturesList))))

(defn get-initialize-params
  "[Input Only] Specifies the parameters for a new disk that will be created alongside the new
   instance. Use initialization parameters to create boot disks or local SSDs attached to the new
   instance.

   This property is mutually exclusive with the source property; you can only define one or the
   other, but not both.

  returns: `com.google.cloud.compute.v1.AttachedDiskInitializeParams`"
  (^com.google.cloud.compute.v1.AttachedDiskInitializeParams [^AttachedDisk this]
    (-> this (.getInitializeParams))))

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
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^AttachedDisk this]
    (-> this (.getDiskEncryptionKey))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttachedDisk this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttachedDisk this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AttachedDisk$Builder`"
  (^com.google.cloud.compute.v1.AttachedDisk$Builder [^AttachedDisk this]
    (-> this (.toBuilder))))

