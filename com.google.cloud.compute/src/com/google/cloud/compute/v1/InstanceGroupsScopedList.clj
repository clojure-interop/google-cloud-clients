(ns com.google.cloud.compute.v1.InstanceGroupsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsScopedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^com.google.cloud.compute.v1.InstanceGroupsScopedList prototype]
    (InstanceGroupsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder []
    (InstanceGroupsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList []
    (InstanceGroupsScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] An informational warning that replaces the list of instance groups when the list
   is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupsScopedList this]
    (-> this (.getWarning))))

(defn get-instance-groups-list
  "[Output Only] The list of instance groups that are contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroup>`"
  (^java.util.List [^InstanceGroupsScopedList this]
    (-> this (.getInstanceGroupsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsScopedList$Builder [^InstanceGroupsScopedList this]
    (-> this (.toBuilder))))

