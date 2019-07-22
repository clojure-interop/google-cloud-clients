(ns com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsDeleteNodesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest prototype]
    (NodeGroupsDeleteNodesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder []
    (NodeGroupsDeleteNodesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest []
    (NodeGroupsDeleteNodesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroupsDeleteNodesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroupsDeleteNodesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsDeleteNodesRequest this]
    (-> this (.getFieldMask))))

(defn get-nodes-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsDeleteNodesRequest this]
    (-> this (.getNodesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest$Builder [^NodeGroupsDeleteNodesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsDeleteNodesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroupsDeleteNodesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroupsDeleteNodesRequest this]
    (-> this (.hashCode))))

