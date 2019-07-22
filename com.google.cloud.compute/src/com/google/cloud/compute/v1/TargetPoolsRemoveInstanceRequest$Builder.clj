(ns com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsRemoveInstanceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^TargetPoolsRemoveInstanceRequest$Builder this ^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "URLs of the instances to be removed from target pool.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^TargetPoolsRemoveInstanceRequest$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "URLs of the instances to be removed from target pool.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^TargetPoolsRemoveInstanceRequest$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "URLs of the instances to be removed from target pool.

  instances - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^TargetPoolsRemoveInstanceRequest$Builder this ^com.google.cloud.compute.v1.InstanceReference instances]
    (-> this (.addInstances instances))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest [^TargetPoolsRemoveInstanceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^TargetPoolsRemoveInstanceRequest$Builder this]
    (-> this (.clone))))

