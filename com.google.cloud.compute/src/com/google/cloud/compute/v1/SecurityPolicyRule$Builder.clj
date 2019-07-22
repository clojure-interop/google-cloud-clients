(ns com.google.cloud.compute.v1.SecurityPolicyRule$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRule$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-preview?
  "If set to true, the specified action is not enforced.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^SecurityPolicyRule$Builder this]
    (-> this (.getPreview))))

(defn get-kind
  "[Output only] Type of the resource. Always compute#securityPolicyRule for security policy
   rules

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule$Builder this]
    (-> this (.getKind))))

(defn get-match
  "A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   corresponding ?action? is enforced.

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher [^SecurityPolicyRule$Builder this]
    (-> this (.getMatch))))

(defn get-action
  "The Action to preform when the client connection triggers the rule. Can currently be either
   \"allow\" or \"deny()\" where valid values for status are 403, 404, and 502.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule$Builder this]
    (-> this (.getAction))))

(defn set-kind
  "[Output only] Type of the resource. Always compute#securityPolicyRule for security policy
   rules

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-match
  "A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   corresponding ?action? is enforced.

  match - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher match]
    (-> this (.setMatch match))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRule`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^SecurityPolicyRule$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRule$Builder this]
    (-> this (.getDescription))))

(defn set-priority
  "An integer indicating the priority of a rule in the list. The priority must be a positive
   value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0
   is the highest priority and 2147483647 is the lowest prority.

  priority - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^java.lang.Integer priority]
    (-> this (.setPriority priority))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SecurityPolicyRule`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRule other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this]
    (-> this (.clone))))

(defn set-preview
  "If set to true, the specified action is not enforced.

  preview - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^java.lang.Boolean preview]
    (-> this (.setPreview preview))))

(defn set-action
  "The Action to preform when the client connection triggers the rule. Can currently be either
   \"allow\" or \"deny()\" where valid values for status are 403, 404, and 502.

  action - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRule$Builder [^SecurityPolicyRule$Builder this ^java.lang.String action]
    (-> this (.setAction action))))

(defn get-priority
  "An integer indicating the priority of a rule in the list. The priority must be a positive
   value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0
   is the highest priority and 2147483647 is the lowest prority.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^SecurityPolicyRule$Builder this]
    (-> this (.getPriority))))

