(ns com.google.cloud.compute.v1.NodeTypesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTypesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeTypesScopedList`

  returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList$Builder this ^com.google.cloud.compute.v1.NodeTypesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-node-types-list
  "[Output Only] A list of node types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeType>`"
  (^java.util.List [^NodeTypesScopedList$Builder this]
    (-> this (.getNodeTypesList))))

(defn add-all-node-types
  "[Output Only] A list of node types contained in this scope.

  node-types - `java.util.List`

  returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList$Builder this ^java.util.List node-types]
    (-> this (.addAllNodeTypes node-types))))

(defn add-node-types
  "[Output Only] A list of node types contained in this scope.

  node-types - `com.google.cloud.compute.v1.NodeType`

  returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList$Builder this ^com.google.cloud.compute.v1.NodeType node-types]
    (-> this (.addNodeTypes node-types))))

(defn get-warning
  "[Output Only] An informational warning that appears when the node types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTypesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that appears when the node types list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTypesScopedList`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList [^NodeTypesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList$Builder this]
    (-> this (.clone))))

