(ns com.google.cloud.compute.deprecated.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.google.cloud.compute.deprecated.Address$Builder])
(require '[com.google.cloud.compute.deprecated.Address])
(require '[com.google.cloud.compute.deprecated.AddressId])
(require '[com.google.cloud.compute.deprecated.AddressInfo$Builder])
(require '[com.google.cloud.compute.deprecated.AddressInfo$GlobalForwardingUsage])
(require '[com.google.cloud.compute.deprecated.AddressInfo$InstanceUsage])
(require '[com.google.cloud.compute.deprecated.AddressInfo$RegionForwardingUsage])
(require '[com.google.cloud.compute.deprecated.AddressInfo$Status])
(require '[com.google.cloud.compute.deprecated.AddressInfo$Usage])
(require '[com.google.cloud.compute.deprecated.AddressInfo])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$InterfaceType])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration$Type])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$AttachedDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$Builder])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$CreateDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration$Mode])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$PersistentDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.AttachedDisk$ScratchDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.AttachedDisk])
(require '[com.google.cloud.compute.deprecated.Compute$AddressAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$AddressField])
(require '[com.google.cloud.compute.deprecated.Compute$AddressFilter])
(require '[com.google.cloud.compute.deprecated.Compute$AddressListOption])
(require '[com.google.cloud.compute.deprecated.Compute$AddressOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskField])
(require '[com.google.cloud.compute.deprecated.Compute$DiskFilter])
(require '[com.google.cloud.compute.deprecated.Compute$DiskListOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskTypeAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskTypeField])
(require '[com.google.cloud.compute.deprecated.Compute$DiskTypeFilter])
(require '[com.google.cloud.compute.deprecated.Compute$DiskTypeListOption])
(require '[com.google.cloud.compute.deprecated.Compute$DiskTypeOption])
(require '[com.google.cloud.compute.deprecated.Compute$ImageField])
(require '[com.google.cloud.compute.deprecated.Compute$ImageFilter])
(require '[com.google.cloud.compute.deprecated.Compute$ImageListOption])
(require '[com.google.cloud.compute.deprecated.Compute$ImageOption])
(require '[com.google.cloud.compute.deprecated.Compute$InstanceAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$InstanceField])
(require '[com.google.cloud.compute.deprecated.Compute$InstanceFilter])
(require '[com.google.cloud.compute.deprecated.Compute$InstanceListOption])
(require '[com.google.cloud.compute.deprecated.Compute$InstanceOption])
(require '[com.google.cloud.compute.deprecated.Compute$LicenseField])
(require '[com.google.cloud.compute.deprecated.Compute$LicenseOption])
(require '[com.google.cloud.compute.deprecated.Compute$ListFilter])
(require '[com.google.cloud.compute.deprecated.Compute$MachineTypeAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$MachineTypeField])
(require '[com.google.cloud.compute.deprecated.Compute$MachineTypeFilter])
(require '[com.google.cloud.compute.deprecated.Compute$MachineTypeListOption])
(require '[com.google.cloud.compute.deprecated.Compute$MachineTypeOption])
(require '[com.google.cloud.compute.deprecated.Compute$NetworkField])
(require '[com.google.cloud.compute.deprecated.Compute$NetworkFilter])
(require '[com.google.cloud.compute.deprecated.Compute$NetworkListOption])
(require '[com.google.cloud.compute.deprecated.Compute$NetworkOption])
(require '[com.google.cloud.compute.deprecated.Compute$OperationField])
(require '[com.google.cloud.compute.deprecated.Compute$OperationFilter])
(require '[com.google.cloud.compute.deprecated.Compute$OperationListOption])
(require '[com.google.cloud.compute.deprecated.Compute$OperationOption])
(require '[com.google.cloud.compute.deprecated.Compute$RegionField])
(require '[com.google.cloud.compute.deprecated.Compute$RegionFilter])
(require '[com.google.cloud.compute.deprecated.Compute$RegionListOption])
(require '[com.google.cloud.compute.deprecated.Compute$RegionOption])
(require '[com.google.cloud.compute.deprecated.Compute$SnapshotField])
(require '[com.google.cloud.compute.deprecated.Compute$SnapshotFilter])
(require '[com.google.cloud.compute.deprecated.Compute$SnapshotListOption])
(require '[com.google.cloud.compute.deprecated.Compute$SnapshotOption])
(require '[com.google.cloud.compute.deprecated.Compute$SubnetworkAggregatedListOption])
(require '[com.google.cloud.compute.deprecated.Compute$SubnetworkField])
(require '[com.google.cloud.compute.deprecated.Compute$SubnetworkFilter])
(require '[com.google.cloud.compute.deprecated.Compute$SubnetworkListOption])
(require '[com.google.cloud.compute.deprecated.Compute$SubnetworkOption])
(require '[com.google.cloud.compute.deprecated.Compute$ZoneField])
(require '[com.google.cloud.compute.deprecated.Compute$ZoneFilter])
(require '[com.google.cloud.compute.deprecated.Compute$ZoneListOption])
(require '[com.google.cloud.compute.deprecated.Compute$ZoneOption])
(require '[com.google.cloud.compute.deprecated.Compute])
(require '[com.google.cloud.compute.deprecated.ComputeException])
(require '[com.google.cloud.compute.deprecated.ComputeFactory])
(require '[com.google.cloud.compute.deprecated.ComputeOptions$Builder])
(require '[com.google.cloud.compute.deprecated.ComputeOptions$DefaultComputeFactory])
(require '[com.google.cloud.compute.deprecated.ComputeOptions$DefaultComputeRpcFactory])
(require '[com.google.cloud.compute.deprecated.ComputeOptions])
(require '[com.google.cloud.compute.deprecated.DeprecationStatus$Builder])
(require '[com.google.cloud.compute.deprecated.DeprecationStatus$Status])
(require '[com.google.cloud.compute.deprecated.DeprecationStatus])
(require '[com.google.cloud.compute.deprecated.Disk$Builder])
(require '[com.google.cloud.compute.deprecated.Disk])
(require '[com.google.cloud.compute.deprecated.DiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.DiskConfiguration$Type])
(require '[com.google.cloud.compute.deprecated.DiskConfiguration])
(require '[com.google.cloud.compute.deprecated.DiskId])
(require '[com.google.cloud.compute.deprecated.DiskImageConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.DiskImageConfiguration])
(require '[com.google.cloud.compute.deprecated.DiskInfo$Builder])
(require '[com.google.cloud.compute.deprecated.DiskInfo$CreationStatus])
(require '[com.google.cloud.compute.deprecated.DiskInfo])
(require '[com.google.cloud.compute.deprecated.DiskType])
(require '[com.google.cloud.compute.deprecated.DiskTypeId])
(require '[com.google.cloud.compute.deprecated.ForwardingRuleId])
(require '[com.google.cloud.compute.deprecated.GlobalAddressId])
(require '[com.google.cloud.compute.deprecated.GlobalForwardingRuleId])
(require '[com.google.cloud.compute.deprecated.GlobalOperationId])
(require '[com.google.cloud.compute.deprecated.Image$Builder])
(require '[com.google.cloud.compute.deprecated.Image])
(require '[com.google.cloud.compute.deprecated.ImageConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.ImageConfiguration$SourceType])
(require '[com.google.cloud.compute.deprecated.ImageConfiguration$Type])
(require '[com.google.cloud.compute.deprecated.ImageConfiguration])
(require '[com.google.cloud.compute.deprecated.ImageDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.ImageDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.ImageId])
(require '[com.google.cloud.compute.deprecated.ImageInfo$Builder])
(require '[com.google.cloud.compute.deprecated.ImageInfo$Status])
(require '[com.google.cloud.compute.deprecated.ImageInfo])
(require '[com.google.cloud.compute.deprecated.Instance$Builder])
(require '[com.google.cloud.compute.deprecated.Instance])
(require '[com.google.cloud.compute.deprecated.InstanceId])
(require '[com.google.cloud.compute.deprecated.InstanceInfo$Builder])
(require '[com.google.cloud.compute.deprecated.InstanceInfo$BuilderImpl])
(require '[com.google.cloud.compute.deprecated.InstanceInfo$Status])
(require '[com.google.cloud.compute.deprecated.InstanceInfo])
(require '[com.google.cloud.compute.deprecated.License])
(require '[com.google.cloud.compute.deprecated.LicenseId])
(require '[com.google.cloud.compute.deprecated.MachineType])
(require '[com.google.cloud.compute.deprecated.MachineTypeId])
(require '[com.google.cloud.compute.deprecated.Metadata$Builder])
(require '[com.google.cloud.compute.deprecated.Metadata])
(require '[com.google.cloud.compute.deprecated.Network$Builder])
(require '[com.google.cloud.compute.deprecated.Network])
(require '[com.google.cloud.compute.deprecated.NetworkConfiguration$Type])
(require '[com.google.cloud.compute.deprecated.NetworkConfiguration])
(require '[com.google.cloud.compute.deprecated.NetworkId])
(require '[com.google.cloud.compute.deprecated.NetworkInfo$Builder])
(require '[com.google.cloud.compute.deprecated.NetworkInfo])
(require '[com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Builder])
(require '[com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig$Type])
(require '[com.google.cloud.compute.deprecated.NetworkInterface$AccessConfig])
(require '[com.google.cloud.compute.deprecated.NetworkInterface$Builder])
(require '[com.google.cloud.compute.deprecated.NetworkInterface])
(require '[com.google.cloud.compute.deprecated.Operation$OperationError])
(require '[com.google.cloud.compute.deprecated.Operation$OperationWarning])
(require '[com.google.cloud.compute.deprecated.Operation$Status])
(require '[com.google.cloud.compute.deprecated.Operation])
(require '[com.google.cloud.compute.deprecated.OperationId])
(require '[com.google.cloud.compute.deprecated.Region$Quota])
(require '[com.google.cloud.compute.deprecated.Region$Status])
(require '[com.google.cloud.compute.deprecated.Region])
(require '[com.google.cloud.compute.deprecated.RegionAddressId])
(require '[com.google.cloud.compute.deprecated.RegionForwardingRuleId])
(require '[com.google.cloud.compute.deprecated.RegionId])
(require '[com.google.cloud.compute.deprecated.RegionOperationId])
(require '[com.google.cloud.compute.deprecated.ResourceId])
(require '[com.google.cloud.compute.deprecated.SchedulingOptions$Maintenance])
(require '[com.google.cloud.compute.deprecated.SchedulingOptions])
(require '[com.google.cloud.compute.deprecated.ServiceAccount])
(require '[com.google.cloud.compute.deprecated.Snapshot$Builder])
(require '[com.google.cloud.compute.deprecated.Snapshot])
(require '[com.google.cloud.compute.deprecated.SnapshotDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.SnapshotDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.SnapshotId])
(require '[com.google.cloud.compute.deprecated.SnapshotInfo$Builder])
(require '[com.google.cloud.compute.deprecated.SnapshotInfo$Status])
(require '[com.google.cloud.compute.deprecated.SnapshotInfo$StorageBytesStatus])
(require '[com.google.cloud.compute.deprecated.SnapshotInfo])
(require '[com.google.cloud.compute.deprecated.StandardDiskConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.StandardDiskConfiguration])
(require '[com.google.cloud.compute.deprecated.StandardNetworkConfiguration])
(require '[com.google.cloud.compute.deprecated.StorageImageConfiguration$Builder])
(require '[com.google.cloud.compute.deprecated.StorageImageConfiguration$ContainerType])
(require '[com.google.cloud.compute.deprecated.StorageImageConfiguration])
(require '[com.google.cloud.compute.deprecated.SubnetNetworkConfiguration])
(require '[com.google.cloud.compute.deprecated.Subnetwork$Builder])
(require '[com.google.cloud.compute.deprecated.Subnetwork])
(require '[com.google.cloud.compute.deprecated.SubnetworkId])
(require '[com.google.cloud.compute.deprecated.SubnetworkInfo$Builder])
(require '[com.google.cloud.compute.deprecated.SubnetworkInfo])
(require '[com.google.cloud.compute.deprecated.Tags$Builder])
(require '[com.google.cloud.compute.deprecated.Tags])
(require '[com.google.cloud.compute.deprecated.Zone$Status])
(require '[com.google.cloud.compute.deprecated.Zone])
(require '[com.google.cloud.compute.deprecated.ZoneId])
(require '[com.google.cloud.compute.deprecated.ZoneOperationId])
