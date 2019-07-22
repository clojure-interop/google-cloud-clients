(ns com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddRuleSecurityPolicyHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getKey))))

(defn get-security-policy
  "Name of the security policy to update. It must have the format
   `{project}/global/securityPolicies/{securityPolicy}/addRule`. \\`{securityPolicy}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getSecurityPolicy))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn set-security-policy-rule-resource
  "Represents a rule that describes one or more match conditions along with the action to be
   taken when traffic matches this condition (allow or deny).

  security-policy-rule-resource - `com.google.cloud.compute.v1.SecurityPolicyRule`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRule security-policy-rule-resource]
    (-> this (.setSecurityPolicyRuleResource security-policy-rule-resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest other]
    (-> this (.mergeFrom other))))

(defn get-security-policy-rule-resource
  "Represents a rule that describes one or more match conditions along with the action to be
   taken when traffic matches this condition (allow or deny).

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getSecurityPolicyRuleResource))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getPrettyPrint))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.clone))))

(defn set-security-policy
  "Name of the security policy to update. It must have the format
   `{project}/global/securityPolicies/{securityPolicy}/addRule`. \\`{securityPolicy}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  security-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest$Builder [^AddRuleSecurityPolicyHttpRequest$Builder this ^java.lang.String security-policy]
    (-> this (.setSecurityPolicy security-policy))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^AddRuleSecurityPolicyHttpRequest$Builder this]
    (-> this (.getFields))))

