(ns com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsAddInstanceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^TargetPoolsAddInstanceRequest$Builder this ^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "A full or partial URL to an instance to add to this target pool. This can be a full or
   partial URL. For example, the following are valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
   - projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^TargetPoolsAddInstanceRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "A full or partial URL to an instance to add to this target pool. This can be a full or
   partial URL. For example, the following are valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
   - projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^TargetPoolsAddInstanceRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "A full or partial URL to an instance to add to this target pool. This can be a full or
   partial URL. For example, the following are valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
   - projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name

  instances - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^TargetPoolsAddInstanceRequest$Builder this ^com.google.cloud.compute.v1.InstanceReference instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest [^TargetPoolsAddInstanceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^TargetPoolsAddInstanceRequest$Builder this]
    (-> this (.clone))))

