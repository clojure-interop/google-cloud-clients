(ns com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsListInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder [^InstanceGroupsListInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instance-state
  "A filter for the state of the instances in the instance group. Valid options are ALL or
   RUNNING. If you do not specify this parameter the list includes all instances regardless of
   their state.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstancesRequest$Builder this]
    (-> this (.getInstanceState))))

(defn set-instance-state
  "A filter for the state of the instances in the instance group. Valid options are ALL or
   RUNNING. If you do not specify this parameter the list includes all instances regardless of
   their state.

  instance-state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder [^InstanceGroupsListInstancesRequest$Builder this ^java.lang.String instance-state]
    (-> this (.setInstanceState instance-state))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest [^InstanceGroupsListInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder [^InstanceGroupsListInstancesRequest$Builder this]
    (-> this (.clone))))

