(ns com.google.cloud.compute.deprecated.Disk
  "A Google Compute Engine persistent disk. A disk can be used as primary storage for your virtual
  machine instances. Objects of this class are immutable. To get a Disk object with the
  most recent information use reload(com.google.cloud.compute.deprecated.Compute.DiskOption...). Disk adds a layer of service-related
  functionality over DiskInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Disk]))

(defn delete
  "Deletes this disk.

  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the delete request was successfully sent, null if the disk
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.delete options))))

(defn get-compute
  "Returns the disk's Compute object used to issue requests.

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^Disk this]
    (-> this (.getCompute))))

(defn reload
  "Fetches current disk's latest information. Returns null if the disk does not exist.

  options - disk options - `com.google.cloud.compute.deprecated.Compute$DiskOption`

  returns: a Disk object with latest information or null if not found - `com.google.cloud.compute.deprecated.Disk`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Disk [^Disk this ^com.google.cloud.compute.deprecated.Compute$DiskOption options]
    (-> this (.reload options))))

(defn create-image
  "Creates an image for this disk given the image's name and description.

  image - `java.lang.String`
  description - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the image creation was successfully requested - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^java.lang.String image ^java.lang.String description ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.createImage image description options)))
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^java.lang.String image ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.createImage image options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Disk this]
    (-> this (.hashCode))))

(defn exists?
  "Checks if this disk exists.

  returns: true if this disk exists, false otherwise - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Disk this]
    (-> this (.exists))))

(defn resize
  "Resizes this disk to the requested size. The new size must be larger than the previous one.

  size-gb - `long`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the resize request was issued correctly, null if this disk
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the new disk size is smaller than the previous one"
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^Long size-gb ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.resize size-gb options))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Disk this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn create-snapshot
  "Creates a snapshot for this disk given the snapshot's name and description.

  snapshot - `java.lang.String`
  description - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation for snapshot creation - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^java.lang.String snapshot ^java.lang.String description ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.createSnapshot snapshot description options)))
  (^com.google.cloud.compute.deprecated.Operation [^Disk this ^java.lang.String snapshot ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.createSnapshot snapshot options))))

(defn to-builder
  "Description copied from class: DiskInfo

  returns: `com.google.cloud.compute.deprecated.Disk$Builder`"
  (^com.google.cloud.compute.deprecated.Disk$Builder [^Disk this]
    (-> this (.toBuilder))))

