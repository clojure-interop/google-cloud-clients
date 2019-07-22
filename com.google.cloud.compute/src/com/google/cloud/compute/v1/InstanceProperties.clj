(ns com.google.cloud.compute.v1.InstanceProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceProperties]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceProperties`

  returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^com.google.cloud.compute.v1.InstanceProperties prototype]
    (InstanceProperties/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceProperties$Builder []
    (InstanceProperties/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceProperties`"
  (^com.google.cloud.compute.v1.InstanceProperties []
    (InstanceProperties/getDefaultInstance )))

(defn get-network-interfaces-list
  "An array of network access configurations for this interface.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkInterface>`"
  (^java.util.List [^InstanceProperties this]
    (-> this (.getNetworkInterfacesList))))

(defn get-guest-accelerators-list
  "A list of guest accelerator cards' type and count to use for instances created from the
   instance template.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>`"
  (^java.util.List [^InstanceProperties this]
    (-> this (.getGuestAcceleratorsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceProperties this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties this]
    (-> this (.toString))))

(defn get-labels-map
  "Labels to apply to instances that are created from this template.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InstanceProperties this]
    (-> this (.getLabelsMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceProperties this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-shielded-instance-config
  "returns: `com.google.cloud.compute.v1.ShieldedInstanceConfig`"
  (^com.google.cloud.compute.v1.ShieldedInstanceConfig [^InstanceProperties this]
    (-> this (.getShieldedInstanceConfig))))

(defn get-scheduling
  "Specifies the scheduling options for the instances that are created from this template.

  returns: `com.google.cloud.compute.v1.Scheduling`"
  (^com.google.cloud.compute.v1.Scheduling [^InstanceProperties this]
    (-> this (.getScheduling))))

(defn get-min-cpu-platform
  "Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   such as minCpuPlatform: \"Intel Haswell\" or minCpuPlatform: \"Intel Sandy Bridge\". For more
   information, read Specifying a Minimum CPU Platform.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties this]
    (-> this (.getMinCpuPlatform))))

(defn get-description
  "An optional text description for the instances that are created from this instance template.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties this]
    (-> this (.getDescription))))

(defn get-machine-type
  "The machine type to use for instances that are created from this template.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceProperties this]
    (-> this (.getMachineType))))

(defn get-can-ip-forward?
  "Enables instances created based on this template to send packets with source IP addresses other
   than their own and receive packets with destination IP addresses other than their own. If these
   instances will be used as an IP gateway or it will be set as the next-hop in a Route resource,
   specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation
   for more information.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InstanceProperties this]
    (-> this (.getCanIpForward))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceProperties this]
    (-> this (.getApiMessageRequestBody))))

(defn get-tags
  "A list of tags to apply to the instances that are created from this template. The tags identify
   valid sources or targets for network firewalls. The setTags method can modify this list of
   tags. Each tag within the list must comply with RFC1035.

  returns: `com.google.cloud.compute.v1.Tags`"
  (^com.google.cloud.compute.v1.Tags [^InstanceProperties this]
    (-> this (.getTags))))

(defn get-disks-list
  "An array of disks that are associated with the instances that are created from this template.

  returns: `java.util.List<com.google.cloud.compute.v1.AttachedDisk>`"
  (^java.util.List [^InstanceProperties this]
    (-> this (.getDisksList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceProperties this]
    (-> this (.hashCode))))

(defn get-metadata
  "The metadata key/value pairs to assign to instances that are created from this template. These
   pairs can consist of custom metadata or predefined keys. See Project and instance metadata for
   more information.

  returns: `com.google.cloud.compute.v1.Metadata`"
  (^com.google.cloud.compute.v1.Metadata [^InstanceProperties this]
    (-> this (.getMetadata))))

(defn get-service-accounts-list
  "A list of service accounts with specified scopes. Access tokens for these service accounts are
   available to the instances that are created from this template. Use metadata queries to obtain
   the access tokens for these instances.

  returns: `java.util.List<com.google.cloud.compute.v1.ServiceAccount>`"
  (^java.util.List [^InstanceProperties this]
    (-> this (.getServiceAccountsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceProperties this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceProperties$Builder`"
  (^com.google.cloud.compute.v1.InstanceProperties$Builder [^InstanceProperties this]
    (-> this (.toBuilder))))

