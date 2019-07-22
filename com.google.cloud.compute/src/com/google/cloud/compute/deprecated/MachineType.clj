(ns com.google.cloud.compute.deprecated.MachineType
  "A Google Compute Engine machine type. A machine type determine the virtualized hardware
  specifications of your virtual machine instances, such as the amount of memory or number of
  virtual CPUs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated MachineType]))

(defn get-machine-type-id
  "Returns the machine type's identity.

  returns: `com.google.cloud.compute.deprecated.MachineTypeId`"
  (^com.google.cloud.compute.deprecated.MachineTypeId [^MachineType this]
    (-> this (.getMachineTypeId))))

(defn get-deprecation-status
  "Returns the deprecation status of the machine type. If DeprecationStatus.getStatus() is
   either DeprecationStatus.Status.DELETED or DeprecationStatus.Status.OBSOLETE
   the machine type should not be used. Returns null if the machine type is not
   deprecated.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<com.google.cloud.compute.deprecated.MachineTypeId>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^MachineType this]
    (-> this (.getDeprecationStatus))))

(defn get-maximum-persistent-disks-size-gb
  "Returns the maximum total persistent disks size allowed, defined in GB.

  returns: `java.lang.Long`"
  (^java.lang.Long [^MachineType this]
    (-> this (.getMaximumPersistentDisksSizeGb))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.toString))))

(defn get-cpus
  "Returns the number of virtual CPUs that are available to the instance.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getCpus))))

(defn get-description
  "Returns an optional textual description of the machine type.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getDescription))))

(defn get-scratch-disks-size-gb
  "Returns the size of all extended scratch disks assigned to the instance, defined in GB.

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^MachineType this]
    (-> this (.getScratchDisksSizeGb))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MachineType this]
    (-> this (.hashCode))))

(defn get-memory-mb
  "Returns the amount of physical memory available to the instance, defined in MB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getMemoryMb))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^MachineType this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the machine type.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineType this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MachineType this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-maximum-persistent-disks
  "Returns the maximum number of persistent disks allowed by this instance type.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MachineType this]
    (-> this (.getMaximumPersistentDisks))))

