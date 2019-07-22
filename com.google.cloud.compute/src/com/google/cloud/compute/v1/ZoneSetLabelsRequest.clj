(ns com.google.cloud.compute.v1.ZoneSetLabelsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneSetLabelsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ZoneSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.ZoneSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetLabelsRequest$Builder [^com.google.cloud.compute.v1.ZoneSetLabelsRequest prototype]
    (ZoneSetLabelsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ZoneSetLabelsRequest$Builder []
    (ZoneSetLabelsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ZoneSetLabelsRequest`"
  (^com.google.cloud.compute.v1.ZoneSetLabelsRequest []
    (ZoneSetLabelsRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ZoneSetLabelsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ZoneSetLabelsRequest this]
    (-> this (.toString))))

(defn get-labels-map
  "The labels to set for this resource.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ZoneSetLabelsRequest this]
    (-> this (.getLabelsMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ZoneSetLabelsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-label-fingerprint
  "The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   fingerprint is initially generated by Compute Engine and changes after every request to modify
   or update labels. You must always provide an up-to-date fingerprint hash in order to update or
   change labels. Make a get() request to the resource to get the latest fingerprint.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneSetLabelsRequest this]
    (-> this (.getLabelFingerprint))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ZoneSetLabelsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ZoneSetLabelsRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ZoneSetLabelsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ZoneSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.ZoneSetLabelsRequest$Builder [^ZoneSetLabelsRequest this]
    (-> this (.toBuilder))))
