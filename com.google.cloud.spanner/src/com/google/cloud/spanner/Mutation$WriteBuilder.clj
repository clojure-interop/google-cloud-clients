(ns com.google.cloud.spanner.Mutation$WriteBuilder
  "Builder for Mutation.Op.INSERT, Mutation.Op.INSERT_OR_UPDATE, Mutation.Op.UPDATE, and Mutation.Op.REPLACE mutations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Mutation$WriteBuilder]))

(defn set
  "Returns a binder to set the value of columnName that should be applied by the
   mutation.

  column-name - `java.lang.String`

  returns: `com.google.cloud.spanner.ValueBinder<com.google.cloud.spanner.Mutation$WriteBuilder>`"
  (^com.google.cloud.spanner.ValueBinder [^Mutation$WriteBuilder this ^java.lang.String column-name]
    (-> this (.set column-name))))

(defn build
  "Returns a newly created Mutation based on the contents of the Builder.

  returns: `com.google.cloud.spanner.Mutation`

  throws: java.lang.IllegalStateException - if any duplicate columns are present. Duplicate detection is case-insensitive."
  (^com.google.cloud.spanner.Mutation [^Mutation$WriteBuilder this]
    (-> this (.build))))

