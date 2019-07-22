(ns com.google.cloud.datastore.ProjectionEntityQuery$Builder
  "A ProjectionEntityQuery builder for queries that return ProjectionEntity
  results."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore ProjectionEntityQuery$Builder]))

(defn set-distinct-on
  "Sets the query's distinct on clause (clearing any previously specified distinct on settings).

  property - `java.lang.String`
  others - `java.lang.String`

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this ^java.lang.String property ^java.lang.String others]
    (-> this (.setDistinctOn property others))))

(defn add-order-by
  "Description copied from interface: StructuredQuery.Builder

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.addOrderBy order-by others))))

(defn clear-order-by
  "Description copied from interface: StructuredQuery.Builder

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this]
    (-> this (.clearOrderBy))))

(defn add-distinct-on
  "Adds one or more properties to the existing group by clause.

  property - `java.lang.String`
  others - `java.lang.String`

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this ^java.lang.String property ^java.lang.String others]
    (-> this (.addDistinctOn property others))))

(defn set-kind
  "Description copied from interface: StructuredQuery.Builder

  kind - `java.lang.String`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-projection
  "Adds one or more projections to the existing projection clause.

  projection - `java.lang.String`
  others - `java.lang.String`

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this ^java.lang.String projection ^java.lang.String others]
    (-> this (.addProjection projection others))))

(defn set-end-cursor
  "Description copied from interface: StructuredQuery.Builder

  end-cursor - `com.google.cloud.datastore.Cursor`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^com.google.cloud.datastore.Cursor end-cursor]
    (-> this (.setEndCursor end-cursor))))

(defn set-projection
  "Sets the query's projection clause (clearing any previously specified Projection settings).

  projection - `java.lang.String`
  others - `java.lang.String`

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this ^java.lang.String projection ^java.lang.String others]
    (-> this (.setProjection projection others))))

(defn set-namespace
  "Description copied from interface: StructuredQuery.Builder

  namespace - `java.lang.String`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))

(defn build
  "returns: `com.google.cloud.datastore.ProjectionEntityQuery`"
  (^com.google.cloud.datastore.ProjectionEntityQuery [^ProjectionEntityQuery$Builder this]
    (-> this (.build))))

(defn set-filter
  "filter - `com.google.cloud.datastore.StructuredQuery$Filter`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$Filter filter]
    (-> this (.setFilter filter))))

(defn clear-projection
  "Clears the projection clause.

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this]
    (-> this (.clearProjection))))

(defn set-limit
  "Description copied from interface: StructuredQuery.Builder

  limit - `java.lang.Integer`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^java.lang.Integer limit]
    (-> this (.setLimit limit))))

(defn set-start-cursor
  "Description copied from interface: StructuredQuery.Builder

  start-cursor - `com.google.cloud.datastore.Cursor`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^com.google.cloud.datastore.Cursor start-cursor]
    (-> this (.setStartCursor start-cursor))))

(defn set-order-by
  "Description copied from interface: StructuredQuery.Builder

  order-by - `com.google.cloud.datastore.StructuredQuery$OrderBy`
  others - `com.google.cloud.datastore.StructuredQuery$OrderBy`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^com.google.cloud.datastore.StructuredQuery$OrderBy order-by ^com.google.cloud.datastore.StructuredQuery$OrderBy others]
    (-> this (.setOrderBy order-by others))))

(defn clear-distinct-on
  "Clears the group by clause.

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder [^ProjectionEntityQuery$Builder this]
    (-> this (.clearDistinctOn))))

(defn set-offset
  "Description copied from interface: StructuredQuery.Builder

  offset - `int`

  returns: `B`"
  ([^ProjectionEntityQuery$Builder this ^Integer offset]
    (-> this (.setOffset offset))))

