(ns com.google.cloud.compute.v1.InstanceGroupManager$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManager$Builder]))

(defn get-versions-list
  "Specifies the instance templates used by this managed instance group to create instances.

   Each version is defined by an instanceTemplate and a name. Every version can appear at
   most once per instance group. This field overrides the top-level instanceTemplate field. Read
   more about the relationships between these fields. Exactly one version must leave the
   targetSize field unset. That version will be applied to all remaining instances. For more
   information, read about canary updates.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerVersion>`"
  (^java.util.List [^InstanceGroupManager$Builder this]
    (-> this (.getVersionsList))))

(defn add-all-versions
  "Specifies the instance templates used by this managed instance group to create instances.

   Each version is defined by an instanceTemplate and a name. Every version can appear at
   most once per instance group. This field overrides the top-level instanceTemplate field. Read
   more about the relationships between these fields. Exactly one version must leave the
   targetSize field unset. That version will be applied to all remaining instances. For more
   information, read about canary updates.

  versions - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.util.List versions]
    (-> this (.addAllVersions versions))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] The URL of the region where the managed instance group resides (for regional
   resources).

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn get-instance-group
  "[Output Only] The URL of the Instance Group resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getInstanceGroup))))

(defn set-creation-timestamp
  "[Output Only] The creation timestamp for this managed instance group in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-target-size
  "The target number of running instances for this managed instance group. Deleting or
   abandoning instances reduces this number. Resizing the group changes this number.

  target-size - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.Integer target-size]
    (-> this (.setTargetSize target-size))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceGroupManager for managed
   instance groups.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getKind))))

(defn add-versions
  "Specifies the instance templates used by this managed instance group to create instances.

   Each version is defined by an instanceTemplate and a name. Every version can appear at
   most once per instance group. This field overrides the top-level instanceTemplate field. Read
   more about the relationships between these fields. Exactly one version must leave the
   targetSize field unset. That version will be applied to all remaining instances. For more
   information, read about canary updates.

  versions - `com.google.cloud.compute.v1.InstanceGroupManagerVersion`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerVersion versions]
    (-> this (.addVersions versions))))

(defn get-distribution-policy
  "Policy specifying intended distribution of instances in regional managed instance group.

  returns: `com.google.cloud.compute.v1.DistributionPolicy`"
  (^com.google.cloud.compute.v1.DistributionPolicy [^InstanceGroupManager$Builder this]
    (-> this (.getDistributionPolicy))))

(defn set-fingerprint
  "Fingerprint of this resource. This field may be used in optimistic locking. It will be
   ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in
   order to update the InstanceGroupManager, otherwise the request will fail with error 412
   conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-status
  "[Output Only] The status of this managed instance group.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus [^InstanceGroupManager$Builder this]
    (-> this (.getStatus))))

(defn set-update-policy
  "The update policy for this managed instance group.

  update-policy - `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy update-policy]
    (-> this (.setUpdatePolicy update-policy))))

(defn get-fingerprint
  "Fingerprint of this resource. This field may be used in optimistic locking. It will be
   ignored when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in
   order to update the InstanceGroupManager, otherwise the request will fail with error 412
   conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getFingerprint))))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getInstanceTemplate))))

(defn set-name
  "The name of the managed instance group. The name must be 1-63 characters long, and comply
   with RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] The resource type, which is always compute#instanceGroupManager for managed
   instance groups.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-all-target-pools
  "The URLs for all TargetPool resources to which instances in the instanceGroup field are
   added. The target pools automatically apply to all of the instances in the managed instance
   group.

  target-pools - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.util.List target-pools]
    (-> this (.addAllTargetPools target-pools))))

(defn add-target-pools
  "The URLs for all TargetPool resources to which instances in the instanceGroup field are
   added. The target pools automatically apply to all of the instances in the managed instance
   group.

  target-pools - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String target-pools]
    (-> this (.addTargetPools target-pools))))

(defn add-all-auto-healing-policies
  "The autohealing policy for this managed instance group. You can specify only one value.

  auto-healing-policies - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.util.List auto-healing-policies]
    (-> this (.addAllAutoHealingPolicies auto-healing-policies))))

