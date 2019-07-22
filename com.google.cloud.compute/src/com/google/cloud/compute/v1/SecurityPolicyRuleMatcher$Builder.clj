(ns com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRuleMatcher$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^SecurityPolicyRuleMatcher$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher other]
    (-> this (.mergeFrom other))))

(defn get-config
  "The configuration options available when specifying versioned_expr. This field must be
   specified if versioned_expr is specified and cannot be specified if versioned_expr is not
   specified.

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig [^SecurityPolicyRuleMatcher$Builder this]
    (-> this (.getConfig))))

(defn set-config
  "The configuration options available when specifying versioned_expr. This field must be
   specified if versioned_expr is specified and cannot be specified if versioned_expr is not
   specified.

  config - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^SecurityPolicyRuleMatcher$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig config]
    (-> this (.setConfig config))))

(defn get-versioned-expr
  "Preconfigured versioned expression. If this field is specified, config must also be
   specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1
   - must specify the corresponding src_ip_range field in config.

  returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyRuleMatcher$Builder this]
    (-> this (.getVersionedExpr))))

(defn set-versioned-expr
  "Preconfigured versioned expression. If this field is specified, config must also be
   specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1
   - must specify the corresponding src_ip_range field in config.

  versioned-expr - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^SecurityPolicyRuleMatcher$Builder this ^java.lang.String versioned-expr]
    (-> this (.setVersionedExpr versioned-expr))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher [^SecurityPolicyRuleMatcher$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcher$Builder [^SecurityPolicyRuleMatcher$Builder this]
    (-> this (.clone))))

