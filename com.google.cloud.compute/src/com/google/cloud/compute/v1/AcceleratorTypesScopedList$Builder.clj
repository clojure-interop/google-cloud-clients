(ns com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorTypesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AcceleratorTypesScopedList`

  returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList$Builder this ^com.google.cloud.compute.v1.AcceleratorTypesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-accelerator-types-list
  "[Output Only] A list of accelerator types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorType>`"
  (^java.util.List [^AcceleratorTypesScopedList$Builder this]
    (-> this (.getAcceleratorTypesList))))

(defn add-all-accelerator-types
  "[Output Only] A list of accelerator types contained in this scope.

  accelerator-types - `java.util.List`

  returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList$Builder this ^java.util.List accelerator-types]
    (-> this (.addAllAcceleratorTypes accelerator-types))))

(defn add-accelerator-types
  "[Output Only] A list of accelerator types contained in this scope.

  accelerator-types - `com.google.cloud.compute.v1.AcceleratorType`

  returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList$Builder this ^com.google.cloud.compute.v1.AcceleratorType accelerator-types]
    (-> this (.addAcceleratorTypes accelerator-types))))

(defn get-warning
  "[Output Only] An informational warning that appears when the accelerator types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AcceleratorTypesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that appears when the accelerator types list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList [^AcceleratorTypesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList$Builder this]
    (-> this (.clone))))

