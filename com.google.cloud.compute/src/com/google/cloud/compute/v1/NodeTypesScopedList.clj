(ns com.google.cloud.compute.v1.NodeTypesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTypesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeTypesScopedList`

  returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^com.google.cloud.compute.v1.NodeTypesScopedList prototype]
    (NodeTypesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder []
    (NodeTypesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeTypesScopedList`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList []
    (NodeTypesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that appears when the node types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeTypesScopedList this]
    (-> this (.getWarning))))

(defn get-node-types-list
  "[Output Only] A list of node types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeType>`"
  (^java.util.List [^NodeTypesScopedList this]
    (-> this (.getNodeTypesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeTypesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeTypesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeTypesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeTypesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeTypesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeTypesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeTypesScopedList$Builder [^NodeTypesScopedList this]
    (-> this (.toBuilder))))

