(ns com.google.cloud.compute.v1.DisksScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DisksScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DisksScopedList`

  returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList$Builder this ^com.google.cloud.compute.v1.DisksScopedList other]
    (-> this (.mergeFrom other))))

(defn get-disks-list
  "[Output Only] A list of disks contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Disk>`"
  (^java.util.List [^DisksScopedList$Builder this]
    (-> this (.getDisksList))))

(defn add-all-disks
  "[Output Only] A list of disks contained in this scope.

  disks - `java.util.List`

  returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList$Builder this ^java.util.List disks]
    (-> this (.addAllDisks disks))))

(defn add-disks
  "[Output Only] A list of disks contained in this scope.

  disks - `com.google.cloud.compute.v1.Disk`

  returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList$Builder this ^com.google.cloud.compute.v1.Disk disks]
    (-> this (.addDisks disks))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of disks when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^DisksScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of disks when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.DisksScopedList`"
  (^com.google.cloud.compute.v1.DisksScopedList [^DisksScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList$Builder this]
    (-> this (.clone))))

