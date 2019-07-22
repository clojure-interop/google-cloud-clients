(ns com.google.cloud.compute.v1.InstancesSetLabelsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetLabelsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^com.google.cloud.compute.v1.InstancesSetLabelsRequest prototype]
    (InstancesSetLabelsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder []
    (InstancesSetLabelsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest []
    (InstancesSetLabelsRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetLabelsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetLabelsRequest this]
    (-> this (.toString))))

(defn get-labels-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InstancesSetLabelsRequest this]
    (-> this (.getLabelsMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesSetLabelsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-label-fingerprint
  "Fingerprint of the previous set of labels for this resource, used to prevent conflicts. Provide
   the latest fingerprint value when making a request to add or change labels.

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetLabelsRequest this]
    (-> this (.getLabelFingerprint))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesSetLabelsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesSetLabelsRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesSetLabelsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetLabelsRequest$Builder [^InstancesSetLabelsRequest this]
    (-> this (.toBuilder))))

