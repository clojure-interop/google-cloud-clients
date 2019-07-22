(ns com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddRuleSecurityPolicyHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest prototype]
    (AddRuleSecurityPolicyHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder []
    (AddRuleSecurityPolicyHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest []
    (AddRuleSecurityPolicyHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AddRuleSecurityPolicyHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-security-policy
  "Name of the security policy to update. It must have the format
   `{project}/global/securityPolicies/{securityPolicy}/addRule`. \\`{securityPolicy}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getSecurityPolicy))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRule`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-security-policy-rule-resource
  "Represents a rule that describes one or more match conditions along with the action to be taken
   when traffic matches this condition (allow or deny).

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getSecurityPolicyRuleResource))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddRuleSecurityPolicyHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest this]
    (-> this (.toBuilder))))

