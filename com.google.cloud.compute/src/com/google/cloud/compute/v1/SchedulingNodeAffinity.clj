(ns com.google.cloud.compute.v1.SchedulingNodeAffinity
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SchedulingNodeAffinity]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SchedulingNodeAffinity`

  returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^com.google.cloud.compute.v1.SchedulingNodeAffinity prototype]
    (SchedulingNodeAffinity/newBuilder prototype))
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder []
    (SchedulingNodeAffinity/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity []
    (SchedulingNodeAffinity/getDefaultInstance )))

(defn get-operator
  "Defines the operation of node selection.

  returns: `java.lang.String`"
  (^java.lang.String [^SchedulingNodeAffinity this]
    (-> this (.getOperator))))

(defn get-values-list
  "Corresponds to the label values of Node resource.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SchedulingNodeAffinity this]
    (-> this (.getValuesList))))

(defn get-key
  "Corresponds to the label key of Node resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SchedulingNodeAffinity this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SchedulingNodeAffinity this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SchedulingNodeAffinity this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SchedulingNodeAffinity this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SchedulingNodeAffinity this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SchedulingNodeAffinity this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SchedulingNodeAffinity this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder`"
  (^com.google.cloud.compute.v1.SchedulingNodeAffinity$Builder [^SchedulingNodeAffinity this]
    (-> this (.toBuilder))))

