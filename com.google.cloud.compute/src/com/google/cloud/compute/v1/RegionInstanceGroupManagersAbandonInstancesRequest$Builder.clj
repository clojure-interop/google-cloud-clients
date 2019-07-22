(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersAbandonInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^RegionInstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.clone))))

