(ns com.google.cloud.spanner.Statement$Builder
  "Builder for Statement."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Statement$Builder]))

(defn append
  "Appends sqlFragment to the statement.

  sql-fragment - `java.lang.String`

  returns: `com.google.cloud.spanner.Statement$Builder`"
  (^com.google.cloud.spanner.Statement$Builder [^Statement$Builder this ^java.lang.String sql-fragment]
    (-> this (.append sql-fragment))))

(defn bind
  "Returns a binder to bind the value of the query parameter parameter.

  parameter - `java.lang.String`

  returns: `com.google.cloud.spanner.ValueBinder<com.google.cloud.spanner.Statement$Builder>`"
  (^com.google.cloud.spanner.ValueBinder [^Statement$Builder this ^java.lang.String parameter]
    (-> this (.bind parameter))))

(defn build
  "Builds the Statement.

  returns: `com.google.cloud.spanner.Statement`"
  (^com.google.cloud.spanner.Statement [^Statement$Builder this]
    (-> this (.build))))

