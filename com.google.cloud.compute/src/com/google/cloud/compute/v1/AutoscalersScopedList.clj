(ns com.google.cloud.compute.v1.AutoscalersScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalersScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalersScopedList`

  returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^com.google.cloud.compute.v1.AutoscalersScopedList prototype]
    (AutoscalersScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder []
    (AutoscalersScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalersScopedList`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList []
    (AutoscalersScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of autoscalers when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AutoscalersScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalersScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalersScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalersScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalersScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalersScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalersScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalersScopedList$Builder`"
  (^com.google.cloud.compute.v1.AutoscalersScopedList$Builder [^AutoscalersScopedList this]
    (-> this (.toBuilder))))

(defn get-autoscalers-list
  "[Output Only] A list of autoscalers contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Autoscaler>`"
  (^java.util.List [^AutoscalersScopedList this]
    (-> this (.getAutoscalersList))))

