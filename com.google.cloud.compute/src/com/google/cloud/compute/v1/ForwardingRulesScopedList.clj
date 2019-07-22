(ns com.google.cloud.compute.v1.ForwardingRulesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ForwardingRulesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ForwardingRulesScopedList`

  returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^com.google.cloud.compute.v1.ForwardingRulesScopedList prototype]
    (ForwardingRulesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder []
    (ForwardingRulesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList []
    (ForwardingRulesScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of forwarding rules when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^ForwardingRulesScopedList this]
    (-> this (.getWarning))))

(defn get-forwarding-rules-list
  "A list of forwarding rules contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.ForwardingRule>`"
  (^java.util.List [^ForwardingRulesScopedList this]
    (-> this (.getForwardingRulesList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ForwardingRulesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ForwardingRulesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ForwardingRulesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ForwardingRulesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ForwardingRulesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ForwardingRulesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList this]
    (-> this (.toBuilder))))

