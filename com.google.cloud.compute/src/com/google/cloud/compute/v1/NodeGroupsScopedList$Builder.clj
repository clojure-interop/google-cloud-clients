(ns com.google.cloud.compute.v1.NodeGroupsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroupsScopedList`

  returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList$Builder this ^com.google.cloud.compute.v1.NodeGroupsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-node-groups-list
  "[Output Only] A list of node groups contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeGroup>`"
  (^java.util.List [^NodeGroupsScopedList$Builder this]
    (-> this (.getNodeGroupsList))))

(defn add-all-node-groups
  "[Output Only] A list of node groups contained in this scope.

  node-groups - `java.util.List`

  returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList$Builder this ^java.util.List node-groups]
    (-> this (.addAllNodeGroups node-groups))))

(defn add-node-groups
  "[Output Only] A list of node groups contained in this scope.

  node-groups - `com.google.cloud.compute.v1.NodeGroup`

  returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList$Builder this ^com.google.cloud.compute.v1.NodeGroup node-groups]
    (-> this (.addNodeGroups node-groups))))

(defn get-warning
  "[Output Only] An informational warning that appears when the nodeGroup list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeGroupsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] An informational warning that appears when the nodeGroup list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroupsScopedList`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList [^NodeGroupsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList$Builder this]
    (-> this (.clone))))

