(ns com.google.cloud.bigtable.admin.v2.models.GCRules$DefaultRule
  "Wrapper for building a empty rule"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules$DefaultRule]))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.GcRule`"
  (^com.google.bigtable.admin.v2.GcRule [^GCRules$DefaultRule this]
    (-> this (.toProto))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GCRules$DefaultRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GCRules$DefaultRule this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GCRules$DefaultRule this]
    (-> this (.toString))))

