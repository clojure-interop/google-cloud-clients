(ns com.google.cloud.compute.v1.MachineType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineType]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.MachineType`

  returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^com.google.cloud.compute.v1.MachineType prototype]
    (MachineType/newBuilder prototype))
  (^com.google.cloud.compute.v1.MachineType$Builder []
    (MachineType/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.MachineType`"
  (^com.google.cloud.compute.v1.MachineType []
    (MachineType/getDefaultInstance )))

(defn get-kind
  "[Output Only] The type of the resource. Always compute#machineType for machine types.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getKind))))

(defn get-guest-cpus
  "[Output Only] The number of virtual CPUs that are available to the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getGuestCpus))))

(defn get-maximum-persistent-disks-size-gb
  "[Output Only] Maximum total persistent disks size (GB) allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getMaximumPersistentDisksSizeGb))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MachineType this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^MachineType this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this machine type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^MachineType this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getDescription))))

(defn get-scratch-disks-list
  "[Output Only] A list of extended scratch disks assigned to the instance.

  returns: `java.util.List<com.google.cloud.compute.v1.ScratchDisks>`"
  (^java.util.List [^MachineType this]
    (-> this (.getScratchDisksList))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^MachineType this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The name of the zone where the machine type resides, such as us-central1-a.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getZone))))

(defn get-is-shared-cpu?
  "[Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   more information.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^MachineType this]
    (-> this (.getIsSharedCpu))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MachineType this]
    (-> this (.hashCode))))

(defn get-memory-mb
  "[Output Only] The amount of physical memory available to the instance, defined in MB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getMemoryMb))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MachineType this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-image-space-gb
  "[Deprecated] This property is deprecated and will never be populated with any relevant values.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getImageSpaceGb))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.MachineType$Builder`"
  (^com.google.cloud.compute.v1.MachineType$Builder [^MachineType this]
    (-> this (.toBuilder))))

(defn get-maximum-persistent-disks
  "[Output Only] Maximum persistent disks allowed.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getMaximumPersistentDisks))))

