(ns com.google.cloud.compute.v1.InstanceGroupManager
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManager]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManager`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^com.google.cloud.compute.v1.InstanceGroupManager prototype]
    (InstanceGroupManager/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder []
    (InstanceGroupManager/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManager`"
  (^com.google.cloud.compute.v1.InstanceGroupManager []
    (InstanceGroupManager/getDefaultInstance )))

(defn get-versions-list
  "Specifies the instance templates used by this managed instance group to create instances.

   Each version is defined by an instanceTemplate and a name. Every version can appear at most
   once per instance group. This field overrides the top-level instanceTemplate field. Read more
   about the relationships between these fields. Exactly one version must leave the targetSize
   field unset. That version will be applied to all remaining instances. For more information,
   read about canary updates.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerVersion>`"
  (^java.util.List [^InstanceGroupManager this]
    (-> this (.getVersionsList))))

(defn get-instance-group
  "[Output Only] The URL of the Instance Group resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getInstanceGroup))))

(defn get-kind
  "[Output Only] The resource type, which is always compute#instanceGroupManager for managed
   instance groups.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getKind))))

(defn get-distribution-policy
  "Policy specifying intended distribution of instances in regional managed instance group.

  returns: `com.google.cloud.compute.v1.DistributionPolicy`"
  (^com.google.cloud.compute.v1.DistributionPolicy [^InstanceGroupManager this]
    (-> this (.getDistributionPolicy))))

(defn get-status
  "[Output Only] The status of this managed instance group.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus [^InstanceGroupManager this]
    (-> this (.getStatus))))

(defn get-fingerprint
  "Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   update the InstanceGroupManager, otherwise the request will fail with error 412
   conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getFingerprint))))

(defn get-instance-template
  "The URL of the instance template that is specified for this managed instance group. The group
   uses this template to create all new instances in the managed instance group.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getInstanceTemplate))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManager this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManager this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of the managed instance group. The name must be 1-63 characters long, and comply with
   RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getName))))

(defn get-auto-healing-policies-list
  "The autohealing policy for this managed instance group. You can specify only one value.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy>`"
  (^java.util.List [^InstanceGroupManager this]
    (-> this (.getAutoHealingPoliciesList))))

(defn get-named-ports-list
  "Named ports configured for the Instance Groups complementary to this Instance Group Manager.

  returns: `java.util.List<com.google.cloud.compute.v1.NamedPort>`"
  (^java.util.List [^InstanceGroupManager this]
    (-> this (.getNamedPortsList))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] A unique identifier for this resource type. The server generates this identifier.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getId))))

(defn get-current-actions
  "[Output Only] The list of instance actions and the number of instances in this managed instance
   group that are scheduled for each of those actions.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerActionsSummary [^InstanceGroupManager this]
    (-> this (.getCurrentActions))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManager this]
    (-> this (.getApiMessageRequestBody))))

(defn get-base-instance-name
  "The base instance name to use for instances in this group. The value must be 1-58 characters
   long. Instances are named by appending a hyphen and a random four-character string to the base
   instance name. The base instance name must comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getBaseInstanceName))))

(defn get-self-link
  "[Output Only] The URL for this managed instance group. The server defines this URL.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] The URL of the zone where the managed instance group is located (for zonal
   resources).

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getZone))))

(defn get-target-size
  "The target number of running instances for this managed instance group. Deleting or abandoning
   instances reduces this number. Resizing the group changes this number.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^InstanceGroupManager this]
    (-> this (.getTargetSize))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManager this]
    (-> this (.hashCode))))

(defn get-target-pools-list
  "The URLs for all TargetPool resources to which instances in the instanceGroup field are added.
   The target pools automatically apply to all of the instances in the managed instance group.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManager this]
    (-> this (.getTargetPoolsList))))

(defn get-creation-timestamp
  "[Output Only] The creation timestamp for this managed instance group in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getCreationTimestamp))))

(defn get-update-policy
  "The update policy for this managed instance group.

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy [^InstanceGroupManager this]
    (-> this (.getUpdatePolicy))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManager this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] The URL of the region where the managed instance group resides (for regional
   resources).

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManager this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManager$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManager$Builder [^InstanceGroupManager this]
    (-> this (.toBuilder))))

