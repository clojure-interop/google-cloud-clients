(ns com.google.cloud.compute.deprecated.AddressInfo$GlobalForwardingUsage
  "Usage information for a Google Compute Engine global address assigned to one or more global
  forwarding rules."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$GlobalForwardingUsage]))

(defn get-forwarding-rules
  "Returns a list of identities of global forwarding rules that are currently using the address.

  returns: `java.util.List<com.google.cloud.compute.deprecated.GlobalForwardingRuleId>`"
  (^java.util.List [^AddressInfo$GlobalForwardingUsage this]
    (-> this (.getForwardingRules))))

(defn get-users
  "Description copied from class: AddressInfo.Usage

  returns: `java.util.List<com.google.cloud.compute.deprecated.GlobalForwardingRuleId>`"
  (^java.util.List [^AddressInfo$GlobalForwardingUsage this]
    (-> this (.getUsers))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo$GlobalForwardingUsage this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressInfo$GlobalForwardingUsage this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressInfo$GlobalForwardingUsage this]
    (-> this (.hashCode))))

