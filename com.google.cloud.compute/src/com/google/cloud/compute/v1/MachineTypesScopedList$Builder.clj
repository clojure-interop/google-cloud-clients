(ns com.google.cloud.compute.v1.MachineTypesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.MachineTypesScopedList`

  returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList$Builder this ^com.google.cloud.compute.v1.MachineTypesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-machine-types-list
  "[Output Only] A list of machine types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.MachineType>`"
  (^java.util.List [^MachineTypesScopedList$Builder this]
    (-> this (.getMachineTypesList))))

(defn add-all-machine-types
  "[Output Only] A list of machine types contained in this scope.

  machine-types - `java.util.List`

  returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList$Builder this ^java.util.List machine-types]
    (-> this (.addAllMachineTypes machine-types))))

(defn add-machine-types
  "[Output Only] A list of machine types contained in this scope.

  machine-types - `com.google.cloud.compute.v1.MachineType`

  returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList$Builder this ^com.google.cloud.compute.v1.MachineType machine-types]
    (-> this (.addMachineTypes machine-types))))

(defn get-warning
  "[Output Only] An informational warning that appears when the machine types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^MachineTypesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that appears when the machine types list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.MachineTypesScopedList`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList [^MachineTypesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList$Builder this]
    (-> this (.clone))))

