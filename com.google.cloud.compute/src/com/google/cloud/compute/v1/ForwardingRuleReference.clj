(ns com.google.cloud.compute.v1.ForwardingRuleReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ForwardingRuleReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ForwardingRuleReference`

  returns: `com.google.cloud.compute.v1.ForwardingRuleReference$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder [^com.google.cloud.compute.v1.ForwardingRuleReference prototype]
    (ForwardingRuleReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder []
    (ForwardingRuleReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ForwardingRuleReference`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference []
    (ForwardingRuleReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ForwardingRuleReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ForwardingRuleReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ForwardingRuleReference this]
    (-> this (.getFieldMask))))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ForwardingRuleReference this]
    (-> this (.getForwardingRule))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ForwardingRuleReference$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder [^ForwardingRuleReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ForwardingRuleReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ForwardingRuleReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ForwardingRuleReference this]
    (-> this (.hashCode))))

