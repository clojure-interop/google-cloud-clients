(ns com.google.cloud.compute.v1.MachineTypesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.MachineTypesScopedList`

  returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^com.google.cloud.compute.v1.MachineTypesScopedList prototype]
    (MachineTypesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder []
    (MachineTypesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.MachineTypesScopedList`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList []
    (MachineTypesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that appears when the machine types list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^MachineTypesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MachineTypesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MachineTypesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^MachineTypesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-machine-types-list
  "[Output Only] A list of machine types contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.MachineType>`"
  (^java.util.List [^MachineTypesScopedList this]
    (-> this (.getMachineTypesList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^MachineTypesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MachineTypesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MachineTypesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.MachineTypesScopedList$Builder`"
  (^com.google.cloud.compute.v1.MachineTypesScopedList$Builder [^MachineTypesScopedList this]
    (-> this (.toBuilder))))

