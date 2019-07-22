(ns com.google.cloud.datastore.StructuredQuery$Builder
  "Interface for StructuredQuery builders."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StructuredQuery$Builder]))

(defn add-order-by
  "Adds settings to the existing order by clause.

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.addOrderBy order-by others))))

(defn clear-order-by
  "Clears any previously specified order by settings.

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this]
    (-> this (.clearOrderBy))))

(defn set-kind
  "Sets the kind for the query.

  kind - `java.lang.String`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-end-cursor
  "Sets the end cursor for the query.

  end-cursor - `com.google.cloud.datastore.Cursor`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^com.google.cloud.datastore.Cursor end-cursor]
    (-> this (.setEndCursor end-cursor))))

(defn set-namespace
  "Sets the namespace for the query.

  namespace - `java.lang.String`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))

(defn build
  "returns: `com.google.cloud.datastore.StructuredQuery<V>`"
  (^com.google.cloud.datastore.StructuredQuery [^StructuredQuery$Builder this]
    (-> this (.build))))

(defn set-filter
  "filter - `com.google.cloud.datastore.StructuredQuery$Filter`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$Filter filter]
    (-> this (.setFilter filter))))

(defn set-limit
  "Sets the limit for the query.

  limit - `java.lang.Integer`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^java.lang.Integer limit]
    (-> this (.setLimit limit))))

(defn set-start-cursor
  "Sets the start cursor for the query.

  start-cursor - `com.google.cloud.datastore.Cursor`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^com.google.cloud.datastore.Cursor start-cursor]
    (-> this (.setStartCursor start-cursor))))

(defn set-order-by
  "Sets the query's order by clause (clearing any previously specified order by settings).

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.setOrderBy order-by others))))

(defn set-offset
  "Sets the offset for the query.

  offset - `int`

  returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery$Builder this ^Integer offset]
    (-> this (.setOffset offset))))

