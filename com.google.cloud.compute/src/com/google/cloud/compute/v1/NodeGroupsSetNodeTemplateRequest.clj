(ns com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsSetNodeTemplateRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`

  returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder [^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest prototype]
    (NodeGroupsSetNodeTemplateRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder []
    (NodeGroupsSetNodeTemplateRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest []
    (NodeGroupsSetNodeTemplateRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroupsSetNodeTemplateRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.getFieldMask))))

(defn get-node-template
  "Full or partial URL of the node template resource to be updated for this node group.

  returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.getNodeTemplate))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest$Builder [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroupsSetNodeTemplateRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroupsSetNodeTemplateRequest this]
    (-> this (.hashCode))))

