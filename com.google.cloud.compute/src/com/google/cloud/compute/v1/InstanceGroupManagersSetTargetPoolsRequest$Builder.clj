(ns com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersSetTargetPoolsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest other]
    (-> this (.mergeFrom other))))

(defn get-fingerprint
  "The fingerprint of the target pools information. Use this optional property to prevent
   conflicts when multiple users change the target pools settings concurrently. Obtain the
   fingerprint with the instanceGroupManagers.get method. Then, include the fingerprint in your
   request to ensure that you do not overwrite changes that were applied from another concurrent
   request.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.getFingerprint))))

(defn set-fingerprint
  "The fingerprint of the target pools information. Use this optional property to prevent
   conflicts when multiple users change the target pools settings concurrently. Obtain the
   fingerprint with the instanceGroupManagers.get method. Then, include the fingerprint in your
   request to ensure that you do not overwrite changes that were applied from another concurrent
   request.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn get-target-pools-list
  "The list of target pool URLs that instances in this managed instance group belong to. The
   managed instance group applies these target pools to all of the instances in the group.
   Existing instances and new instances in the group all receive these target pool settings.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.getTargetPoolsList))))

(defn add-all-target-pools
  "The list of target pool URLs that instances in this managed instance group belong to. The
   managed instance group applies these target pools to all of the instances in the group.
   Existing instances and new instances in the group all receive these target pool settings.

  target-pools - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.util.List target-pools]
    (-> this (.addAllTargetPools target-pools))))

(defn add-target-pools
  "The list of target pool URLs that instances in this managed instance group belong to. The
   managed instance group applies these target pools to all of the instances in the group.
   Existing instances and new instances in the group all receive these target pool settings.

  target-pools - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest$Builder this ^java.lang.String target-pools]
    (-> this (.addTargetPools target-pools))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest [^InstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest$Builder [^InstanceGroupManagersSetTargetPoolsRequest$Builder this]
    (-> this (.clone))))

