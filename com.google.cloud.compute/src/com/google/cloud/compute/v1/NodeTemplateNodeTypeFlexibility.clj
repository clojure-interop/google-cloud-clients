(ns com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateNodeTypeFlexibility]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`

  returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility prototype]
    (NodeTemplateNodeTypeFlexibility/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder []
    (NodeTemplateNodeTypeFlexibility/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility []
    (NodeTemplateNodeTypeFlexibility/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.toString))))

(defn get-local-ssd
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.getLocalSsd))))

(defn get-cpus
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.getCpus))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeTemplateNodeTypeFlexibility this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeTemplateNodeTypeFlexibility this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-memory
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.getMemory))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility$Builder [^NodeTemplateNodeTypeFlexibility this]
    (-> this (.toBuilder))))

