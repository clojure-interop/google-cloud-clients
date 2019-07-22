(ns com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsAddInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^InstanceGroupsAddInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The list of instances to add to the instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^InstanceGroupsAddInstancesRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The list of instances to add to the instance group.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^InstanceGroupsAddInstancesRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The list of instances to add to the instance group.

  instances - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^InstanceGroupsAddInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceReference instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest [^InstanceGroupsAddInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^InstanceGroupsAddInstancesRequest$Builder this]
    (-> this (.clone))))

