(ns com.google.cloud.datastore.KeyQuery$Builder
  "A KeyQuery builder for queries that return Key results."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore KeyQuery$Builder]))

(defn add-order-by
  "Description copied from interface: StructuredQuery.Builder

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `B`"
  ([^KeyQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.addOrderBy order-by others))))

(defn clear-order-by
  "Description copied from interface: StructuredQuery.Builder

  returns: `B`"
  ([^KeyQuery$Builder this]
    (-> this (.clearOrderBy))))

(defn set-kind
  "Description copied from interface: StructuredQuery.Builder

  kind - `java.lang.String`

  returns: `B`"
  ([^KeyQuery$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-end-cursor
  "Description copied from interface: StructuredQuery.Builder

  end-cursor - `com.google.cloud.datastore.Cursor`

  returns: `B`"
  ([^KeyQuery$Builder this ^com.google.cloud.datastore.Cursor end-cursor]
    (-> this (.setEndCursor end-cursor))))

(defn set-namespace
  "Description copied from interface: StructuredQuery.Builder

  namespace - `java.lang.String`

  returns: `B`"
  ([^KeyQuery$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))

(defn build
  "returns: `com.google.cloud.datastore.KeyQuery`"
  (^com.google.cloud.datastore.KeyQuery [^KeyQuery$Builder this]
    (-> this (.build))))

(defn set-filter
  "filter - `com.google.cloud.datastore.StructuredQuery$Filter`

  returns: `B`"
  ([^KeyQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$Filter filter]
    (-> this (.setFilter filter))))

(defn set-limit
  "Description copied from interface: StructuredQuery.Builder

  limit - `java.lang.Integer`

  returns: `B`"
  ([^KeyQuery$Builder this ^java.lang.Integer limit]
    (-> this (.setLimit limit))))

(defn set-start-cursor
  "Description copied from interface: StructuredQuery.Builder

  start-cursor - `com.google.cloud.datastore.Cursor`

  returns: `B`"
  ([^KeyQuery$Builder this ^com.google.cloud.datastore.Cursor start-cursor]
    (-> this (.setStartCursor start-cursor))))

(defn set-order-by
  "Description copied from interface: StructuredQuery.Builder

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `B`"
  ([^KeyQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.setOrderBy order-by others))))

(defn set-offset
  "Description copied from interface: StructuredQuery.Builder

  offset - `int`

  returns: `B`"
  ([^KeyQuery$Builder this ^Integer offset]
    (-> this (.setOffset offset))))

