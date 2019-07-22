(ns com.google.cloud.compute.deprecated.ForwardingRuleId
  "Base class for Google Compute Engine forwarding rule identities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ForwardingRuleId]))

(defn get-type
  "Returns the type of this forwarding rule identity.

  returns: `com.google.cloud.compute.deprecated.ForwardingRuleId.Type`"
  (^com.google.cloud.compute.deprecated.ForwardingRuleId.Type [^ForwardingRuleId this]
    (-> this (.getType))))

(defn get-rule
  "Returns the name of the forwarding rule. The forwarding rule name must be 1-63 characters long
   and comply with RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^ForwardingRuleId this]
    (-> this (.getRule))))

