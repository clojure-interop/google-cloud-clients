(ns com.google.cloud.compute.v1.AutoscalersScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalersScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalersScopedList`

  returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList$Builder this ^com.google.cloud.compute.v1.AutoscalersScopedList other]
    (-> this (.mergeFrom other))))

(defn get-autoscalers-list
  "[Output Only] A list of autoscalers contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Autoscaler>`"
  (^java.util.List [^AutoscalersScopedList$Builder this]
    (-> this (.getAutoscalersList))))

(defn add-all-autoscalers
  "[Output Only] A list of autoscalers contained in this scope.

  autoscalers - `java.util.List`

  returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList$Builder this ^java.util.List autoscalers]
    (-> this (.addAllAutoscalers autoscalers))))

(defn add-autoscalers
  "[Output Only] A list of autoscalers contained in this scope.

  autoscalers - `com.google.cloud.compute.v1.Autoscaler`

  returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList$Builder this ^com.google.cloud.compute.v1.Autoscaler autoscalers]
    (-> this (.addAutoscalers autoscalers))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of autoscalers when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AutoscalersScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of autoscalers when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalersScopedList`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList [^AutoscalersScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList$Builder this]
    (-> this (.clone))))

