(ns com.google.cloud.compute.deprecated.spi.v1.HttpComputeRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.spi.v1 HttpComputeRpc]))

(defn ->http-compute-rpc
  "Constructor.

  options - `com.google.cloud.compute.deprecated.ComputeOptions`"
  (^HttpComputeRpc [^com.google.cloud.compute.deprecated.ComputeOptions options]
    (new HttpComputeRpc options)))

(defn get-image
  "Description copied from interface: ComputeRpc

  project - `java.lang.String`
  image - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Image`"
  (^com.google.api.services.compute.model.Image [^HttpComputeRpc this ^java.lang.String project ^java.lang.String image ^java.util.Map options]
    (-> this (.getImage project image options))))

(defn stop
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the stop request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.stop zone instance options))))

(defn deprecate-image
  "Description copied from interface: ComputeRpc

  project - `java.lang.String`
  image - `java.lang.String`
  deprecation-status - `com.google.api.services.compute.model.DeprecationStatus`
  options - `java.util.Map`

  returns: a global operation if the deprecation request was issued correctly, null if the
       image was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String project ^java.lang.String image ^com.google.api.services.compute.model.DeprecationStatus deprecation-status ^java.util.Map options]
    (-> this (.deprecateImage project image deprecation-status options))))

(defn list-regions
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Region>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listRegions options))))

(defn get-subnetwork
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  subnetwork - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Subnetwork`"
  (^com.google.api.services.compute.model.Subnetwork [^HttpComputeRpc this ^java.lang.String region ^java.lang.String subnetwork ^java.util.Map options]
    (-> this (.getSubnetwork region subnetwork options))))

(defn delete-region-operation
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpComputeRpc this ^java.lang.String region ^java.lang.String operation]
    (-> this (.deleteRegionOperation region operation))))

(defn list-machine-types
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.MachineType>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listMachineTypes zone options)))
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listMachineTypes options))))

(defn delete-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.util.Map options]
    (-> this (.deleteDisk zone disk options))))

(defn get-zone-operation
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String operation ^java.util.Map options]
    (-> this (.getZoneOperation zone operation options))))

(defn list-global-operations
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listGlobalOperations options))))

(defn get-global-operation
  "Description copied from interface: ComputeRpc

  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String operation ^java.util.Map options]
    (-> this (.getGlobalOperation operation options))))

(defn create-instance
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `com.google.api.services.compute.model.Instance`
  options - `java.util.Map`

  returns: a zone operation for instance's creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^com.google.api.services.compute.model.Instance instance ^java.util.Map options]
    (-> this (.createInstance zone instance options))))

(defn list-region-addresses
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listRegionAddresses region options))))

(defn create-network
  "Description copied from interface: ComputeRpc

  network - `com.google.api.services.compute.model.Network`
  options - `java.util.Map`

  returns: a global operation for network's creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^com.google.api.services.compute.model.Network network ^java.util.Map options]
    (-> this (.createNetwork network options))))

(defn get-license
  "Description copied from interface: ComputeRpc

  project - `java.lang.String`
  license - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.License`"
  (^com.google.api.services.compute.model.License [^HttpComputeRpc this ^java.lang.String project ^java.lang.String license ^java.util.Map options]
    (-> this (.getLicense project license options))))

(defn attach-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  attached-disk - `com.google.api.services.compute.model.AttachedDisk`
  options - `java.util.Map`

  returns: a zone operation if the attach request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.AttachedDisk attached-disk ^java.util.Map options]
    (-> this (.attachDisk zone instance attached-disk options))))

(defn list-disk-types
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.DiskType>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listDiskTypes zone options)))
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listDiskTypes options))))

(defn list-addresses
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listAddresses options))))

(defn get-snapshot
  "Description copied from interface: ComputeRpc

  snapshot - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Snapshot`"
  (^com.google.api.services.compute.model.Snapshot [^HttpComputeRpc this ^java.lang.String snapshot ^java.util.Map options]
    (-> this (.getSnapshot snapshot options))))

(defn list-subnetworks
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Subnetwork>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listSubnetworks region options)))
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listSubnetworks options))))

(defn set-scheduling
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  scheduling - `com.google.api.services.compute.model.Scheduling`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Scheduling scheduling ^java.util.Map options]
    (-> this (.setScheduling zone instance scheduling options))))

(defn list-networks
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Network>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listNetworks options))))

(defn get-region-operation
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  operation - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String region ^java.lang.String operation ^java.util.Map options]
    (-> this (.getRegionOperation region operation options))))

