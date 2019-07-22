(ns com.google.cloud.compute.v1.InstanceProperties$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceProperties$Builder]))

(defn get-network-interfaces-list
  "An array of network access configurations for this interface.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkInterface>`"
  (^java.util.List [^InstanceProperties$Builder this]
    (-> this (.getNetworkInterfacesList))))

(defn add-all-guest-accelerators
  "A list of guest accelerator cards' type and count to use for instances created from the
   instance template.

  guest-accelerators - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.util.List guest-accelerators]
    (-> this (.addAllGuestAccelerators guest-accelerators))))

(defn set-description
  "An optional text description for the instances that are created from this instance template.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-all-network-interfaces
  "An array of network access configurations for this interface.

  network-interfaces - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.util.List network-interfaces]
    (-> this (.addAllNetworkInterfaces network-interfaces))))

(defn set-shielded-instance-config
  "shielded-instance-config - `com.google.cloud.compute.v1.ShieldedInstanceConfig`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceConfig shielded-instance-config]
    (-> this (.setShieldedInstanceConfig shielded-instance-config))))

(defn add-all-disks
  "An array of disks that are associated with the instances that are created from this template.

  disks - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.util.List disks]
    (-> this (.addAllDisks disks))))

(defn put-all-labels
  "Labels to apply to instances that are created from this template.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn get-guest-accelerators-list
  "A list of guest accelerator cards' type and count to use for instances created from the
   instance template.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>`"
  (^java.util.List [^InstanceProperties$Builder this]
    (-> this (.getGuestAcceleratorsList))))

(defn set-can-ip-forward
  "Enables instances created based on this template to send packets with source IP addresses
   other than their own and receive packets with destination IP addresses other than their own.
   If these instances will be used as an IP gateway or it will be set as the next-hop in a Route
   resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding
   documentation for more information.

  can-ip-forward - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.lang.Boolean can-ip-forward]
    (-> this (.setCanIpForward can-ip-forward))))

(defn set-scheduling
  "Specifies the scheduling options for the instances that are created from this template.

  scheduling - `com.google.cloud.compute.v1.Scheduling`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.Scheduling scheduling]
    (-> this (.setScheduling scheduling))))

(defn set-min-cpu-platform
  "Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   such as minCpuPlatform: \"Intel Haswell\" or minCpuPlatform: \"Intel Sandy Bridge\". For more
   information, read Specifying a Minimum CPU Platform.

  min-cpu-platform - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.lang.String min-cpu-platform]
    (-> this (.setMinCpuPlatform min-cpu-platform))))

(defn get-labels-map
  "Labels to apply to instances that are created from this template.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InstanceProperties$Builder this]
    (-> this (.getLabelsMap))))

(defn add-guest-accelerators
  "A list of guest accelerator cards' type and count to use for instances created from the
   instance template.

  guest-accelerators - `com.google.cloud.compute.v1.AcceleratorConfig`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.AcceleratorConfig guest-accelerators]
    (-> this (.addGuestAccelerators guest-accelerators))))

(defn get-shielded-instance-config
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig [^InstanceProperties$Builder this]
    (-> this (.getShieldedInstanceConfig))))

(defn add-network-interfaces
  "An array of network access configurations for this interface.

  network-interfaces - `com.google.cloud.compute.v1.NetworkInterface`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.NetworkInterface network-interfaces]
    (-> this (.addNetworkInterfaces network-interfaces))))

(defn get-scheduling
  "Specifies the scheduling options for the instances that are created from this template.

  returns: `com.google.cloud.compute.v1.Scheduling`"
  (^com.google.cloud.compute.v1.Scheduling [^InstanceProperties$Builder this]
    (-> this (.getScheduling))))

(defn get-min-cpu-platform
  "Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   such as minCpuPlatform: \"Intel Haswell\" or minCpuPlatform: \"Intel Sandy Bridge\". For more
   information, read Specifying a Minimum CPU Platform.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties$Builder this]
    (-> this (.getMinCpuPlatform))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceProperties`"
  (^com.google.cloud.compute.v1.InstanceProperties [^InstanceProperties$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional text description for the instances that are created from this instance template.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties$Builder this]
    (-> this (.getDescription))))

