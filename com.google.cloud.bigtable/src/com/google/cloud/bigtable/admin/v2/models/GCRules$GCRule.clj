(ns com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule
  "interface for fluent GcRule wrappers"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules$GCRule]))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.GcRule`"
  (^com.google.bigtable.admin.v2.GcRule [^GCRules$GCRule this]
    (-> this (.toProto))))

