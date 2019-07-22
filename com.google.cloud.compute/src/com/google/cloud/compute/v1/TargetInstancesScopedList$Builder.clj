(ns com.google.cloud.compute.v1.TargetInstancesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstancesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetInstancesScopedList`

  returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList$Builder this ^com.google.cloud.compute.v1.TargetInstancesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-target-instances-list
  "A list of target instances contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetInstance>`"
  (^java.util.List [^TargetInstancesScopedList$Builder this]
    (-> this (.getTargetInstancesList))))

(defn add-all-target-instances
  "A list of target instances contained in this scope.

  target-instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList$Builder this ^java.util.List target-instances]
    (-> this (.addAllTargetInstances target-instances))))

(defn add-target-instances
  "A list of target instances contained in this scope.

  target-instances - `com.google.cloud.compute.v1.TargetInstance`

  returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList$Builder this ^com.google.cloud.compute.v1.TargetInstance target-instances]
    (-> this (.addTargetInstances target-instances))))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetInstancesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetInstancesScopedList`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList [^TargetInstancesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList$Builder this]
    (-> this (.clone))))