(defn get-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Disk`"
  (^com.google.api.services.compute.model.Disk [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.util.Map options]
    (-> this (.getDisk zone disk options))))

(defn delete-access-config
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  network-interface - `java.lang.String`
  access-config - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String network-interface ^java.lang.String access-config ^java.util.Map options]
    (-> this (.deleteAccessConfig zone instance network-interface access-config options))))

(defn get-disk-type
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk-type - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.DiskType`"
  (^com.google.api.services.compute.model.DiskType [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String disk-type ^java.util.Map options]
    (-> this (.getDiskType zone disk-type options))))

(defn list-instances
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Instance>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listInstances zone options)))
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listInstances options))))

(defn delete-subnetwork
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  subnetwork - `java.lang.String`
  options - `java.util.Map`

  returns: a region operation if the delete request was issued correctly, null if the
       subnetwork was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String region ^java.lang.String subnetwork ^java.util.Map options]
    (-> this (.deleteSubnetwork region subnetwork options))))

(defn reset
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the reset request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.reset zone instance options))))

(defn create-subnetwork
  "region - `java.lang.String`
  subnetwork - `com.google.api.services.compute.model.Subnetwork`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String region ^com.google.api.services.compute.model.Subnetwork subnetwork ^java.util.Map options]
    (-> this (.createSubnetwork region subnetwork options))))

(defn list-images
  "Description copied from interface: ComputeRpc

  project - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Image>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String project ^java.util.Map options]
    (-> this (.listImages project options))))

(defn create-global-address
  "Description copied from interface: ComputeRpc

  address - `com.google.api.services.compute.model.Address`
  options - `java.util.Map`

  returns: a global operation for global address' creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^com.google.api.services.compute.model.Address address ^java.util.Map options]
    (-> this (.createGlobalAddress address options))))

(defn delete-global-operation
  "Description copied from interface: ComputeRpc

  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpComputeRpc this ^java.lang.String operation]
    (-> this (.deleteGlobalOperation operation))))

(defn delete-instance
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.deleteInstance zone instance options))))

(defn list-global-addresses
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Address>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listGlobalAddresses options))))

(defn delete-snapshot
  "Description copied from interface: ComputeRpc

  snapshot - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the request was issued correctly, null if the snapshot
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String snapshot ^java.util.Map options]
    (-> this (.deleteSnapshot snapshot options))))

(defn delete-image
  "Description copied from interface: ComputeRpc

  project - `java.lang.String`
  image - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the delete request was issued correctly, null if the
       image was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String project ^java.lang.String image ^java.util.Map options]
    (-> this (.deleteImage project image options))))

(defn get-instance
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Instance`"
  (^com.google.api.services.compute.model.Instance [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.getInstance zone instance options))))

(defn add-access-config
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  network-interface - `java.lang.String`
  access-config - `com.google.api.services.compute.model.AccessConfig`
  options - `java.util.Map`

  returns: a zone operation if the add request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String network-interface ^com.google.api.services.compute.model.AccessConfig access-config ^java.util.Map options]
    (-> this (.addAccessConfig zone instance network-interface access-config options))))

(defn delete-global-address
  "Description copied from interface: ComputeRpc

  address - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the request was issued correctly, null if the address was
       not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String address ^java.util.Map options]
    (-> this (.deleteGlobalAddress address options))))

(defn list-zone-operations
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listZoneOperations zone options))))

(defn start
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the start request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.util.Map options]
    (-> this (.start zone instance options))))

(defn get-machine-type
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  machine-type - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.MachineType`"
  (^com.google.api.services.compute.model.MachineType [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String machine-type ^java.util.Map options]
    (-> this (.getMachineType zone machine-type options))))

(defn set-tags
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  tags - `com.google.api.services.compute.model.Tags`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Tags tags ^java.util.Map options]
    (-> this (.setTags zone instance tags options))))

(defn delete-region-address
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  address - `java.lang.String`
  options - `java.util.Map`

  returns: a region operation if the request was issued correctly, null if the address was
       not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String region ^java.lang.String address ^java.util.Map options]
    (-> this (.deleteRegionAddress region address options))))

(defn set-machine-type
  "Description copied from interface: ComputeRpc

  zone - name of the zone in which the instance resides - `java.lang.String`
  instance - name of the instance - `java.lang.String`
  machine-type-url - full or partial URL of the machine type resource. For example zones/us-central1-f/machineTypes/n1-standard-1. - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String machine-type-url ^java.util.Map options]
    (-> this (.setMachineType zone instance machine-type-url options))))

(defn get-serial-port-output
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  port - `java.lang.Integer`
  options - `java.util.Map`

  returns: the serial port output or null if the instance was not found - `java.lang.String`"
  (^java.lang.String [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.Integer port ^java.util.Map options]
    (-> this (.getSerialPortOutput zone instance port options))))

