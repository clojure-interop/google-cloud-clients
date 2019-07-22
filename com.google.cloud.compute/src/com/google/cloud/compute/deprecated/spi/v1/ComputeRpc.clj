(ns com.google.cloud.compute.deprecated.spi.v1.ComputeRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.spi.v1 ComputeRpc]))

(defn get-image
  "Returns the requested image or null if not found.

  project - `java.lang.String`
  image - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Image`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Image [^ComputeRpc this ^java.lang.String project ^java.lang.String image ^java.util.Map options]
    (-> this (.getImage project image options))))

(defn stop
  "Stops the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the stop request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.stop zone instance options))))

(defn deprecate-image
  "Deprecates the requested image.

  project - `java.lang.String`
  image - `java.lang.String`
  deprecation-status - `com.google.api.services.compute.model.DeprecationStatus`
  options - `java.util.Map`

  returns: a global operation if the deprecation request was issued correctly, null if the
       image was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String project ^java.lang.String image ^com.google.api.services.compute.model.DeprecationStatus deprecation-status ^java.util.Map options]
    (-> this (.deprecateImage project image deprecation-status options))))

(defn list-regions
  "Lists the regions.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Region>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listRegions options))))

(defn get-subnetwork
  "Returns the requested subnetwork or null if not found.

  region - `java.lang.String`
  subnetwork - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Subnetwork`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Subnetwork [^ComputeRpc this ^java.lang.String region ^java.lang.String subnetwork ^java.util.Map options]
    (-> this (.getSubnetwork region subnetwork options))))

(defn delete-region-operation
  "Deletes the requested region operation.

  region - `java.lang.String`
  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^ComputeRpc this ^java.lang.String region ^java.lang.String operation]
    (-> this (.deleteRegionOperation region operation))))

(defn list-machine-types
  "Lists the machine types in the provided zone.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.MachineType>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listMachineTypes zone options)))
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listMachineTypes options))))

(defn delete-disk
  "Deletes the requested disk.

  zone - `java.lang.String`
  disk - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.util.Map options]
    (-> this (.deleteDisk zone disk options))))

(defn get-zone-operation
  "Returns the requested zone operation or null if not found.

  zone - `java.lang.String`
  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String operation ^java.util.Map options]
    (-> this (.getZoneOperation zone operation options))))

(defn list-global-operations
  "Lists the global operations.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listGlobalOperations options))))

(defn get-global-operation
  "Returns the requested global operation or null if not found.

  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String operation ^java.util.Map options]
    (-> this (.getGlobalOperation operation options))))

(defn create-instance
  "Creates a new instance.

  zone - `java.lang.String`
  instance - `com.google.api.services.compute.model.Instance`
  options - `java.util.Map`

  returns: a zone operation for instance's creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the zone does not exist"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^com.google.api.services.compute.model.Instance instance ^java.util.Map options]
    (-> this (.createInstance zone instance options))))

(defn list-region-addresses
  "Lists the regions addresses for the provided region.

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if region is not found"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listRegionAddresses region options))))

(defn create-network
  "Creates a new network.

  network - `com.google.api.services.compute.model.Network`
  options - `java.util.Map`

  returns: a global operation for network's creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^com.google.api.services.compute.model.Network network ^java.util.Map options]
    (-> this (.createNetwork network options))))

(defn get-license
  "Returns the requested license or null if not found.

  project - `java.lang.String`
  license - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.License`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.License [^ComputeRpc this ^java.lang.String project ^java.lang.String license ^java.util.Map options]
    (-> this (.getLicense project license options))))

(defn attach-disk
  "Attaches a disk to an instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  attached-disk - `com.google.api.services.compute.model.AttachedDisk`
  options - `java.util.Map`

  returns: a zone operation if the attach request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.AttachedDisk attached-disk ^java.util.Map options]
    (-> this (.attachDisk zone instance attached-disk options))))

(defn list-disk-types
  "Lists the disk types in the provided zone.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.DiskType>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listDiskTypes zone options)))
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listDiskTypes options))))

(defn list-addresses
  "Lists all addresses.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listAddresses options))))

(defn get-snapshot
  "Returns the requested snapshot or null if not found.

  snapshot - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Snapshot`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Snapshot [^ComputeRpc this ^java.lang.String snapshot ^java.util.Map options]
    (-> this (.getSnapshot snapshot options))))

