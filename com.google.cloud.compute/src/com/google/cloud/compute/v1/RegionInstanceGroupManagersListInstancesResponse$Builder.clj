(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersListInstancesResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^RegionInstanceGroupManagersListInstancesResponse$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse other]
    (-> this (.mergeFrom other))))

(defn get-managed-instances-list
  "A list of managed instances.

  returns: `java.util.List<com.google.cloud.compute.v1.ManagedInstance>`"
  (^java.util.List [^RegionInstanceGroupManagersListInstancesResponse$Builder this]
    (-> this (.getManagedInstancesList))))

(defn add-all-managed-instances
  "A list of managed instances.

  managed-instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^RegionInstanceGroupManagersListInstancesResponse$Builder this ^java.util.List managed-instances]
    (-> this (.addAllManagedInstances managed-instances))))

(defn add-managed-instances
  "A list of managed instances.

  managed-instances - `com.google.cloud.compute.v1.ManagedInstance`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^RegionInstanceGroupManagersListInstancesResponse$Builder this ^com.google.cloud.compute.v1.ManagedInstance managed-instances]
    (-> this (.addManagedInstances managed-instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse [^RegionInstanceGroupManagersListInstancesResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^RegionInstanceGroupManagersListInstancesResponse$Builder this]
    (-> this (.clone))))

