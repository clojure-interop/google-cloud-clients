(ns com.google.cloud.compute.deprecated.Compute
  "An interface for Google Cloud Compute Engine."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute]))

(defn get-image
  "Returns the requested image or null if not found.

  image-id - `com.google.cloud.compute.deprecated.ImageId`
  options - `com.google.cloud.compute.deprecated.Compute$ImageOption`

  returns: `com.google.cloud.compute.deprecated.Image`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Image [^Compute this ^com.google.cloud.compute.deprecated.ImageId image-id ^com.google.cloud.compute.deprecated.Compute$ImageOption options]
    (-> this (.getImage image-id options))))

(defn stop
  "Stops the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the stop request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.stop instance options))))

(defn list-regions
  "Lists the regions.

  options - `com.google.cloud.compute.deprecated.Compute$RegionListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Region>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$RegionListOption options]
    (-> this (.listRegions options))))

(defn get-subnetwork
  "Returns the requested subnetwork or null if not found.

  subnetwork-id - `com.google.cloud.compute.deprecated.SubnetworkId`
  options - `com.google.cloud.compute.deprecated.Compute$SubnetworkOption`

  returns: `com.google.cloud.compute.deprecated.Subnetwork`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Subnetwork [^Compute this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork-id ^com.google.cloud.compute.deprecated.Compute$SubnetworkOption options]
    (-> this (.getSubnetwork subnetwork-id options))))

(defn deprecate
  "Deprecates the requested image.

  image - `com.google.cloud.compute.deprecated.ImageId`
  deprecation-status - `com.google.cloud.compute.deprecated.DeprecationStatus`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the deprecation request was issued correctly, null if the
       image was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if image is a publicly-available image"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.ImageId image ^com.google.cloud.compute.deprecated.DeprecationStatus deprecation-status ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deprecate image deprecation-status options))))

(defn list-machine-types
  "Lists the machine types in the provided zone.

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$MachineTypeListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.MachineType>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$MachineTypeListOption options]
    (-> this (.listMachineTypes zone options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption options]
    (-> this (.listMachineTypes options))))

(defn delete-disk
  "Deletes the requested disk.

  disk - `com.google.cloud.compute.deprecated.DiskId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.DiskId disk ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteDisk disk options))))

(defn list-global-operations
  "Lists the global operations.

  options - `com.google.cloud.compute.deprecated.Compute$OperationListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Operation>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$OperationListOption options]
    (-> this (.listGlobalOperations options))))

(defn list-region-addresses
  "Lists the region addresses for the provided region.

  region - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$AddressListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Address>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String region ^com.google.cloud.compute.deprecated.Compute$AddressListOption options]
    (-> this (.listRegionAddresses region options))))

(defn get-license
  "Returns the requested license or null if not found.

  license - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$LicenseOption`

  returns: `com.google.cloud.compute.deprecated.License`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.License [^Compute this ^java.lang.String license ^com.google.cloud.compute.deprecated.Compute$LicenseOption options]
    (-> this (.getLicense license options))))

(defn attach-disk
  "Attaches a persistent disk to an instance given the device name, its configuration and the
   device index.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  device-name - `java.lang.String`
  configuration - `com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration`
  index - `int`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the attach request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String device-name ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^Integer index ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk instance device-name configuration index options)))
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String device-name ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk instance device-name configuration options)))
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration configuration ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.attachDisk instance configuration options))))

(defn list-disk-types
  "Lists the disk types in the provided zone.

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$DiskTypeListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.DiskType>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$DiskTypeListOption options]
    (-> this (.listDiskTypes zone options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption options]
    (-> this (.listDiskTypes options))))

(defn list-addresses
  "Lists both global and region addresses.

  options - `com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Address>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption options]
    (-> this (.listAddresses options))))

(defn get-snapshot
  "Returns the requested snapshot or null if not found.

  snapshot - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$SnapshotOption`

  returns: `com.google.cloud.compute.deprecated.Snapshot`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Snapshot [^Compute this ^java.lang.String snapshot ^com.google.cloud.compute.deprecated.Compute$SnapshotOption options]
    (-> this (.getSnapshot snapshot options))))

