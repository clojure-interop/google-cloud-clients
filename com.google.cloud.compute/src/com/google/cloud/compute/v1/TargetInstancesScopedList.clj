(ns com.google.cloud.compute.v1.TargetInstancesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstancesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetInstancesScopedList`

  returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^com.google.cloud.compute.v1.TargetInstancesScopedList prototype]
    (TargetInstancesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder []
    (TargetInstancesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetInstancesScopedList`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList []
    (TargetInstancesScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetInstancesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetInstancesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetInstancesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetInstancesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetInstancesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetInstancesScopedList this]
    (-> this (.hashCode))))

(defn get-target-instances-list
  "A list of target instances contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetInstance>`"
  (^java.util.List [^TargetInstancesScopedList this]
    (-> this (.getTargetInstancesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetInstancesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetInstancesScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetInstancesScopedList$Builder [^TargetInstancesScopedList this]
    (-> this (.toBuilder))))

