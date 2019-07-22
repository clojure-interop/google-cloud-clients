(ns com.google.cloud.compute.v1.InstanceGroupManagerStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagerStatus`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder [^com.google.cloud.compute.v1.InstanceGroupManagerStatus prototype]
    (InstanceGroupManagerStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder []
    (InstanceGroupManagerStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus []
    (InstanceGroupManagerStatus/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagerStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagerStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagerStatus this]
    (-> this (.getFieldMask))))

(defn get-is-stable?
  "[Output Only] A bit indicating whether the managed instance group is in a stable state. A
   stable state means that: none of the instances in the managed instance group is currently
   undergoing any type of change (for example, creation, restart, or deletion); no future changes
   are scheduled for instances in the managed instance group; and the managed instance group
   itself is not being modified.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InstanceGroupManagerStatus this]
    (-> this (.getIsStable))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerStatus$Builder [^InstanceGroupManagerStatus this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagerStatus this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagerStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagerStatus this]
    (-> this (.hashCode))))

