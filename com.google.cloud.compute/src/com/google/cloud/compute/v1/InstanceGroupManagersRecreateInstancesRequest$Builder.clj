(ns com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersRecreateInstancesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^InstanceGroupManagersRecreateInstancesRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersRecreateInstancesRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^InstanceGroupManagersRecreateInstancesRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^InstanceGroupManagersRecreateInstancesRequest$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest [^InstanceGroupManagersRecreateInstancesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^InstanceGroupManagersRecreateInstancesRequest$Builder this]
    (-> this (.clone))))

