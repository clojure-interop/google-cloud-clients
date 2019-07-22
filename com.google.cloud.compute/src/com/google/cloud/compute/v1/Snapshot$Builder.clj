(ns com.google.cloud.compute.v1.Snapshot$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Snapshot$Builder]))

(defn add-all-storage-locations
  "GCS bucket storage location of the snapshot (regional or multi-regional).

  storage-locations - `java.util.List`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.util.List storage-locations]
    (-> this (.addAllStorageLocations storage-locations))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-source-disk-id
  "[Output Only] The ID value of the disk used to create this snapshot. This value may be used
   to determine whether the snapshot was taken from the current or a previous instance of a
   given disk name.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getSourceDiskId))))

(defn set-source-disk-encryption-key
  "The customer-supplied encryption key of the source disk. Required if the source disk is
   protected by a customer-supplied encryption key.

  source-disk-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey source-disk-encryption-key]
    (-> this (.setSourceDiskEncryptionKey source-disk-encryption-key))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn put-all-labels
  "Labels to apply to this snapshot. These can be later modified by the setLabels method. Label
   values may be empty.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn add-storage-locations
  "GCS bucket storage location of the snapshot (regional or multi-regional).

  storage-locations - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String storage-locations]
    (-> this (.addStorageLocations storage-locations))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or
   UPLOADING.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getStatus))))

(defn set-source-disk
  "[Output Only] The source disk used to create this snapshot.

  source-disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String source-disk]
    (-> this (.setSourceDisk source-disk))))

(defn get-source-disk
  "[Output Only] The source disk used to create this snapshot.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getSourceDisk))))

(defn set-source-disk-id
  "[Output Only] The ID value of the disk used to create this snapshot. This value may be used
   to determine whether the snapshot was taken from the current or a previous instance of a
   given disk name.

  source-disk-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String source-disk-id]
    (-> this (.setSourceDiskId source-disk-id))))

(defn add-license-codes
  "[Output Only] Integer license codes indicating which licenses are attached to this snapshot.

  license-codes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String license-codes]
    (-> this (.addLicenseCodes license-codes))))

(defn set-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-labels-map
  "Labels to apply to this snapshot. These can be later modified by the setLabels method. Label
   values may be empty.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Snapshot$Builder this]
    (-> this (.getLabelsMap))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#snapshot for Snapshot resources.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-storage-bytes
  "[Output Only] A size of the storage used by the snapshot. As snapshots share storage, this
   number is expected to change with snapshot creation/deletion.

  storage-bytes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String storage-bytes]
    (-> this (.setStorageBytes storage-bytes))))

(defn add-all-licenses
  "[Output Only] A list of public visible licenses that apply to this snapshot. This can be
   because the original image had licenses attached (such as a Windows image).

  licenses - `java.util.List`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.util.List licenses]
    (-> this (.addAllLicenses licenses))))

(defn get-source-disk-encryption-key
  "The customer-supplied encryption key of the source disk. Required if the source disk is
   protected by a customer-supplied encryption key.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Snapshot$Builder this]
    (-> this (.getSourceDiskEncryptionKey))))

(defn get-storage-locations-list
  "GCS bucket storage location of the snapshot (regional or multi-regional).

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Snapshot$Builder this]
    (-> this (.getStorageLocationsList))))

(defn set-disk-size-gb
  "[Output Only] Size of the snapshot, specified in GB.

  disk-size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String disk-size-gb]
    (-> this (.setDiskSizeGb disk-size-gb))))

(defn get-snapshot-encryption-key
  "Encrypts the snapshot using a customer-supplied encryption key.

   After you encrypt a snapshot using a customer-supplied key, you must provide the same key
   if you use the snapshot later. For example, you must provide the encryption key when you
   create a disk from the encrypted snapshot in a future request.

   Customer-supplied encryption keys do not protect access to metadata of the snapshot.

   If you do not provide an encryption key when creating the snapshot, then the snapshot will
   be encrypted using an automatically generated key and you do not need to provide a key to use
   the snapshot later.

  returns: `com.google.cloud.compute.v1.CustomerEncryptionKey`"
  (^com.google.cloud.compute.v1.CustomerEncryptionKey [^Snapshot$Builder this]
    (-> this (.getSnapshotEncryptionKey))))

