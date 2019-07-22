(ns com.google.cloud.compute.v1.InstancesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstancesScopedList`

  returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList$Builder this ^com.google.cloud.compute.v1.InstancesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-instances-list
  "[Output Only] A list of instances contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Instance>`"
  (^java.util.List [^InstancesScopedList$Builder this]
    (-> this (.getInstancesList))))

(defn add-all-instances
  "[Output Only] A list of instances contained in this scope.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn add-instances
  "[Output Only] A list of instances contained in this scope.

  instances - `com.google.cloud.compute.v1.Instance`

  returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList$Builder this ^com.google.cloud.compute.v1.Instance instances]
    (-> this (.addInstances instances))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of instances when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstancesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of instances when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstancesScopedList`"
  (^com.google.cloud.compute.v1.InstancesScopedList [^InstancesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList$Builder this]
    (-> this (.clone))))

