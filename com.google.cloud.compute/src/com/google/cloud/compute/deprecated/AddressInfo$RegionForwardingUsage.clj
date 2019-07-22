(ns com.google.cloud.compute.deprecated.AddressInfo$RegionForwardingUsage
  "Usage information for a Google Compute Engine region address assigned to one or more region
  forwarding rules."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$RegionForwardingUsage]))

(defn get-forwarding-rules
  "Returns a list of identities of region forwarding rules that are currently using the address.

  returns: `java.util.List<com.google.cloud.compute.deprecated.RegionForwardingRuleId>`"
  (^java.util.List [^AddressInfo$RegionForwardingUsage this]
    (-> this (.getForwardingRules))))

(defn get-users
  "Description copied from class: AddressInfo.Usage

  returns: `java.util.List<com.google.cloud.compute.deprecated.RegionForwardingRuleId>`"
  (^java.util.List [^AddressInfo$RegionForwardingUsage this]
    (-> this (.getUsers))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressInfo$RegionForwardingUsage this]
    (-> this (.toString))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressInfo$RegionForwardingUsage this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressInfo$RegionForwardingUsage this]
    (-> this (.hashCode))))

