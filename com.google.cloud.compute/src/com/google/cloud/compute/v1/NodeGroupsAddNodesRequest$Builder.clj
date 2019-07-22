(ns com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsAddNodesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder [^NodeGroupsAddNodesRequest$Builder this ^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest other]
    (-> this (.mergeFrom other))))

(defn get-additional-node-count
  "Count of additional nodes to be added to the node group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeGroupsAddNodesRequest$Builder this]
    (-> this (.getAdditionalNodeCount))))

(defn set-additional-node-count
  "Count of additional nodes to be added to the node group.

  additional-node-count - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder [^NodeGroupsAddNodesRequest$Builder this ^java.lang.Integer additional-node-count]
    (-> this (.setAdditionalNodeCount additional-node-count))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest [^NodeGroupsAddNodesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder [^NodeGroupsAddNodesRequest$Builder this]
    (-> this (.clone))))

