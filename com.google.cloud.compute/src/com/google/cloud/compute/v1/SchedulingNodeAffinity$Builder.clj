(ns com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SchedulingNodeAffinity$Builder]))

(defn get-operator
  "Defines the operation of node selection.

  returns: `java.lang.String`"
  (^java.lang.String [^SchedulingNodeAffinity$Builder this]
    (-> this (.getOperator))))

(defn add-all-values
  "Corresponds to the label values of Node resource.

  values - `java.util.List`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this ^java.util.List values]
    (-> this (.addAllValues values))))

(defn get-values-list
  "Corresponds to the label values of Node resource.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SchedulingNodeAffinity$Builder this]
    (-> this (.getValuesList))))

(defn get-key
  "Corresponds to the label key of Node resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SchedulingNodeAffinity$Builder this]
    (-> this (.getKey))))

(defn set-operator
  "Defines the operation of node selection.

  operator - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this ^java.lang.String operator]
    (-> this (.setOperator operator))))

(defn build
  "returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity [^SchedulingNodeAffinity$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SchedulingNodeAffinity`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this ^com.google.cloud.compute.v1.SchedulingNodeAffinity other]
    (-> this (.mergeFrom other))))

(defn set-key
  "Corresponds to the label key of Node resource.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn add-values
  "Corresponds to the label values of Node resource.

  values - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this ^java.lang.String values]
    (-> this (.addValues values))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity$Builder this]
    (-> this (.clone))))

