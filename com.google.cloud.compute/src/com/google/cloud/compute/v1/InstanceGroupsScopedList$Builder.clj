(ns com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceGroupsScopedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList$Builder this ^com.google.cloud.compute.v1.InstanceGroupsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-instance-groups-list
  "[Output Only] The list of instance groups that are contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroup>`"
  (^java.util.List [^InstanceGroupsScopedList$Builder this]
    (-> this (.getInstanceGroupsList))))

(defn add-all-instance-groups
  "[Output Only] The list of instance groups that are contained in this scope.

  instance-groups - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList$Builder this ^java.util.List instance-groups]
    (-> this (.addAllInstanceGroups instance-groups))))

(defn add-instance-groups
  "[Output Only] The list of instance groups that are contained in this scope.

  instance-groups - `com.google.cloud.compute.v1.InstanceGroup`

  returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList$Builder this ^com.google.cloud.compute.v1.InstanceGroup instance-groups]
    (-> this (.addInstanceGroups instance-groups))))

(defn get-warning
  "[Output Only] An informational warning that replaces the list of instance groups when the
   list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that replaces the list of instance groups when the
   list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList [^InstanceGroupsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList$Builder this]
    (-> this (.clone))))

