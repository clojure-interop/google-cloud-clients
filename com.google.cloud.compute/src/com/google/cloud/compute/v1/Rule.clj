(ns com.google.cloud.compute.v1.Rule
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Rule]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Rule`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^com.google.cloud.compute.v1.Rule prototype]
    (Rule/newBuilder prototype))
  (^com.google.cloud.compute.v1.Rule$Builder []
    (Rule/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Rule`"
  (^com.google.cloud.compute.v1.Rule []
    (Rule/getDefaultInstance )))

(defn get-ins-list
  "If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR
   is in at least one of these entries.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule this]
    (-> this (.getInsList))))

(defn get-permissions-list
  "A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*'
   matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all
   verbs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule this]
    (-> this (.getPermissionsList))))

(defn get-log-configs-list
  "The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   action.

  returns: `java.util.List<com.google.cloud.compute.v1.LogConfig>`"
  (^java.util.List [^Rule this]
    (-> this (.getLogConfigsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Rule this]
    (-> this (.toString))))

(defn get-action
  "Required

  returns: `java.lang.String`"
  (^java.lang.String [^Rule this]
    (-> this (.getAction))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Rule this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-conditions-list
  "Additional restrictions that must be met. All conditions must pass for the rule to match.

  returns: `java.util.List<com.google.cloud.compute.v1.Condition>`"
  (^java.util.List [^Rule this]
    (-> this (.getConditionsList))))

(defn get-description
  "Human-readable description of the rule.

  returns: `java.lang.String`"
  (^java.lang.String [^Rule this]
    (-> this (.getDescription))))

(defn get-not-ins-list
  "If one or more 'not_in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule this]
    (-> this (.getNotInsList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Rule this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Rule this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Rule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule this]
    (-> this (.toBuilder))))

