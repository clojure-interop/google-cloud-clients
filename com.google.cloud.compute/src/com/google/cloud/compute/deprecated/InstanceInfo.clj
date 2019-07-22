(ns com.google.cloud.compute.deprecated.InstanceInfo
  "A Google Compute Engine VM Instance. An instance is a virtual machine (VM) hosted on Google's
  infrastructure. Instances can run Linux and Windows Server images provided by Google, or any
  customized versions of these images. You can also build and run images of other operating
  systems. Google Compute Engine also lets you choose the machine properties of your instances,
  such as the number of virtual CPUs and the amount of memory

  By default, each Compute Engine instance has a small root persistent disk that contains the
  operating system. When your applications require additional storage space, you can add one or
  more additional disks to your instance.

  Instances communicate with other instances in the same network through a local area network.
  Instances communicate with the rest of the world through the Internet. A network lives in a
  project and is isolated from other networks in the project. A project can have up to five
  different networks."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated InstanceInfo]))

(defn *new-builder
  "Returns a builder for an InstanceInfo object given the instance identity and the
   machine type.

  instance-id - `com.google.cloud.compute.deprecated.InstanceId`
  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^com.google.cloud.compute.deprecated.InstanceId instance-id ^com.google.cloud.compute.deprecated.MachineTypeId machine-type]
    (InstanceInfo/newBuilder instance-id machine-type)))

(defn *of
  "Returns an InstanceInfo object given the instance identity, the machine type, a disk to
   attach to the instance and a network interface. disk must be a boot disk (i.e. AttachedDisk.AttachedDiskConfiguration.boot() returns true).

  instance-id - `com.google.cloud.compute.deprecated.InstanceId`
  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`
  disk - `com.google.cloud.compute.deprecated.AttachedDisk`
  network-interface - `com.google.cloud.compute.deprecated.NetworkInterface`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo`"
  (^com.google.cloud.compute.deprecated.InstanceInfo [^com.google.cloud.compute.deprecated.InstanceId instance-id ^com.google.cloud.compute.deprecated.MachineTypeId machine-type ^com.google.cloud.compute.deprecated.AttachedDisk disk ^com.google.cloud.compute.deprecated.NetworkInterface network-interface]
    (InstanceInfo/of instance-id machine-type disk network-interface)))

(defn get-scheduling-options
  "Returns the scheduling options for the instance.

  returns: `com.google.cloud.compute.deprecated.SchedulingOptions`"
  (^com.google.cloud.compute.deprecated.SchedulingOptions [^InstanceInfo this]
    (-> this (.getSchedulingOptions))))

(defn get-cpu-platform
  "Returns the CPU platform used by this instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.getCpuPlatform))))

(defn get-status
  "Returns the status of the instance.

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Status`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Status [^InstanceInfo this]
    (-> this (.getStatus))))

(defn can-ip-forward?
  "Returns whether to allow this instance to send and receive packets with non-matching
   destination or source IPs. This is required if you plan to use this instance to forward routes.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InstanceInfo this]
    (-> this (.canIpForward))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.toString))))

(defn get-attached-disks
  "Returns a list of disks attached to the instance.

  returns: `java.util.List<com.google.cloud.compute.deprecated.AttachedDisk>`"
  (^java.util.List [^InstanceInfo this]
    (-> this (.getAttachedDisks))))

(defn get-network-interfaces
  "Returns a list of network interfaces. This specifies how this instance is configured to
   interact with other network services, such as connecting to the internet.

  returns: `java.util.List<com.google.cloud.compute.deprecated.NetworkInterface>`"
  (^java.util.List [^InstanceInfo this]
    (-> this (.getNetworkInterfaces))))

(defn get-description
  "Returns a textual description of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.getDescription))))

(defn get-machine-type
  "Returns the machine type identity.

  returns: `com.google.cloud.compute.deprecated.MachineTypeId`"
  (^com.google.cloud.compute.deprecated.MachineTypeId [^InstanceInfo this]
    (-> this (.getMachineType))))

(defn get-service-accounts
  "Returns a list of service accounts, with their specified scopes, authorized for this instance.
   Service accounts generate access tokens that can be accessed through the metadata server and
   used to authenticate applications on the instance.

  returns: `java.util.List<com.google.cloud.compute.deprecated.ServiceAccount>`"
  (^java.util.List [^InstanceInfo this]
    (-> this (.getServiceAccounts))))

(defn get-tags
  "Returns the tags of this instance. Tags are used to identify valid sources or targets for
   network firewalls.

  returns: `com.google.cloud.compute.deprecated.Tags`"
  (^com.google.cloud.compute.deprecated.Tags [^InstanceInfo this]
    (-> this (.getTags))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceInfo this]
    (-> this (.hashCode))))

(defn get-metadata
  "Returns the instance metadata.

  returns: `com.google.cloud.compute.deprecated.Metadata`"
  (^com.google.cloud.compute.deprecated.Metadata [^InstanceInfo this]
    (-> this (.getMetadata))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^InstanceInfo this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.getGeneratedId))))

(defn get-instance-id
  "Returns the instance identity.

  returns: `com.google.cloud.compute.deprecated.InstanceId`"
  (^com.google.cloud.compute.deprecated.InstanceId [^InstanceInfo this]
    (-> this (.getInstanceId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-status-message
  "Returns an optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceInfo this]
    (-> this (.getStatusMessage))))

(defn to-builder
  "Returns a builder for the current instance.

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo this]
    (-> this (.toBuilder))))

