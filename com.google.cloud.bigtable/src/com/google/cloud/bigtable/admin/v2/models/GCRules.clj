(ns com.google.cloud.bigtable.admin.v2.models.GCRules
  "Wraps GcRule protocol buffer object and exposes a friendly API.

  Note: Garbage collection executes opportunistically in the background, and so it's possible
  for reads to return a cell even if it matches the active GC expression for its family. Please use
  appropriate filters in your reads to exclude cells which are eligible for garbage collection."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models GCRules]))

(def *-gcrules
  "Static Constant.

  Factory method to create GCRules - entry point into the DSL.

  type: com.google.cloud.bigtable.admin.v2.models.GCRules"
  GCRules/GCRULES)

(defn intersection
  "Creates a new instance of the IntersectionRule

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule [^GCRules this]
    (-> this (.intersection))))

(defn union
  "Creates a new instance of the IntersectionRule

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$UnionRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$UnionRule [^GCRules this]
    (-> this (.union))))

(defn max-versions
  "Creates a new instance of the VersionRule

  max-version - - maximum number of cell versions to keep - `int`

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$VersionRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$VersionRule [^GCRules this ^Integer max-version]
    (-> this (.maxVersions max-version))))

(defn max-age
  "Creates a new instance of the DurationRule

  max-age - - maximum age of the cell to keep - `long`
  time-unit - - timeunit for the age - `java.util.concurrent.TimeUnit`

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$DurationRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$DurationRule [^GCRules this ^Long max-age ^java.util.concurrent.TimeUnit time-unit]
    (-> this (.maxAge max-age time-unit)))
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$DurationRule [^GCRules this ^org.threeten.bp.Duration duration]
    (-> this (.maxAge duration))))

(defn default-rule
  "Creates an empty default rule

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$DefaultRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$DefaultRule [^GCRules this]
    (-> this (.defaultRule))))

(defn from-proto
  "source - `com.google.bigtable.admin.v2.GcRule`

  returns: `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`"
  (^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule [^GCRules this ^com.google.bigtable.admin.v2.GcRule source]
    (-> this (.fromProto source))))

