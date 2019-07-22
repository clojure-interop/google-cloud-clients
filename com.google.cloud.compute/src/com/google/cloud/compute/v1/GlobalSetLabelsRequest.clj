(ns com.google.cloud.compute.v1.GlobalSetLabelsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalSetLabelsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GlobalSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.GlobalSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.GlobalSetLabelsRequest$Builder [^com.google.cloud.compute.v1.GlobalSetLabelsRequest prototype]
    (GlobalSetLabelsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GlobalSetLabelsRequest$Builder []
    (GlobalSetLabelsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GlobalSetLabelsRequest`"
  (^com.google.cloud.compute.v1.GlobalSetLabelsRequest []
    (GlobalSetLabelsRequest/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GlobalSetLabelsRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GlobalSetLabelsRequest this]
    (-> this (.toString))))

(defn get-labels-map
  "A list of labels to apply for this resource. Each label key & value must comply with
   RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash. For example, \"webserver-frontend\": \"images\". A label value
   can also be empty (e.g. \"my-label\": \"\").

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^GlobalSetLabelsRequest this]
    (-> this (.getLabelsMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GlobalSetLabelsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-label-fingerprint
  "The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   fingerprint is initially generated by Compute Engine and changes after every request to modify
   or update labels. You must always provide an up-to-date fingerprint hash when updating or
   changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   request to the resource to get the latest fingerprint.

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalSetLabelsRequest this]
    (-> this (.getLabelFingerprint))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GlobalSetLabelsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GlobalSetLabelsRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GlobalSetLabelsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GlobalSetLabelsRequest$Builder`"
  (^com.google.cloud.compute.v1.GlobalSetLabelsRequest$Builder [^GlobalSetLabelsRequest this]
    (-> this (.toBuilder))))
