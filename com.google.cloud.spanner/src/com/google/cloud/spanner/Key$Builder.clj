(ns com.google.cloud.spanner.Key$Builder
  "Builder for Key instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Key$Builder]))

(defn append
  "Appends a BOOL value to the key.

  value - `java.lang.Boolean`

  returns: `com.google.cloud.spanner.Key$Builder`"
  (^com.google.cloud.spanner.Key$Builder [^Key$Builder this ^java.lang.Boolean value]
    (-> this (.append value))))

(defn append-object
  "Appends an object following the same conversion rules as Key.of(Object...). When
   using the Builder, most code should prefer using the strongly typed append(...) methods, for both performance and the benefit of compile-time checking.

  value - `java.lang.Object`

  returns: `com.google.cloud.spanner.Key$Builder`"
  (^com.google.cloud.spanner.Key$Builder [^Key$Builder this ^java.lang.Object value]
    (-> this (.appendObject value))))

(defn build
  "returns: `com.google.cloud.spanner.Key`"
  (^com.google.cloud.spanner.Key [^Key$Builder this]
    (-> this (.build))))

