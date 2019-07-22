(ns com.google.cloud.compute.v1.Policy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Policy$Builder]))

(defn set-version
  "Deprecated.

  version - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.lang.Integer version]
    (-> this (.setVersion version))))

(defn add-all-bindings
  "Associates a list of `members` to a `role`. `bindings` with no members will result in an
   error.

  bindings - `java.util.List`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.util.List bindings]
    (-> this (.addAllBindings bindings))))

(defn add-rules
  "If more than one rule is specified, the rules are applied in the following manner: - All
   matching LOG rules are always applied. - If any DENY/DENY_WITH_LOG rule matches, permission
   is denied. Logging will be applied if one or more matching rule requires logging. -
   Otherwise, if any ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be
   applied if one or more matching rule requires logging. - Otherwise, if no rule applies,
   permission is denied.

  rules - `com.google.cloud.compute.v1.Rule`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^com.google.cloud.compute.v1.Rule rules]
    (-> this (.addRules rules))))

(defn get-iam-owned?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Policy$Builder this]
    (-> this (.getIamOwned))))

(defn add-all-rules
  "If more than one rule is specified, the rules are applied in the following manner: - All
   matching LOG rules are always applied. - If any DENY/DENY_WITH_LOG rule matches, permission
   is denied. Logging will be applied if one or more matching rule requires logging. -
   Otherwise, if any ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be
   applied if one or more matching rule requires logging. - Otherwise, if no rule applies,
   permission is denied.

  rules - `java.util.List`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.util.List rules]
    (-> this (.addAllRules rules))))

(defn set-etag
  "`etag` is used for optimistic concurrency control as a way to help prevent simultaneous
   updates of a policy from overwriting each other. It is strongly suggested that systems make
   use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid
   race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are
   expected to put that etag in the request to `setIamPolicy` to ensure that their change will
   be applied to the same version of the policy.

   If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   overwritten blindly.

  etag - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.lang.String etag]
    (-> this (.setEtag etag))))

(defn add-all-audit-configs
  "Specifies cloud audit logging configuration for this policy.

  audit-configs - `java.util.List`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.util.List audit-configs]
    (-> this (.addAllAuditConfigs audit-configs))))

(defn get-etag
  "`etag` is used for optimistic concurrency control as a way to help prevent simultaneous
   updates of a policy from overwriting each other. It is strongly suggested that systems make
   use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid
   race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are
   expected to put that etag in the request to `setIamPolicy` to ensure that their change will
   be applied to the same version of the policy.

   If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   overwritten blindly.

  returns: `java.lang.String`"
  (^java.lang.String [^Policy$Builder this]
    (-> this (.getEtag))))

(defn get-audit-configs-list
  "Specifies cloud audit logging configuration for this policy.

  returns: `java.util.List<com.google.cloud.compute.v1.AuditConfig>`"
  (^java.util.List [^Policy$Builder this]
    (-> this (.getAuditConfigsList))))

(defn get-version
  "Deprecated.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Policy$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `com.google.cloud.compute.v1.Policy`"
  (^com.google.cloud.compute.v1.Policy [^Policy$Builder this]
    (-> this (.build))))

(defn add-bindings
  "Associates a list of `members` to a `role`. `bindings` with no members will result in an
   error.

  bindings - `com.google.cloud.compute.v1.Binding`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^com.google.cloud.compute.v1.Binding bindings]
    (-> this (.addBindings bindings))))

(defn add-audit-configs
  "Specifies cloud audit logging configuration for this policy.

  audit-configs - `com.google.cloud.compute.v1.AuditConfig`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^com.google.cloud.compute.v1.AuditConfig audit-configs]
    (-> this (.addAuditConfigs audit-configs))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Policy`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^com.google.cloud.compute.v1.Policy other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this]
    (-> this (.clone))))

(defn get-rules-list
  "If more than one rule is specified, the rules are applied in the following manner: - All
   matching LOG rules are always applied. - If any DENY/DENY_WITH_LOG rule matches, permission
   is denied. Logging will be applied if one or more matching rule requires logging. -
   Otherwise, if any ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be
   applied if one or more matching rule requires logging. - Otherwise, if no rule applies,
   permission is denied.

  returns: `java.util.List<com.google.cloud.compute.v1.Rule>`"
  (^java.util.List [^Policy$Builder this]
    (-> this (.getRulesList))))

(defn set-iam-owned
  "iam-owned - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy$Builder this ^java.lang.Boolean iam-owned]
    (-> this (.setIamOwned iam-owned))))

(defn get-bindings-list
  "Associates a list of `members` to a `role`. `bindings` with no members will result in an
   error.

  returns: `java.util.List<com.google.cloud.compute.v1.Binding>`"
  (^java.util.List [^Policy$Builder this]
    (-> this (.getBindingsList))))

