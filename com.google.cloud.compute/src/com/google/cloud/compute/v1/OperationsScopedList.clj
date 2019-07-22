(ns com.google.cloud.compute.v1.OperationsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 OperationsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.OperationsScopedList`

  returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^com.google.cloud.compute.v1.OperationsScopedList prototype]
    (OperationsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder []
    (OperationsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.OperationsScopedList`"
  (^com.google.cloud.compute.v1.OperationsScopedList []
    (OperationsScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of operations when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^OperationsScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OperationsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OperationsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^OperationsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-operations-list
  "[Output Only] A list of operations contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Operation>`"
  (^java.util.List [^OperationsScopedList this]
    (-> this (.getOperationsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^OperationsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OperationsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OperationsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList this]
    (-> this (.toBuilder))))