(defn get-name
  "The name of the managed instance group. The name must be 1-63 characters long, and comply
   with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] A unique identifier for this resource type. The server generates this
   identifier.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-auto-healing-policies-list
  "The autohealing policy for this managed instance group. You can specify only one value.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy>`"
  (^java.util.List [^InstanceGroupManager$Builder this]
    (-> this (.getAutoHealingPoliciesList))))

(defn set-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn get-named-ports-list
  "Named ports configured for the Instance Groups complementary to this Instance Group Manager.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceGroupManager$Builder this]
    (-> this (.getNamedPortsList))))

(defn add-auto-healing-policies
  "The autohealing policy for this managed instance group. You can specify only one value.

  auto-healing-policies - `com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy auto-healing-policies]
    (-> this (.addAutoHealingPolicies auto-healing-policies))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManager`"
  (^com.google.cloud.compute.v1.InstanceGroupManager [^InstanceGroupManager$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getDescription))))

(defn set-base-instance-name
  "The base instance name to use for instances in this group. The value must be 1-58 characters
   long. Instances are named by appending a hyphen and a random four-character string to the
   base instance name. The base instance name must comply with RFC1035.

  base-instance-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String base-instance-name]
    (-> this (.setBaseInstanceName base-instance-name))))

(defn set-instance-group
  "[Output Only] The URL of the Instance Group resource.

  instance-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String instance-group]
    (-> this (.setInstanceGroup instance-group))))

(defn get-id
  "[Output Only] A unique identifier for this resource type. The server generates this
   identifier.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] The URL for this managed instance group. The server defines this URL.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn get-current-actions
  "[Output Only] The list of instance actions and the number of instances in this managed
   instance group that are scheduled for each of those actions.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary [^InstanceGroupManager$Builder this]
    (-> this (.getCurrentActions))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManager`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManager other]
    (-> this (.mergeFrom other))))

(defn set-zone
  "[Output Only] The URL of the zone where the managed instance group is located (for zonal
   resources).

  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn get-base-instance-name
  "The base instance name to use for instances in this group. The value must be 1-58 characters
   long. Instances are named by appending a hyphen and a random four-character string to the
   base instance name. The base instance name must comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getBaseInstanceName))))

(defn get-self-link
  "[Output Only] The URL for this managed instance group. The server defines this URL.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The URL of the zone where the managed instance group is located (for zonal
   resources).

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getZone))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this]
    (-> this (.clone))))

(defn get-target-size
  "The target number of running instances for this managed instance group. Deleting or
   abandoning instances reduces this number. Resizing the group changes this number.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManager$Builder this]
    (-> this (.getTargetSize))))

(defn set-current-actions
  "[Output Only] The list of instance actions and the number of instances in this managed
   instance group that are scheduled for each of those actions.

  current-actions - `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary current-actions]
    (-> this (.setCurrentActions current-actions))))

(defn get-target-pools-list
  "The URLs for all TargetPool resources to which instances in the instanceGroup field are
   added. The target pools automatically apply to all of the instances in the managed instance
   group.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManager$Builder this]
    (-> this (.getTargetPoolsList))))

(defn get-creation-timestamp
  "[Output Only] The creation timestamp for this managed instance group in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-update-policy
  "The update policy for this managed instance group.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy [^InstanceGroupManager$Builder this]
    (-> this (.getUpdatePolicy))))

(defn add-named-ports
  "Named ports configured for the Instance Groups complementary to this Instance Group Manager.

  named-ports - `com.google.cloud.compute.v1.NamedPort`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.NamedPort named-ports]
    (-> this (.addNamedPorts named-ports))))

(defn set-distribution-policy
  "Policy specifying intended distribution of instances in regional managed instance group.

  distribution-policy - `com.google.cloud.compute.v1.DistributionPolicy`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.DistributionPolicy distribution-policy]
    (-> this (.setDistributionPolicy distribution-policy))))

(defn set-status
  "[Output Only] The status of this managed instance group.

  status - `com.google.cloud.compute.v1.InstanceGroupManagerStatus`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerStatus status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] The URL of the region where the managed instance group resides (for regional
   resources).

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager$Builder this]
    (-> this (.getRegion))))

(defn add-all-named-ports
  "Named ports configured for the Instance Groups complementary to this Instance Group Manager.

  named-ports - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager$Builder this ^java.util.List named-ports]
    (-> this (.addAllNamedPorts named-ports))))

