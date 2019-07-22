(ns com.google.cloud.compute.deprecated.RegionForwardingRuleId
  "Identity for a Google Compute Engine region's forwarding rule."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated RegionForwardingRuleId]))

(defn *of
  "Returns a region forwarding rule identity given project, region and rule names. The forwarding
   rule name must be 1-63 characters long and comply with RFC1035. Specifically, the name must
   match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character
   must be a lowercase letter, and all following characters must be a dash, lowercase letter, or
   digit, except the last character, which cannot be a dash.

  project - `java.lang.String`
  region - `java.lang.String`
  rule - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.RegionForwardingRuleId`"
  (^com.google.cloud.compute.deprecated.RegionForwardingRuleId [^java.lang.String project ^java.lang.String region ^java.lang.String rule]
    (RegionForwardingRuleId/of project region rule))
  (^com.google.cloud.compute.deprecated.RegionForwardingRuleId [^com.google.cloud.compute.deprecated.RegionId region-id ^java.lang.String rule]
    (RegionForwardingRuleId/of region-id rule)))

(defn get-type
  "Description copied from class: ForwardingRuleId

  returns: `com.google.cloud.compute.deprecated.ForwardingRuleId.Type`"
  (^com.google.cloud.compute.deprecated.ForwardingRuleId.Type [^RegionForwardingRuleId this]
    (-> this (.getType))))

(defn get-region
  "Returns the name of the region this forwarding rule belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionForwardingRuleId this]
    (-> this (.getRegion))))

(defn get-region-id
  "Returns the identity of the region this forwarding rule belongs to.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^RegionForwardingRuleId this]
    (-> this (.getRegionId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^RegionForwardingRuleId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionForwardingRuleId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionForwardingRuleId this ^java.lang.Object obj]
    (-> this (.equals obj))))

