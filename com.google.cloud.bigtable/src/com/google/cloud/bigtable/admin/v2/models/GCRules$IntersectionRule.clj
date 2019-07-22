(ns com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule
  "Fluent wrapper for GcRule.Intersection rule. Allows far adding an hierarchy of rules with
  intersection as the root"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules$IntersectionRule]))

(defn rule
  "Adds a new GCRule

  rule - `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule [^GCRules$IntersectionRule this ^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule rule]
    (-> this (.rule rule))))

(defn get-rules-list
  "Gets the list of child rules

  returns: `java.util.List<com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule>`"
  (^java.util.List [^GCRules$IntersectionRule this]
    (-> this (.getRulesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GCRules$IntersectionRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GCRules$IntersectionRule this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GCRules$IntersectionRule this]
    (-> this (.toString))))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.GcRule`"
  (^com.google.bigtable.admin.v2.GcRule [^GCRules$IntersectionRule this]
    (-> this (.toProto))))

