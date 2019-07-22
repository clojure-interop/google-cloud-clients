(ns com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ForwardingRulesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ForwardingRulesScopedList`

  returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList$Builder this ^com.google.cloud.compute.v1.ForwardingRulesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-forwarding-rules-list
  "A list of forwarding rules contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.ForwardingRule>`"
  (^java.util.List [^ForwardingRulesScopedList$Builder this]
    (-> this (.getForwardingRulesList))))

(defn add-all-forwarding-rules
  "A list of forwarding rules contained in this scope.

  forwarding-rules - `java.util.List`

  returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList$Builder this ^java.util.List forwarding-rules]
    (-> this (.addAllForwardingRules forwarding-rules))))

(defn add-forwarding-rules
  "A list of forwarding rules contained in this scope.

  forwarding-rules - `com.google.cloud.compute.v1.ForwardingRule`

  returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList$Builder this ^com.google.cloud.compute.v1.ForwardingRule forwarding-rules]
    (-> this (.addForwardingRules forwarding-rules))))

(defn get-warning
  "Informational warning which replaces the list of forwarding rules when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^ForwardingRulesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of forwarding rules when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList [^ForwardingRulesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder`"
  (^com.google.cloud.compute.v1.ForwardingRulesScopedList$Builder [^ForwardingRulesScopedList$Builder this]
    (-> this (.clone))))

