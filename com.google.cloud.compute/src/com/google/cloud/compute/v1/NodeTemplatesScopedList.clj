(ns com.google.cloud.compute.v1.NodeTemplatesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplatesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeTemplatesScopedList`

  returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^com.google.cloud.compute.v1.NodeTemplatesScopedList prototype]
    (NodeTemplatesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder []
    (NodeTemplatesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList []
    (NodeTemplatesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that appears when the node templates list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTemplatesScopedList this]
    (-> this (.getWarning))))

(defn get-node-templates-list
  "[Output Only] A list of node templates contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeTemplate>`"
  (^java.util.List [^NodeTemplatesScopedList this]
    (-> this (.getNodeTemplatesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeTemplatesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTemplatesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeTemplatesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeTemplatesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeTemplatesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeTemplatesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplatesScopedList$Builder [^NodeTemplatesScopedList this]
    (-> this (.toBuilder))))