(defn list-subnetworks
  "Lists subnetworks for the provided region.

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Subnetwork>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listSubnetworks region options)))
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listSubnetworks options))))

(defn set-scheduling
  "Sets the scheduling options for the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  scheduling - `com.google.api.services.compute.model.Scheduling`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Scheduling scheduling ^java.util.Map options]
    (-> this (.setScheduling zone instance scheduling options))))

(defn list-networks
  "Lists networks.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Network>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listNetworks options))))

(defn get-region-operation
  "Returns the requested region operation or null if not found.

  region - `java.lang.String`
  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String region ^java.lang.String operation ^java.util.Map options]
    (-> this (.getRegionOperation region operation options))))

(defn get-disk
  "Returns the requested disk or null if not found.

  zone - `java.lang.String`
  disk - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Disk`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Disk [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.util.Map options]
    (-> this (.getDisk zone disk options))))

(defn delete-access-config
  "Deletes an access configuration from an instance's network interface.

  zone - `java.lang.String`
  instance - `java.lang.String`
  network-interface - `java.lang.String`
  access-config - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String network-interface ^java.lang.String access-config ^java.util.Map options]
    (-> this (.deleteAccessConfig zone instance network-interface access-config options))))

(defn get-disk-type
  "Returns the requested disk type or null if not found.

  zone - `java.lang.String`
  disk-type - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.DiskType`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.DiskType [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk-type ^java.util.Map options]
    (-> this (.getDiskType zone disk-type options))))

(defn list-instances
  "Lists instances for the provided zone.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Instance>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the zone does not exist"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listInstances zone options)))
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listInstances options))))

(defn delete-subnetwork
  "Deletes the requested subnetwork. Any attempt to delete an automatically created subnetwork
   will fail.

  region - `java.lang.String`
  subnetwork - `java.lang.String`
  options - `java.util.Map`

  returns: a region operation if the delete request was issued correctly, null if the
       subnetwork was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String region ^java.lang.String subnetwork ^java.util.Map options]
    (-> this (.deleteSubnetwork region subnetwork options))))

(defn reset
  "Resets the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the reset request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.reset zone instance options))))

(defn create-subnetwork
  "region - `java.lang.String`
  subnetwork - `com.google.api.services.compute.model.Subnetwork`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String region ^com.google.api.services.compute.model.Subnetwork subnetwork ^java.util.Map options]
    (-> this (.createSubnetwork region subnetwork options))))

(defn list-images
  "Lists images in the provided project that are available to the current user.

  project - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Image>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String project ^java.util.Map options]
    (-> this (.listImages project options))))

(defn create-global-address
  "Creates a new global address.

  address - `com.google.api.services.compute.model.Address`
  options - `java.util.Map`

  returns: a global operation for global address' creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^com.google.api.services.compute.model.Address address ^java.util.Map options]
    (-> this (.createGlobalAddress address options))))

(defn delete-global-operation
  "Deletes the requested global operation.

  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^ComputeRpc this ^java.lang.String operation]
    (-> this (.deleteGlobalOperation operation))))

(defn delete-instance
  "Deletes the requested instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the zone does not exist"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.deleteInstance zone instance options))))

