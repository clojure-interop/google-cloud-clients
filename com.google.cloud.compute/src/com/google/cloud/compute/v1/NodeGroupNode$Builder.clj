(ns com.google.cloud.compute.v1.NodeGroupNode$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupNode$Builder]))

(defn add-all-instances
  "Instances scheduled on this node.

  instances - `java.util.List`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^java.util.List instances]
    (-> this (.addAllInstances instances))))

(defn get-status
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode$Builder this]
    (-> this (.getStatus))))

(defn get-node-type
  "The type of this node.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode$Builder this]
    (-> this (.getNodeType))))

(defn set-name
  "The name of the node.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-name
  "The name of the node.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode$Builder this]
    (-> this (.getName))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroupNode`"
  (^com.google.cloud.compute.v1.NodeGroupNode [^NodeGroupNode$Builder this]
    (-> this (.build))))

(defn set-node-type
  "The type of this node.

  node-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^java.lang.String node-type]
    (-> this (.setNodeType node-type))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroupNode`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^com.google.cloud.compute.v1.NodeGroupNode other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this]
    (-> this (.clone))))

(defn add-instances
  "Instances scheduled on this node.

  instances - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^java.lang.String instances]
    (-> this (.addInstances instances))))

(defn get-instances-list
  "Instances scheduled on this node.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupNode$Builder this]
    (-> this (.getInstancesList))))

(defn set-status
  "status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

