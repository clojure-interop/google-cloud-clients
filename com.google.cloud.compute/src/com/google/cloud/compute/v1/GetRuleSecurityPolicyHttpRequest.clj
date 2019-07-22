(ns com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetRuleSecurityPolicyHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest`

  returns: `com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest$Builder [^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest prototype]
    (GetRuleSecurityPolicyHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest$Builder []
    (GetRuleSecurityPolicyHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest`"
  (^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest []
    (GetRuleSecurityPolicyHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetRuleSecurityPolicyHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-security-policy
  "Name of the security policy to which the queried rule belongs. It must have the format
   `{project}/global/securityPolicies/{securityPolicy}/getRule`. \\`{securityPolicy}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getSecurityPolicy))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetRuleSecurityPolicyHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-priority
  "The priority of the rule to get from the security policy.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.getPriority))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest$Builder [^GetRuleSecurityPolicyHttpRequest this]
    (-> this (.toBuilder))))

