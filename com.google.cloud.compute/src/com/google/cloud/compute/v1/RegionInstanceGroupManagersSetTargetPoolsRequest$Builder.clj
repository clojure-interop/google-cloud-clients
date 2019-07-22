(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersSetTargetPoolsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this ^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest other]
    (-> this (.mergeFrom other))))

(defn get-fingerprint
  "Fingerprint of the target pools information, which is a hash of the contents. This field is
   used for optimistic locking when you update the target pool entries. This field is optional.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.getFingerprint))))

(defn set-fingerprint
  "Fingerprint of the target pools information, which is a hash of the contents. This field is
   used for optimistic locking when you update the target pool entries. This field is optional.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-target-pools-list
  "The URL of all TargetPool resources to which instances in the instanceGroup field are added.
   The target pools automatically apply to all of the instances in the managed instance group.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.getTargetPoolsList))))

(defn add-all-target-pools
  "The URL of all TargetPool resources to which instances in the instanceGroup field are added.
   The target pools automatically apply to all of the instances in the managed instance group.

  target-pools - `java.util.List`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.util.List target-pools]
    (-> this (.addAllTargetPools target-pools))))

(defn add-target-pools
  "The URL of all TargetPool resources to which instances in the instanceGroup field are added.
   The target pools automatically apply to all of the instances in the managed instance group.

  target-pools - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.lang.String target-pools]
    (-> this (.addTargetPools target-pools))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest$Builder [^RegionInstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.clone))))

