(ns com.google.cloud.compute.v1.Rule$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Rule$Builder]))

(defn set-description
  "Human-readable description of the rule.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-log-configs
  "The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   action.

  log-configs - `com.google.cloud.compute.v1.LogConfig`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^com.google.cloud.compute.v1.LogConfig log-configs]
    (-> this (.addLogConfigs log-configs))))

(defn get-ins-list
  "If one or more 'in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule$Builder this]
    (-> this (.getInsList))))

(defn get-permissions-list
  "A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*'
   matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches
   all verbs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule$Builder this]
    (-> this (.getPermissionsList))))

(defn get-log-configs-list
  "The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   action.

  returns: `java.util.List<com.google.cloud.compute.v1.LogConfig>`"
  (^java.util.List [^Rule$Builder this]
    (-> this (.getLogConfigsList))))

(defn add-all-conditions
  "Additional restrictions that must be met. All conditions must pass for the rule to match.

  conditions - `java.util.List`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.util.List conditions]
    (-> this (.addAllConditions conditions))))

(defn add-permissions
  "A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*'
   matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches
   all verbs.

  permissions - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.lang.String permissions]
    (-> this (.addPermissions permissions))))

(defn get-action
  "Required

  returns: `java.lang.String`"
  (^java.lang.String [^Rule$Builder this]
    (-> this (.getAction))))

(defn get-conditions-list
  "Additional restrictions that must be met. All conditions must pass for the rule to match.

  returns: `java.util.List<com.google.cloud.compute.v1.Condition>`"
  (^java.util.List [^Rule$Builder this]
    (-> this (.getConditionsList))))

(defn add-ins
  "If one or more 'in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.

  ins - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.lang.String ins]
    (-> this (.addIns ins))))

(defn add-all-ins
  "If one or more 'in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.

  ins - `java.util.List`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.util.List ins]
    (-> this (.addAllIns ins))))

(defn build
  "returns: `com.google.cloud.compute.v1.Rule`"
  (^com.google.cloud.compute.v1.Rule [^Rule$Builder this]
    (-> this (.build))))

(defn get-description
  "Human-readable description of the rule.

  returns: `java.lang.String`"
  (^java.lang.String [^Rule$Builder this]
    (-> this (.getDescription))))

(defn get-not-ins-list
  "If one or more 'not_in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Rule$Builder this]
    (-> this (.getNotInsList))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Rule`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^com.google.cloud.compute.v1.Rule other]
    (-> this (.mergeFrom other))))

(defn add-all-not-ins
  "If one or more 'not_in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.

  not-ins - `java.util.List`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.util.List not-ins]
    (-> this (.addAllNotIns not-ins))))

(defn add-all-permissions
  "A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*'
   matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches
   all verbs.

  permissions - `java.util.List`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.util.List permissions]
    (-> this (.addAllPermissions permissions))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this]
    (-> this (.clone))))

(defn add-conditions
  "Additional restrictions that must be met. All conditions must pass for the rule to match.

  conditions - `com.google.cloud.compute.v1.Condition`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^com.google.cloud.compute.v1.Condition conditions]
    (-> this (.addConditions conditions))))

(defn set-action
  "Required

  action - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.lang.String action]
    (-> this (.setAction action))))

(defn add-all-log-configs
  "The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG
   action.

  log-configs - `java.util.List`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.util.List log-configs]
    (-> this (.addAllLogConfigs log-configs))))

(defn add-not-ins
  "If one or more 'not_in' clauses are specified, the rule matches if the
   PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.

  not-ins - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Rule$Builder`"
  (^com.google.cloud.compute.v1.Rule$Builder [^Rule$Builder this ^java.lang.String not-ins]
    (-> this (.addNotIns not-ins))))

