(ns com.google.cloud.compute.v1.Instance$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Instance$Builder]))

(defn get-network-interfaces-list
  "An array of network configurations for this instance. These specify how interfaces are
   configured to interact with other network services, such as connecting to the internet.
   Multiple interfaces are supported per instance.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkInterface>`"
  (^java.util.List [^Instance$Builder this]
    (-> this (.getNetworkInterfacesList))))

(defn get-start-restricted?
  "[Output Only] Whether a VM has been restricted for start because Compute Engine has detected
   suspicious activity.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Instance$Builder this]
    (-> this (.getStartRestricted))))

(defn add-all-guest-accelerators
  "A list of the type and count of accelerator cards attached to the instance.

  guest-accelerators - `java.util.List`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.util.List guest-accelerators]
    (-> this (.addAllGuestAccelerators guest-accelerators))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-all-network-interfaces
  "An array of network configurations for this instance. These specify how interfaces are
   configured to interact with other network services, such as connecting to the internet.
   Multiple interfaces are supported per instance.

  network-interfaces - `java.util.List`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.util.List network-interfaces]
    (-> this (.addAllNetworkInterfaces network-interfaces))))

(defn set-shielded-instance-config
  "shielded-instance-config - `com.google.cloud.compute.v1.ShieldedInstanceConfig`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceConfig shielded-instance-config]
    (-> this (.setShieldedInstanceConfig shielded-instance-config))))

(defn add-all-disks
  "Array of disks associated with this instance. Persistent disks must be created before you can
   assign them.

  disks - `java.util.List`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.util.List disks]
    (-> this (.addAllDisks disks))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn put-all-labels
  "Labels to apply to this instance. These can be later modified by the setLabels method.

  labels - `java.util.Map`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.util.Map labels]
    (-> this (.putAllLabels labels))))

(defn get-shielded-instance-integrity-policy
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`"
  (^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy [^Instance$Builder this]
    (-> this (.getShieldedInstanceIntegrityPolicy))))

(defn get-deletion-protection?
  "Whether the resource should be protected against deletion.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Instance$Builder this]
    (-> this (.getDeletionProtection))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#instance for instances.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getKind))))

(defn get-cpu-platform
  "[Output Only] The CPU platform used by this instance.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getCpuPlatform))))

(defn set-shielded-instance-integrity-policy
  "shielded-instance-integrity-policy - `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy shielded-instance-integrity-policy]
    (-> this (.setShieldedInstanceIntegrityPolicy shielded-instance-integrity-policy))))

(defn get-status
  "[Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING,
   RUNNING, STOPPING, STOPPED, SUSPENDING, SUSPENDED, and TERMINATED.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getStatus))))

(defn get-guest-accelerators-list
  "A list of the type and count of accelerator cards attached to the instance.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>`"
  (^java.util.List [^Instance$Builder this]
    (-> this (.getGuestAcceleratorsList))))

(defn set-can-ip-forward
  "Allows this instance to send and receive packets with non-matching destination or source IPs.
   This is required if you plan to use this instance to forward routes. For more information,
   see Enabling IP Forwarding.

  can-ip-forward - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.Boolean can-ip-forward]
    (-> this (.setCanIpForward can-ip-forward))))

(defn get-hostname
  "returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getHostname))))

(defn set-scheduling
  "Sets the scheduling options for this instance.

  scheduling - `com.google.cloud.compute.v1.Scheduling`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.Scheduling scheduling]
    (-> this (.setScheduling scheduling))))

(defn set-min-cpu-platform
  "Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly
   names of CPU platforms, such as minCpuPlatform: \"Intel Haswell\" or minCpuPlatform: \"Intel
   Sandy Bridge\".

  min-cpu-platform - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String min-cpu-platform]
    (-> this (.setMinCpuPlatform min-cpu-platform))))

(defn set-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-labels-map
  "Labels to apply to this instance. These can be later modified by the setLabels method.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Instance$Builder this]
    (-> this (.getLabelsMap))))

