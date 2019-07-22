(ns com.google.cloud.compute.v1.InstanceGroupManagersScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersScopedList`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersScopedList prototype]
    (InstanceGroupManagersScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder []
    (InstanceGroupManagersScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList []
    (InstanceGroupManagersScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] The warning that replaces the list of managed instance groups when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InstanceGroupManagersScopedList this]
    (-> this (.getWarning))))

(defn get-instance-group-managers-list
  "[Output Only] The list of managed instance groups that are contained in the specified project
   and zone.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^java.util.List [^InstanceGroupManagersScopedList this]
    (-> this (.getInstanceGroupManagersList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersScopedList$Builder [^InstanceGroupManagersScopedList this]
    (-> this (.toBuilder))))

