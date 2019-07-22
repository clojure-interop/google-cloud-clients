(ns com.google.cloud.compute.v1.ForwardingRuleReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ForwardingRuleReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ForwardingRuleReference`

  returns: `com.google.cloud.compute.v1.ForwardingRuleReference$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder [^ForwardingRuleReference$Builder this ^com.google.cloud.compute.v1.ForwardingRuleReference other]
    (-> this (.mergeFrom other))))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ForwardingRuleReference$Builder this]
    (-> this (.getForwardingRule))))

(defn set-forwarding-rule
  "forwarding-rule - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ForwardingRuleReference$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder [^ForwardingRuleReference$Builder this ^java.lang.String forwarding-rule]
    (-> this (.setForwardingRule forwarding-rule))))

(defn build
  "returns: `com.google.cloud.compute.v1.ForwardingRuleReference`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference [^ForwardingRuleReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ForwardingRuleReference$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference$Builder [^ForwardingRuleReference$Builder this]
    (-> this (.clone))))

