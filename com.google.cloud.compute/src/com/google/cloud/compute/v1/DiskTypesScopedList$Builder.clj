(ns com.google.cloud.compute.v1.DiskTypesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskTypesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DiskTypesScopedList`

  returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList$Builder this ^com.google.cloud.compute.v1.DiskTypesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-disk-types-list
  "[Output Only] A list of disk types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.DiskType>`"
  (^java.util.List [^DiskTypesScopedList$Builder this]
    (-> this (.getDiskTypesList))))

(defn add-all-disk-types
  "[Output Only] A list of disk types contained in this scope.

  disk-types - `java.util.List`

  returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList$Builder this ^java.util.List disk-types]
    (-> this (.addAllDiskTypes disk-types))))

(defn add-disk-types
  "[Output Only] A list of disk types contained in this scope.

  disk-types - `com.google.cloud.compute.v1.DiskType`

  returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList$Builder this ^com.google.cloud.compute.v1.DiskType disk-types]
    (-> this (.addDiskTypes disk-types))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of disk types when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^DiskTypesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of disk types when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.DiskTypesScopedList`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList [^DiskTypesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList$Builder this]
    (-> this (.clone))))