(defn list-subnetworks
  "Lists subnetworks for the provided region.

  region - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$SubnetworkListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Subnetwork>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String region ^com.google.cloud.compute.deprecated.Compute$SubnetworkListOption options]
    (-> this (.listSubnetworks region options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption options]
    (-> this (.listSubnetworks options))))

(defn list-networks
  "Lists networks.

  options - `com.google.cloud.compute.deprecated.Compute$NetworkListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Network>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$NetworkListOption options]
    (-> this (.listNetworks options))))

(defn get-disk
  "Returns the requested disk or null if not found.

  disk-id - `com.google.cloud.compute.deprecated.DiskId`
  options - `com.google.cloud.compute.deprecated.Compute$DiskOption`

  returns: `com.google.cloud.compute.deprecated.Disk`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Disk [^Compute this ^com.google.cloud.compute.deprecated.DiskId disk-id ^com.google.cloud.compute.deprecated.Compute$DiskOption options]
    (-> this (.getDisk disk-id options))))

(defn delete-access-config
  "Deletes an access configuration from an instance's network interface.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  network-interface - `java.lang.String`
  access-config - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String network-interface ^java.lang.String access-config ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteAccessConfig instance network-interface access-config options))))

(defn get-disk-type
  "Returns the requested disk type or null if not found.

  zone - `java.lang.String`
  disk-type - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$DiskTypeOption`

  returns: `com.google.cloud.compute.deprecated.DiskType`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.DiskType [^Compute this ^java.lang.String zone ^java.lang.String disk-type ^com.google.cloud.compute.deprecated.Compute$DiskTypeOption options]
    (-> this (.getDiskType zone disk-type options)))
  (^com.google.cloud.compute.deprecated.DiskType [^Compute this ^com.google.cloud.compute.deprecated.DiskTypeId disk-type-id ^com.google.cloud.compute.deprecated.Compute$DiskTypeOption options]
    (-> this (.getDiskType disk-type-id options))))

(defn delete-operation
  "Deletes the requested operation. Delete is only possible for operations that have completed
   their execution. Any attempt to delete a running operation will fail.

  operation - `com.google.cloud.compute.deprecated.OperationId`

  returns: true if operation was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^Boolean [^Compute this ^com.google.cloud.compute.deprecated.OperationId operation]
    (-> this (.deleteOperation operation))))

(defn list-instances
  "Lists instances for the provided zone.

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$InstanceListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Instance>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$InstanceListOption options]
    (-> this (.listInstances zone options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption options]
    (-> this (.listInstances options))))

(defn delete-subnetwork
  "Deletes the requested subnetwork. Any attempt to delete an automatically created subnetwork
   will fail.

  subnetwork - `com.google.cloud.compute.deprecated.SubnetworkId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a region operation if the delete request was issued correctly, null if the
       subnetwork was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.SubnetworkId subnetwork ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteSubnetwork subnetwork options))))

(defn get-address
  "Returns the requested address or null if not found.

  address-id - `com.google.cloud.compute.deprecated.AddressId`
  options - `com.google.cloud.compute.deprecated.Compute$AddressOption`

  returns: `com.google.cloud.compute.deprecated.Address`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Address [^Compute this ^com.google.cloud.compute.deprecated.AddressId address-id ^com.google.cloud.compute.deprecated.Compute$AddressOption options]
    (-> this (.getAddress address-id options))))

(defn reset
  "Resets the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the reset request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.reset instance options))))

(defn list-images
  "Lists images in the provided project that are available to the current user. This method can be
   used to list publicly-available images by providing the respective image project. Examples of
   image projects are: centos-cloud, coreos-cloud, debian-cloud, opensuse-cloud, rhel-cloud, suse-cloud, ubuntu-os-cloud and windows-cloud. Attempting to delete or deprecate a publicly-available image will fail.

  project - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$ImageListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Image>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String project ^com.google.cloud.compute.deprecated.Compute$ImageListOption options]
    (-> this (.listImages project options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$ImageListOption options]
    (-> this (.listImages options))))

(defn delete-instance
  "Deletes the requested instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the delete request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteInstance instance options))))

(defn list-global-addresses
  "Lists the global addresses.

  options - `com.google.cloud.compute.deprecated.Compute$AddressListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Address>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$AddressListOption options]
    (-> this (.listGlobalAddresses options))))

