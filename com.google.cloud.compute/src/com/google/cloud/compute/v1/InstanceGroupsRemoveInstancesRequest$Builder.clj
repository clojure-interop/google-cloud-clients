(ns com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsRemoveInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^InstanceGroupsRemoveInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The list of instances to remove from the instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^InstanceGroupsRemoveInstancesRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The list of instances to remove from the instance group.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^InstanceGroupsRemoveInstancesRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The list of instances to remove from the instance group.

  instances - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^InstanceGroupsRemoveInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceReference instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest [^InstanceGroupsRemoveInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^InstanceGroupsRemoveInstancesRequest$Builder this]
    (-> this (.clone))))

