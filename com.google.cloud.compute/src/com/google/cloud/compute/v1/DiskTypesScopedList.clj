(ns com.google.cloud.compute.v1.DiskTypesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskTypesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DiskTypesScopedList`

  returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^com.google.cloud.compute.v1.DiskTypesScopedList prototype]
    (DiskTypesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder []
    (DiskTypesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DiskTypesScopedList`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList []
    (DiskTypesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of disk types when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^DiskTypesScopedList this]
    (-> this (.getWarning))))

(defn get-disk-types-list
  "[Output Only] A list of disk types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.DiskType>`"
  (^java.util.List [^DiskTypesScopedList this]
    (-> this (.getDiskTypesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DiskTypesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskTypesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DiskTypesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DiskTypesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskTypesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskTypesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DiskTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.DiskTypesScopedList$Builder [^DiskTypesScopedList this]
    (-> this (.toBuilder))))

