(ns com.google.cloud.compute.v1.AcceleratorTypesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorTypesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AcceleratorTypesScopedList`

  returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^com.google.cloud.compute.v1.AcceleratorTypesScopedList prototype]
    (AcceleratorTypesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder []
    (AcceleratorTypesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList []
    (AcceleratorTypesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that appears when the accelerator types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AcceleratorTypesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AcceleratorTypesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AcceleratorTypesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AcceleratorTypesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AcceleratorTypesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AcceleratorTypesScopedList this]
    (-> this (.hashCode))))

(defn get-accelerator-types-list
  "[Output Only] A list of accelerator types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorType>`"
  (^java.util.List [^AcceleratorTypesScopedList this]
    (-> this (.getAcceleratorTypesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AcceleratorTypesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AcceleratorTypesScopedList$Builder [^AcceleratorTypesScopedList this]
    (-> this (.toBuilder))))