(defn delete-zone-operation
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  operation - `java.lang.String`

  returns: true if operation was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String operation]
    (-> this (.deleteZoneOperation zone operation))))

(defn list-snapshots
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Snapshot>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listSnapshots options))))

(defn get-zone
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Zone`"
  (^com.google.api.services.compute.model.Zone [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.getZone zone options))))

(defn list-region-operations
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Operation>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.listRegionOperations region options))))

(defn list-disks
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Disk>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.lang.String zone ^java.util.Map options]
    (-> this (.listDisks zone options)))
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listDisks options))))

(defn get-network
  "Description copied from interface: ComputeRpc

  network - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Network`"
  (^com.google.api.services.compute.model.Network [^HttpComputeRpc this ^java.lang.String network ^java.util.Map options]
    (-> this (.getNetwork network options))))

(defn create-region-address
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  address - `com.google.api.services.compute.model.Address`
  options - `java.util.Map`

  returns: a region operation for region address' creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String region ^com.google.api.services.compute.model.Address address ^java.util.Map options]
    (-> this (.createRegionAddress region address options))))

(defn create-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk - `com.google.api.services.compute.model.Disk`
  options - `java.util.Map`

  returns: a zone operation for disk's creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^com.google.api.services.compute.model.Disk disk ^java.util.Map options]
    (-> this (.createDisk zone disk options))))

(defn create-image
  "Description copied from interface: ComputeRpc

  image - `com.google.api.services.compute.model.Image`
  options - `java.util.Map`

  returns: a global operation for image's creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^com.google.api.services.compute.model.Image image ^java.util.Map options]
    (-> this (.createImage image options))))

(defn detach-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  device-name - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation if the detach request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String device-name ^java.util.Map options]
    (-> this (.detachDisk zone instance device-name options))))

(defn get-global-address
  "Description copied from interface: ComputeRpc

  address - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Address`"
  (^com.google.api.services.compute.model.Address [^HttpComputeRpc this ^java.lang.String address ^java.util.Map options]
    (-> this (.getGlobalAddress address options))))

(defn resize-disk
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk - `java.lang.String`
  size-gb - `long`
  options - `java.util.Map`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String disk ^Long size-gb ^java.util.Map options]
    (-> this (.resizeDisk zone disk size-gb options))))

(defn list-zones
  "Description copied from interface: ComputeRpc

  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.compute.model.Zone>>`"
  (^com.google.cloud.Tuple [^HttpComputeRpc this ^java.util.Map options]
    (-> this (.listZones options))))

(defn get-region-address
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  address - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Address`"
  (^com.google.api.services.compute.model.Address [^HttpComputeRpc this ^java.lang.String region ^java.lang.String address ^java.util.Map options]
    (-> this (.getRegionAddress region address options))))

(defn create-snapshot
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  disk - `java.lang.String`
  snapshot - `java.lang.String`
  description - `java.lang.String`
  options - `java.util.Map`

  returns: a zone operation for snapshot creation - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String disk ^java.lang.String snapshot ^java.lang.String description ^java.util.Map options]
    (-> this (.createSnapshot zone disk snapshot description options))))

(defn set-metadata
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  metadata - `com.google.api.services.compute.model.Metadata`
  options - `java.util.Map`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^com.google.api.services.compute.model.Metadata metadata ^java.util.Map options]
    (-> this (.setMetadata zone instance metadata options))))

(defn get-region
  "Description copied from interface: ComputeRpc

  region - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.compute.model.Region`"
  (^com.google.api.services.compute.model.Region [^HttpComputeRpc this ^java.lang.String region ^java.util.Map options]
    (-> this (.getRegion region options))))

(defn delete-network
  "Description copied from interface: ComputeRpc

  network - `java.lang.String`
  options - `java.util.Map`

  returns: a global operation if the delete request was issued correctly, null if the
       network was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String network ^java.util.Map options]
    (-> this (.deleteNetwork network options))))

(defn set-disk-auto-delete
  "Description copied from interface: ComputeRpc

  zone - `java.lang.String`
  instance - `java.lang.String`
  device-name - `java.lang.String`
  auto-delete - `boolean`
  options - `java.util.Map`

  returns: a zone operation if the flag setting request was issued correctly, null if the
       instance was not found - `com.google.api.services.compute.model.Operation`"
  (^com.google.api.services.compute.model.Operation [^HttpComputeRpc this ^java.lang.String zone ^java.lang.String instance ^java.lang.String device-name ^Boolean auto-delete ^java.util.Map options]
    (-> this (.setDiskAutoDelete zone instance device-name auto-delete options))))

