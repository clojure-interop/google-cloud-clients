(ns com.google.cloud.spanner.Struct$Builder
  "Builder for constructing non-NULL Struct instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Struct$Builder]))

(defn set
  "Returns a binder to set the value of a new field in the struct named fieldName.

  field-name - name of the field to set. Can be empty or the same as an existing field name in the STRUCT - `java.lang.String`

  returns: `com.google.cloud.spanner.ValueBinder<com.google.cloud.spanner.Struct$Builder>`"
  (^com.google.cloud.spanner.ValueBinder [^Struct$Builder this ^java.lang.String field-name]
    (-> this (.set field-name))))

(defn add
  "Adds a new unnamed field fieldName with the given value.

  value - `com.google.cloud.spanner.Value`

  returns: `com.google.cloud.spanner.Struct$Builder`"
  (^com.google.cloud.spanner.Struct$Builder [^Struct$Builder this ^com.google.cloud.spanner.Value value]
    (-> this (.add value))))

(defn build
  "returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^Struct$Builder this]
    (-> this (.build))))

