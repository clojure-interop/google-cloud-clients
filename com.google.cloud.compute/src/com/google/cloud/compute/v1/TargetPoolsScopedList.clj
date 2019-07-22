(ns com.google.cloud.compute.v1.TargetPoolsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolsScopedList`

  returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^com.google.cloud.compute.v1.TargetPoolsScopedList prototype]
    (TargetPoolsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder []
    (TargetPoolsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolsScopedList`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList []
    (TargetPoolsScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetPoolsScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolsScopedList this]
    (-> this (.hashCode))))

(defn get-target-pools-list
  "A list of target pools contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetPool>`"
  (^java.util.List [^TargetPoolsScopedList this]
    (-> this (.getTargetPoolsList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolsScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsScopedList$Builder [^TargetPoolsScopedList this]
    (-> this (.toBuilder))))

