(ns com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsSetNodeTemplateRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder [^NodeGroupsSetNodeTemplateRequest$Builder this ^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest other]
    (-> this (.mergeFrom other))))

(defn get-node-template
  "Full or partial URL of the node template resource to be updated for this node group.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsSetNodeTemplateRequest$Builder this]
    (-> this (.getNodeTemplate))))

(defn set-node-template
  "Full or partial URL of the node template resource to be updated for this node group.

  node-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder [^NodeGroupsSetNodeTemplateRequest$Builder this ^java.lang.String node-template]
    (-> this (.setNodeTemplate node-template))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest [^NodeGroupsSetNodeTemplateRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder [^NodeGroupsSetNodeTemplateRequest$Builder this]
    (-> this (.clone))))

