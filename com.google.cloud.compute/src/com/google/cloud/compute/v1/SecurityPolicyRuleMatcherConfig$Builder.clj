(ns com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyRuleMatcherConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^SecurityPolicyRuleMatcherConfig$Builder this ^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig other]
    (-> this (.mergeFrom other))))

(defn get-src-ip-ranges-list
  "CIDR IP address range.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyRuleMatcherConfig$Builder this]
    (-> this (.getSrcIpRangesList))))

(defn add-all-src-ip-ranges
  "CIDR IP address range.

  src-ip-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^SecurityPolicyRuleMatcherConfig$Builder this ^java.util.List src-ip-ranges]
    (-> this (.addAllSrcIpRanges src-ip-ranges))))

(defn add-src-ip-ranges
  "CIDR IP address range.

  src-ip-ranges - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^SecurityPolicyRuleMatcherConfig$Builder this ^java.lang.String src-ip-ranges]
    (-> this (.addSrcIpRanges src-ip-ranges))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig [^SecurityPolicyRuleMatcherConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig$Builder [^SecurityPolicyRuleMatcherConfig$Builder this]
    (-> this (.clone))))

