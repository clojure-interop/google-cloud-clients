(ns com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersAbandonInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^InstanceGroupManagersAbandonInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^InstanceGroupManagersAbandonInstancesRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^InstanceGroupManagersAbandonInstancesRequest$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest [^InstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^InstanceGroupManagersAbandonInstancesRequest$Builder this]
    (-> this (.clone))))

