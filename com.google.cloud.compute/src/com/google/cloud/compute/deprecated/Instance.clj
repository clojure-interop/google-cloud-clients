(ns com.google.cloud.compute.deprecated.Instance
  "A Google Compute Engine VM Instance. An instance is a virtual machine (VM) hosted on Google's
  infrastructure. Instances can run Linux and Windows Server images provided by Google, or any
  customized versions of these images. You can also build and run images of other operating
  systems. Objects of this class are immutable. To get an Instance object with the most
  recent information use reload(com.google.cloud.compute.deprecated.Compute.InstanceOption...). Instance adds a layer of service-related
  functionality over InstanceInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Instance]))

(defn stop
  "Stops this instance.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the stop request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.stop options))))

(defn delete
  "Deletes this instance.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if delete request was successfully sent, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn attach-disk
  "Attaches a persistent disk to this instance given the device name, its configuration and the
   device index.

  device-name - `java.lang.String`
  configuration - `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration`
  index - `int`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the attach request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String device-name ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^Integer index ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk device-name configuration index options)))
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String device-name ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk device-name configuration options)))
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk configuration options))))

(defn delete-access-config
  "Deletes an access configuration from the provided network interface for this instance.

  network-interface - `java.lang.String`
  access-config - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String network-interface ^java.lang.String access-config ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteAccessConfig network-interface access-config options))))

(defn reset
  "Resets this instance.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the reset request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.reset options))))

(defn get-compute
  "Returns the snapshot's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Instance this]
    (-> this (.getCompute))))

(defn add-access-config
  "Adds an access configuration to the provided network interface for this instance.

  network-interface - `java.lang.String`
  access-config - `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the add request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String network-interface ^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig access-config ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.addAccessConfig network-interface access-config options))))

(defn start
  "Starts this instance.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the start request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.start options))))

(defn set-tags
  "Sets the tags for this instance.

  tags - `com.google.cloud.compute.deprecated.Tags`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Tags tags ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setTags tags options))))

(defn set-machine-type
  "Sets the machine type for this instance. The instance must be in InstanceInfo.Status.TERMINATED state to be able to set its machine type.

  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.MachineTypeId machine-type ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setMachineType machine-type options))))

(defn get-serial-port-output
  "Returns the serial port output for this instance and port number. port must be between
   1 and 4 (inclusive).

  port - `int`

  returns: the serial port output or null if the instance was not found - `java.lang.String`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^java.lang.String [^Instance this ^Integer port]
    (-> this (.getSerialPortOutput port)))
  (^java.lang.String [^Instance this]
    (-> this (.getSerialPortOutput))))

(defn reload
  "Fetches current instance's latest information. Returns null if the instance does not
   exist.

  options - instance options - `com.google.cloud.compute.deprecated.Compute$InstanceOption`

  returns: a Instance object with latest information or null if not found - `com.google.cloud.compute.deprecated.Instance`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Instance [^Instance this ^com.google.cloud.compute.deprecated.Compute$InstanceOption options]
    (-> this (.reload options))))

(defn set-scheduling-options
  "Sets the scheduling options for this instance.

  scheduling - `com.google.cloud.compute.deprecated.SchedulingOptions`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.SchedulingOptions scheduling ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setSchedulingOptions scheduling options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Instance this]
    (-> this (.hashCode))))

(defn detach-disk
  "Detaches a disk from this instance.

  device-name - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the detach request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String device-name ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.detachDisk device-name options))))

(defn exists?
  "Checks if this instance exists.

  returns: true if this instance exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Instance this]
    (-> this (.exists))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Instance this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn set-metadata
  "Sets the metadata for this instance.

  metadata - `com.google.cloud.compute.deprecated.Metadata`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^com.google.cloud.compute.deprecated.Metadata metadata ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setMetadata metadata options))))

(defn to-builder
  "Description copied from class: InstanceInfo

  returns: `com.google.cloud.compute.deprecated.Instance$Builder`"
  (^com.google.cloud.compute.deprecated.Instance$Builder [^Instance this]
    (-> this (.toBuilder))))

(defn set-disk-auto-delete
  "Sets the auto-delete flag for a disk attached to this instance.

  device-name - `java.lang.String`
  auto-delete - `boolean`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the flag setting request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Instance this ^java.lang.String device-name ^Boolean auto-delete ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setDiskAutoDelete device-name auto-delete options))))

