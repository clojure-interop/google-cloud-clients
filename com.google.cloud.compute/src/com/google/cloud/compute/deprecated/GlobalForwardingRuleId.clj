(ns com.google.cloud.compute.deprecated.GlobalForwardingRuleId
  "Identity for a Google Compute Engine global forwarding rule."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated GlobalForwardingRuleId]))

(defn *of
  "Returns a forwarding rule identity given the project rule names. The forwarding rule name must
   be 1-63 characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  rule - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.GlobalForwardingRuleId`"
  (^com.google.cloud.compute.deprecated.GlobalForwardingRuleId [^java.lang.String project ^java.lang.String rule]
    (GlobalForwardingRuleId/of project rule))
  (^com.google.cloud.compute.deprecated.GlobalForwardingRuleId [^java.lang.String rule]
    (GlobalForwardingRuleId/of rule)))

(defn get-type
  "Description copied from class: ForwardingRuleId

  returns: `com.google.cloud.compute.deprecated.ForwardingRuleId.Type`"
  (^com.google.cloud.compute.deprecated.ForwardingRuleId.Type [^GlobalForwardingRuleId this]
    (-> this (.getType))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalForwardingRuleId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GlobalForwardingRuleId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GlobalForwardingRuleId this ^java.lang.Object obj]
    (-> this (.equals obj))))

