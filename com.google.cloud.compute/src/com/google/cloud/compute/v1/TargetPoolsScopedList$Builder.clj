(ns com.google.cloud.compute.v1.TargetPoolsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetPoolsScopedList`

  returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList$Builder this ^com.google.cloud.compute.v1.TargetPoolsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-target-pools-list
  "A list of target pools contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetPool>`"
  (^java.util.List [^TargetPoolsScopedList$Builder this]
    (-> this (.getTargetPoolsList))))

(defn add-all-target-pools
  "A list of target pools contained in this scope.

  target-pools - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList$Builder this ^java.util.List target-pools]
    (-> this (.addAllTargetPools target-pools))))

(defn add-target-pools
  "A list of target pools contained in this scope.

  target-pools - `com.google.cloud.compute.v1.TargetPool`

  returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList$Builder this ^com.google.cloud.compute.v1.TargetPool target-pools]
    (-> this (.addTargetPools target-pools))))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetPoolsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetPoolsScopedList`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList [^TargetPoolsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList$Builder this]
    (-> this (.clone))))

