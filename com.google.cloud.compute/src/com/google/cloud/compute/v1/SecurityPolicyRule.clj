(ns com.google.cloud.compute.v1.SecurityPolicyRule
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRule]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SecurityPolicyRule`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^com.google.cloud.compute.v1.SecurityPolicyRule prototype]
    (SecurityPolicyRule/newBuilder prototype))
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder []
    (SecurityPolicyRule/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRule`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule []
    (SecurityPolicyRule/getDefaultInstance )))

(defn get-preview?
  "If set to true, the specified action is not enforced.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SecurityPolicyRule this]
    (-> this (.getPreview))))

(defn get-kind
  "[Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule this]
    (-> this (.getKind))))

(defn get-match
  "A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   corresponding ?action? is enforced.

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher [^SecurityPolicyRule this]
    (-> this (.getMatch))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyRule this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule this]
    (-> this (.toString))))

(defn get-action
  "The Action to preform when the client connection triggers the rule. Can currently be either
   \"allow\" or \"deny()\" where valid values for status are 403, 404, and 502.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule this]
    (-> this (.getAction))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SecurityPolicyRule this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SecurityPolicyRule this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SecurityPolicyRule this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SecurityPolicyRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-priority
  "An integer indicating the priority of a rule in the list. The priority must be a positive value
   between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   highest priority and 2147483647 is the lowest prority.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^SecurityPolicyRule this]
    (-> this (.getPriority))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule this]
    (-> this (.toBuilder))))

