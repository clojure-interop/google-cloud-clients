(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersRecreateRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^RegionInstanceGroupManagersRecreateRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersRecreateRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^RegionInstanceGroupManagersRecreateRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such
   as zones/[ZONE]/instances/[INSTANCE_NAME].

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^RegionInstanceGroupManagersRecreateRequest$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest [^RegionInstanceGroupManagersRecreateRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest$Builder [^RegionInstanceGroupManagersRecreateRequest$Builder this]
    (-> this (.clone))))

