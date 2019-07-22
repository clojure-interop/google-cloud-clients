(ns com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsDeleteNodesRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^NodeGroupsDeleteNodesRequest$Builder this ^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest other]
    (-> this (.mergeFrom other))))

(defn get-nodes-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsDeleteNodesRequest$Builder this]
    (-> this (.getNodesList))))

(defn add-all-nodes
  "nodes - `java.util.List`

  returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^NodeGroupsDeleteNodesRequest$Builder this ^java.util.List nodes]
    (-> this (.addAllNodes nodes))))

(defn add-nodes
  "nodes - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^NodeGroupsDeleteNodesRequest$Builder this ^java.lang.String nodes]
    (-> this (.addNodes nodes))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest [^NodeGroupsDeleteNodesRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^NodeGroupsDeleteNodesRequest$Builder this]
    (-> this (.clone))))

