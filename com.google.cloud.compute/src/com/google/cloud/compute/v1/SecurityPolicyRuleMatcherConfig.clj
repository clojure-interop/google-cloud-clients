(ns com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRuleMatcherConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig prototype]
    (SecurityPolicyRuleMatcherConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder []
    (SecurityPolicyRuleMatcherConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig []
    (SecurityPolicyRuleMatcherConfig/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SecurityPolicyRuleMatcherConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.getFieldMask))))

(defn get-src-ip-ranges-list
  "CIDR IP address range.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.getSrcIpRangesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SecurityPolicyRuleMatcherConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SecurityPolicyRuleMatcherConfig this]
    (-> this (.hashCode))))