(defn add-guest-accelerators
  "A list of the type and count of accelerator cards attached to the instance.

  guest-accelerators - `com.google.cloud.compute.v1.AcceleratorConfig`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.AcceleratorConfig guest-accelerators]
    (-> this (.addGuestAccelerators guest-accelerators))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#instance for instances.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-shielded-instance-config
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig [^Instance$Builder this]
    (-> this (.getShieldedInstanceConfig))))

(defn add-network-interfaces
  "An array of network configurations for this instance. These specify how interfaces are
   configured to interact with other network services, such as connecting to the internet.
   Multiple interfaces are supported per instance.

  network-interfaces - `com.google.cloud.compute.v1.NetworkInterface`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.NetworkInterface network-interfaces]
    (-> this (.addNetworkInterfaces network-interfaces))))

(defn get-name
  "The name of the resource, provided by the client when initially creating the resource. The
   resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-scheduling
  "Sets the scheduling options for this instance.

  returns: `com.google.cloud.compute.v1.Scheduling`"
  (^com.google.cloud.compute.v1.Scheduling [^Instance$Builder this]
    (-> this (.getScheduling))))

(defn get-label-fingerprint
  "A fingerprint for this request, which is essentially a hash of the label's contents and used
   for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   after every request to modify or update labels. You must always provide an up-to-date
   fingerprint hash in order to update or change labels.

   To see the latest fingerprint, make get() request to the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getLabelFingerprint))))

(defn get-min-cpu-platform
  "Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly
   names of CPU platforms, such as minCpuPlatform: \"Intel Haswell\" or minCpuPlatform: \"Intel
   Sandy Bridge\".

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getMinCpuPlatform))))

(defn build
  "returns: `com.google.cloud.compute.v1.Instance`"
  (^com.google.cloud.compute.v1.Instance [^Instance$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getDescription))))

(defn get-machine-type
  "Full or partial URL of the machine type resource to use for this instance, in the format:
   zones/zone/machineTypes/machine-type. This is provided by the client when the instance is
   created. For example, the following is a valid partial url to a predefined machine type:
   zones/us-central1-f/machineTypes/n1-standard-1

   To create a custom machine type, provide a URL to a machine type in the following format,
   where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total
   memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB
   (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY

   For example: zones/us-central1-f/machineTypes/custom-4-5120

   For a full list of restrictions, read the Specifications for custom machine types.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getMachineType))))

(defn set-tags
  "Tags to apply to this instance. Tags are used to identify valid sources or targets for
   network firewalls and are specified by the client during instance creation. The tags can be
   later modified by the setTags method. Each tag within the list must comply with RFC1035.
   Multiple tags can be specified via the 'tags.items' field.

  tags - `com.google.cloud.compute.v1.Tags`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.Tags tags]
    (-> this (.setTags tags))))

(defn get-can-ip-forward?
  "Allows this instance to send and receive packets with non-matching destination or source IPs.
   This is required if you plan to use this instance to forward routes. For more information,
   see Enabling IP Forwarding.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Instance$Builder this]
    (-> this (.getCanIpForward))))