(defn get-machine-type
  "The machine type to use for instances that are created from this template.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties$Builder this]
    (-> this (.getMachineType))))

(defn set-tags
  "A list of tags to apply to the instances that are created from this template. The tags
   identify valid sources or targets for network firewalls. The setTags method can modify this
   list of tags. Each tag within the list must comply with RFC1035.

  tags - `com.google.cloud.compute.v1.Tags`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.Tags tags]
    (-> this (.setTags tags))))

(defn get-can-ip-forward?
  "Enables instances created based on this template to send packets with source IP addresses
   other than their own and receive packets with destination IP addresses other than their own.
   If these instances will be used as an IP gateway or it will be set as the next-hop in a Route
   resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding
   documentation for more information.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InstanceProperties$Builder this]
    (-> this (.getCanIpForward))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceProperties`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.InstanceProperties other]
    (-> this (.mergeFrom other))))

(defn get-tags
  "A list of tags to apply to the instances that are created from this template. The tags
   identify valid sources or targets for network firewalls. The setTags method can modify this
   list of tags. Each tag within the list must comply with RFC1035.

  returns: `com.google.cloud.compute.v1.Tags`"
  (^com.google.cloud.compute.v1.Tags [^InstanceProperties$Builder this]
    (-> this (.getTags))))

(defn set-machine-type
  "The machine type to use for instances that are created from this template.

  machine-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.lang.String machine-type]
    (-> this (.setMachineType machine-type))))

(defn get-disks-list
  "An array of disks that are associated with the instances that are created from this template.

  returns: `java.util.List<com.google.cloud.compute.v1.AttachedDisk>`"
  (^java.util.List [^InstanceProperties$Builder this]
    (-> this (.getDisksList))))

(defn add-service-accounts
  "A list of service accounts with specified scopes. Access tokens for these service accounts
   are available to the instances that are created from this template. Use metadata queries to
   obtain the access tokens for these instances.

  service-accounts - `com.google.cloud.compute.v1.ServiceAccount`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.ServiceAccount service-accounts]
    (-> this (.addServiceAccounts service-accounts))))

(defn add-all-service-accounts
  "A list of service accounts with specified scopes. Access tokens for these service accounts
   are available to the instances that are created from this template. Use metadata queries to
   obtain the access tokens for these instances.

  service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^java.util.List service-accounts]
    (-> this (.addAllServiceAccounts service-accounts))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this]
    (-> this (.clone))))

(defn get-metadata
  "The metadata key/value pairs to assign to instances that are created from this template.
   These pairs can consist of custom metadata or predefined keys. See Project and instance
   metadata for more information.

  returns: `com.google.cloud.compute.v1.Metadata`"
  (^com.google.cloud.compute.v1.Metadata [^InstanceProperties$Builder this]
    (-> this (.getMetadata))))

(defn get-service-accounts-list
  "A list of service accounts with specified scopes. Access tokens for these service accounts
   are available to the instances that are created from this template. Use metadata queries to
   obtain the access tokens for these instances.

  returns: `java.util.List<com.google.cloud.compute.v1.ServiceAccount>`"
  (^java.util.List [^InstanceProperties$Builder this]
    (-> this (.getServiceAccountsList))))

(defn add-disks
  "An array of disks that are associated with the instances that are created from this template.

  disks - `com.google.cloud.compute.v1.AttachedDisk`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.AttachedDisk disks]
    (-> this (.addDisks disks))))

(defn set-metadata
  "The metadata key/value pairs to assign to instances that are created from this template.
   These pairs can consist of custom metadata or predefined keys. See Project and instance
   metadata for more information.

  metadata - `com.google.cloud.compute.v1.Metadata`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties$Builder this ^com.google.cloud.compute.v1.Metadata metadata]
    (-> this (.setMetadata metadata))))

