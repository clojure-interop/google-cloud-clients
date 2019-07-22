(ns com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupsListInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^RegionInstanceGroupsListInstancesRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instance-state
  "Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default,
   it lists all instances.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstancesRequest$Builder this]
    (-> this (.getInstanceState))))

(defn set-instance-state
  "Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default,
   it lists all instances.

  instance-state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^RegionInstanceGroupsListInstancesRequest$Builder this ^java.lang.String instance-state]
    (-> this (.setInstanceState instance-state))))

(defn get-port-name
  "Name of port user is interested in. It is optional. If it is set, only information about this
   ports will be returned. If it is not set, all the named ports will be returned. Always lists
   all instances.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstancesRequest$Builder this]
    (-> this (.getPortName))))

(defn set-port-name
  "Name of port user is interested in. It is optional. If it is set, only information about this
   ports will be returned. If it is not set, all the named ports will be returned. Always lists
   all instances.

  port-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^RegionInstanceGroupsListInstancesRequest$Builder this ^java.lang.String port-name]
    (-> this (.setPortName port-name))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest [^RegionInstanceGroupsListInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^RegionInstanceGroupsListInstancesRequest$Builder this]
    (-> this (.clone))))

