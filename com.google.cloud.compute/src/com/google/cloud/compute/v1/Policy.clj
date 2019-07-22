(ns com.google.cloud.compute.v1.Policy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Policy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Policy`

  returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^com.google.cloud.compute.v1.Policy prototype]
    (Policy/newBuilder prototype))
  (^com.google.cloud.compute.v1.Policy$Builder []
    (Policy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Policy`"
  (^com.google.cloud.compute.v1.Policy []
    (Policy/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Policy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Policy this]
    (-> this (.toString))))

(defn get-iam-owned?
  "returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Policy this]
    (-> this (.getIamOwned))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Policy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-etag
  "`etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates
   of a policy from overwriting each other. It is strongly suggested that systems make use of the
   `etag` in the read-modify-write cycle to perform policy updates in order to avoid race
   conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected
   to put that etag in the request to `setIamPolicy` to ensure that their change will be applied
   to the same version of the policy.

   If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is
   overwritten blindly.

  returns: `java.lang.String`"
  (^java.lang.String [^Policy this]
    (-> this (.getEtag))))

(defn get-audit-configs-list
  "Specifies cloud audit logging configuration for this policy.

  returns: `java.util.List<com.google.cloud.compute.v1.AuditConfig>`"
  (^java.util.List [^Policy this]
    (-> this (.getAuditConfigsList))))

(defn get-version
  "Deprecated.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Policy this]
    (-> this (.getVersion))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Policy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Policy this]
    (-> this (.hashCode))))

(defn get-rules-list
  "If more than one rule is specified, the rules are applied in the following manner: - All
   matching LOG rules are always applied. - If any DENY/DENY_WITH_LOG rule matches, permission is
   denied. Logging will be applied if one or more matching rule requires logging. - Otherwise, if
   any ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be applied if one or
   more matching rule requires logging. - Otherwise, if no rule applies, permission is denied.

  returns: `java.util.List<com.google.cloud.compute.v1.Rule>`"
  (^java.util.List [^Policy this]
    (-> this (.getRulesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Policy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Policy$Builder`"
  (^com.google.cloud.compute.v1.Policy$Builder [^Policy this]
    (-> this (.toBuilder))))

(defn get-bindings-list
  "Associates a list of `members` to a `role`. `bindings` with no members will result in an error.

  returns: `java.util.List<com.google.cloud.compute.v1.Binding>`"
  (^java.util.List [^Policy this]
    (-> this (.getBindingsList))))

