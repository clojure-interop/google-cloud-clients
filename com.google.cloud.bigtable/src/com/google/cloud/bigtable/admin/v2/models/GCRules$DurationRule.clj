(ns com.google.cloud.bigtable.admin.v2.models.GCRules$DurationRule
  "Wrapper for building max duration rule"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules$DurationRule]))

(defn get-max-age
  "Gets the configured maximum age

  returns: `org.threeten.bp.Duration`"
  (^org.threeten.bp.Duration [^GCRules$DurationRule this]
    (-> this (.getMaxAge))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GCRules$DurationRule this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GCRules$DurationRule this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GCRules$DurationRule this]
    (-> this (.toString))))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.GcRule`"
  (^com.google.bigtable.admin.v2.GcRule [^GCRules$DurationRule this]
    (-> this (.toProto))))

