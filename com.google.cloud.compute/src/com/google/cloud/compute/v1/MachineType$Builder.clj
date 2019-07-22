(ns com.google.cloud.compute.v1.MachineType$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineType$Builder]))

(defn add-all-scratch-disks
  "[Output Only] A list of extended scratch disks assigned to the instance.

  scratch-disks - `java.util.List`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.util.List scratch-disks]
    (-> this (.addAllScratchDisks scratch-disks))))

(defn set-description
  "[Output Only] An optional textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#machineType for machine types.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getKind))))

(defn set-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the instance.

  guest-cpus - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.Integer guest-cpus]
    (-> this (.setGuestCpus guest-cpus))))

(defn get-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType$Builder this]
    (-> this (.getGuestCpus))))

(defn set-is-shared-cpu
  "[Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   more information.

  is-shared-cpu - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.Boolean is-shared-cpu]
    (-> this (.setIsSharedCpu is-shared-cpu))))

(defn get-maximum-persistent-disks-size-gb
  "[Output Only] Maximum total persistent disks size (GB) allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getMaximumPersistentDisksSizeGb))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The type of the resource. Always compute#machineType for machine types.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-image-space-gb
  "[Deprecated] This property is deprecated and will never be populated with any relevant
   values.

  image-space-gb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.Integer image-space-gb]
    (-> this (.setImageSpaceGb image-space-gb))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this machine type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^MachineType$Builder this]
    (-> this (.getDeprecated))))

(defn build
  "returns: `com.google.cloud.compute.v1.MachineType`"
  (^com.google.cloud.compute.v1.MachineType [^MachineType$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getDescription))))

(defn set-maximum-persistent-disks
  "[Output Only] Maximum persistent disks allowed.

  maximum-persistent-disks - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.Integer maximum-persistent-disks]
    (-> this (.setMaximumPersistentDisks maximum-persistent-disks))))

(defn get-scratch-disks-list
  "[Output Only] A list of extended scratch disks assigned to the instance.

  returns: `java.util.List<com.google.cloud.compute.v1.ScratchDisks>`"
  (^java.util.List [^MachineType$Builder this]
    (-> this (.getScratchDisksList))))

(defn add-scratch-disks
  "[Output Only] A list of extended scratch disks assigned to the instance.

  scratch-disks - `com.google.cloud.compute.v1.ScratchDisks`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^com.google.cloud.compute.v1.ScratchDisks scratch-disks]
    (-> this (.addScratchDisks scratch-disks))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.MachineType`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^com.google.cloud.compute.v1.MachineType other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The name of the zone where the machine type resides, such as us-central1-a.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn set-maximum-persistent-disks-size-gb
  "[Output Only] Maximum total persistent disks size (GB) allowed.

  maximum-persistent-disks-size-gb - `java.lang.String`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.String maximum-persistent-disks-size-gb]
    (-> this (.setMaximumPersistentDisksSizeGb maximum-persistent-disks-size-gb))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the machine type resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getZone))))

(defn get-is-shared-cpu?
  "[Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   more information.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^MachineType$Builder this]
    (-> this (.getIsSharedCpu))))

(defn clone
  "returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this]
    (-> this (.clone))))

(defn get-memory-mb
  "[Output Only] The amount of physical memory available to the instance, defined in MB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType$Builder this]
    (-> this (.getMemoryMb))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-memory-mb
  "[Output Only] The amount of physical memory available to the instance, defined in MB.

  memory-mb - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^java.lang.Integer memory-mb]
    (-> this (.setMemoryMb memory-mb))))

(defn set-deprecated
  "[Output Only] The deprecation status associated with this machine type.

  deprecated - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType$Builder this ^com.google.cloud.compute.v1.DeprecationStatus deprecated]
    (-> this (.setDeprecated deprecated))))

(defn get-image-space-gb
  "[Deprecated] This property is deprecated and will never be populated with any relevant
   values.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType$Builder this]
    (-> this (.getImageSpaceGb))))

(defn get-maximum-persistent-disks
  "[Output Only] Maximum persistent disks allowed.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType$Builder this]
    (-> this (.getMaximumPersistentDisks))))

