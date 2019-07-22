(ns com.google.cloud.compute.v1.SecurityPolicyRuleMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRuleMatcher]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher prototype]
    (SecurityPolicyRuleMatcher/newBuilder prototype))
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder []
    (SecurityPolicyRuleMatcher/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher []
    (SecurityPolicyRuleMatcher/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyRuleMatcher this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRuleMatcher this]
    (-> this (.toString))))

(defn get-versioned-expr
  "Preconfigured versioned expression. If this field is specified, config must also be specified.
   Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must
   specify the corresponding src_ip_range field in config.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRuleMatcher this]
    (-> this (.getVersionedExpr))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SecurityPolicyRuleMatcher this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SecurityPolicyRuleMatcher this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SecurityPolicyRuleMatcher this]
    (-> this (.hashCode))))

(defn get-config
  "The configuration options available when specifying versioned_expr. This field must be
   specified if versioned_expr is specified and cannot be specified if versioned_expr is not
   specified.

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig [^SecurityPolicyRuleMatcher this]
    (-> this (.getConfig))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SecurityPolicyRuleMatcher this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^SecurityPolicyRuleMatcher this]
    (-> this (.toBuilder))))