(defn delete-snapshot
  "Deletes the requested snapshot. Keep in mind that deleting a single snapshot might not
   necessarily delete all the data for that snapshot. If any data for the snapshot that is marked
   for deletion is needed for subsequent snapshots, the data will be moved to the next snapshot.

  snapshot - `com.google.cloud.compute.deprecated.SnapshotId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the request was issued correctly, null if the snapshot
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.SnapshotId snapshot ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteSnapshot snapshot options))))

(defn delete-image
  "Deletes the requested image.

  image - `com.google.cloud.compute.deprecated.ImageId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the delete request was issued correctly, null if the
       image was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if image is a publicly-available image"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.ImageId image ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteImage image options))))

(defn get-instance
  "Returns the requested instance or null if not found.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  options - `com.google.cloud.compute.deprecated.Compute$InstanceOption`

  returns: `com.google.cloud.compute.deprecated.Instance`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Instance [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Compute$InstanceOption options]
    (-> this (.getInstance instance options))))

(defn add-access-config
  "Adds an access configuration to an instance's network interface.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  network-interface - `java.lang.String`
  access-config - `com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the add request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String network-interface ^com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig access-config ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.addAccessConfig instance network-interface access-config options))))

(defn list-zone-operations
  "Lists the operations for the provided zone. These are operations that create/modify/delete
   resources that live in a zone (e.g. instances).

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Operation>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$OperationListOption options]
    (-> this (.listZoneOperations zone options))))

(defn start
  "Starts the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the start request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.start instance options))))

(defn get-machine-type
  "Returns the requested machine type or null if not found.

  zone - `java.lang.String`
  machine-type - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$MachineTypeOption`

  returns: `com.google.cloud.compute.deprecated.MachineType`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.MachineType [^Compute this ^java.lang.String zone ^java.lang.String machine-type ^com.google.cloud.compute.deprecated.Compute$MachineTypeOption options]
    (-> this (.getMachineType zone machine-type options)))
  (^com.google.cloud.compute.deprecated.MachineType [^Compute this ^com.google.cloud.compute.deprecated.MachineTypeId machine-type-id ^com.google.cloud.compute.deprecated.Compute$MachineTypeOption options]
    (-> this (.getMachineType machine-type-id options))))

(defn set-tags
  "Sets the tags for the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  tags - `com.google.cloud.compute.deprecated.Tags`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Tags tags ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setTags instance tags options))))

(defn delete-address
  "Deletes the requested address.

  address-id - `com.google.cloud.compute.deprecated.AddressId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an operation if the request was issued correctly, null if the address was not
       found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.AddressId address-id ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteAddress address-id options))))

(defn set-machine-type
  "Sets the machine type for the provided instance. Instance must be in InstanceInfo.Status.TERMINATED state to be able to set its machine type.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.MachineTypeId machine-type ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setMachineType instance machine-type options))))

(defn get-serial-port-output
  "Returns the serial port output for the provided instance and port number. port must be
   between 1 and 4 (inclusive).

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  port - `int`

  returns: the serial port output or null if the instance was not found - `java.lang.String`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^java.lang.String [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^Integer port]
    (-> this (.getSerialPortOutput instance port)))
  (^java.lang.String [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance]
    (-> this (.getSerialPortOutput instance))))

(defn list-snapshots
  "Lists snapshots.

  options - `com.google.cloud.compute.deprecated.Compute$SnapshotListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Snapshot>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$SnapshotListOption options]
    (-> this (.listSnapshots options))))

