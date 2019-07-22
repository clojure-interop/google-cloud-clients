(ns com.google.cloud.bigtable.admin.v2.models.GCRules$VersionRule
  "Wrapper for building max versions rule"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules$VersionRule]))

(defn get-max-versions
  "Gets the configured maximum versions

  returns: `int`"
  (^Integer [^GCRules$VersionRule this]
    (-> this (.getMaxVersions))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GCRules$VersionRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GCRules$VersionRule this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GCRules$VersionRule this]
    (-> this (.toString))))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.GcRule`"
  (^com.google.bigtable.admin.v2.GcRule [^GCRules$VersionRule this]
    (-> this (.toProto))))

