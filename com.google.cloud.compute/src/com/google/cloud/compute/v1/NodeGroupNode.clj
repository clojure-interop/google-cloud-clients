(ns com.google.cloud.compute.v1.NodeGroupNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupNode]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroupNode`

  returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^com.google.cloud.compute.v1.NodeGroupNode prototype]
    (NodeGroupNode/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder []
    (NodeGroupNode/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroupNode`"
  (^com.google.cloud.compute.v1.NodeGroupNode []
    (NodeGroupNode/getDefaultInstance )))

(defn get-status
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode this]
    (-> this (.getStatus))))

(defn get-node-type
  "The type of this node.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode this]
    (-> this (.getNodeType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupNode this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroupNode this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of the node.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupNode this]
    (-> this (.getName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroupNode this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroupNode this]
    (-> this (.hashCode))))

(defn get-instances-list
  "Instances scheduled on this node.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupNode this]
    (-> this (.getInstancesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroupNode this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroupNode$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupNode$Builder [^NodeGroupNode this]
    (-> this (.toBuilder))))

