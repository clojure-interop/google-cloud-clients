(ns com.google.cloud.compute.v1.NodeGroupsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NodeGroupsScopedList`

  returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^com.google.cloud.compute.v1.NodeGroupsScopedList prototype]
    (NodeGroupsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder []
    (NodeGroupsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NodeGroupsScopedList`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList []
    (NodeGroupsScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that appears when the nodeGroup list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^NodeGroupsScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeGroupsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NodeGroupsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NodeGroupsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NodeGroupsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeGroupsScopedList this]
    (-> this (.hashCode))))

(defn get-node-groups-list
  "[Output Only] A list of node groups contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.NodeGroup>`"
  (^java.util.List [^NodeGroupsScopedList this]
    (-> this (.getNodeGroupsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeGroupsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NodeGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupsScopedList$Builder [^NodeGroupsScopedList this]
    (-> this (.toBuilder))))

