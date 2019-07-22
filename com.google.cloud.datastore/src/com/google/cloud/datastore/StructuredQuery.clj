(ns com.google.cloud.datastore.StructuredQuery
  "An implementation of a Google Cloud Datastore Query that can be constructed by providing all the
  specific query elements.

  A usage example:

  A simple query that returns all entities for a specific kind



  Query<Entity> query = Query.newEntityQueryBuilder().setKind(kind).build();
  QueryResults<Entity> results = datastore.run(query);
  while (results.hasNext()) {
    Entity entity = results.next();
    ...
  }

  A simple key-only query of all entities for a specific kind



  Query<Key> keyOnlyQuery =  Query.newKeyQueryBuilder().setKind(KIND1).build();
  QueryResults<Key> results = datastore.run(keyOnlyQuery);
  ...

  A less trivial example of a projection query that returns the first 10 results of \"age\" and
  \"name\" properties (sorted and grouped by \"age\") with an age greater than 18



  Query<ProjectionEntity> query = Query.newProjectionEntityQueryBuilder()
      .setKind(kind)
      .setProjection(Projection.property(\"age\"), Projection.first(\"name\"))
      .setFilter(PropertyFilter.gt(\"age\", 18))
      .setGroupBy(\"age\")
      .setOrderBy(OrderBy.asc(\"age\"))
      .setLimit(10)
      .build();
  QueryResults<ProjectionEntity> results = datastore.run(query);
  ..."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore StructuredQuery]))

(defn get-distinct-on
  "Returns the distinct on clause for this query.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^StructuredQuery this]
    (-> this (.getDistinctOn))))

(defn get-kind
  "Returns the kind for this query.

  returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery this]
    (-> this (.getKind))))

(defn get-start-cursor
  "Returns the start cursor for this query.

  returns: `com.google.cloud.datastore.Cursor`"
  (^com.google.cloud.datastore.Cursor [^StructuredQuery this]
    (-> this (.getStartCursor))))

(defn get-projection
  "Returns the projection for this query.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^StructuredQuery this]
    (-> this (.getProjection))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StructuredQuery this]
    (-> this (.toString))))

(defn get-offset
  "Returns the offset for this query.

  returns: `int`"
  (^Integer [^StructuredQuery this]
    (-> this (.getOffset))))

(defn get-filter
  "Returns the filter for this query.

  returns: `com.google.cloud.datastore.StructuredQuery$Filter`"
  (^com.google.cloud.datastore.StructuredQuery$Filter [^StructuredQuery this]
    (-> this (.getFilter))))

(defn get-end-cursor
  "Returns the end cursor for this query.

  returns: `com.google.cloud.datastore.Cursor`"
  (^com.google.cloud.datastore.Cursor [^StructuredQuery this]
    (-> this (.getEndCursor))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StructuredQuery this]
    (-> this (.hashCode))))

(defn get-limit
  "Returns the limit for this query.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^StructuredQuery this]
    (-> this (.getLimit))))

(defn get-order-by
  "Returns the order by clause for this query.

  returns: `java.util.List<com.google.cloud.datastore.StructuredQuery$OrderBy>`"
  (^java.util.List [^StructuredQuery this]
    (-> this (.getOrderBy))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StructuredQuery this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "returns: `com.google.cloud.datastore.StructuredQuery$Builder<V>`"
  (^com.google.cloud.datastore.StructuredQuery$Builder [^StructuredQuery this]
    (-> this (.toBuilder))))

