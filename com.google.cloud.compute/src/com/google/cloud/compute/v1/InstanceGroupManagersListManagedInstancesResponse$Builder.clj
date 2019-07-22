(ns com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersListManagedInstancesResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^InstanceGroupManagersListManagedInstancesResponse$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse other]
    (-> this (.mergeFrom other))))

(defn get-managed-instances-list
  "[Output Only] The list of instances in the managed instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.ManagedInstance>`"
  (^java.util.List [^InstanceGroupManagersListManagedInstancesResponse$Builder this]
    (-> this (.getManagedInstancesList))))

(defn add-all-managed-instances
  "[Output Only] The list of instances in the managed instance group.

  managed-instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^InstanceGroupManagersListManagedInstancesResponse$Builder this ^java.util.List managed-instances]
    (-> this (.addAllManagedInstances managed-instances))))

(defn add-managed-instances
  "[Output Only] The list of instances in the managed instance group.

  managed-instances - `com.google.cloud.compute.v1.ManagedInstance`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^InstanceGroupManagersListManagedInstancesResponse$Builder this ^com.google.cloud.compute.v1.ManagedInstance managed-instances]
    (-> this (.addManagedInstances managed-instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse [^InstanceGroupManagersListManagedInstancesResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^InstanceGroupManagersListManagedInstancesResponse$Builder this]
    (-> this (.clone))))

