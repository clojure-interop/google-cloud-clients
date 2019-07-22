(ns com.google.cloud.compute.v1.InstancesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesScopedList`

  returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^com.google.cloud.compute.v1.InstancesScopedList prototype]
    (InstancesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder []
    (InstancesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesScopedList`"
  (^com.google.cloud.compute.v1.InstancesScopedList []
    (InstancesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of instances when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstancesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesScopedList this]
    (-> this (.hashCode))))

(defn get-instances-list
  "[Output Only] A list of instances contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Instance>`"
  (^java.util.List [^InstancesScopedList this]
    (-> this (.getInstancesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstancesScopedList$Builder [^InstancesScopedList this]
    (-> this (.toBuilder))))

