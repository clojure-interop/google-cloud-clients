(ns com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerStatus$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagerStatus`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder [^InstanceGroupManagerStatus$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagerStatus other]
    (-> this (.mergeFrom other))))

(defn get-is-stable?
  "[Output Only] A bit indicating whether the managed instance group is in a stable state. A
   stable state means that: none of the instances in the managed instance group is currently
   undergoing any type of change (for example, creation, restart, or deletion); no future
   changes are scheduled for instances in the managed instance group; and the managed instance
   group itself is not being modified.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InstanceGroupManagerStatus$Builder this]
    (-> this (.getIsStable))))

(defn set-is-stable
  "[Output Only] A bit indicating whether the managed instance group is in a stable state. A
   stable state means that: none of the instances in the managed instance group is currently
   undergoing any type of change (for example, creation, restart, or deletion); no future
   changes are scheduled for instances in the managed instance group; and the managed instance
   group itself is not being modified.

  is-stable - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder [^InstanceGroupManagerStatus$Builder this ^java.lang.Boolean is-stable]
    (-> this (.setIsStable is-stable))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus [^InstanceGroupManagerStatus$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder [^InstanceGroupManagerStatus$Builder this]
    (-> this (.clone))))