(defn list-global-addresses
  "Lists the global addresses.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listGlobalAddresses options))))

(defn delete-snapshot
  "Deletes the requested snapshot. Keep in mind that deleting a single snapshot might not
   necessarily delete all the data for that snapshot. If any data for the snapshot that is marked
   for deletion is needed for subsequent snapshots, the data will be moved to the next snapshot.

  snapshot - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the request was issued correctly, null if the snapshot
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String snapshot ^java.util.Map options]
    (-> this (.deleteSnapshot snapshot options))))

(defn delete-image
  "Deletes the requested image.

  project - `java.lang.String`
  image - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the delete request was issued correctly, null if the
       image was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String project ^java.lang.String image ^java.util.Map options]
    (-> this (.deleteImage project image options))))

(defn get-instance
  "Returns the requested instance or null if not found.

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Instance`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the zone does not exist"
  (^com.google.api.services.compute.model.Instance [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.getInstance zone instance options))))

(defn add-access-config
  "Adds an access configuration to an instance's network interface.

  zone - `java.lang.String`
  instance - `java.lang.String`
  network-interface - `java.lang.String`
  access-config - `com.google.api.services.compute.model.AccessConfig`
  options - `java.util.Map`

  returns: a zone operation if the add request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String network-interface ^com.google.api.services.compute.model.AccessConfig access-config ^java.util.Map options]
    (-> this (.addAccessConfig zone instance network-interface access-config options))))

(defn delete-global-address
  "Deletes the requested global address.

  address - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the request was issued correctly, null if the address was
       not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String address ^java.util.Map options]
    (-> this (.deleteGlobalAddress address options))))

(defn list-zone-operations
  "Lists the zone operations for the provided zone.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listZoneOperations zone options))))

(defn start
  "Starts the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the start request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.start zone instance options))))

(defn get-machine-type
  "Returns the requested machine type or null if not found.

  zone - `java.lang.String`
  disk-type - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.MachineType`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.MachineType [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk-type ^java.util.Map options]
    (-> this (.getMachineType zone disk-type options))))

(defn set-tags
  "Sets the tags for the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  tags - `com.google.api.services.compute.model.Tags`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Tags tags ^java.util.Map options]
    (-> this (.setTags zone instance tags options))))

(defn delete-region-address
  "Deletes the requested region address.

  region - `java.lang.String`
  address - `java.lang.String`
  options - `java.util.Map`

  returns: a region operation if the request was issued correctly, null if the address was
       not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if region is not found"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String region ^java.lang.String address ^java.util.Map options]
    (-> this (.deleteRegionAddress region address options))))

(defn set-machine-type
  "Sets the machine type for the provided instance. Instance must be in TERMINATED state
   to be able to set its machine type.

  zone - name of the zone in which the instance resides - `java.lang.String`
  instance - name of the instance - `java.lang.String`
  machine-type-url - full or partial URL of the machine type resource. For example zones/us-central1-f/machineTypes/n1-standard-1. - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String machine-type-url ^java.util.Map options]
    (-> this (.setMachineType zone instance machine-type-url options))))

(defn get-serial-port-output
  "Returns the serial port output for the provided instance and port number. port must be
   between 1 and 4 (inclusive). If port is null output for the default port (1) is
   returned.

  zone - `java.lang.String`
  instance - `java.lang.String`
  port - `java.lang.Integer`
  options - `java.util.Map`

  returns: the serial port output or null if the instance was not found - `java.lang.String`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^java.lang.String [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.Integer port ^java.util.Map options]
    (-> this (.getSerialPortOutput zone instance port options))))

(defn delete-zone-operation
  "Deletes the requested zone operation.

  zone - `java.lang.String`
  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^ComputeRpc this ^java.lang.String zone ^java.lang.String operation]
    (-> this (.deleteZoneOperation zone operation))))

(defn list-snapshots
  "Lists snapshots.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Snapshot>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listSnapshots options))))

(defn get-zone
  "Returns the requested zone or null if not found.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Zone`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Zone [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.getZone zone options))))

(defn list-region-operations
  "Lists the region operations for the provided region.

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listRegionOperations region options))))