(defn get-zone
  "Returns the requested zone or null if not found.

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$ZoneOption`

  returns: `com.google.cloud.compute.deprecated.Zone`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Zone [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$ZoneOption options]
    (-> this (.getZone zone options))))

(defn list-region-operations
  "Lists the operations for the provided region. These are operations that create/modify/delete
   resources that live in a region (e.g. subnetworks).

  region - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Operation>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String region ^com.google.cloud.compute.deprecated.Compute$OperationListOption options]
    (-> this (.listRegionOperations region options))))

(defn set-scheduling-options
  "Sets the scheduling options for the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  scheduling - `com.google.cloud.compute.deprecated.SchedulingOptions`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.SchedulingOptions scheduling ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setSchedulingOptions instance scheduling options))))

(defn list-disks
  "Lists disks for the provided zone.

  zone - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$DiskListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Disk>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^java.lang.String zone ^com.google.cloud.compute.deprecated.Compute$DiskListOption options]
    (-> this (.listDisks zone options)))
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption options]
    (-> this (.listDisks options))))

(defn get-network
  "Returns the requested network or null if not found.

  network - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$NetworkOption`

  returns: `com.google.cloud.compute.deprecated.Network`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Network [^Compute this ^java.lang.String network ^com.google.cloud.compute.deprecated.Compute$NetworkOption options]
    (-> this (.getNetwork network options))))

(defn create
  "Creates a new address.

  address - `com.google.cloud.compute.deprecated.AddressInfo`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: an operation for address' creation - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.AddressInfo address ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.create address options))))

(defn detach-disk
  "Detaches a disk from an instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  device-name - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the detach request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String device-name ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.detachDisk instance device-name options))))

(defn list-zones
  "Lists the zones.

  options - `com.google.cloud.compute.deprecated.Compute$ZoneListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.compute.deprecated.Zone>`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.api.gax.paging.Page [^Compute this ^com.google.cloud.compute.deprecated.Compute$ZoneListOption options]
    (-> this (.listZones options))))

(defn resize
  "Resizes the disk to the requested size. The new size must be larger than the previous one.

  disk - `com.google.cloud.compute.deprecated.DiskId`
  size-gb - `long`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the request was issued correctly, null if the disk was not
       found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure or if the new disk size is smaller than the previous one"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.DiskId disk ^Long size-gb ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.resize disk size-gb options))))

(defn get-operation
  "Returns the requested operation or null if not found.

  operation-id - `com.google.cloud.compute.deprecated.OperationId`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.OperationId operation-id ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.getOperation operation-id options))))

(defn set-metadata
  "Sets the metadata for the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  metadata - `com.google.cloud.compute.deprecated.Metadata`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the set request was issued correctly, null if the instance
       was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^com.google.cloud.compute.deprecated.Metadata metadata ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setMetadata instance metadata options))))

(defn get-region
  "Returns the requested region or null if not found.

  region - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$RegionOption`

  returns: `com.google.cloud.compute.deprecated.Region`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Region [^Compute this ^java.lang.String region ^com.google.cloud.compute.deprecated.Compute$RegionOption options]
    (-> this (.getRegion region options))))

(defn delete-network
  "Deletes the requested network.

  network - `java.lang.String`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a global operation if the delete request was issued correctly, null if the
       network was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^java.lang.String network ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.deleteNetwork network options))))

(defn set-disk-auto-delete
  "Sets the auto-delete flag for a disk attached to the provided instance.

  instance - `com.google.cloud.compute.deprecated.InstanceId`
  device-name - `java.lang.String`
  auto-delete - `boolean`
  options - `com.google.cloud.compute.deprecated.Compute$OperationOption`

  returns: a zone operation if the flag setting request was issued correctly, null if the
       instance was not found - `com.google.cloud.compute.deprecated.Operation`

  throws: com.google.cloud.compute.deprecated.ComputeException - upon failure"
  (^com.google.cloud.compute.deprecated.Operation [^Compute this ^com.google.cloud.compute.deprecated.InstanceId instance ^java.lang.String device-name ^Boolean auto-delete ^com.google.cloud.compute.deprecated.Compute$OperationOption options]
    (-> this (.setDiskAutoDelete instance device-name auto-delete options))))