(defn get-name
  "Name of the resource; provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-licenses-list
  "[Output Only] A list of public visible licenses that apply to this snapshot. This can be
   because the original image had licenses attached (such as a Windows image).

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Snapshot$Builder this]
    (-> this (.getLicensesList))))

(defn add-licenses
  "[Output Only] A list of public visible licenses that apply to this snapshot. This can be
   because the original image had licenses attached (such as a Windows image).

  licenses - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String licenses]
    (-> this (.addLicenses licenses))))

(defn get-label-fingerprint
  "A fingerprint for the labels being applied to this snapshot, which is essentially a hash of
   the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   Engine and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a snapshot.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getLabelFingerprint))))

(defn build
  "returns: `com.google.cloud.compute.v1.Snapshot`"
  (^com.google.cloud.compute.v1.Snapshot [^Snapshot$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getDescription))))

(defn add-all-license-codes
  "[Output Only] Integer license codes indicating which licenses are attached to this snapshot.

  license-codes - `java.util.List`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.util.List license-codes]
    (-> this (.addAllLicenseCodes license-codes))))

(defn get-disk-size-gb
  "[Output Only] Size of the snapshot, specified in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getDiskSizeGb))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn get-storage-bytes
  "[Output Only] A size of the storage used by the snapshot. As snapshots share storage, this
   number is expected to change with snapshot creation/deletion.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getStorageBytes))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Snapshot`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^com.google.cloud.compute.v1.Snapshot other]
    (-> this (.mergeFrom other))))

(defn get-storage-bytes-status
  "[Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted
   as a result of shared storage reallocation. This status can either be UPDATING, meaning the
   size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is
   up-to-date.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getStorageBytesStatus))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getSelfLink))))

(defn set-snapshot-encryption-key
  "Encrypts the snapshot using a customer-supplied encryption key.

   After you encrypt a snapshot using a customer-supplied key, you must provide the same key
   if you use the snapshot later. For example, you must provide the encryption key when you
   create a disk from the encrypted snapshot in a future request.

   Customer-supplied encryption keys do not protect access to metadata of the snapshot.

   If you do not provide an encryption key when creating the snapshot, then the snapshot will
   be encrypted using an automatically generated key and you do not need to provide a key to use
   the snapshot later.

  snapshot-encryption-key - `com.google.cloud.compute.v1.CustomerEncryptionKey`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^com.google.cloud.compute.v1.CustomerEncryptionKey snapshot-encryption-key]
    (-> this (.setSnapshotEncryptionKey snapshot-encryption-key))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this]
    (-> this (.clone))))

(defn set-storage-bytes-status
  "[Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted
   as a result of shared storage reallocation. This status can either be UPDATING, meaning the
   size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is
   up-to-date.

  storage-bytes-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String storage-bytes-status]
    (-> this (.setStorageBytesStatus storage-bytes-status))))

(defn get-license-codes-list
  "[Output Only] Integer license codes indicating which licenses are attached to this snapshot.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Snapshot$Builder this]
    (-> this (.getLicenseCodesList))))

(defn set-label-fingerprint
  "A fingerprint for the labels being applied to this snapshot, which is essentially a hash of
   the labels set used for optimistic locking. The fingerprint is initially generated by Compute
   Engine and changes after every request to modify or update labels. You must always provide an
   up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a snapshot.

  label-fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String label-fingerprint]
    (-> this (.setLabelFingerprint label-fingerprint))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Snapshot$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-status
  "[Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or
   UPLOADING.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Snapshot$Builder`"
  (^com.google.cloud.compute.v1.Snapshot$Builder [^Snapshot$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