(defn list-disks
  "Lists the disks for the provided zone.

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Disk>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listDisks zone options)))
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listDisks options))))

(defn get-network
  "Returns the requested network or null if not found.

  network - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Network`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Network [^ComputeRpc this ^java.lang.String network ^java.util.Map options]
    (-> this (.getNetwork network options))))

(defn create-region-address
  "Creates a new region address.

  region - `java.lang.String`
  address - `com.google.api.services.compute.model.Address`
  options - `java.util.Map`

  returns: a region operation for region address' creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if region is not found"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String region ^com.google.api.services.compute.model.Address address ^java.util.Map options]
    (-> this (.createRegionAddress region address options))))

(defn create-disk
  "Creates a new disk.

  zone - `java.lang.String`
  disk - `com.google.api.services.compute.model.Disk`
  options - `java.util.Map`

  returns: a zone operation for disk's creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^com.google.api.services.compute.model.Disk disk ^java.util.Map options]
    (-> this (.createDisk zone disk options))))

(defn create-image
  "Creates a new image.

  image - `com.google.api.services.compute.model.Image`
  options - `java.util.Map`

  returns: a global operation for image's creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^com.google.api.services.compute.model.Image image ^java.util.Map options]
    (-> this (.createImage image options))))

(defn detach-disk
  "Detaches a disk from an instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  device-name - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the detach request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String device-name ^java.util.Map options]
    (-> this (.detachDisk zone instance device-name options))))

(defn get-global-address
  "Returns the requested global address or null if not found.

  address - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Address`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Address [^ComputeRpc this ^java.lang.String address ^java.util.Map options]
    (-> this (.getGlobalAddress address options))))

(defn resize-disk
  "Resizes the disk to the requested size. The new size must be larger than the previous one.

  zone - `java.lang.String`
  disk - `java.lang.String`
  size-gb - `long`
  options - `java.util.Map`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the new disk size is smaller than the previous one"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk ^Long size-gb ^java.util.Map options]
    (-> this (.resizeDisk zone disk size-gb options))))

(defn list-zones
  "Lists the zones.

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Zone>>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.Tuple [^ComputeRpc this ^java.util.Map options]
    (-> this (.listZones options))))

(defn get-region-address
  "Returns the requested region address or null if not found.

  region - `java.lang.String`
  address - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Address`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if region is not found"
  (^com.google.api.services.compute.model.Address [^ComputeRpc this ^java.lang.String region ^java.lang.String address ^java.util.Map options]
    (-> this (.getRegionAddress region address options))))

(defn create-snapshot
  "Creates a snapshot for the specified disk.

  zone - `java.lang.String`
  disk - `java.lang.String`
  snapshot - `java.lang.String`
  description - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation for snapshot creation - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.lang.String snapshot ^java.lang.String description ^java.util.Map options]
    (-> this (.createSnapshot zone disk snapshot description options))))

(defn set-metadata
  "Sets the metadata for the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  metadata - `com.google.api.services.compute.model.Metadata`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Metadata metadata ^java.util.Map options]
    (-> this (.setMetadata zone instance metadata options))))

(defn get-region
  "Returns the requested region or null if not found.

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Region`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Region [^ComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.getRegion region options))))

(defn delete-network
  "Deletes the requested network.

  network - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the delete request was issued correctly, null if the
       network was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String network ^java.util.Map options]
    (-> this (.deleteNetwork network options))))

(defn set-disk-auto-delete
  "Sets the auto-delete flag for a disk attached to the provided instance.

  zone - `java.lang.String`
  instance - `java.lang.String`
  device-name - `java.lang.String`
  auto-delete - `boolean`
  options - `java.util.Map`

  returns: a zone operation if the flag setting request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.services.compute.model.Operation [^ComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String device-name ^Boolean auto-delete ^java.util.Map options]
    (-> this (.setDiskAutoDelete zone instance device-name auto-delete options))))

