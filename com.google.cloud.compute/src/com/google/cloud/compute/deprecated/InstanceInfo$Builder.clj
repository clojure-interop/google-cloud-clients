(ns com.google.cloud.compute.deprecated.InstanceInfo$Builder
  "A builder for InstanceInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated InstanceInfo$Builder]))

(defn ->builder
  "Constructor."
  (^InstanceInfo$Builder []
    (new InstanceInfo$Builder )))

(defn set-description
  "Sets an optional description of this Google Compute Engine instance.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-can-ip-forward
  "Sets whether to allow this instance to send and receive packets with non-matching destination
   or source IPs. This is required if you plan to use this instance to forward routes.

  can-ip-forward - `java.lang.Boolean`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.lang.Boolean can-ip-forward]
    (-> this (.setCanIpForward can-ip-forward))))

(defn set-service-accounts
  "Sets a list of service accounts, with their specified scopes, authorized for this instance.
   Service accounts generate access tokens that can be accessed through the metadata server and
   used to authenticate applications on the instance.

  service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.util.List service-accounts]
    (-> this (.setServiceAccounts service-accounts))))

(defn set-attached-disks
  "Sets a list of disks to attach to the instance. One boot disk must be provided (i.e. an
   attached disk such that AttachedDisk.AttachedDiskConfiguration.boot() returns true).

  attached-disks - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.util.List attached-disks]
    (-> this (.setAttachedDisks attached-disks))))

(defn set-instance-id
  "Sets the identity of the virtual machine instance.

  instance-id - `com.google.cloud.compute.deprecated.InstanceId`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.compute.deprecated.InstanceId instance-id]
    (-> this (.setInstanceId instance-id))))

(defn build
  "Creates an InstanceInfo object.

  returns: `com.google.cloud.compute.deprecated.InstanceInfo`"
  (^com.google.cloud.compute.deprecated.InstanceInfo [^InstanceInfo$Builder this]
    (-> this (.build))))

(defn set-tags
  "Sets the tags to apply to this instance. Tags are used to identify valid sources or targets
   for network firewalls.

  tags - `com.google.cloud.compute.deprecated.Tags`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.compute.deprecated.Tags tags]
    (-> this (.setTags tags))))

(defn set-machine-type
  "Sets the machine type identity.

  machine-type - `com.google.cloud.compute.deprecated.MachineTypeId`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.compute.deprecated.MachineTypeId machine-type]
    (-> this (.setMachineType machine-type))))

(defn set-scheduling-options
  "Sets the scheduling options for the instance.

  scheduling-options - `com.google.cloud.compute.deprecated.SchedulingOptions`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.compute.deprecated.SchedulingOptions scheduling-options]
    (-> this (.setSchedulingOptions scheduling-options))))

(defn set-metadata
  "Sets the instance metadata.

  metadata - `com.google.cloud.compute.deprecated.Metadata`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^com.google.cloud.compute.deprecated.Metadata metadata]
    (-> this (.setMetadata metadata))))

(defn set-network-interfaces
  "Sets a list of network interfaces. This specifies how this instance is configured to interact
   with other network services, such as connecting to the internet. At the moment, instances
   only support one network interface.

  network-interfaces - `java.util.List`

  returns: `com.google.cloud.compute.deprecated.InstanceInfo$Builder`"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Builder [^InstanceInfo$Builder this ^java.util.List network-interfaces]
    (-> this (.setNetworkInterfaces network-interfaces))))

