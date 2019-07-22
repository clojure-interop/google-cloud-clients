(ns com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplatesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeTemplatesScopedList`

  returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList$Builder this ^com.google.cloud.compute.v1.NodeTemplatesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-node-templates-list
  "[Output Only] A list of node templates contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeTemplate>`"
  (^java.util.List [^NodeTemplatesScopedList$Builder this]
    (-> this (.getNodeTemplatesList))))

(defn add-all-node-templates
  "[Output Only] A list of node templates contained in this scope.

  node-templates - `java.util.List`

  returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList$Builder this ^java.util.List node-templates]
    (-> this (.addAllNodeTemplates node-templates))))

(defn add-node-templates
  "[Output Only] A list of node templates contained in this scope.

  node-templates - `com.google.cloud.compute.v1.NodeTemplate`

  returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList$Builder this ^com.google.cloud.compute.v1.NodeTemplate node-templates]
    (-> this (.addNodeTemplates node-templates))))

(defn get-warning
  "[Output Only] An informational warning that appears when the node templates list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTemplatesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that appears when the node templates list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList [^NodeTemplatesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList$Builder this]
    (-> this (.clone))))

