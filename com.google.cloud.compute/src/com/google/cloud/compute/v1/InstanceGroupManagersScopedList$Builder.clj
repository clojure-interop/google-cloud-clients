(ns com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupManagersScopedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList$Builder this ^com.google.cloud.compute.v1.InstanceGroupManagersScopedList other]
    (-> this (.mergeFrom other))))

(defn get-instance-group-managers-list
  "[Output Only] The list of managed instance groups that are contained in the specified project
   and zone.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^java.util.List [^InstanceGroupManagersScopedList$Builder this]
    (-> this (.getInstanceGroupManagersList))))

(defn add-all-instance-group-managers
  "[Output Only] The list of managed instance groups that are contained in the specified project
   and zone.

  instance-group-managers - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList$Builder this ^java.util.List instance-group-managers]
    (-> this (.addAllInstanceGroupManagers instance-group-managers))))

(defn add-instance-group-managers
  "[Output Only] The list of managed instance groups that are contained in the specified project
   and zone.

  instance-group-managers - `com.google.cloud.compute.v1.InstanceGroupManager`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList$Builder this ^com.google.cloud.compute.v1.InstanceGroupManager instance-group-managers]
    (-> this (.addInstanceGroupManagers instance-group-managers))))

(defn get-warning
  "[Output Only] The warning that replaces the list of managed instance groups when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupManagersScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] The warning that replaces the list of managed instance groups when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList [^InstanceGroupManagersScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList$Builder this]
    (-> this (.clone))))