(defn set-hostname
  "hostname - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String hostname]
    (-> this (.setHostname hostname))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Instance`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.Instance other]
    (-> this (.mergeFrom other))))

(defn get-tags
  "Tags to apply to this instance. Tags are used to identify valid sources or targets for
   network firewalls and are specified by the client during instance creation. The tags can be
   later modified by the setTags method. Each tag within the list must comply with RFC1035.
   Multiple tags can be specified via the 'tags.items' field.

  returns: `com.google.cloud.compute.v1.Tags`"
  (^com.google.cloud.compute.v1.Tags [^Instance$Builder this]
    (-> this (.getTags))))

(defn set-zone
  "[Output Only] URL of the zone where the instance resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn set-deletion-protection
  "Whether the resource should be protected against deletion.

  deletion-protection - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.Boolean deletion-protection]
    (-> this (.setDeletionProtection deletion-protection))))

(defn set-machine-type
  "Full or partial URL of the machine type resource to use for this instance, in the format:
   zones/zone/machineTypes/machine-type. This is provided by the client when the instance is
   created. For example, the following is a valid partial url to a predefined machine type:
   zones/us-central1-f/machineTypes/n1-standard-1

   To create a custom machine type, provide a URL to a machine type in the following format,
   where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total
   memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB
   (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY

   For example: zones/us-central1-f/machineTypes/custom-4-5120

   For a full list of restrictions, read the Specifications for custom machine types.

  machine-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String machine-type]
    (-> this (.setMachineType machine-type))))

(defn get-self-link
  "[Output Only] Server-defined URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getSelfLink))))

(defn get-disks-list
  "Array of disks associated with this instance. Persistent disks must be created before you can
   assign them.

  returns: `java.util.List<com.google.cloud.compute.v1.AttachedDisk>`"
  (^java.util.List [^Instance$Builder this]
    (-> this (.getDisksList))))

(defn set-start-restricted
  "[Output Only] Whether a VM has been restricted for start because Compute Engine has detected
   suspicious activity.

  start-restricted - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.Boolean start-restricted]
    (-> this (.setStartRestricted start-restricted))))

(defn get-zone
  "[Output Only] URL of the zone where the instance resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getZone))))

(defn add-service-accounts
  "A list of service accounts, with their specified scopes, authorized for this instance. Only
   one service account per VM instance is supported.

   Service accounts generate access tokens that can be accessed through the metadata server
   and used to authenticate applications on the instance. See Service Accounts for more
   information.

  service-accounts - `com.google.cloud.compute.v1.ServiceAccount`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.ServiceAccount service-accounts]
    (-> this (.addServiceAccounts service-accounts))))

(defn add-all-service-accounts
  "A list of service accounts, with their specified scopes, authorized for this instance. Only
   one service account per VM instance is supported.

   Service accounts generate access tokens that can be accessed through the metadata server
   and used to authenticate applications on the instance. See Service Accounts for more
   information.

  service-accounts - `java.util.List`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.util.List service-accounts]
    (-> this (.addAllServiceAccounts service-accounts))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this]
    (-> this (.clone))))

(defn set-label-fingerprint
  "A fingerprint for this request, which is essentially a hash of the label's contents and used
   for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   after every request to modify or update labels. You must always provide an up-to-date
   fingerprint hash in order to update or change labels.

   To see the latest fingerprint, make get() request to the instance.

  label-fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String label-fingerprint]
    (-> this (.setLabelFingerprint label-fingerprint))))

(defn get-metadata
  "The metadata key/value pairs assigned to this instance. This includes custom metadata and
   predefined keys.

  returns: `com.google.cloud.compute.v1.Metadata`"
  (^com.google.cloud.compute.v1.Metadata [^Instance$Builder this]
    (-> this (.getMetadata))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-service-accounts-list
  "A list of service accounts, with their specified scopes, authorized for this instance. Only
   one service account per VM instance is supported.

   Service accounts generate access tokens that can be accessed through the metadata server
   and used to authenticate applications on the instance. See Service Accounts for more
   information.

  returns: `java.util.List<com.google.cloud.compute.v1.ServiceAccount>`"
  (^java.util.List [^Instance$Builder this]
    (-> this (.getServiceAccountsList))))

(defn add-disks
  "Array of disks associated with this instance. Persistent disks must be created before you can
   assign them.

  disks - `com.google.cloud.compute.v1.AttachedDisk`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.AttachedDisk disks]
    (-> this (.addDisks disks))))

(defn get-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^Instance$Builder this]
    (-> this (.getStatusMessage))))

(defn set-status
  "[Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING,
   RUNNING, STOPPING, STOPPED, SUSPENDING, SUSPENDED, and TERMINATED.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn set-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  status-message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String status-message]
    (-> this (.setStatusMessage status-message))))

(defn set-metadata
  "The metadata key/value pairs assigned to this instance. This includes custom metadata and
   predefined keys.

  metadata - `com.google.cloud.compute.v1.Metadata`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^com.google.cloud.compute.v1.Metadata metadata]
    (-> this (.setMetadata metadata))))

(defn set-cpu-platform
  "[Output Only] The CPU platform used by this instance.

  cpu-platform - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Instance$Builder`"
  (^com.google.cloud.compute.v1.Instance$Builder [^Instance$Builder this ^java.lang.String cpu-platform]
    (-> this (.setCpuPlatform cpu-platform))))

