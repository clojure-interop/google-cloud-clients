(ns com.google.cloud.compute.v1.DisksScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DisksScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DisksScopedList`

  returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^com.google.cloud.compute.v1.DisksScopedList prototype]
    (DisksScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.DisksScopedList$Builder []
    (DisksScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DisksScopedList`"
  (^com.google.cloud.compute.v1.DisksScopedList []
    (DisksScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of disks when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^DisksScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DisksScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DisksScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DisksScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DisksScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn get-disks-list
  "[Output Only] A list of disks contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Disk>`"
  (^java.util.List [^DisksScopedList this]
    (-> this (.getDisksList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DisksScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DisksScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DisksScopedList$Builder`"
  (^com.google.cloud.compute.v1.DisksScopedList$Builder [^DisksScopedList this]
    (-> this (.toBuilder))))

