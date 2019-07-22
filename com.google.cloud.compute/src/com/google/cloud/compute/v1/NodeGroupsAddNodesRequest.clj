(ns com.google.cloud.compute.v1.NodeGroupsAddNodesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsAddNodesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder [^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest prototype]
    (NodeGroupsAddNodesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder []
    (NodeGroupsAddNodesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest []
    (NodeGroupsAddNodesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroupsAddNodesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroupsAddNodesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsAddNodesRequest this]
    (-> this (.getFieldMask))))

(defn get-additional-node-count
  "Count of additional nodes to be added to the node group.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^NodeGroupsAddNodesRequest this]
    (-> this (.getAdditionalNodeCount))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest$Builder [^NodeGroupsAddNodesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsAddNodesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroupsAddNodesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroupsAddNodesRequest this]
    (-> this (.hashCode))))

